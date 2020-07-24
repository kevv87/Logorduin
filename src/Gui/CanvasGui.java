package Gui;

import Logic.Cursor;
import Logic.jsonAction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Clase de la interfaz para el canvas
 */
public class CanvasGui extends Application {

    private Cursor cursor;
    private ImageView imageCursor;
    private ObjectMapper objectMapper = new ObjectMapper();

    private AnimationTimer update;

    @Override
    public void start(Stage stage) {
        int width = 600;
        int height = 600;
        Group canvasGroup = new Group();
        Scene scene = new Scene(canvasGroup);
        stage.setScene(scene);
        Canvas canvas = new Canvas(width, height);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        //Creacion del cursor
        imageCursor = CommonMethods.loadImageView("/res/turtle.png", 30, 30);
        cursor = new Cursor(imageCursor, width, height, graphicsContext);
        imageCursor.setLayoutX(cursor.getPosX()-15);
        imageCursor.setLayoutY(cursor.getPosY()-15);


        PixelWriter pixelWriter = graphicsContext.getPixelWriter();
        graphicsContext.fillRect(400, 300, 1, 1);
//        drawLineCanvas(graphicsContext,400, 300, 70, 0);
        canvasGroup.getChildren().addAll(imageCursor, canvas);
        configureUpdateLoop();
        update.start();

        stage.show();

    }

    /**
     * Método para actualizar el dibujo
     */
    private void configureUpdateLoop() {
        rotateCursor(45);
        update = new AnimationTimer() {
            @Override
            public void handle(long l) {

                //rotateCursor(1); //TODO obtener los grados a girar
                cursor.move(1, true);
/*
                try {
                    Thread.sleep(1000); //TODO cambiar según necesidades
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                // Despues de aplicar los cambios, update the image
                updateCursor();
            }
        };
    }

    /**
     * Pinta de nuevo el cursor aplicando sus atributos (posicion y rotacion) al ImageView.
     */
    private void updateCursor(){
        imageCursor.setRotate(cursor.getRotation());
        imageCursor.setLayoutX(cursor.getPosX()-15);
        imageCursor.setLayoutY(cursor.getPosY()-15);
    }

    /**
     * Método para girar el cursor
     * @param rotation rotación a actualizar
     */
    private void rotateCursor(int rotation) {
        cursor.updateRotation(rotation, true);
    }

    /**
     * Método para esconder el cursor.
     */
    public void hideCursor() {
        imageCursor.setVisible(false);
    }

    /**
     * Método para mostrar el cursor.
     */
    public void showCursor() {
        imageCursor.setVisible(true);
    }

    /**
     * Método para obtener el codigo hexadecimal del color.
     * @param color nombre del color que se busca.
     * @return objeto de clase Color
     */
    public Color convertColor(String color) {
        Color result = Color.BLACK;
        switch (color) {
            case "Blanco":
            case "blanco":
                result = Color.WHITE;
                break;
            case "Azul":
            case "azul":
                result = Color.BLUE;
                break;
            case "Marron":
            case "marron":
                result = Color.BROWN;
                break;
            case "Cian":
            case "cian":
                result = Color.CYAN;
                break;
            case "Gris":
            case "gris":
                result = Color.GRAY;
                break;
            case "Amarillo":
            case "amarillo":
                result = Color.YELLOW;
                break;
            case "Negro":
            case "negro":
                result = Color.BLACK;
                break;
            case "Rojo":
            case "rojo":
                result = Color.RED;
                break;
            case "Verde":
            case "verde":
                result = Color.GREEN;
                break;
        }
        return result;
    }

    /**
     * Método que lanza la aplicación
     */
    public static void show() {
        new CanvasGui().start(new Stage());
    }

    /**
     * Metodo para llamar funciones del canvas segun codigo maquina
     */
    public void callFunction(String json, GraphicsContext graphicsContext, int Height, int Width) {
        String action = "";
        int repeticion = 0;
        try {
            jsonAction jAction = objectMapper.readValue(json, jsonAction.class);
            action = jAction.getAccion();
            repeticion = jAction.getRepeticiones();

            switch (action) {
                case "avanza":
                case "av":
                    int length = (int) jAction.getArgumentos().get(0);
                    cursor.move(length, true);
                    break;
                case "retrocede":
                case "re":
                    length = (int) jAction.getArgumentos().get(0);
                    cursor.move(length, false);
                    break;
                case "giraderecha":
                case "gd":
                    int angulo = (int) jAction.getArgumentos().get(0);
                    cursor.updateRotation(angulo, true);
                    break;
                case "giraizquierda":
                case "gi":
                    angulo = (int) jAction.getArgumentos().get(0);
                    cursor.updateRotation(angulo, false);
                    break;
                case "ocultatortuga":
                case "ot":
                    hideCursor();
                    break;
                case "aparecetortuga":
                case "AT":
                    showCursor();
                case "ponpos":
                case "ponxy":
                    Double posX = (Double) jAction.getArgumentos().get(0);
                    Double posY = (Double) jAction.getArgumentos().get(1);
                    cursor.realocate(posX, posY);
                    break;
                case "ponrumbo":
                    angulo = (int) jAction.getArgumentos().get(0);
                    cursor.setRotation(angulo);
                    break;
                case "rumbo":   // TODO mostrar en consola la rotacion
                    System.out.println(cursor.getRotation());
                    break;
                case "ponx":
                    posX = (Double) jAction.getArgumentos().get(0);
                    cursor.setPosX(posX);
                    break;
                case "pony":
                    posY = (Double) jAction.getArgumentos().get(0);
                    cursor.setPosY(posY);
                    break;
                case "bajalapiz":
                case "bl":
                    if(!cursor.isLapiz()) {
                        cursor.setLapiz(true);
                    }
                    break;
                case "subelapiz":
                case "sb":
                    if(cursor.isLapiz()) {
                        cursor.setLapiz(false);
                    }
                    break;
                case "poncolorlapiz":
                case "poncl":
                    String color = (String) jAction.getArgumentos().get(0);
                    cursor.setCurrentColor(convertColor(color));
                    break;
                case "centro":
                    Double centerX = (double) (Width/2);
                    Double centerY = (double) (Height/2);
                    cursor.realocate( centerX, centerY);
                    break;
                case "espera":
                    int tiempo = (int) jAction.getArgumentos().get(0);
                    try {
                        TimeUnit.SECONDS.sleep(tiempo);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case "borrapantalla":
                    graphicsContext.clearRect(0, 0, Width, Height);
                    break;
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
