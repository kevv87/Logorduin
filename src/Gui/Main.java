package Gui;

import Logic.MessageHandler;
import Logic.MessageType;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.IOException;
import java.io.PrintWriter;

import Compiler.Helpers.*;
import Compiler.Jacc.Parser;

/**
 * Clase de interfaz principal.
 */
public class Main extends Application {

    private BorderPane mainPane;
    private VBox messagesContainer;
    private TextArea code;
    private File workingFile;
    private MessageHandler msgHandler;

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
        msgHandler = MessageHandler.getInstance();
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
            boolean saved = saveAction(stage);
            if (!saved) return;
            System.out.println("Compilando...");
            msgHandler.add("Compilando archivo...", MessageType.INFO);
            CompiledFile compiledFile = getCompiled();
        });
        runButton.setOnMouseClicked(mouseEvent -> {
            boolean saved = saveAction(stage);
            if (!saved) return;
            System.out.println("Compilando y ejecutando...");
            msgHandler.add("Compilando y ejecutando...", MessageType.INFO);
            CompiledFile compiledFile = getCompiled();
            if (compiledFile == null) return;
            CanvasGui.cFile = compiledFile;
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
        MenuItem nuevoItem = new MenuItem("Nuevo");
        MenuItem cargarItem = new MenuItem("Cargar");
        MenuItem guardarItem = new MenuItem("Guardar");
        FileChooser fileChooser = new FileChooser();

        KeyCombination newCombination = new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN);
        nuevoItem.setAccelerator(newCombination);
        nuevoItem.setOnAction(actionEvent -> {
            fileChooser.setInitialFileName("untitled.ldr");
            File newFile = fileChooser.showSaveDialog(stage);
            try {
                if ((newFile == null) || !newFile.createNewFile()) return;
                workingFile = newFile;
                loadCurrentFile();

            } catch (IOException ex) {
                System.err.println("No se pudo crear un nuevo archivo");
                msgHandler.add("No se pudo crear un nuevo archivo", MessageType.ERROR);
            }
        });

        KeyCombination openCombination = new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_DOWN);
        cargarItem.setAccelerator(openCombination);
        cargarItem.setOnAction(e -> {
            workingFile = fileChooser.showOpenDialog(stage);
            if (workingFile == null) return; //Fix cuando no se selecciona archivo
            loadCurrentFile();
        });

        KeyCombination saveCombination = new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN);
        guardarItem.setAccelerator(saveCombination);
        guardarItem.setOnAction(actionEvent -> saveAction(stage));

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

        KeyCombination undoCombination = new KeyCodeCombination(KeyCode.Z, KeyCombination.CONTROL_DOWN);
        deshacerItem.setAccelerator(undoCombination);
        deshacerItem.setOnAction(actionEvent -> code.undo());

        KeyCombination redoCombination = new KeyCodeCombination(KeyCode.Y, KeyCombination.CONTROL_DOWN);
        rehacerItem.setAccelerator(redoCombination);
        rehacerItem.setOnAction(actionEvent -> code.redo());

        KeyCombination cutCombination = new KeyCodeCombination(KeyCode.X, KeyCombination.CONTROL_DOWN);
        cortarItem.setAccelerator(cutCombination);
        cortarItem.setOnAction(actionEvent -> code.cut());

        KeyCombination copyCombination = new KeyCodeCombination(KeyCode.C, KeyCombination.CONTROL_DOWN);
        copiarItem.setAccelerator(copyCombination);
        copiarItem.setOnAction(actionEvent -> code.copy());

        KeyCombination pasteCombination = new KeyCodeCombination(KeyCode.V, KeyCombination.CONTROL_DOWN);
        pegarItem.setAccelerator(pasteCombination);
        pegarItem.setOnAction(actionEvent -> code.paste());

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
     * Método para cargar el archivo en WorkingFile.
     */
    private void loadCurrentFile() {
        code.clear(); //Evita que deje residuos de código anterior
        try {
            Scanner s = new Scanner(workingFile).useDelimiter("");
            while(s.hasNext()){
                code.appendText(s.next());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    /**
     * Método que define la acción de guardar el archivo actual.
     * @param parent Instancia de la ventana principal.
     * @return Si el archivo se guardo o no.
     */
    private boolean saveAction(Stage parent) {
        FileChooser fileChooser = new FileChooser();
        if (workingFile == null) {
            fileChooser.setInitialFileName("untitled.ldr");
            workingFile = fileChooser.showSaveDialog(parent);
        }

        if (workingFile == null) return false;
        saveCurrentFile();
        return true;
    }

    /**
     * Método para guardar el archivo en WorkingFile.
     */
    private void saveCurrentFile() {
        try {
            PrintWriter writer = new PrintWriter(workingFile);
            writer.print(code.getText());
            writer.close();
            System.out.println("Archivo guardado correctamente");
            msgHandler.add("Archivo guardad correctamente", MessageType.INFO);
        } catch (IOException ex) {
            System.err.println("No se pudo guardar el archivo");
            msgHandler.add("No se pudo guardar el archivo", MessageType.ERROR);
        }
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

        msgHandler.setMessageContainer(messagesContainer);
    }

    /**
     * Método para compilar el archivo y obtener la ruta
     * @return la ruta del archivo compilado
     */
    private CompiledFile getCompiled() {
        String ruta = workingFile.getAbsolutePath();
        String rutaCompilado = Parser.compile(ruta);
        if (rutaCompilado == null) return null;
        String jsonCompiledString = "";
        CompiledFile cFile = null;
        try {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        cFile = mapper.readValue(new File(rutaCompilado), CompiledFile.class);
        } catch (IOException e) {
            System.out.println("Error en proceso de pasar de txt a string");
            msgHandler.add("Error en proceso de parsear archivo compilado", MessageType.INFO);
        }
        return cFile;
    }

}
