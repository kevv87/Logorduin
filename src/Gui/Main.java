package Gui;

import Logic.MessageType;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
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
    private Color colorLapiz = Color.BLACK;

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
     * @param stage Instancia de la ventana principal.
     */
    private void setMenuButtonSection(Stage stage) {
        menuButtonContainer = new HBox();
        menuButtonContainer.setSpacing(20);

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
            runCanvas(800, 600);
        });

        DropShadow shadow = new DropShadow();
        compileButton.setOnMouseEntered(mouseEvent -> compileButton.setEffect(shadow));
        compileButton.setOnMouseExited(mouseEvent -> compileButton.setEffect(null));
        runButton.setOnMouseEntered(mouseEvent -> runButton.setEffect(shadow));
        runButton.setOnMouseExited(mouseEvent -> runButton.setEffect(null));

        buttonSection.getChildren().addAll(compileButton, runButton);

        menuButtonContainer.getChildren().add(setMenuBarSection(stage));
        menuButtonContainer.getChildren().addAll(buttonSection);
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
                File selectedFile = fileChooser.showOpenDialog(stage);
            });
        MenuItem guardarItem = new MenuItem("Guardar");
        guardarItem.setOnAction(e -> {
            File selectedFile = fileChooser.showOpenDialog(stage);
        });
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

        // Menu de vista
        Menu menuVista = new Menu("Vista");
        // Menu de Herramientas
        Menu menuHerramientas = new Menu("Herramientas");
        // Menu de Ayuda
        Menu menuAyuda = new Menu("Ayuda");

        MenuBar menuBar = new MenuBar();
        menuBar.setMinHeight(30);
        // TODO anadir iconos a items
        // TODO agregar items necesarios
        // TODO funcionalidades de cada item del menu

        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuVista, menuHerramientas, menuAyuda);

        return menuBar;
    }

    /**
     * Metodo para abrir un canvas
     * @param width ancho de la ventana del canvas
     * @param height altura de la ventana del canvas
     */
    void runCanvas(int width, int height){
        Stage canvasStage = new Stage();
        canvasStage.initModality(Modality.APPLICATION_MODAL);
        canvasStage.setTitle("Logorduin Canvas");

        Group canvasGroup = new Group();
        Canvas canvas = new Canvas(width, height);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        PixelWriter pixelWriter = graphicsContext.getPixelWriter();
        graphicsContext.fillRect(400, 300, 1, 1);
        drawLineCanvas(graphicsContext, width, height, 400, 300, 70, 0);
        canvasGroup.getChildren().add(canvas);
        canvasStage.setScene(new Scene(canvasGroup));
        canvasStage.show();
    }

    /**
     * Metodo para dibujar una linea
     * @param graphicsContext GraphicsContext correspondiente al canvas
     * @param width ancho de la ventana del canvas
     * @param height altura de la ventana del canvas
     * @param posX posicion horizontal desde la cual inicia el dibujo
     * @param posY posicion vertical desde la cual inicia el dibujo
     * @param length largo de la linea a dibujar
     * @param direction direccion hacia la cual se va a dibujar (0-arriba, 1-derecha, 2-abajo y 3-izquierda)
     */
    void drawLineCanvas(GraphicsContext graphicsContext, int width, int height, int posX, int posY, int length, int direction){
        graphicsContext.setFill(colorLapiz);
        for(int i = length; i>0; i--){
            switch (direction) {
                //Direccion-arriba
                case 0:
                    if(posY>=0){
                        graphicsContext.fillRect(posX, posY, 1, 1);         // TODO hallar alternativa a fillRect() por pixeles individuales
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
        switch (color){
            case 0:
                colorLapiz = Color.WHITE;
                break;
            case 1:
                colorLapiz = Color.BLUE;
                break;
            case 2:
                colorLapiz = Color.BROWN;
                break;
            case 3:
                colorLapiz = Color.CYAN;
                break;
            case 4:
                colorLapiz = Color.GRAY;
                break;
            case 5:
                colorLapiz = Color.YELLOW;
                break;
            case 6:
                colorLapiz = Color.BLACK;
                break;
            case 7:
                colorLapiz = Color.RED;
                break;
            case 8:
                colorLapiz = Color.GREEN;
                break;
        }
    }
}
