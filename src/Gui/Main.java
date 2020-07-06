package Gui;

import Logic.MessageType;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Clase de interfaz principal.
 */
public class Main extends Application {

    private final String cwd = System.getProperty("user.dir");
    private BorderPane mainPane;
    private VBox messagesContainer;
    private TextArea code;
    private HBox menuButtonContainer;

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

        //Sección de menu y botones
        setMenuButtonSection();

        setCodeSection();

        Scene scene = new Scene(mainPane);
        scene.getStylesheets().add("file:///" + cwd.replaceAll("\\\\", "/") + "/res/style.css");
        stage.setTitle("Logorduin");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Metodo para establecer la seccion de edicion de codigo.
     */
    private void setCodeSection(){


        code = new TextArea();
        code.setEditable(true);

        code.setMaxHeight(Double.MAX_VALUE);
        code.setMaxWidth(Double.MAX_VALUE);
        code.setFont(Font.font("dialog", 15));

        GridPane.setVgrow(code, Priority.ALWAYS);
        GridPane.setHgrow(code, Priority.ALWAYS);


        mainPane.setCenter(code);
    }

    /**
     * Metodo que limpia el codigo
     */
    public void clearCode(){
        code.clear();
    }

    /**
     * Pone un nuevo codigo en el TextArea.
     * @param newCode Codigo a agregar
     */
    public void setCode(String newCode){
        clearCode();
        code.setText(newCode);
    }

    /**
     * Método para establecer la sección de menu y de botones de compilacion y ejecución
     */
    private void setMenuButtonSection() {
        menuButtonContainer = new HBox();
        menuButtonContainer.setSpacing(20);

        // TODO crear menu

        HBox buttonSection = new HBox();
        buttonSection.setSpacing(20);
        HBox.setMargin(buttonSection, new Insets(10));

        ImageView compileButton = loadImageView("/res/compileButton.png", 30, 30);
        ImageView runButton = loadImageView("/res/runButton.png", 30, 30);
        compileButton.setOnMouseClicked(mouseEvent -> {
            // TODO compilar el programa
            System.out.println("Compilando...");
        });
        runButton.setOnMouseClicked(mouseEvent -> {
            //TODO compilar y ejecutar el programa
            System.out.println("Compilando y ejecutando...");
        });

        DropShadow shadow = new DropShadow();
        compileButton.setOnMouseEntered(mouseEvent -> compileButton.setEffect(shadow));
        compileButton.setOnMouseExited(mouseEvent -> compileButton.setEffect(null));
        runButton.setOnMouseEntered(mouseEvent -> runButton.setEffect(shadow));
        runButton.setOnMouseExited(mouseEvent -> runButton.setEffect(null));

        buttonSection.getChildren().addAll(compileButton, runButton);

        menuButtonContainer.getChildren().addAll(buttonSection); // TODO agregar seccion de menu antes de buttonSection
        mainPane.setTop(menuButtonContainer);
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

        //TODO: crear archivo css para agregar estilos.
//        lbl.getStyleClass().add("info-text"); // Ejemplo para agregar css a objeto
        // objeto.getStyleClass().add("nombre-selector");

        switch (type) {
            case INFO -> lbl.setTextFill(Color.GRAY);
            case WARNING -> lbl.setTextFill(Color.ORANGE);
            case ERROR -> lbl.setTextFill(Color.FIREBRICK);
        }

        messagesContainer.getChildren().add(lbl);
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
}
