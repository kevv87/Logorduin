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

import Compiler.Helpers.CompiledFile;


/**
 * Clase de la interfaz para el canvas
 */
public class CanvasGui extends Application {

    private Cursor cursor;
    private ImageView imageCursor;

    private AnimationTimer update;
    private ArgumentHandler argHandler;
    private InstructionHandler instrHandler;
    private ProcedureHandler procHandler;
    private VariableHandler varHandler;

    public static CompiledFile cFile;

    @Override
    public void start(Stage stage) {
        argHandler = new ArgumentHandler();
        instrHandler = new InstructionHandler();
        procHandler = new ProcedureHandler();
        varHandler = new VariableHandler();
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

        //exec();

        stage.show();

        exec();

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
                cursor.move(1);
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

    private void manejoInstrucciones(String instruction, InstructionHandler instrHandler, ProcedureHandler procHandler){
      JsonNode args = instrHandler.getArgs(instruction);
        String action = instrHandler.getAction(instruction);
        ReturnType tipoRetorno = instrHandler.getReturnType(instruction);
        JsonNode body = instrHandler.getBody(instruction);
        InstructionType tipoInstruction = instrHandler.getType(instruction);

        switch(tipoInstruction){
          case NORMAL:
            break;
          case LOGIC:
            break;
          case OPERATION:
            break;
          case VARIABLE:
            break;
          case CYCLE:   //// Eu
            int repeticiones = Integer.parseInt(String.valueOf(args.get("value")));     // CUIDADO
            for(int i=0;i<repeticiones;i++){
              int j =0;
              String instruccionAnidada="";
              if(body.get(j)==null){  // Si esto pasa es porque el body solo es una accion
                instruccionAnidada = body;
                manejoInstrucciones(instruccionAnidada, instrHandler, procHandler);
              }else{
                while(body.get(j)!=null){
                  instruccionAnidada = body.get(j);
                  manejoInstrucciones(instruccionAnidada, instrHandler, procHandler);
                  j++;
                }
              }
            }
            break;
          case CONDITION:
            if(args.getType() == "BOOL_CONSTANT"){
              if(){ // Si es

              }
            }else{  // Hay que parsear el argumento

            }
            break;
          case PROCEDURE:
            break;
        }
    }

    private void exec(CompiledFile cFile){
      InstructionHandler instrHandler= cFile.getInstructions();
      ProcedureHandler procHandler = cFile.getProcedures();
      while(instrHandler.getInstructionCount() > 0){

        // Obteniendo los campos de la instruccion
        String instruction = instrHandler.getNext();
        manejoInstrucciones(instruction, instrHandler, procHandler);
      }
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
        cursor.updateRotation(rotation);
    }

    /**
     * Método que lanza la aplicación
     */
    public static void show() {
        new CanvasGui().start(new Stage());
    }
}
