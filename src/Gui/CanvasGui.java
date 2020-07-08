package Gui;

import Logic.Cursor;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.stage.Stage;

/**
 * Clase de la interfaz para el canvas
 */
public class CanvasGui extends Application {

    private Cursor cursor;
    private ImageView imageCursor;

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
        imageCursor.setLayoutX(cursor.getPosX());
        imageCursor.setLayoutY(cursor.getPosY());


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
        update = new AnimationTimer() {
            @Override
            public void handle(long l) {

                rotateCursor(1); //TODO obtener los grados a girar
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
        imageCursor.setLayoutX(cursor.getPosX());
        imageCursor.setLayoutY(cursor.getPosY());
    }

    /**
     * Método para girar el cursor
     * @param rotation rotación a actualizar
     */
    private void rotateCursor(int rotation) {
        cursor.updateRotation(rotation);
    }

    /**
     * Método que lanza la aplicación
     */
    public static void show() {
        new CanvasGui().start(new Stage());
    }
}
