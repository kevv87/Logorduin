package Gui;

import Compiler.Exceptions.CompilerException;
import Compiler.Helpers.*;
import Logic.Cursor;
import Logic.MessageHandler;
import Logic.MessageType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.Random;

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
    private int cont;
    private GraphicsContext graphicsContext;
    private Random random;
    private LinkedList<LinkedList<String>> instructionTail;

    public static CompiledFile cFile;

    @Override
    public void start(Stage stage) {
        cont = 0;
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
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                System.out.println( "Kill meee");
                update.stop();
            }
        });
        Canvas canvas = new Canvas(width, height);
        graphicsContext = canvas.getGraphicsContext2D();
        instructionTail = new LinkedList<>();
        PixelWriter pixelWriter = graphicsContext.getPixelWriter();
        graphicsContext.fillRect(400, 300, 1, 1);
        //Creacion del cursor
        imageCursor = CommonMethods.loadImageView("/res/turtle.png", 30, 30);
        cursor = new Cursor(imageCursor, width, height, graphicsContext);
        imageCursor.setLayoutX(cursor.getPosX()-15);
        imageCursor.setLayoutY(cursor.getPosY()-15);
        MessageHandler msgHandler = MessageHandler.getInstance();


//        drawLineCanvas(graphicsContext,400, 300, 70, 0);
        try {
            canvasGroup.getChildren().addAll(imageCursor, canvas);
            configureUpdateLoop();

            //exec();

            stage.show();
            //updateCursor();
            exec(CanvasGui.cFile);
            update.start();
            //updateCursor();
        } catch (JsonProcessingException e) {  //TODO: Aqui se estarian agarrando los errores, tirarlos a la interfaz.
            e.printStackTrace();
        } catch(CompilerException err){
            msgHandler.add(err.getMensaje(),MessageType.ERROR);
            stage.close();
        }

    }

    /**
     * Método para actualizar el dibujo
     */
    private void configureUpdateLoop() {
        //rotateCursor(45);
        update = new AnimationTimer() {
            @Override
            public void handle(long l) {
                //rotateCursor(1);
                //cursor.move(1, true);
                try{
                    Thread.sleep(1000);
                    LinkedList<String> instruction;

                    if(instructionTail.size() > 0 && cont >1 ){
                        instruction = instructionTail.getFirst();
                        switch (instruction.getFirst()){
                            case "avanza":
                                cursor.move(Integer.parseInt(instruction.get(1)), true);
                                System.out.println("Debi haber avanzado");
                                break;
                            case "retrocede":
                                cursor.move(Integer.parseInt(instruction.get(1)), false);
                                System.out.println("Debi haber retrocedido");
                                break;
                            case "update":
                                imageCursor.setRotate(cursor.getRotation());
                                imageCursor.setLayoutX(cursor.getPosX()-15);
                                imageCursor.setLayoutY(cursor.getPosY()-15);
                                System.out.println("Debi haber actualizado?");
                                break;
                            case "giraderecha":
                                cursor.updateRotation(Integer.parseInt(instruction.get(1)), true);
                                System.out.println("Debi haber girado a la derecha");
                                break;
                            case "giraizquierda":
                                cursor.updateRotation(Integer.parseInt(instruction.get(1)), false);
                                System.out.println("Debi haber girado a la izquierda");
                                break;
                            case "ponpos":
                                cursor.realocate(Integer.parseInt(instruction.get(1)), Integer.parseInt(instruction.get(2)));
                                System.out.println("Debi haber puesto otra posicion");
                                break;
                            case "ponrumbo":
                                cursor.setRotation(Integer.parseInt(instruction.get(1)));
                                System.out.println("Debi haber ponrumbo");
                                break;
                            case "rumbo":
                                cursor.getRotation();
                                break;
                            case "hide":
                                imageCursor.setVisible(false);
                                System.out.println("Debi haberme ocultado");
                                break;
                            case "show":
                                imageCursor.setVisible(true);
                                System.out.println("Debi haber aparecido");
                                break;
                            case "ponx":
                                cursor.setPosX(Integer.parseInt(instruction.get(1)));
                                break;
                            case "pony":
                                cursor.setPosY(Integer.parseInt(instruction.get(1)));
                                break;
                            case "bajalapiz":
                                cursor.setLapiz(true);
                                break;
                            case "subelapiz":
                                cursor.setLapiz(false);
                                break;
                            case "poncolor":
                                Color color = convertColor(instruction.get(1));
                                cursor.setCurrentColor(color);
                                break;
                            case "centro":
                                int centerX = (int) (Integer.parseInt(instruction.get(1)) / 2);
                                int centerY = (int) (Integer.parseInt(instruction.get(2)) / 2);
                                cursor.realocate(centerX, centerY);
                                break;
                            case "espera":
                                int tiempo = Integer.parseInt(instruction.get(1));
                                try {
                                    TimeUnit.SECONDS.sleep(tiempo);
                                } catch (InterruptedException e){
                                    e.printStackTrace();
                                }
                            case "borrapantalla":
                                graphicsContext.clearRect(0, 0, width, height);
                                break;
                            default:
                                break;
                        }
                        instructionTail.removeFirst();
                        // Despues de aplicar los cambios, update the image
                        updateCursor();
                    }else if(cont==0 || cont==1){
                        cursor.move(0, true);
                        updateCursor();
                        cont+=1;
                    }

               } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
    }

    // Retorna Object, cada lugar que llame lo castea a conveniencia
    private Object manejoInstrucciones(String instruction, InstructionHandler instrHandler, ProcedureHandler procHandler) throws JsonProcessingException, CompilerException {
      JsonNode args = instrHandler.getArgs(instruction);
        String action = instrHandler.getAction(instruction);
        ReturnType tipoRetorno = instrHandler.getReturnType(instruction);
        JsonNode body = instrHandler.getBody(instruction);
        InstructionType tipoInstruction = instrHandler.getType(instruction);

        switch(tipoInstruction){
          case NORMAL:
            return normalInstruction(action, tipoInstruction, tipoRetorno, args, instrHandler, procHandler, instruction);
          case LOGIC:
            return logicInstruction(action, tipoInstruction, tipoRetorno, args, instrHandler, procHandler, instruction);
          case OPERATION:
              return operationInstruction(action, tipoInstruction, tipoRetorno, args, instrHandler, procHandler, instruction);
          case VARIABLE:
            // Validando Argumentos
              LinkedList<HashMap<String,Object>> argumentosParseados = parsearMultiplesArgumentos(args,instrHandler,procHandler, instruction);
              if(argumentosParseados.get(0).get("string") == null){
                  System.out.println("El nombre de la variable no es un string");
                  return null;
              }else if(argumentosParseados.size() == 1){  // Solo definicion, agrega la variable con null.
                  varHandler.add((String)argumentosParseados.get(0).get("string"));
                  return null;
              }

              // Agrega o modifica la variable.
              if(action.equals("var")){  // Definicion
                  if(argumentosParseados.get(1).get("int") != null){
                      varHandler.add((String) argumentosParseados.get(0).get("string"), (int)argumentosParseados.get(1).get("int"));
                  }else if(argumentosParseados.get(1).get("float") != null){
                      varHandler.add((String)argumentosParseados.get(0).get("string"), (float)argumentosParseados.get(1).get("float"));
                  }else if (argumentosParseados.get(1).get("boolean")!=null){
                      varHandler.add((String)argumentosParseados.get(0).get("string"), (boolean)argumentosParseados.get(1).get("boolean"));
                  }else{
                      throw new CompilerException("Tipo de valor no soportado para una variable", instruction);
                  }
              }else if(action.equals("inic")){  //Modificacion
                  try {
                      if (argumentosParseados.get(1).get("int") != null) {
                          varHandler.modify((String) argumentosParseados.get(0).get("string"), (int) argumentosParseados.get(1).get("int"));
                      } else if (argumentosParseados.get(1).get("float") != null) {
                          varHandler.modify((String) argumentosParseados.get(0).get("string"), (float) argumentosParseados.get(1).get("float"));
                      } else if (argumentosParseados.get(1).get("boolean") != null) {
                          varHandler.modify((String) argumentosParseados.get(0).get("string"), (boolean) argumentosParseados.get(1).get("boolean"));
                      }else
                      {
                          throw new CompilerException("Este tipo no se puede asignar a esta variable", instruction);
                      }
                  }catch(CompilerException err){
                      err.setInstruccion(instruction);
                  }
              }else{
                  throw new CompilerException("Error inesperado en VARIABLE", instruction);
              }
              return null;
          case CYCLE:   //// Eu
          // Parseo de argumentos
            argumentosParseados = parsearMultiplesArgumentos(args, instrHandler, procHandler, instruction);

            // Validando primer argumento
            if(argumentosParseados.get(0).get("int") == null){
                System.out.println("El numero de repeticiones debe ser un integer");
                throw new CompilerException("El numero de repeticiones debe ser un integer", instruction);
            }

            // Setteando el numero de repeticiones
            int repeticiones = (int)argumentosParseados.get(0).get("int");

            // Ejecutando el ciclo
          for(int i=0;i<repeticiones;i++){
            int j =0;
            String instruccionAnidada="";
              while(body.get(j)!=null){
                instruccionAnidada = body.get(j).textValue();

                // Ejecutando cada instruccion
                manejoInstrucciones(instruccionAnidada, instrHandler, procHandler);
                j++;
              }
          }
          return null;
          case CONDITION:
            // Validando condicion
              argumentosParseados = parsearMultiplesArgumentos(args, instrHandler, procHandler, instruction);

              // Validando primer argumento
              if(argumentosParseados.get(0).get("boolean") == null){
                  throw new CompilerException("La condicion solo puede ser un boolean", instruction);
              }

              if(!((boolean) argumentosParseados.get(0).get("boolean"))){
                  return null;
              }
                // Ejecutando las instrucciones, sorry por el indent xD
             int j =0;
              String instruccionAnidada="";
                while(body.get(j)!=null){
                  instruccionAnidada = body.get(j).textValue();
                  manejoInstrucciones(instruccionAnidada, instrHandler, procHandler);
                  j++;
                }
                return null;
          case PROCEDURE:
              if(procHandler.get_procs() == null || procHandler.get_procs().get(action) == null){
                  throw new CompilerException("No hay procedimientos definidos con este nombre",instruction);
              }
              JsonNode procedure = mapper.readTree(procHandler.get_procs().get(action));
              JsonNode parametros = mapper.readTree(procedure.get("params").toString());
              argumentosParseados = parsearMultiplesArgumentos(args, instrHandler, procHandler, instruction);
              int k =0;
              while(k < argumentosParseados.size()){  // Creando los parametros como variables con el scope de la funcion
                  String parametro = parametros.get(k).textValue();
                  if(argumentosParseados.get(k).get("int") != null){
                      varHandler.createVar(parametro,NumberType.TYPE_INT, String.valueOf((int)argumentosParseados.get(k).get("int")), action);
                  }else if(argumentosParseados.get(k).get("float")!=null){
                      varHandler.createVar(parametro,NumberType.TYPE_FLOAT, String.valueOf((float)argumentosParseados.get(k).get("float")), action);
                  }else if(argumentosParseados.get(k).get("boolean")!=null){
                      varHandler.createVar(parametro,NumberType.TYPE_BOOL, String.valueOf((boolean)argumentosParseados.get(k).get("boolean")), action);
                  }else{
                      System.out.println("Tipo de parametro no valido.");
                  }
                  k++;
              }
            varHandler.setScope(action);
            // Cuerpo de la funcion
            j = 0;
            JsonNode instructions = procedure.get("instructions");
            if(instructions == null){
                throw new CompilerException("No hay instrucciones que ejecutar", instruction);
            }
            while(instructions.get(j) != null){
              String instruccionAnidadaJ = instructions.get(j).textValue();
              manejoInstrucciones(instruccionAnidadaJ, instrHandler, procHandler);
              j++;
            }
            varHandler.resetScope();
            return null;
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
    private HashMap<String,Object> parseoArgs(JsonNode args, InstructionHandler instrHandler, ProcedureHandler procHandler, String instruction) throws JsonProcessingException, CompilerException {  // Parsea UN argumento, no pasar multiples.
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
                Boolean boolValue = varHandler.getBoolean(args.get("value").asText());
                if(floatValue != null){
                    retorno.put("float", floatValue);
                }else if(intValue != null){
                    retorno.put( "int", intValue);
                }else if(boolValue !=null){
                    retorno.put("boolean", boolValue);
                }else{
                    throw new CompilerException("La variable retorna un error que no esta soportado.", instruction);
                }
                break;
            case "INSTRUCTION":
                JsonNode instruccionJ = args.get("value");
                String returnType = args.get("value").asText();
                switch (returnType) {
                    case "INTEGER" -> retorno.put("int", (int) manejoInstrucciones(instruccionJ.toString(), instrHandler, procHandler));
                    case "FLOAT" -> retorno.put("float", (int) manejoInstrucciones(instruccionJ.toString(), instrHandler, procHandler));
                    case "BOOLEAN" -> retorno.put("boolean", (int) manejoInstrucciones(instruccionJ.toString(), instrHandler, procHandler));
                    case "VOID" -> retorno.put("void", (int) manejoInstrucciones(instruccionJ.toString(), instrHandler, procHandler));
                }
                break;
            case "OPERATION":
                //LinkedList<HashMap<String, Object>> parsArgs = parsearMultiplesArgumentos(args.get("args"), instrHandler, procHandler);
                returnType = args.get("return").asText();
                Object valor = operationInstruction(args.get("action").asText(), null, null, args.get("args"), instrHandler, procHandler, instruction);
                switch(returnType){
                    case"INTEGER":
                        retorno.put("int", valor);
                        break;
                    case "FLOAT":
                        retorno.put("float",valor);
                        break;
                    default:
                        System.out.println("El tipo de retorno solo puede ser integer o float para una operacion aritmetica");
                        break;
                }
                break;
            case "LOGIC":
                returnType = args.get("return").asText();
                valor = operationInstruction(args.get("action").asText(), null, null, args.get("args"), instrHandler, procHandler, instruction);
                switch(returnType){
                    case"BOOLEAN":
                        retorno.put("boolean", valor);
                        break;
                    default:
                        System.out.println("El tipo de retorno no es valido para una operacion logica");
                        break;
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
    private LinkedList<HashMap<String, Object>> parsearMultiplesArgumentos(JsonNode args, InstructionHandler instrHandler, ProcedureHandler procHandler, String instruction) throws JsonProcessingException, CompilerException {
        LinkedList<HashMap<String, Object>> argumentosParseados = new LinkedList<>();
        int i =0;
        while(args.get(i) !=null){
            JsonNode argumento = args.get(i);
            argumentosParseados.add(parseoArgs(argumento, instrHandler, procHandler, instruction));
            i++;
        }
        return argumentosParseados;
    }

    private Object operationInstruction(String action, InstructionType tipoInstruction, ReturnType tipoRetorno, JsonNode args, InstructionHandler instrHandler, ProcedureHandler procHandler, String instruction) throws JsonProcessingException, CompilerException {
        // Parseando argumentos.
        LinkedList<HashMap<String, Object>> argPars = parsearMultiplesArgumentos(args, instrHandler, procHandler, instruction);
        switch(action){
            case "+":
                if(argPars.get(0).get("int") != null){
                    if(argPars.get(1).get("float") != null){
                        return (int)argPars.get(0).get("int") + (float)argPars.get(1).get("float");
                    }else if(argPars.get(1).get("int")!=null){
                        return (int)argPars.get(0).get("int") + (int)argPars.get(1).get("int");
                    }else{
                        throw new CompilerException("Solo se pueden sumar integers o floats", instruction);
                    }
                }else if(argPars.get(0).get("float") != null){
                    if(argPars.get(1).get("float") != null){
                        return (float)argPars.get(0).get("float") + (float)argPars.get(1).get("float");
                    }else if(argPars.get(1).get("int") != null){
                        return (float)argPars.get(0).get("float") + (int)argPars.get(1).get("int");
                    }else{
                        throw new CompilerException("Solo se pueden sumar integers o floats", instruction);
                    }
                }else{
                    throw new CompilerException("Solo se pueden sumar integers o floats", instruction);
                }
            case "-":
                if(argPars.get(0).get("int") != null){
                    if(argPars.get(1).get("float") != null){
                        return (int)argPars.get(0).get("int") - (float)argPars.get(1).get("float");
                    }else if(argPars.get(1).get("int")!=null){
                        return (int)argPars.get(0).get("int") - (int)argPars.get(1).get("int");
                    }else{
                        throw new CompilerException("Solo se pueden sumar integers o floats", instruction);
                    }
                }else if(argPars.get(0).get("float") != null){
                    if(argPars.get(1).get("float") != null){
                        return (float)argPars.get(0).get("float") - (float)argPars.get(1).get("float");
                    }else if(argPars.get(1).get("int") != null){
                        return (float)argPars.get(0).get("float") - (int)argPars.get(1).get("int");
                    }else{
                        throw new CompilerException("Solo se pueden restar integers o floats", instruction);
                    }
                }else{
                    throw new CompilerException("Solo se pueden restar integers o floats", instruction);
                }
            case "*":
                if(argPars.get(0).get("int") != null){
                    if(argPars.get(1).get("float") != null){
                        return (int)argPars.get(0).get("int") * (float)argPars.get(1).get("float");
                    }else if(argPars.get(1).get("int")!=null){
                        return (int)argPars.get(0).get("int") * (int)argPars.get(1).get("int");
                    }else{
                        throw new CompilerException("Solo se pueden multiplicar integers o floats", instruction);
                    }
                }else if(argPars.get(0).get("float") != null){
                    if(argPars.get(1).get("float") != null){
                        return (float)argPars.get(0).get("float") * (float)argPars.get(1).get("float");
                    }else if(argPars.get(1).get("int") != null){
                        return (float)argPars.get(0).get("float") * (int)argPars.get(1).get("int");
                    }else{
                        throw new CompilerException("Solo se pueden multiplicar integers o floats", instruction);
                    }
                }else{
                    throw new CompilerException("Solo se pueden restar integers o floats", instruction);
                }
            case "/":
                if(argPars.get(0).get("int") != null){
                    if(argPars.get(1).get("float") != null){
                        return (int)argPars.get(0).get("int") / (float)argPars.get(1).get("float");
                    }else if(argPars.get(1).get("int")!=null){
                        return (int)argPars.get(0).get("int") / (int)argPars.get(1).get("int");
                    }else{
                        throw new CompilerException("Solo se pueden dividir integers o floats", instruction);
                    }
                }else if(argPars.get(0).get("float") != null){
                    if(argPars.get(1).get("float") != null){
                        return (float)argPars.get(0).get("float") / (float)argPars.get(1).get("float");
                    }else if(argPars.get(1).get("int") != null){
                        return (float)argPars.get(0).get("float") / (int)argPars.get(1).get("int");
                    }else{
                        throw new CompilerException("Solo se pueden dividir integers o floats", instruction);
                    }
                }else{
                    throw new CompilerException("Solo se pueden dividir integers o floats", instruction);
                }
        }
        return null;
    }

    private Object logicInstruction(String action, InstructionType tipoInstruction, ReturnType tipoRetorno, JsonNode args, InstructionHandler instrHandler, ProcedureHandler procHandler, String instruction) throws JsonProcessingException, CompilerException {
        // Parseando argumentos.
        LinkedList<HashMap<String, Object>> argPars = parsearMultiplesArgumentos(args, instrHandler, procHandler, instruction);
        switch(action){
            case "iguales":
                if(argPars.get(0).get("int") != null && argPars.get(1).get("int") != null){
                    return (int)argPars.get(0).get("int") == (int)argPars.get(1).get("int");
                }else if(argPars.get(0).get("float") != null && argPars.get(1).get("float") != null){
                    return (float)argPars.get(0).get("float") == (float)argPars.get(1).get("float");
                }else if(argPars.get(0).get("boolean")!=null && argPars.get(1).get("boolean")!=null){
                    return (boolean)argPars.get(0).get("boolean") == (boolean)argPars.get(0).get("boolean");
                }else{
                   throw new CompilerException("No se pueden igualar dos tipos de valores distintos", instruction);
                }
            case "mayorque":
                if(argPars.get(0).get("int") != null && argPars.get(1).get("int") != null){
                    return (int)argPars.get(0).get("int") > (int)argPars.get(1).get("int");
                }else if(argPars.get(0).get("int") != null && argPars.get(1).get("float") != null){
                    return (int)argPars.get(0).get("int") > (float)argPars.get(1).get("float");
                }else if(argPars.get(0).get("float") != null && argPars.get(1).get("int") != null){
                    return (float)argPars.get(0).get("float") > (int)argPars.get(1).get("int");
                }else if(argPars.get(0).get("float") != null && argPars.get(1).get("float") != null){
                    return (float)argPars.get(0).get("float") > (float)argPars.get(1).get("float");
                }else{
                   throw new CompilerException("Solo se pueden realizar comparaciones entre numeros", instruction);
                }
            case "menorque":
                if(argPars.get(0).get("int") != null && argPars.get(1).get("int") != null){
                    return (int)argPars.get(0).get("int") < (int)argPars.get(1).get("int");
                }else if(argPars.get(0).get("int") != null && argPars.get(1).get("float") != null){
                    return (int)argPars.get(0).get("int") < (float)argPars.get(1).get("float");
                }else if(argPars.get(0).get("float") != null && argPars.get(1).get("int") != null){
                    return (float)argPars.get(0).get("float") < (int)argPars.get(1).get("int");
                }else if(argPars.get(0).get("float") != null && argPars.get(1).get("float") != null){
                    return (float)argPars.get(0).get("float") < (float)argPars.get(1).get("float");
                }else{
                    throw new CompilerException("Solo se pueden realizar comparaciones entre numeros", instruction);
                }
            case "y":
                if(argPars.get(0).get("boolean") != null && argPars.get(1).get("boolean") != null){
                    return (boolean)argPars.get(0).get("boolean") && (boolean)argPars.get(1).get("boolean");
                }else{
                   throw new CompilerException("Solo se puede aplicar el operando AND entre valores booleanos", instruction);
                }
            case "o":
                if(argPars.get(0).get("boolean") != null && argPars.get(1).get("boolean") != null){
                    return (boolean)argPars.get(0).get("boolean") || (boolean)argPars.get(1).get("boolean");
                }else{
                    throw new CompilerException("Solo se puede aplicar el operando OR entre valores booleanos", instruction);
                }
        }
        throw new CompilerException("El tipo de instruccion logica no es valida", instruction);
    }


    public Object normalInstruction(String action, InstructionType tipoInstruction, ReturnType tipoRetorno, JsonNode args, InstructionHandler instrHandler, ProcedureHandler procHandler, String instruction) throws JsonProcessingException, CompilerException {
      // Parseando argumentos.
      LinkedList<HashMap<String, Object>> argPars = parsearMultiplesArgumentos(args, instrHandler, procHandler, instruction);
      boolean iterationBoolean = true;
      switch(action) {
          case "avanza":
              if(argPars.get(0).get("int") != null){
                avanza((int)argPars.get(0).get("int"));
                return null;
              }
              else if(argPars.size()!=1){
                  throw new CompilerException("Avanza recibe solo un argumento", instruction);
              }else{
                  throw new CompilerException("Avanza solo recibe integers", instruction);
              }
          case "retrocede":
              if(argPars.get(0).get("int") != null){
                retrocede((int)argPars.get(0).get("int"));
                return null;
              }else if(argPars.size()!=1){
                  throw new CompilerException("Retrocede recibe solo un argumento", instruction);
              }
              else{
                  throw new CompilerException("Retrocede solo acepta integers", instruction);
              }
          case "giraderecha":
              if(argPars.get(0).get("int") != null){
                rotateCursor((int)argPars.get(0).get("int"), true);
                return null;
                //cursor.updateRotation((int)argPars.get(0).get("int"), true);
              }else if(argPars.size()!=1){
                  throw new CompilerException("Giraderecha recibe solo un argumento", instruction);
              }
              else{
                  throw new CompilerException("Giraderecha solo acepta integers", instruction);
              }
          case "giraizquierda":
              if(argPars.get(0).get("int") != null){
                  rotateCursor((int)argPars.get(0).get("int"), false);
                  return null;
                //cursor.updateRotation((int)argPars.get(0).get("int"), false);
              }else if(argPars.size()!=1){
                  throw new CompilerException("Giraizquierda recibe solo un argumento", instruction);
              }
              else{
                  throw new CompilerException("Giraizquierda solo acepta integers", instruction);
              }
          case "ponpos":
              if(argPars.get(0).get("int") != null){
                  if(argPars.get(1).get("int") != null){
                      ponpos((int)argPars.get(0).get("int"), (int)argPars.get(1).get("int"));
                      return null;
                  }
                  else {
                      throw new CompilerException("Ponpos solo acepta integers", instruction);
                  }
              }else if(argPars.size()!=2){
                  throw new CompilerException("Ponpos recibe dos argumentos", instruction);
              }
              else {
                  throw new CompilerException("Ponpos solo acepta integers", instruction);
              }
          case "ponrumbo":
              if(argPars.get(0).get("int") != null){
                ponRumbo((int)argPars.get(0).get("int"));
                return null;
                //cursor.setRotation((int)argPars.get(0).get("int"));
              }else if(argPars.size()!=1){
                  throw new CompilerException("Ponrumbo recibe un argumento", instruction);
              }
              else{
                  throw new CompilerException("Ponrumbo solo acepta integers", instruction);
              }
          case "rumbo":
              // TODO: Pseudorumbo para guardar la rotacion
              if(argPars.size() != 0){
                  throw new CompilerException("Rumbo no tiene parametros", instruction);
              }
              rumbo();  // TODO: Retorna rumbo
              break;
          case "ponx":
              if(argPars.get(0).get("int") != null){
                ponX((int)argPars.get(0).get("int"));
                return null;
                //cursor.setPosX((int)argPars.get(0).get("int"));
              }else if(argPars.size() != 1){
                  throw new CompilerException("Ponx lleva un parametro", instruction);
              }
              else{
                  throw new CompilerException("Ponx solo acepta integers", instruction);
              }
          case "pony":
              if(argPars.get(0).get("int") != null){
                ponY((int)argPars.get(0).get("int"));
                return null;
                //cursor.setPosY((int)argPars.get(0).get("int"));
              }
              else if(argPars.size() != 1){
                  throw new CompilerException("Pony lleva un parametro", instruction);
              }
              else{
                  throw new CompilerException("Pony solo acepta integers", instruction);
              }
          case "poncl":
              if(argPars.get(0).get("string") != null){
                ponColor((String) argPars.get(0).get("string"));
                return null;
                //Color color = convertColor((String) argPars.get(0).get("string"));
                //cursor.setCurrentColor(color);
              }else if(argPars.size() != 1){
                  throw new CompilerException("Poncolorlapiz lleva un parametro", instruction);
              }
              else{
                  throw new CompilerException("El color solo puede ser un string", instruction);
              }
          case "espera":
              if(argPars.get(0).get("int") != null){
                  espera((int)argPars.get(0).get("int"));
                  return null;
              }else if(argPars.size() != 1){
                  throw new CompilerException("Espera lleva un parametro", instruction);
              }
              else{
                  throw new CompilerException("Espera solo acepta integers", instruction);
              }
          case "ocultatortuga":
              if(argPars.size() != 0){
                  throw new CompilerException("Ocultatortuga no lleva parametros", instruction);
              }
              hideCursor();
              return null;
          case "aparecetortuga":
              if(argPars.size() != 0){
                  throw new CompilerException("Aparecetortuga no lleva parametros", instruction);
              }
              showCursor();
              return null;
          case "bajalapiz":
              if(argPars.size() != 0){
                  throw new CompilerException("Bajalapiz no lleva parametros", instruction);
              }
              bajaLapiz();
              return null;
          case "subelapiz":
              if(argPars.size() != 0){
                  throw new CompilerException("Subelapiz no lleva parametros", instruction);
              }
              subeLapiz();
              return null;
          case "centro":
              if(argPars.size() != 0){
                  throw new CompilerException("Centro no lleva parametros", instruction);
              }
              centro(width, height);
              //cursor.realocate(centerX, centerY);
              return null;
          case "borrapantalla":
              if(argPars.size() != 0){
                  throw new CompilerException("Borrapantalla no lleva parametros", instruction);
              }
              borraPantalla();
              return null;
          case "redondea":
              if(argPars.get(0).get("float") != null){
                return redondea((float)argPars.get(0).get("float"));
              }else if(argPars.size() != 1){
                throw new CompilerException("Redondea lleva un parametro", instruction);
              }
              else{
                  throw new CompilerException("Redondea solo acepta integers", instruction);
              }
          case "azar":
            if(argPars.get(0).get("int") != null){
              return azar((int)argPars.get(0).get("int"));
            }
            else if(argPars.get(0).get("float") != null){
              return azar((float)argPars.get(0).get("float"));
            }else if(argPars.size() != 1){
                throw new CompilerException("Azar lleva un parametro", instruction);
            }
            else{
                throw new CompilerException("Azar solo acepta integers o floats", instruction);
            }
          case "menos":
            if(argPars.get(0).get("int") != null){
              return ((int)argPars.get(0).get("int") * -1);
            }
            else if(argPars.get(0).get("float") != null){
              return ((float)argPars.get(0).get("float") * -1);
            }else if(argPars.size() != 1){
                throw new CompilerException("Menos lleva un parametro", instruction);
            }
            else{
                throw new CompilerException("Menos solo acepta int o float", instruction);
            }
          case "cos":
            if(argPars.get(0).get("int") != null){
              return cos((int)argPars.get(0).get("int"));
            }
            else if(argPars.get(0).get("float") != null){
              return cos((float)argPars.get(0).get("float"));
            }else if(argPars.size() != 1){
                throw new CompilerException("Cos lleva un parametro", instruction);
            }
            else{
                throw new CompilerException("Cos solo acepta integers o floats", instruction);
            }
          case "seno":
            if(argPars.get(0).get("int") != null){
              return sen((int)argPars.get(0).get("int"));
            }
            else if(argPars.get(0).get("float") != null){
              return sen((float)argPars.get(0).get("float"));
            }else if(argPars.size() != 1){
                throw new CompilerException("Seno lleva un parametro", instruction);
            }
            else{
                throw new CompilerException("Seno no acepta integers o floats", instruction);
            }
          case "raiz":
            if(argPars.get(0).get("int") != null){
              return raiz((int)argPars.get(0).get("int"));
            }
            else if(argPars.get(0).get("float") != null){
              return raiz((float)argPars.get(0).get("float"));
            }else if(argPars.size() != 1){
                throw new CompilerException("Raiz lleva un parametro", instruction);
            }
            else{
                throw new CompilerException("Raiz solo acpeta integers o floats", instruction);
            }
          case "potencia":
            // Retorna int si base int
            if(argPars.get(0).get("int") != null){
              if(argPars.get(1).get("int") != null){
                double exponent = (double) argPars.get(1).get("int");
                return potencia((int) argPars.get(0).get("int"), exponent);
              }
              else if(argPars.get(1).get("float") != null){
                double exponent = (double) argPars.get(1).get("float");
                return potencia((int) argPars.get(0).get("int"), exponent);
              }
              else{
                  throw new CompilerException("Los argumentos de potencia solo pueden ser integers o floats", instruction);
              }
            }
            // Retorna float si base float
            else if(argPars.get(0).get("float") != null){
              if(argPars.get(1).get("int") != null){
                double exponent = (double) argPars.get(1).get("int");
                return potencia((float) argPars.get(0).get("float"), exponent);
              }
              else if(argPars.get(1).get("float") != null){
                double exponent = (double) argPars.get(1).get("float");
                return potencia((float) argPars.get(0).get("float"), exponent);
              }
              else{
                  throw new CompilerException("Los argumentos de potencia solo pueden ser integers o floats", instruction);
              }
            }else if(argPars.size() != 2){
                throw new CompilerException("Potencia lleva dos parametros", instruction);
            }
            else{
                throw new CompilerException("Los argumentos de potencia solo pueden ser integers o floats", instruction);
            }
          case "resto":
              if(argPars.size() != 2){
                  throw new CompilerException("Resto lleva dos parametros", instruction);
              }
            if(argPars.get(0).get("int") != null){
              if(argPars.get(1).get("int") != null){
                return resto((int)argPars.get(0).get("int"), (int)argPars.get(1).get("int"));
              }else if(argPars.get(1).get("float")!=null){
                  return resto((int)argPars.get(0).get("int"), (float)argPars.get(1).get("float"));
              }
              else{
                  throw new CompilerException("Resto solo recibe integers o floats", instruction);
              }
            }else if(argPars.get(1).get("float") !=null){
                if(argPars.get(1).get("int") != null){
                    return resto((float)argPars.get(0).get("float"), (int)argPars.get(1).get("int"));
                }else if(argPars.get(1).get("float")!=null){
                    return resto((float)argPars.get(0).get("float"), (float)argPars.get(1).get("float"));
                }
                else{
                    throw new CompilerException("Resto solo recibe integers o floats", instruction);
                }
            }
            else{
                throw new CompilerException("Resto solo recibe integers o floats", instruction);
           }
          case "division":
              if(argPars.size()>2){
                  throw new CompilerException("Division acepta dos parametros", instruction);
              }
            if(argPars.get(0).get("int") != null){
              if(argPars.get(1).get("int") != null){
                int dividend = (int) argPars.get(0).get("int");
                int divisor = (int) argPars.get(1).get("int");
                return dividend/divisor;
              }
              else if(argPars.get(1).get("float") != null){
                float dividend = (float) argPars.get(0).get("float");
                int divisor = (int) argPars.get(1).get("int");
                return dividend/divisor;
              }
              else{
                  throw new CompilerException("Division solo recibe int o float", instruction);
              }
            }
            else if(argPars.get(0).get("float") != null){
              if(argPars.get(1).get("int") != null){
                float dividend = (float) argPars.get(0).get("float");
                int divisor = (int) argPars.get(1).get("int");
                return dividend/divisor;
              }
              else if(argPars.get(1).get("float") != null){
                float dividend = (float) argPars.get(0).get("float");
                float divisor = (float) argPars.get(1).get("float");
                return dividend/divisor;
              }
              else{
                  throw new CompilerException("Los argumentos de division solo pueden ser integer o float", instruction);
              }
            }
            else{
                throw new CompilerException("Los argumentos de division solo pueden ser integer o float", instruction);
            }
          case "diferencia":
              if(argPars.size()==0){
                  throw new CompilerException("Diferencia debe tener parametros", instruction);
              }
            // Si deberia ser de ints
            if(argPars.get(0).get("int") != null){
              LinkedList<Integer> arguments = new LinkedList<>();
              // Valida que todos los argumentos sean ints
              for (int tmp=0; tmp<argPars.size(); tmp++){
                if(argPars.get(tmp).get("int") == null){
                  iterationBoolean = false;
                  break;
                }
                else{
                  Integer intObj = new Integer((int)argPars.get(tmp).get("int"));
                  arguments.add(intObj);
                }
              }
              if(iterationBoolean){
                return diferenciaInt(arguments);
              }
              else{
                  throw new CompilerException("Resta solo recibe integers o floats", instruction);
              }
            }
            // Si deberia ser de floats
            else if(argPars.get(0).get("float") != null){
              LinkedList<Float> arguments = new LinkedList<Float>();
              // Valida que todos los argumentos sean ints
              for (int tmp=0; tmp<argPars.size(); tmp++){
                if(argPars.get(tmp).get("float") == null){
                  iterationBoolean = false;
                  break;
                }
                else{
                  Float floatObj = new Float((float)argPars.get(tmp).get("float"));
                  arguments.add(floatObj);
                }
              }
              if(iterationBoolean){
                return diferenciaFloat(arguments);
              }
              else{
                System.out.println("Todos los argumentos deben ser del mismo tipo"); // TODO: Nope
              }
            }
            else{
                throw new CompilerException("Resta solo recibe integers o floats", instruction);
            }
            break;
          case "producto":
              // Si deberia ser de ints
              if(argPars.size() == 0){
                  throw new CompilerException("Producto debe tener parametros", instruction);
              }
              if(argPars.get(0).get("int") != null){
                  LinkedList<Integer> arguments = new LinkedList<>();
                  // Valida que todos los argumentos sean ints
                  for (int tmp=0; tmp<argPars.size(); tmp++){
                      if(argPars.get(tmp).get("int") == null){
                          iterationBoolean = false;
                          break;
                      }
                      else{
                          Integer intObj = new Integer((int)argPars.get(tmp).get("int"));
                          arguments.add(intObj);
                      }
                  }
                  if(iterationBoolean){
                      return productoInt(arguments);
                  }
                  else{
                      System.out.println("Todos los argumentos deben ser del mismo tipo"); //TODO:Nope
                  }
              }
              // Si deberia ser de floats
              else if(argPars.get(0).get("float") != null){
                  LinkedList<Float> arguments = new LinkedList<Float>();
                  // Valida que todos los argumentos sean ints
                  for (int tmp=0; tmp<argPars.size(); tmp++){
                      if(argPars.get(tmp).get("float") == null){
                          iterationBoolean = false;
                          break;
                      }
                      else{
                          Float floatObj = new Float((float)argPars.get(tmp).get("float"));
                          arguments.add(floatObj);
                      }
                  }
                  if(iterationBoolean){
                      return productoFloat(arguments);
                  }
                  else{
                      System.out.println("Todos los argumentos deben ser del mismo tipo");// TODO:Nope
                  }
              }
              else{
                 throw new CompilerException("Producto solo recibe integers o floats", instruction);
              }
              break;
          case "suma":
              if(argPars.size()==0){
                  throw new CompilerException("Suma debe tener parametros", instruction);
              }
              // Si deberia ser de ints
              if(argPars.get(0).get("int") != null){
                  LinkedList<Integer> arguments = new LinkedList<>();
                  // Valida que todos los argumentos sean ints
                  for (int tmp=0; tmp<argPars.size(); tmp++){
                      if(argPars.get(tmp).get("int") == null){
                          iterationBoolean = false;
                          break;
                      }
                      else{
                          Integer intObj = new Integer((int)argPars.get(tmp).get("int"));
                          arguments.add(intObj);
                      }
                  }
                  if(iterationBoolean){
                      return sumaInt(arguments);
                  }
                  else{
                      System.out.println("Todos los argumentos deben ser del mismo tipo"); // TODO:Nope
                  }
              }
              // Si deberia ser de floats
              else if(argPars.get(0).get("float") != null){
                  LinkedList<Float> arguments = new LinkedList<Float>();
                  // Valida que todos los argumentos sean ints
                  for (int tmp=0; tmp<argPars.size(); tmp++){
                      if(argPars.get(tmp).get("float") == null){
                          iterationBoolean = false;
                          break;
                      }
                      else{
                          Float floatObj = new Float((float)argPars.get(tmp).get("float"));
                          arguments.add(floatObj);
                      }
                  }
                  if(iterationBoolean){
                      return sumaFloat(arguments);
                  }
                  else{
                      System.out.println("Todos los argumentos deben ser del mismo tipo"); //TODO:Nope
                  }
              }
              else{
                  throw new CompilerException("Suma solo recibe integers o floats", instruction);
              }
              break;
          case "elegir":
              // Si deberia ser de ints
              if(argPars.size() == 0){
                  throw new CompilerException("Elegir debe recibir parametros", instruction);
              }
              if(argPars.get(0).get("int") != null){
                  LinkedList<Integer> arguments = new LinkedList<>();
                  // Valida que todos los argumentos sean ints
                  for (int tmp=0; tmp<argPars.size(); tmp++){
                      if(argPars.get(tmp).get("int") == null){
                          iterationBoolean = false;
                          break;
                      }
                      else{
                          Integer intObj = new Integer((int)argPars.get(tmp).get("int"));
                          arguments.add(intObj);
                      }
                  }
                  if(iterationBoolean){
                      return elegirInt(arguments);
                  }
                  else{
                      System.out.println("Todos los argumentos deben ser del mismo tipo"); // TODO: Nope
                  }
              }
              // Si deberia ser de floats
              else if(argPars.get(0).get("float") != null){
                  LinkedList<Float> arguments = new LinkedList<Float>();
                  // Valida que todos los argumentos sean ints
                  for (int tmp=0; tmp<argPars.size(); tmp++){
                      if(argPars.get(tmp).get("float") == null){
                          iterationBoolean = false;
                          break;
                      }
                      else{
                          Float floatObj = new Float((float)argPars.get(tmp).get("float"));
                          arguments.add(floatObj);
                      }
                  }
                  if(iterationBoolean){
                      return elegirFloat(arguments);
                  }
                  else{
                      System.out.println("Todos los argumentos deben ser del mismo tipo"); //TODO:Nope
                  }
              }
              else{
                  throw new CompilerException("Elegir solo recibe integers o floats", instruction);
              }
              break;
          case "cuenta":
              return argPars.size();
          case "ultimo":
              if(argPars.size() == 0){
                  throw new CompilerException("Ultimo debe recibir parametros", instruction);
              }
              // Si deberia ser de ints
              if(argPars.get(0).get("int") != null){
                  // Valida que todos los argumentos sean ints
                  for (int tmp=0; tmp<argPars.size(); tmp++){
                      if(argPars.get(tmp).get("int") == null){
                          iterationBoolean = false;
                          break;
                      }
                  }
                  if(iterationBoolean){
                      return (int) argPars.getLast().get("int");
                  }
                  else{
                      System.out.println("Todos los argumentos deben ser del mismo tipo");  // TODO: Nope
                  }
              }
              // Si deberia ser de floats
              else if(argPars.get(0).get("float") != null){
                  // Valida que todos los argumentos sean ints
                  for (int tmp=0; tmp<argPars.size(); tmp++){
                      if(argPars.get(tmp).get("float") == null){
                          iterationBoolean = false;
                          break;
                      }
                  }
                  if(iterationBoolean){
                      return (float) argPars.getLast().get("float");
                  }
                  else{
                      System.out.println("Todos los argumentos deben ser del mismo tipo");// TODO: No
                  }
              }
              else{
                  throw new CompilerException("Los argumentos de ultimo deben ser integers o floats", instruction);
              }
              break;
          case "primero":
              if(argPars.size() == 0){
                  throw new CompilerException("Primero debe recibir argumentos", instruction);
              }
              // Si deberia ser de ints
              if(argPars.get(0).get("int") != null){
                  // Valida que todos los argumentos sean ints
                  for (int tmp=0; tmp<argPars.size(); tmp++){
                      if(argPars.get(tmp).get("int") == null){
                          iterationBoolean = false;
                          break;
                      }
                  }
                  if(iterationBoolean){
                      return (int) argPars.getFirst().get("int");
                  }
                  else{
                      System.out.println("Todos los argumentos deben ser del mismo tipo"); // TODO: Nope
                  }
              }
              // Si deberia ser de floats
              else if(argPars.get(0).get("float") != null){
                  // Valida que todos los argumentos sean ints
                  for (int tmp=0; tmp<argPars.size(); tmp++){
                      if(argPars.get(tmp).get("float") == null){
                          iterationBoolean = false;
                          break;
                      }
                  }
                  if(iterationBoolean){
                      return (float) argPars.getFirst().get("float");
                  }
                  else{
                      System.out.println("Todos los argumentos deben ser del mismo tipo"); // TODO: Nope
                  }
              }
              else{
                  throw new CompilerException("Los argumentos de primero deben ser integers o floats",instruction);
              }
              break;
          case "elemento":
              if(argPars.size() < 2){
                  throw new CompilerException("Elemento debe tener minimo dos argumentos", instruction);
              }
              // Si el indice es un entero
              if(argPars.get(0).get("int") != null){
                  // Si deberia ser de ints
                  if(argPars.get(1).get("int") != null){
                      LinkedList<Integer> arguments = new LinkedList<>();
                      // Valida que todos los argumentos sean ints
                      for (int tmp=1; tmp<argPars.size(); tmp++){
                          if(argPars.get(tmp).get("int") == null){
                              iterationBoolean = false;
                              break;
                          }
                          else{
                              Integer intObj = new Integer((int)argPars.get(tmp).get("int"));
                              arguments.add(intObj);
                          }
                      }
                      if(iterationBoolean){
                          return arguments.get((int)argPars.get(0).get("int")).intValue();
                      }
                      else{
                          System.out.println("Todos los argumentos deben ser del mismo tipo");  // TODO:Nope
                      }
                  }
                  // Si deberia ser de floats
                  else if(argPars.get(0).get("float") != null){
                      LinkedList<Float> arguments = new LinkedList<Float>();
                      // Valida que todos los argumentos sean ints
                      for (int tmp=1; tmp<argPars.size(); tmp++){
                          if(argPars.get(tmp).get("float") == null){
                              iterationBoolean = false;
                              break;
                          }
                          else{
                              Float floatObj = new Float((float)argPars.get(tmp).get("float"));
                              arguments.add(floatObj);
                          }
                      }
                      if(iterationBoolean){
                          return arguments.get((int)argPars.get(0).get("int")).floatValue();
                      }
                      else{
                          System.out.println("Todos los argumentos de la lista deben ser del mismo tipo");  //TODO:Nope
                      }
                  }
                  else{
                      throw new CompilerException("Elemento solo recibe integers o floats", instruction);
                  }
              }
              else{
                  throw new CompilerException("El indice de elemento debe ser un integer", instruction);
              }
      }
      return null;
    }

    public void avanza(int length) {
      LinkedList<String> method = new LinkedList<>();
      method.add("avanza");
      method.add(Integer.toString(length));
      instructionTail.add(method);
      //cursor.move(length, true);

    }

    public void retrocede(int length){
        LinkedList<String> method = new LinkedList<>();
        method.add("retrocede");
        method.add(Integer.toString(length));
        instructionTail.add(method);
        //cursor.move(length, false);
    }

    private void exec(CompiledFile cFile) throws JsonProcessingException, CompilerException {
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
    public void updateCursor(){
        LinkedList<String> method = new LinkedList<>();
        method.add("update");
        imageCursor.setRotate(cursor.getRotation());
        imageCursor.setLayoutX(cursor.getPosX()-15);
        imageCursor.setLayoutY(cursor.getPosY()-15);
    }


    /**
     * Método para girar el cursor
     * @param rotation rotación a actualizar
     */
    public void rotateCursor(int rotation, boolean clockwise) {
        LinkedList<String> method = new LinkedList<>();
        if(clockwise){
            method.add("giraderecha");
        }
        else{
            method.add("giraizquierda");
        }
        method.add(Integer.toString(rotation));
        instructionTail.add(method);
    }

    public void ponX(int position) {
        LinkedList<String> method = new LinkedList<>();
        method.add("ponx");
        method.add(Integer.toString(position));
        instructionTail.add(method);
    }

    public void ponY(int position) {
        LinkedList<String> method = new LinkedList<>();
        method.add("pony");
        method.add(Integer.toString(position));
        instructionTail.add(method);
    }

    public void bajaLapiz() {
        LinkedList<String> method = new LinkedList<>();
        method.add("bajalapiz");
        instructionTail.add(method);
    }

    public void subeLapiz() {
        LinkedList<String> method = new LinkedList<>();
        method.add("subelapiz");
        instructionTail.add(method);
    }

    public void ponColor(String color) {
        LinkedList<String> method = new LinkedList<>();
        method.add("poncolor");
        method.add(color);
        instructionTail.add(method);
    }

    public void centro(int width, int height) {
        LinkedList<String> method = new LinkedList<>();
        method.add("centro");
        method.add(Integer.toString(width));
        method.add(Integer.toString(height));
        instructionTail.add(method);
    }

    public void espera(int segundos) {
        LinkedList<String> method = new LinkedList<>();
        method.add("espera");
        method.add(Integer.toString(segundos));
        instructionTail.add(method);
    }

    public void borraPantalla() {
        LinkedList<String> method = new LinkedList<>();
        method.add("borrapantalla");
        instructionTail.add(method);
    }

    public void ponRumbo(int angulo) {
        LinkedList<String> method = new LinkedList<>();
        method.add("ponrumbo");
        method.add(Integer.toString(angulo));
        instructionTail.add(method);
    }

    /**
     * Método para esconder el cursor.
     */
    public void hideCursor() {
        LinkedList<String> method = new LinkedList<>();
        method.add("hide");
        instructionTail.add(method);
        //imageCursor.setVisible(false);
    }

    /**
     * Método para mostrar el cursor.
     */
    public void showCursor() {
        LinkedList<String> method = new LinkedList<>();
        method.add("show");
        instructionTail.add(method);
        //imageCursor.setVisible(true);
    }

    public void ponpos(int posX, int posY){
        LinkedList<String> method = new LinkedList<>();
        method.add("ponpos");
        method.add(Integer.toString(posX));
        method.add(Integer.toString(posY));
        instructionTail.add(method);
        //cursor.realocate(posX, posY);
    }

    public void rumbo() {
        LinkedList<String> method = new LinkedList<>();
        method.add("rumbo");
        instructionTail.add(method);
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

    public int redondea(float arg){
      int result = (int) arg;
      return result;
    }

    public int azar(int arg){
      int result = (int)(Math.random() * arg);
      return result;
    }

    public float azar(float arg){
      float result = (float)(Math.random() * arg);
      return result;
    }

    public int cos(int arg){
      double angulo = Math.toRadians((double)arg);
      int result = (int)Math.cos(angulo);
      return result;
    }

    public float cos(float arg){
      double angulo = Math.toRadians((double)arg);
      float result = (float)Math.cos(angulo);
      return result;
    }

    public float sen(int arg){
      double angulo = Math.toRadians((double)arg);
      float result = (float)Math.sin(angulo);
      return result;
    }

    public float sen(float arg){
      double angulo = Math.toRadians((double)arg);
      float result = (float)Math.sin(angulo);
      return result;
    }

    public float raiz(int arg){
      double number = (double)arg;
      float result = (float)Math.sqrt(number);
      return result;
    }

    public float raiz(float arg){
      double number = (double)arg;
      float result = (float)Math.sqrt(number);
      return result;
    }

    public int potencia(int arg, double power){     // la base determina el resultado, 2 funciones
      double base = (double)arg;
      int result = (int)Math.pow(base, power);
      return result;
    }

    public float potencia(float arg, double power){     // la base determina el resultado, 2 funciones
      double base = (double)arg;
      float result = (float)Math.pow(base, power);
      return result;
    }

    public int resto(int dividend, int divisor){
      int result = dividend%divisor;
      return result;
    }

    public float resto(float dividend, float divisor){
        return dividend%divisor;
    }
    public float resto(float dividend, int divisor){
        return dividend%divisor;
    }

    public float resto(int dividend, float divisor){
        return dividend%divisor;
    }

    public float division(double dividend, double divisor){
      float result = (float) (dividend/divisor);
      return result;
    }

    public int diferenciaInt(LinkedList<Integer> arguments){
      int result = arguments.getFirst().intValue();
      arguments.remove();
      while(arguments.size()>0){
          result -= arguments.getFirst().intValue();
          arguments.remove();
      }
      return result;
    }

    public float diferenciaFloat(LinkedList<Float> arguments){
        float result = arguments.getFirst().floatValue();
        arguments.remove();
        while(arguments.size()>0){
            result -= arguments.getFirst().floatValue();
            arguments.remove();
        }
        return result;
    }

    public int productoInt(LinkedList<Integer> arguments){
        int result = 1;
        while(arguments.size()>0){
            result *= arguments.getFirst().intValue();
            arguments.remove();
        }
        return result;
    }

    public float productoFloat(LinkedList<Float> arguments){
        float result = 1;
        while(arguments.size()>0){
            result *= arguments.getFirst().floatValue();
            arguments.remove();
        }
        return result;
    }

    public int sumaInt(LinkedList<Integer> arguments){
        int result = 0;
        while(arguments.size()>0){
            result += arguments.getFirst().intValue();
            arguments.remove();
        }
        return result;
    }

    public float sumaFloat(LinkedList<Float> arguments){
        float result = 0;
        while(arguments.size()>0){
            result += arguments.getFirst().floatValue();
            arguments.remove();
        }
        return result;
    }

    public int elegirInt(LinkedList<Integer> arguments){
        int index = (int) (Math.random() * (arguments.size() - 1));
        int result = arguments.get(index).intValue();
        return result;
    }

    public float elegirFloat(LinkedList<Float> arguments){
        int index = (int) (Math.random() * (arguments.size() - 1));
        float result = arguments.get(index).floatValue();
        return result;
    }

    /**
     * Método que lanza la aplicación
     */
    public static void show() {
        new CanvasGui().start(new Stage());
    }
}
