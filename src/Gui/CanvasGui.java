package Gui;

import Compiler.Helpers.*;
import Logic.Cursor;
import Logic.jsonAction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
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

import java.util.HashMap;
import java.util.LinkedList;
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
    private int width;
    private int height;
    private GraphicsContext graphicsContext;

    public static CompiledFile cFile;

    @Override
    public void start(Stage stage) {
        argHandler = new ArgumentHandler();
        instrHandler = new InstructionHandler();
        procHandler = new ProcedureHandler();
        varHandler = new VariableHandler();
        mapper = new ObjectMapper();
        width = 600;
        height = 600;
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

        try {
            exec(CanvasGui.cFile);
        } catch (JsonProcessingException e) {  //TODO: Aqui se estarian agarrando los errores, tirarlos a la interfaz.
            e.printStackTrace();
        }

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
    private Object manejoInstrucciones(String instruction, InstructionHandler instrHandler, ProcedureHandler procHandler) throws JsonProcessingException {
      JsonNode args = instrHandler.getArgs(instruction);
        String action = instrHandler.getAction(instruction);
        ReturnType tipoRetorno = instrHandler.getReturnType(instruction);
        JsonNode body = instrHandler.getBody(instruction);
        InstructionType tipoInstruction = instrHandler.getType(instruction);

        switch(tipoInstruction){
          case NORMAL:
            return normalInstruction(action, tipoInstruction, tipoRetorno, args);
          case LOGIC:
            return logicInstruction(action, tipoInstruction, tipoRetorno, args);
            break;
          case OPERATION:
              return operationInstruction(action, tipoInstruction, tipoRetorno, args, instrHandler, procHandler);
          case VARIABLE:
            // Validando Argumentos
            String tipo = args.get(1).get("type").toString();
            if(tipo == null && action == "var"){  // No inicializada
              varHandler.add(args.get(0).get("value").toString());
            }
            switch(tipo) {  // Diferente para cada tipo
                case "INT_CONSTANT":
                    if (action == "var") {
                        varHandler.add(args.get(0).get("value").asText(), Integer.parseInt(args.get(1).get("value").toString()));
                    } else {
                        varHandler.modify(args.get(0).get("value").asText(), Integer.parseInt(args.get(1).get("value").toString()));
                    }
                    break;
                case "FLOAT_CONSTANT":
                    if (action == "var") {
                        varHandler.add(args.get(0).get("value").asText(), Float.parseFloat(args.get(1).get("value").toString()));
                    } else {
                        varHandler.modify(args.get(0).get("value").asText(), Float.parseFloat(args.get(1).get("value").toString()));
                    }
                    break;
                case "INT_VARIABLE":
                    if (action == "var") {
                        varHandler.add(args.get(0).get("value").asText(), varHandler.getInt(args.get(1).get("value").toString()));
                    } else {
                        varHandler.modify(args.get(0).get("value").asText(), varHandler.getInt(args.get(1).get("value").toString()));
                    }
                    break;
                case "FLOAT_VARIABLE":
                    if (action == "var") {
                        varHandler.add(args.get(0).get("value").asText(), varHandler.getFloat(args.get(1).get("value").toString()));
                    } else {
                        varHandler.modify(args.get(0).get("value").asText(), varHandler.getFloat(args.get(1).get("value").toString()));
                    }
                    break;
                case "VARIABLE":
                    Float floatValue = varHandler.getFloat(args.get("value").toString());
                    Integer intValue = varHandler.getInt(args.get("value").toString());
                    if (floatValue != null) {
                        if (action == "var") {
                            varHandler.add(args.get(0).get("value").asText(), varHandler.getFloat(args.get(1).get("value").toString()));
                        } else {
                            varHandler.modify(args.get(0).get("value").asText(), varHandler.getFloat(args.get(1).get("value").toString()));
                        }
                    } else if (intValue != null) {
                        if (action == "var") {
                            varHandler.add(args.get(0).get("value").asText(), varHandler.getInt(args.get(1).get("value").toString()));
                        } else {
                            varHandler.modify(args.get(0).get("value").asText(), varHandler.getInt(args.get(1).get("value").toString()));
                        }
                    } else {  // No existe la variable
                        System.out.println("error"); // TODO: Error aca
                        return null;
                    }
                    break;
                case "INSTRUCTION": // Volvear a llamar y castear resultado al tipo de retorno
                    JsonNode instruccionAnidadaJ = args.get("value");
                    String tipoRetorno_aux = instruccionAnidadaJ.get("return").toString();
                    switch (tipoRetorno_aux) {
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
            break;
          case CYCLE:   //// Eu
            int repeticiones = 0;     // CUIDADO
            // Validando lsa repeticiones

            String tipo_aux = args.get("type").toString();
            switch(tipo_aux){  // Diferente para cada tipo
                case "INT_CONSTANT":
                  repeticiones = Integer.parseInt(args.get("value").toString());
                  break;
                case "FLOAT_CONSTANT":
                  System.out.println("El input de repeticion no puede ser float"); //TODO: Error
                  return null;
                case "INT_VARIABLE":
                  repeticiones = varHandler.getInt(args.get("value").toString());
                  break;
                case "FLOAT_VARIABLE":
                  System.out.println("El input de repeticion no puede ser float"); //TODO: Error
                  return null;
                case "VARIABLE":
                  Float floatValue = varHandler.getFloat(args.get("value").toString());
                  Integer intValue = varHandler.getInt(args.get("value").toString());
                  if(floatValue != null){
                    System.out.println("El input de repeticion no puede ser float"); //TODO: Error
                    return null;
                  }else if(intValue != null){
                    repeticiones = intValue;
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
                      repeticiones = (int) manejoInstrucciones(instruccionAnidadaJ.toString(), instrHandler, procHandler);                      break;
                    case "FLOAT":
                      System.out.println("El input de repeticion no puede ser float"); // TODO:Error
                      return null;
                    case "BOOLEAN":
                      System.out.println("El input de repeticion no puede ser bool");//TODO: Error
                      return null;
                    case "VOID":
                      System.out.println("El input de repeticion no puede ser void");// TODO:Error
                      return null;
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
                  manejoInstrucciones(instruccionAnidada, instrHandler, procHandler);
                  j++;
                }
              }
            }
            break;
          case CONDITION:
            // Validando condicion
            if(args.get(0).get("type").toString() == "BOOL_CONSTANT"){     // TODO:ese args puede dar problemas
              if(args.get(0).get("value").toString() == "false"){
                return null;
              }
            }else if(args.get(0).get("type").toString()  == "INSTRUCTION"){  // TODO: Hay que parsear el argumento
                  JsonNode instruccionAnidadaJ = args.get(0).get("value");
                  String tipoRetorno_aux = instruccionAnidadaJ.get("return").toString();
                  switch(tipoRetorno_aux){
                    case "INTEGER":
                      System.out.println("debe devolver boolean"); //TODO:ERROR
                      break;
                    case "FLOAT":
                      System.out.println("Debe devolver boolean"); // TODO:ERROR
                      break;
                    case "BOOLEAN":
                      if(!((boolean) manejoInstrucciones(instruccionAnidadaJ.toString(), instrHandler, procHandler))){
                        return null;
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
                  manejoInstrucciones(instruccionAnidada, instrHandler, procHandler);
                  j++;
                }
              }
            break;
          case PROCEDURE:
            JsonNode procedure = mapper.readTree(procHandler.get_procs().get(action).toString()); //TODO: Manejar error de que pasa si no se encuentra esto
            JsonNode parametros = mapper.readTree(procedure.get("params").toString());
            int k =0;

            // Creando los parametros como variables en varHandler con el scope de la funcion
            while(parametros.get(k)!=null){
              String parametro = parametros.get(k).toString();
              JsonNode parametroJson = mapper.readTree(args.get(k).toString());
              String tipo_aux1 = parametroJson.get("type").toString();
              switch(tipo_aux1){  // Diferente para cada tipo
                case "INT_CONSTANT":
                  varHandler.createVar(parametro,NumberType.TYPE_INT, parametroJson.get("value").toString(), action);
                  break;
                case "FLOAT_CONSTANT":
                  varHandler.createVar(parametro, NumberType.TYPE_FLOAT, parametroJson.get("value").toString(), action);
                  break;
                case "INT_VARIABLE":
                  varHandler.createVar(parametro, NumberType.TYPE_INT, varHandler.getInt(parametroJson.get("value").toString()).toString(), action);
                  break;
                case "FLOAT_VARIABLE":
                  varHandler.createVar(parametro, NumberType.TYPE_FLOAT, varHandler.getFloat(parametroJson.get("value").toString()).toString(), action);
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
                    return null;
                  }
                  break;
                case "INSTRUCTION": // Volvear a llamar y castear resultado al tipo de retorno
                  JsonNode instruccionAnidadaJ = mapper.readTree(parametroJson.get("value").toString());
                  String tipoRetorno_aux = instruccionAnidadaJ.get("return").toString();
                  switch(tipoRetorno_aux){
                    case "INTEGER":
                      varHandler.createVar(parametro, NumberType.TYPE_INT, ((Integer)manejoInstrucciones(instruccionAnidadaJ.toString(), instrHandler, procHandler)).toString(),action);
                      break;
                    case "FLOAT":
                      varHandler.createVar(parametro, NumberType.TYPE_FLOAT, ((Float)manejoInstrucciones(instruccionAnidadaJ.toString(), instrHandler, procHandler)).toString(),action);
                      break;
                    case "BOOLEAN":
                      System.out.println("No se soportan booleanos como variables");  // TODO: This is wrong...
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
              String instruccionAnidadaJ = instructions.get(j).toString();
              manejoInstrucciones(instruccionAnidadaJ, instrHandler, procHandler);
            }
            varHandler.resetScope();
            break;
        }
        return null; // TODO: Asegurarse de que cada switch devuelve algo
    }

    /**
     * Metodo para parsear argumentos. Retorna un Hashmap con un unico elemento cuyo key es el tipo de valor del dato
     * y cuyo valor es el dato en su forma de Object.
     * @param args JsonNode con el argumento a parsear. Solo puede ser uno.
     * @param instrHandler Instruction handler de donde va a sacar las instrucciones.
     * @param procHandler Procedure handler de donde saca los procedimientos.
     * */
    private HashMap<String,Object> parseoArgs(JsonNode args, InstructionHandler instrHandler, ProcedureHandler procHandler) throws JsonProcessingException {  // Parsea UN argumento, no pasar multiples.
        String tipo = args.get("type").asText();
        HashMap<String, Object> retorno = new HashMap<>();
        switch(tipo){
            case "INT_CONSTANT":
                retorno.put("int", args.get("value").asInt());
                break;
            case "FLOAT_CONSTANT":
                retorno.put("float", Float.parseFloat(args.get("value").asText()));
                break;
            case "STRING_CONSTANT":
                retorno.put("string", args.get("value").asText());
                break;
            case "BOOL_CONSTANT":
                retorno.put("boolean",args.get("value").asBoolean());
                break;
            case "INT_VARIABLE":
                retorno.put("int",varHandler.getInt(args.get("value").asText()));
                break;
            case "FLOAT_VARIABLE":
                retorno.put("float",varHandler.getFloat(args.get("value").asText()));
                break;
            case "VARIABLE":
                Float floatValue = varHandler.getFloat(args.get("value").asText());
                Integer intValue = varHandler.getInt(args.get("value").asText());
                if(floatValue != null){
                    retorno.put("float", floatValue);
                }else if(intValue != null){
                    retorno.put( "int", intValue);
                }else{
                    System.out.println("error"); // TODO: Error aca
                    return null;
                }
                break;
            case "INSTRUCTION":
            case "OPERATION":
            case "LOGIC":
                JsonNode instruccionJ = args.get("value");
                String returnType = args.get("value").asText();
                switch (returnType) {
                    case "INTEGER" -> retorno.put("int", (int) manejoInstrucciones(instruccionJ.toString(), instrHandler, procHandler));
                    case "FLOAT" -> retorno.put("float", (int) manejoInstrucciones(instruccionJ.toString(), instrHandler, procHandler));
                    case "BOOLEAN" -> retorno.put("boolean", (int) manejoInstrucciones(instruccionJ.toString(), instrHandler, procHandler));
                    case "VOID" -> retorno.put("void", (int) manejoInstrucciones(instruccionJ.toString(), instrHandler, procHandler));
                }
                break;
        }
        return retorno;
    }

    /**
     * Because Im dumb e hice la funcion de parsearArgumentos que trabajara con un solo argumento, hice esta otra
     * que se le pasa una lista de argumentos (args) y retorna una lista de hashmaps donde cada hashmap
     * representa un argumento. El key de cada hashmap es el tipo de argumento, que solo puede ser: string, boolean, int, float
     * el value de cada hashmap es el valor de cada argumento en clase Object, entonces hay que castearlo al tipo de key del
     * hashmap.
     * @param args  Lista de argumentos a parsear
     * @param instrHandler Lo de siempre
     * @param procHandler Lo de siempre
     * @return Lista de argumentos parseados en forma de Hashmap.
     * */
    private LinkedList<HashMap<String, Object>> parsearMultiplesArgumentos(JsonNode args, InstructionHandler instrHandler, ProcedureHandler procHandler) throws JsonProcessingException {
        LinkedList<HashMap<String, Object>> argumentosParseados = new LinkedList<>();
        int i =0;
        while(args.get(i) !=null){
            JsonNode argumento = args.get(i);
            argumentosParseados.add(parseoArgs(argumento, instrHandler, procHandler));
        }
        return argumentosParseados;
    }

    private Object operationInstruction(String action, InstructionType tipoInstruction, ReturnType tipoRetorno, JsonNode args, InstructionHandler instrHandler, ProcedureHandler procHandler) throws JsonProcessingException {
        // Parseando argumentos.
        LinkedList<HashMap<String, Object>> argPars = parsearMultiplesArgumentos(args, instrHandler, procHandler);
        switch(action){
            case "+":
                if(argPars.get(0).get("int") != null){
                    if(argPars.get(1).get("int") == null){
                        System.out.println("No se pueden sumar dos valores diferentes"); // TODO:Error
                    }
                    return (int)argPars.get(0).get("int") + (int)argPars.get(1).get("int");
                }else if(argPars.get(0).get("float") != null){
                    if(argPars.get(1).get("float") == null){
                        System.out.println("No se pueden sumar dos valores diferentes"); // TODO:Error
                    }
                    return (float)argPars.get(0).get("float") + (float)argPars.get(1).get("float");
                }else{
                    System.out.println("Solo puede ser int o float"); // TODO: Error
                    return null;
                }
            case "-":
                if(argPars.get(0).get("int") != null){
                    if(argPars.get(1).get("int") == null){
                        System.out.println("No se pueden sumar dos valores diferentes"); // TODO:Error
                    }
                    return (int)argPars.get(1).get("int") - (int)argPars.get(0).get("int");
                }else if(argPars.get(0).get("float") != null){
                    if(argPars.get(1).get("float") == null){
                        System.out.println("No se pueden sumar dos valores diferentes"); // TODO:Error
                    }
                    return (float)argPars.get(1).get("float") - (float)argPars.get(0).get("float");
                }else{
                    System.out.println("Solo puede ser int o float"); // TODO: Error
                    return null;
                }
            case "*":
                if(argPars.get(0).get("int") != null){
                    if(argPars.get(1).get("int") == null){
                        System.out.println("No se pueden sumar dos valores diferentes"); // TODO:Error
                    }
                    return (int)argPars.get(1).get("int") * (int)argPars.get(0).get("int");
                }else if(argPars.get(0).get("float") != null){
                    if(argPars.get(1).get("float") == null){
                        System.out.println("No se pueden sumar dos valores diferentes"); // TODO:Error
                    }
                    return (float)argPars.get(1).get("float") * (float)argPars.get(0).get("float");
                }else{
                    System.out.println("Solo puede ser int o float"); // TODO: Error
                    return null;
                }
            case "/":
                if(argPars.get(0).get("int") != null){
                    if(argPars.get(1).get("int") == null){
                        System.out.println("No se pueden sumar dos valores diferentes"); // TODO:Error
                    }
                    return (int)argPars.get(1).get("int") / (int)argPars.get(0).get("int");
                }else if(argPars.get(0).get("float") != null){
                    if(argPars.get(1).get("float") == null){
                        System.out.println("No se pueden sumar dos valores diferentes"); // TODO:Error
                    }
                    return (float)argPars.get(1).get("float") / (float)argPars.get(0).get("float");
                }else{
                    System.out.println("Solo puede ser int o float"); // TODO: Error
                    return null;
                }
        }
        return null;
    }

    private Object logicInstruction(String action, InstructionType tipoInstruction, ReturnType tipoRetorno, JsonNode args, InstructionHandler instrHandler, ProcedureHandler procHandler) throws JsonProcessingException {
        // Parseando argumentos.
        LinkedList<HashMap<String, Object>> argPars = parsearMultiplesArgumentos(args, instrHandler, procHandler);
        switch(action){
            case "iguales":
                if(argPars.get(0).get("boolean") != null && argPars.get(1).get("boolean") != null){
                    return (boolean)argPars.get(0).get("boolean") == (boolean)argPars.get(1).get("boolean");
                }else{
                    System.out.println("Solo puede ser boolean"); // TODO: Error
                    return null;
                }
            case "mayorque":
                if(argPars.get(0).get("boolean") != null && argPars.get(1).get("boolean") != null){
                    return (boolean)argPars.get(0).get("boolean") > (boolean)argPars.get(1).get("boolean");
                }else{
                    System.out.println("Solo puede ser boolean"); // TODO: Error
                    return null;
                }
            case "menorque":
                if(argPars.get(0).get("boolean") != null && argPars.get(1).get("boolean") != null){
                    return (boolean)argPars.get(0).get("boolean") < (boolean)argPars.get(1).get("boolean");
                }else{
                    System.out.println("Solo puede ser boolean"); // TODO: Error
                    return null;
                }
            case "y":
                if(argPars.get(0).get("boolean") != null && argPars.get(1).get("boolean") != null){
                    return (boolean)argPars.get(0).get("boolean") && (boolean)argPars.get(1).get("boolean");
                }else{
                    System.out.println("Solo puede ser boolean"); // TODO: Error
                    return null;
                }
            case "o":
                if(argPars.get(0).get("boolean") != null && argPars.get(1).get("boolean") != null){
                    return (boolean)argPars.get(0).get("boolean") || (boolean)argPars.get(1).get("boolean");
                }else{
                    System.out.println("Solo puede ser boolean"); // TODO: Error
                    return null;
                }
        }
        return null;
    }


    public Object normalInstruction(String action, InstructionType tipoInstruction, ReturnType tipoRetorno, JsonNode args, InstructionHandler instrHandler, ProcedureHandler procHandler){
      // Parseando argumentos.
      LinkedList<HashMap<String, Object>> argPars = parsearMultiplesArgumentos(args, instrHandler, procHandler);
      switch(action) {
          case "avanza":
              if(argPars.get(0).get("int") != null){
                avanza((int)argPars.get(0).get("int"))
              }
              break;
          case "retrocede":
              arg = args.get("type").asInt();
              retrocede(arg);
              break;
          case "giraderecha":
              arg = args.get("type").asInt();
              cursor.updateRotation(arg, true);
              break;
          case "giraizquierda":
              arg = args.get("type").asInt();
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
              Double centerX = (double) (width / 2);
              Double centerY = (double) (height / 2);
              cursor.realocate(centerX, centerY);
              break;
          case "borrapantalla":
              graphicsContext.clearRect(0, 0, width, height);
              break;
          case "print":
              break;
      }
      return null;
    }

    public void avanza(int length){
      cursor.move(length, true);
    }

    public void retrocede(int length){
      cursor.move(length, false);
    }

    private void exec(CompiledFile cFile) throws JsonProcessingException {
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
