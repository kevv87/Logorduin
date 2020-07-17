package Gui;

import Logic.MessageType;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Clase de interfaz principal.
 */
public class Main extends Application {

    private BorderPane mainPane;
    private VBox messagesContainer;
    private TextArea code;
    private File workingFile;

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
        setMenuButtonSection(stage);

        setCodeSection();

        Scene scene = new Scene(mainPane);
        scene.getStylesheets().add("file:///" + CommonMethods.getCwd().replaceAll("\\\\", "/") + "/res/style.css");
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
     * @param stage Instancia de la ventana principal.
     */
    private void setMenuButtonSection(Stage stage) {
        VBox container  = new VBox();
        HBox menuButtonContainer = new HBox();
        menuButtonContainer.setSpacing(20);
        menuButtonContainer.getStyleClass().add("menu-container");

        Line line = new Line(0, 0, 0, 0);

        HBox buttonSection = new HBox();
        buttonSection.setAlignment(Pos.TOP_RIGHT);
        HBox.setHgrow(buttonSection, Priority.ALWAYS);
        buttonSection.setSpacing(25);
        HBox.setMargin(buttonSection, new Insets(10, 30, 10, 10));

        ImageView compileButton = CommonMethods.loadImageView("/res/compileButton.png", 20, 20);
        ImageView runButton = CommonMethods.loadImageView("/res/runButton.png", 20, 20);
        compileButton.setOnMouseClicked(mouseEvent -> {
            // TODO compilar el programa
            System.out.println("Compilando...");
        });
        runButton.setOnMouseClicked(mouseEvent -> {
            //TODO compilar y ejecutar el programa
            System.out.println("Compilando y ejecutando...");
            CanvasGui.show();
        });

        DropShadow shadow = new DropShadow();
        compileButton.setOnMouseEntered(mouseEvent -> compileButton.setEffect(shadow));
        compileButton.setOnMouseExited(mouseEvent -> compileButton.setEffect(null));
        runButton.setOnMouseEntered(mouseEvent -> runButton.setEffect(shadow));
        runButton.setOnMouseExited(mouseEvent -> runButton.setEffect(null));

        buttonSection.getChildren().addAll(compileButton, runButton);

        menuButtonContainer.getChildren().add(setMenuBarSection(stage));
        menuButtonContainer.getChildren().addAll(buttonSection);

        container.getChildren().addAll(menuButtonContainer, line);

        mainPane.setTop(container);
    }

    /**
     * Metodo para establecer el toolbar de la aplicacion
     * @param stage Instancia de la ventana principal.
     */
    private MenuBar setMenuBarSection(Stage stage){
        // Menu de Archivo
        Menu menuArchivo = new Menu("Archivo");
        FileChooser fileChooser = new FileChooser();
        MenuItem nuevoItem = new MenuItem("Nuevo");
        MenuItem cargarItem = new MenuItem("Cargar");
        cargarItem.setOnAction(e -> {
            workingFile = fileChooser.showOpenDialog(stage);
            try {
                Scanner s = new Scanner(workingFile).useDelimiter("");
                while(s.hasNext()){
                    code.appendText(s.next());
                }
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        });
        MenuItem guardarItem = new MenuItem("Guardar");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Codigo Logorduin", "*.ldr") //.ldr Es el tipo de archivo arbitrario para nuestros codigos
        );
        menuArchivo.getItems().addAll(nuevoItem, cargarItem, guardarItem);
        // TODO anadir filtros para extension de archivos a usar

        // Menu de Editar
        Menu menuEditar = new Menu("Editar");
        MenuItem deshacerItem = new MenuItem("Deshacer");
        MenuItem rehacerItem = new MenuItem("Rehacer");
        MenuItem cortarItem = new MenuItem("Cortar");
        MenuItem copiarItem = new MenuItem("Copiar");
        MenuItem pegarItem = new MenuItem("Pegar");
        menuEditar.getItems().addAll(deshacerItem, rehacerItem, cortarItem, copiarItem, pegarItem);

        MenuBar menuBar = new MenuBar();
        menuBar.setMinHeight(30);
        // TODO anadir iconos a items
        // TODO agregar items necesarios
        // TODO funcionalidades de cada item del menu

        menuBar.getMenus().addAll(menuArchivo, menuEditar);
        return menuBar;
    }

    /**
     * Método para establecer la sección de mensajes de compilación.
     */
    private void setMessagesSection() {
        messagesContainer = new VBox();
        messagesContainer.getStyleClass().add("msg-container");
        ScrollPane messages = new ScrollPane(messagesContainer);
        messages.getStyleClass().add("msg-parent-container");

        mainPane.setBottom(messages);
    }

    /**
     * Método para mostrar un nuevo mensaje en la sección de mensajes de compilación.
     * @param text Texto del mensaje.
     * @param type Tipo del mensaje, puede ser Info, Warning o Error.
     */
    private void addMessage(String text, MessageType type) {
        Label lbl = new Label(text);
        lbl.getStyleClass().add("msg-text");

        switch (type) {
            case INFO -> lbl.getStyleClass().add("info-text");
            case WARNING -> lbl.getStyleClass().add("warning-text");
            case ERROR -> lbl.getStyleClass().add("error-text");
        }

        messagesContainer.getChildren().add(lbl);
    }


}
