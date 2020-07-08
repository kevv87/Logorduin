package Gui;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import Logic.Cursor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Clase de la interfaz para el canvas
 */
public class CanvasGui extends Application {

    private final String cwd = System.getProperty("user.dir");
    private final Integer width = 600;
    private final Integer height = 600;
    private Color colorLapiz = Color.BLACK;
    private Cursor cursor;
    private ImageView imageCursor;

    private AnimationTimer update;

    @Override
    public void start(Stage stage) {
        Group canvasGroup = new Group();
        Scene scene = new Scene(canvasGroup);
        stage.setScene(scene);

        //Creacion del cursor
        imageCursor = loadImageView("/res/turtle.png", 30, 30);
        cursor = new Cursor(imageCursor, width, height);
        imageCursor.setLayoutX(cursor.getPosX());
        imageCursor.setLayoutY(cursor.getPosY());


        Canvas canvas = new Canvas(width, height);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        PixelWriter pixelWriter = graphicsContext.getPixelWriter();
        graphicsContext.fillRect(400, 300, 1, 1);
        drawLineCanvas(graphicsContext,400, 300, 70, 0);
        canvasGroup.getChildren().addAll(imageCursor, canvas);
        configureUpdateLoop();
        update.start();

        stage.show();

    }

    /**
     * Método para actualizar el dibujo
     */
    private void configureUpdateLoop() {
        update = new AnimationTimer() {
            @Override
            public void handle(long l) {

                rotateCursor(5); //TODO obtener los grados a girar

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    /**
     * Método para girar el cursor
     * @param rotation rotación a actualizar
     */
    private void rotateCursor(int rotation) {
        cursor.updateRotation(rotation);
        imageCursor.setRotate(cursor.getRotation());
    }

    /**
     * Metodo para dibujar una linea
     * @param graphicsContext GraphicsContext correspondiente al canvas
     * @param posX posicion horizontal desde la cual inicia el dibujo
     * @param posY posicion vertical desde la cual inicia el dibujo
     * @param length largo de la linea a dibujar
     * @param direction direccion hacia la cual se va a dibujar (0-arriba, 1-derecha, 2-abajo y 3-izquierda)
  */
    void drawLineCanvas(GraphicsContext graphicsContext, int posX, int posY, int length, int direction){
        graphicsContext.setFill(colorLapiz);
        for(int i = length; i>0; i--){
            switch (direction) {
                //Direccion-arriba
                case 0:
                    if(posY>=0){
                        graphicsContext.fillRect(posX, posY, 1, 1); // TODO hallar alternativa a fillRect() por pixeles individuales
                        posY-=1;
                    }
                    break;
                //Direccion-derecha
                case 1:
                    if(posX<=width){
                        graphicsContext.fillRect(posX, posY, 1, 1);
                        posX+=1;
                    }
                    break;
                //Direccion-abajo
                case 2:
                    if(posY<=height){
                        graphicsContext.fillRect(posX, posY, 1, 1);
                        posY+=1;
                    }
                    break;
                //Direccion-izquierda
                case 3:
                    if(posX>=width){
                        graphicsContext.fillRect(posX, posY, 1, 1);
                        posX-=1;
                    }
                    break;
            }
        }
    }

    /**
     * Metodo para cambiar el color del lapiz
     * @param color color del lapiz
     */
    void cambiarColor(int color){
        switch (color) {
            case 0 -> colorLapiz = Color.WHITE;
            case 1 -> colorLapiz = Color.BLUE;
            case 2 -> colorLapiz = Color.BROWN;
            case 3 -> colorLapiz = Color.CYAN;
            case 4 -> colorLapiz = Color.GRAY;
            case 5 -> colorLapiz = Color.YELLOW;
            case 6 -> colorLapiz = Color.BLACK;
            case 7 -> colorLapiz = Color.RED;
            case 8 -> colorLapiz = Color.GREEN;
        }
    }

    /**
     * Métod para cargar un ImageView
     * @param path Ruta del archivo
     * @param height Altura de la imagen
     * @param width Ancho de la imagen
     * @return Un objeto ImageView de la imagen agregada
     */
    private ImageView loadImageView(String path, Integer height, Integer width){
        Image tokenImage = imageLoader(cwd.replaceAll("\\\\", "/") + path);
        ImageView addTokenImage = new ImageView(tokenImage);
        addTokenImage.setFitHeight(height);
        addTokenImage.setFitWidth(width);

        return addTokenImage;
    }

    /**
     * Método para cargar una imagen
     * @param path Ruta de la imagen
     * @return El objeto de la imagen creada
     */
    private Image imageLoader(String path){
        try{
            FileInputStream i = new FileInputStream(path);
            return new Image(i);
        }catch (FileNotFoundException e){
            System.out.println("Couldn't load images!");
        }
        System.out.println("Could not find " + path);
        return null;
    }

    /**
     * Método que lanza la aplicación
     */
    public static void show() {
        new CanvasGui().start(new Stage());
    }
}
