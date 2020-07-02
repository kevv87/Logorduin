package Gui;

import Logic.MessageType;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Clase de interfaz principal.
 */
public class Main extends Application {

    private BorderPane mainPane;
    private VBox messagesContainer;

    /**
     * Método para iniciar la aplicación.
     * @param args Argumentos del programa.
     */
    public static void main(String[] args) {
        launch(Main.class);
    }

    /**
     * Método para configurar la ventana principal de la aplicación.
     * @param stage Instancia de la ventana principal.
     */
    @Override
    public void start(Stage stage) {
        /*
        Agregar la siguiente línea en configuración de ejecución, en campo VM Options.
        --module-path "Ruta a la carpeta lib de JavaFx" --add-modules javafx.controls,javafx.fxml
         */

        mainPane = new BorderPane();

        //Sección de mensajes de compilación
        setMessagesSection();


        Scene scene = new Scene(mainPane);
        stage.setTitle("Logorduin");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Método para establecer la sección de mensajes de compilación.
     */
    private void setMessagesSection() {
        messagesContainer = new VBox();
        messagesContainer.setFillWidth(true);
        messagesContainer.setAlignment(Pos.CENTER_LEFT);
        ScrollPane messages = new ScrollPane(messagesContainer);
        messages.setFitToWidth(true);
        messages.setPrefHeight(200);

        mainPane.setBottom(messages);
    }

    /**
     * Método para mostrar un nuevo mensaje en la sección de mensajes de compilación.
     * @param text Texto del mensaje.
     * @param type Tipo del mensaje, puede ser Info, Warning o Error.
     */
    private void addMessage(String text, MessageType type) {
        Label lbl = new Label(text);
        lbl.setAlignment(Pos.CENTER_RIGHT);

        switch (type) {
            case INFO -> lbl.setTextFill(Color.GRAY);
            case WARNING -> lbl.setTextFill(Color.ORANGE);
            case ERROR -> lbl.setTextFill(Color.FIREBRICK);
        }

        messagesContainer.getChildren().add(lbl);
    }
}
