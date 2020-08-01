package Gui;

import Compiler.Helpers.*;
import Logic.Cursor;
import Logic.jsonAction;
import com.fasterxml.jackson.databind.JsonNode;
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

import java.util.concurrent.TimeUnit;

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
    private ObjectMapper mapper;
    private int Width;
    private int Height;
    private GraphicsContext graphicsContext;

    public static CompiledFile cFile;

    @Override
    public void start(Stage stage) {
        argHandler = new ArgumentHandler();
        instrHandler = new InstructionHandler();
        procHandler = new ProcedureHandler();
        varHandler = new VariableHandler();
        mapper = new ObjectMapper();
        Width = 600;
        Height = 600;
        Group canvasGroup = new Group();
        Scene scene = new Scene(canvasGroup);
        stage.setScene(scene);
        Canvas canvas = new Canvas(width, height);
        graphicsContext = canvas.getGraphicsContext2D();

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

        exec(CanvasGui.cFile);

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

    // Retorna Object, cada lugar que llame lo castea a conveniencia
    private Object manejoInstrucciones(String instruction, InstructionHandler instrHandler, ProcedureHandler procHandler){
      JsonNode args = instrHandler.getArgs(instruction);
        String action = instrHandler.getAction(instruction);
        ReturnType tipoRetorno = instrHandler.getReturnType(instruction);
        JsonNode body = instrHandler.getBody(instruction);
        InstructionType tipoInstruction = instrHandler.getType(instruction);

        switch(tipoInstruction){
          case NORMAL:
            normalInstruction(action, tipoInstruction, tipoRetorno, args);
            break;
          case LOGIC:
            break;
          case OPERATION:
            break;
          case VARIABLE:
            // Validando Argumentos
            String tipo = args.get(1).get("type").toString();
            if(tipo == null && action == "var"){  // No inicializada
              varHandler.add(args.get(0).get("value").toString());
            }
            switch(tipo){  // Diferente para cada tipo
                case "INT_CONSTANT":
                  if(action == "var"){
                    varHandler.add(args.get(0).get("value"), Integer.parseInt(args.get(1).get("value").toString()));
                  }else{
                    varHandler.modify(args.get(0).get("value"), Integer.parseInt(args.get(1).get("value").toString()));
                  }
                  break;
                case "FLOAT_CONSTANT":
                  if(action == "var"){
                    varHandler.add(args.get(0).get("value"), Float.parseFloat(args.get(1).get("value").toString()));
                  }else{
                    varHandler.modify(args.get(0).get("value"), Float.parseFloat(args.get(1).get("value").toString()));
                  }
                  break;
                case "INT_VARIABLE":
                  if(action == "var"){
                    varHandler.add(args.get(0).get("value"), varHandler.getInt(args.get(1).get("value").toString()));
                  }else{
                    varHandler.modify(args.get(0).get("value"), varHandler.getInt(args.get(1).get("value").toString()));
                  }
                  break;
                case "FLOAT_VARIABLE":
                  if(action == "var"){
                    varHandler.add(args.get(0).get("value"), varHandler.getFloat(args.get(1).get("value").toString()));
                  }else{
                    varHandler.modify(args.get(0).get("value"), varHandler.getFloat(args.get(1).get("value").toString()));
                  }
                  break;
                case "VARIABLE":
                  Float floatValue = varHandler.getFloat(args.get("value").toString());
                  Integer intValue = varHandler.getInt(args.get("value").toString());
                  if(floatValue != null){
                    if(action == "var"){
                    varHandler.add(args.get(0).get("value"), varHandler.getFloat(args.get(1).get("value").toString()));
                  }else{
                    varHandler.modify(args.get(0).get("value"), varHandler.getFloat(args.get(1).get("value").toString()));
                  }
                  }else if(intValue != null){
                    if(action == "var"){
                    varHandler.add(args.get(0).get("value"), varHandler.getInt(args.get(1).get("value").toString()));
                  }else{
                    varHandler.modify(args.get(0).get("value"), varHandler.getInt(args.get(1).get("value").toString()));
                  }
                  }else{  // No existe la variable
                    System.out.println("error"); // TODO: Error aca
                    return null;
                  }
                  break;
                case "INSTRUCTION": // Volvear a llamar y castear resultado al tipo de retorno
                  JsonNode instruccionAnidadaJ = args.get("value");
                  String tipoRetorno_aux = instruccionAnidadaJ.get("return").toString();
                  switch(tipoRetorno_aux){
                    case "INTEGER":
                    case "FLOAT":
                      break;
                    case "BOOLEAN":
                      break;
                    case "VOID":
                      break;
                  }
                  break;
              }
            if(action == "var"){

            }else {

            }
            break;
          case CYCLE:   //// Eu
            int repeticiones = 0;     // CUIDADO
            // Validando lsa repeticiones

            String tipo = args.get("type").toString();
            switch(tipo){  // Diferente para cada tipo
                case "INT_CONSTANT":
                  repeticiones = Integer.parseInt(args.get("value").toString());
                  break;
                case "FLOAT_CONSTANT":
                  return System.out.println("El input de repeticion no puede ser float"); //TODO: Error
                  break;
                case "INT_VARIABLE":
                  repeticiones = varHandler.getInt(args.get("value").toString());
                  break;
                case "FLOAT_VARIABLE":
                  return System.out.println("El input de repeticion no puede ser float"); //TODO: Error
                  break;
                case "VARIABLE":
                  Float floatValue = varHandler.getFloat(args.get("value").toString());
                  Integer intValue = varHandler.getInt(args.get("value").toString());
                  if(floatValue != null){
                    return System.out.println("El input de repeticion no puede ser float"); //TODO: Error
                  }else if(intValue != null){
                    repeticiones = intValue;
                  }else{  // No existe la variable
                    System.out.println("error"); // TODO: Error aca
                    return;
                  }
                  break;
                case "INSTRUCTION": // Volvear a llamar y castear resultado al tipo de retorno
                  JsonNode instruccionAnidadaJ = args.get("value");
                  String tipoRetorno = instruccionAnidada.get("return").toString();
                  switch(tipoRetorno){
                    case "INTEGER":
                      repeticiones = (int) manejoInstrucciones(instruccionAnidadaJ.toString(), instrHandler, procHandler);                      break;
                    case "FLOAT":
                      return System.out.println("El input de repeticion no puede ser float"); // TODO:Error
                      break;
                    case "BOOLEAN":
                      return System.out.println("El input de repeticion no puede ser bool");//TODO: Error
                      break;
                    case "VOID":
                      return System.out.println("El input de repeticion no puede ser void");// TODO:Error
                      break;
                  }
                  break;
              }


            for(int i=0;i<repeticiones;i++){
              int j =0;
              String instruccionAnidada="";
              if(body.get(j)==null){  // Si esto pasa es porque el body solo es una accion
                instruccionAnidada = body.toString();
                return manejoInstrucciones(instruccionAnidada, instrHandler, procHandler);
              }else{
                while(body.get(j)!=null){
                  instruccionAnidada = body.get(j).toString();
                  return manejoInstrucciones(instruccionAnidada, instrHandler, procHandler);
                  j++;
                }
              }
            }
            break;
          case CONDITION:
            // Validando condicion
            if(args.get(0).get("type").toString() == "BOOL_CONSTANT"){     // TODO:ese args puede dar problemas
              if(args.get(0).get("value").toString() == "false"){
                return;
              }
            }else if(args.get(0).get("type").toString()  == "INSTRUCTION"){  // TODO: Hay que parsear el argumento
                  JsonNode instruccionAnidadaJ = args.get(0).get("value");
                  String tipoRetorno = instruccionAnidadaJ.get("return").toString();
                  switch(tipoRetorno){
                    case "INTEGER":
                      System.out.println("debe devolver boolean"); //TODO:ERROR
                      break;
                    case "FLOAT":
                      System.out.println("Debe devolver boolean"); // TODO:ERROR
                      break;
                    case "BOOLEAN":
                      if(((boolean) manejoInstrucciones(instruccionAnidadaJ.toString(), instrHandler, procHandler)) == false){
                        return;
                      }
                      break;
                    case "VOID":
                      System.out.println("Error, la instruccion no puede devolver vacio");
                      break;
                  }
                }
                // Ejecutando las instrucciones, sorry por el indent xD
             int j =0;
              String instruccionAnidada="";
              if(body.get(j)==null){  // Si esto pasa es porque el body solo es una accion
                instruccionAnidada = body.toString();
                return manejoInstrucciones(instruccionAnidada, instrHandler, procHandler);
              }else{
                while(body.get(j)!=null){
                  instruccionAnidada = body.get(j).toString();
                  return manejoInstrucciones(instruccionAnidada, instrHandler, procHandler);
                  j++;
                }
              }
            break;
          case PROCEDURE:
            JsonNode procedure = mapper.readTree(procHandler.get_procs().get(action).toString()); //TODO: Manejar error de que pasa si no se encuentra esto
            JsonNode parametros = mapper.readTree(procedure.get("params").toString());
            int j =0;

            // Creando los parametros como variables en varHandler con el scope de la funcion
            while(parametros.get(j)!=null){
              String parametro = parametros.get(j).toString();
              JsonNode parametroJson = mapper.readTree(args.get(j));
              String tipo = parametroJson.get("type").toString();
              switch(tipo){  // Diferente para cada tipo
                case "INT_CONSTANT":
                  varHandler.createVar(parametro,NumberType.TYPE_INT, parametroJson.get("value").toString(), action);
                  break;
                case "FLOAT_CONSTANT":
                  varHandler.createVar(parametro, NumberType.TYPE_FLOAT, parametroJson.get("value").toString(), action);
                  break;
                case "INT_VARIABLE":
                  varHandler.createVar(parametro, varHandler.getInt(parametroJson.get("value").toString());
                  break;
                case "FLOAT_VARIABLE":
                  varHandler.createVar(parametro, varHandler.getFloat(parametroJson.get("value").toString()));
                  break;
                case "VARIABLE":
                  Float floatValue = varHandler.getFloat(parametroJson.get("value").toString());
                  Integer intValue = varHandler.getInt(parametroJson.get("value").toString());
                  if(floatValue != null){
                    varHandler.createVar(parametro, NumberType.TYPE_FLOAT, floatValue.toString(), action);
                  }else if(intValue != null){
                    varHandler.createVar(parametro, NumberType.TYPE_INT, intValue.toString(), action);
                  }else{
                    System.out.println("error"); // TODO: Error aca
                    return;
                  }
                  break;
                case "INSTRUCTION": // Volvear a llamar y castear resultado al tipo de retorno
                  JsonNode instruccionAnidada = mapper.readTree(parametroJson.get("value").toString());
                  String tipoRetorno = instruccionAnidada.get("return").toString();
                  switch(tipoRetorno){
                    case "INTEGER":
                      varHandler.createVar(parametro, NumberType.TYPE_INT, ((int)manejoInstrucciones(instruccionAnidada.toString())).toString(),action);
                      break;
                    case "FLOAT":
                      varHandler.createVar(parametro, NumberType.TYPE_FLOAT, ((Float)manejoInstrucciones(instruccionAnidada.toString())).toString(),action);
                      break;
                    case "BOOLEAN":
                      system.out.println("No se soportan booleanos como variables");  // TODO: This is wrong...
                      break;
                    case "VOID":
                      System.out.println("Error, la instruccion no puede devolver vacio");
                      break;
                  }
                  break;
              }
            }
            varHandler.setScope(action);
            // Cuerpo de la funcion
            j = 0;
            JsonNode instructions = mapper.readTree(procedure.get("instructions").toString());
            while(instructions.get(j) != null){
              String instruccionAnidada = instructions.get(j).toString();
              manejoInstrucciones(instruccionAnidada, instrHandler, procHandler);i
            }
            varHandler.resetScope();
            break;
        }
    }

    public Object normalInstruction(String action, InstructionType tipoInstruction, ReturnType tipoRetorno, JsonNode args){
      // Parsea los argumentos

      
      switch(action):
        case "avanza":
          int arg = args.get("type").asInt();
          avanza(arg);
          break;
        case "retrocede":
          int arg = args.get("type").asInt();
          retrocede(arg);
          break;
        case "giraderecha":
          int arg = args.get("type").asInt();
          cursor.updateRotation(arg, true);
          break;
        case "giraizquierda":
          int arg = args.get("type").asInt();
          cursor.updateRotation(arg, false);
          break;
        case "ponrumbo":
          break;
        case "ponx":
          break;
        case "pony":
          break;
        case "poncl":
          break;
        case "espera":
          break;
        case "ocultatortuga":
          hideCursor();
          break;
        case "aparecetortuga":
          showCursor();
          break;
        case "bajalapiz":
          cursor.setLapiz(true);
          break;
        case "subelapiz":
          cursor.setLapiz(false);
          break;
        case "centro":
          Double centerX = (double) (Width/2);
          Double centerY = (double) (Height/2);
          cursor.realocate( centerX, centerY);
          break;
        case "borrapantalla":
          graphicsContext.clearRect(0, 0, Width, Height);
          break;
        case "print":
          break;
    }

    public void avanza(int length){
      cursor.move(length, true);
    }

    public void retrocede(int length){
      cursor.move(length, false);
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
        cursor.updateRotation(rotation, true);      // TODO validate boolean
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
     * Metodo para llamar funciones del canvas segun codigo maquina
     */
/*    public void callFunction(String json, GraphicsContext graphicsContext, int Height, int Width) {
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
*/
    /**
     * Método que lanza la aplicación
     */
    public static void show() {
        new CanvasGui().start(new Stage());
    }
}
