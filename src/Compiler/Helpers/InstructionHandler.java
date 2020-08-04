package Compiler.Helpers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.*;

public class InstructionHandler {

    private final ArrayList<String> _instr;
    @JsonIgnore
    private final ObjectMapper _mapper;

    public InstructionHandler() {
        _instr = new ArrayList<>();
        _mapper = new ObjectMapper();
        _mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    /*
    procedimientos
    --------------
    proc
    proc arg
    proc arg arg
    proc arg...
    proc [ instr... ]
    proc arg [ instr... ]

    PARA proc arg...
        instr...
    FIN

    {
        "action": "mover",
        "type": "type",
        "return": "integer",
        "args": [ arg1 ],
        "body": [ instr... ]
    }

    {
        "action": "suma",
        "type": OPERATION,
        "args": [ {"type": "instruction", "value": "{...}"}, {...} ],
        "body": null
    }


    argumentos
    ---------------
    arg -> constante
    arg -> instrucción

    {
        "type": "instruction | constant",
        "valType": "integer | float"
        "value": "azar (myvar + 20) | 30"
    }
    */

    /**
     * Método para agregar una nueva instrucción a la cola de instrucciones
     * @param instr Json que representa la instrucción
     */
    public void add(String instr) {
        //_instr.add(instr);
        _instr.add(0, instr);
    }

    /**
     * Método para añadir una instrucción a la cola de instrucciones
     * @param action Nombre o acción de la instrucción
     * @param type Tipo de instrucción
     * @param args Argumentos de la instrucción
     * @param instr Instrucciones internas de la instrucción
     */
    public void add(String action, InstructionType type, ReturnType returnType, ArrayList<String> args, ArrayList<String> instr) {
        ObjectNode proc = _mapper.createObjectNode();
        proc.put("action", action);
        proc.put("type", type.toString());
        proc.put("return", returnType.toString());

        //Almacenar argumentos
        if (args != null) {
            ArrayNode parameters = _mapper.createArrayNode();
            for (String arg : args) {
                JsonNode argNode = getNode(arg);
                if (argNode == null) continue;
                parameters.add(argNode);
            }
            proc.putArray("args").addAll(parameters);
        }

        //Almacenar instrucciones
        if (instr != null) {
            ArrayNode instructions = _mapper.createArrayNode();
            for (String ins : instr) {
                JsonNode insNode = getNode(ins);
                if (insNode == null) continue;
                instructions.add(ins);
            }
            proc.putArray("body").addAll(instructions);
        }

        try {
            _instr.add(0, _mapper.writeValueAsString(proc));
        } catch (JsonProcessingException ex) {
            System.err.println("No se pudo almacenar la instrucción");
        }
    }

    /**
     * Método para obtener la siguiente instrucción de la cola de instrucciones, eliminandola de la misma
     * @return Json representando una instrucción
     */
    public String getNext() {
    //    _instr.get(_current++);
        String instr = _instr.get(0);
        _instr.remove(0);
        return instr;
    }
/*
    public void reverse() {

        Stack<String> s = new Stack<>();  //create a stack

        //while the queue is not empty
        while(!_instr.isEmpty())
        {  //add the elements of the queue onto a stack
            s.push(_instr.poll());
        }

        //while the stack is not empty
        while(!s.isEmpty())
        { //add the elements in the stack back to the queue
            _instr.add(s.pop());
        }

    }
*/

    /**
     * Método para obtener la siguiente instrucción de la cola de instrucciones, pero sin eliminarla de la misma
     * @return Json representando una instrucción
     */
    public String seeNext() {
        return _instr.get(0);
    }

    /**
     * Método para obtener la cantidad de instrucciones en la cola de instrucciones
     * @return Cantidad de instrucciones actualmente en la cola
     */
    public Integer getInstructionCount() {
        return _instr.size();
    }

    public void print() {
        System.out.println("\nInstruction List");
        System.out.println("#################");
        for (String item: _instr) {
            System.out.println(item + "\n");
        }
//        _instr.forEach(System.out::println);
    }

    public String create(String action, InstructionType type, ArrayList<String> args, Integer currentLine) {
        return create(action, type, ReturnType.VOID, args, null, currentLine);
    }

    /**
     * Método para crear una instrucción con los parámetros dados
     * @param action Nombre o acción de la instrucción
     * @param type Tipo de instrucción
     * @param args Argumentos o instrucciones internas
     * @param currentLine línea de la instrucción actual
     * @return Json que representa la instrucción
     */
    public String create(String action, InstructionType type, ReturnType returnType, ArrayList<String> args, Integer currentLine) {
        return create(action, type, returnType, args, null, currentLine);
    }

    /**
     * Método para crear una instrucción a partir de los parámetros dados
     * @param action Nombre o acción de la instrucción
     * @param type Tipo de instrucción
     * @param returnType Tipo de valor de retorno de la instrucción
     * @param args Argumentos de la instrucción
     * @param instr Intrucciones internas de la instrucción
     * @param currentLine línea de la instrucción actual
     * @return Json representado la instrucción
     */
    public String create(String action, InstructionType type, ReturnType returnType, ArrayList<String> args, ArrayList<String> instr, Integer currentLine) {
        ObjectNode proc = _mapper.createObjectNode();
        proc.put("action", action);
        proc.put("type", type.toString());
        proc.put("return", returnType.toString());
        proc.put("line", currentLine);

        //Almacenar argumentos
        if (args != null) {
            ArrayNode parameters = _mapper.createArrayNode();
            for (String arg : args) {
                JsonNode argNode = getNode(arg);
                if (argNode == null) continue;
                parameters.add(argNode);
            }
            proc.putArray("args").addAll(parameters);
        }

        //Almacenar instrucciones
        if (instr != null) {
            ArrayNode instructions = _mapper.createArrayNode();
            for (String ins : instr) {
                JsonNode insNode = getNode(ins);
                if (insNode == null) continue;
                instructions.add(ins);
            }
            proc.putArray("body").addAll(instructions);
        }

        try {
            return _mapper.writeValueAsString(proc);
        } catch (JsonProcessingException ex) {
            System.err.println("No se pudo crear la instrucción");
            return null;
        }
    }

    /**
     * Método para parsear un json y obtener su representación en JsonNode
     * @param nodeString Json a parsear
     * @return Representación del json con JsonNode o null si no se puede parsear
     */
    private JsonNode getNode(String nodeString) {
        try {
            return _mapper.readTree(nodeString);
        } catch (JsonProcessingException ex) {
            System.err.println("No se pudo leer el nodo - " + ex.getMessage());
            return null;
        }
    }

    /**
     * Método para obtener la acción de una instrucción
     * @param instr Json representando la instrucción
     * @return La acción de la instrucción dada
     */
    public String getAction(String instr) {
        JsonNode instrNode = getNode(instr);
        if (instrNode == null) return null;

        return instrNode.get("action").textValue();
    }

    /**
     * Método para obtener el tipo de una instrucción
     * @param instr Json representando la instrucción
     * @return El tipo de la instrucción dada
     */
    public InstructionType getType(String instr) {
        JsonNode instrNode = getNode(instr);
        if (instrNode == null) return null;
        return InstructionType.valueOf(instrNode.get("type").textValue());
    }

    /**
     * Método para obtener el tipo de retorno de una instrucción
     * @param instr Json representando la instrucción
     * @return El tipo de retorno de la instrucción dada
     */
    public ReturnType getReturnType(String instr) {
        JsonNode instrNode = getNode(instr);
        if (instrNode == null) return null;
        return ReturnType.valueOf(instrNode.get("return").textValue());
    }

    /**
     * Método para obtener los argumentos de una instrucción
     * @param instr Json representando la instrucción
     * @return Los argumentos de la instrucción dada
     */
    public JsonNode getArgs(String instr) {
        JsonNode instrNode = getNode(instr);
        if (instrNode == null) return null;

        JsonNode args = instrNode.get("args");
        if(args==null){
            return null;
        }
        if (!args.isArray()) {
            args = getNode(args.textValue());
        }
        return args;
    }

    /**
     * Método para obtener las instrucciones internas de una instrucción
     * @param instr Json representando la instrucción
     * @return Las instrucciones internas de la instrucción dada
     */
    public JsonNode getBody(String instr) {
        JsonNode instrNode = getNode(instr);
        if (instrNode == null) return null;

        JsonNode body = instrNode.get("body");
        if(body == null){
            return null;
        }
        if (!body.isArray()) {
            body = getNode(body.textValue());
        }
        return body;
    }

    // Getters for jackson
    /*
    public Queue<String> get_instr() {
        return _instr;
    }
    */

    public ArrayList<String> get_instr() {
        return _instr;
    }

    public ObjectMapper get_mapper() {
        return _mapper;
    }

    public static void main(String[] args) {
//        InstructionHandler handler = new InstructionHandler();
//
//        var avanzaArgs = new ArrayList<String>();
//        avanzaArgs.add(intArg(100));
//
//        var repetirArgs = new ArrayList<String>();
//        repetirArgs.add(intArg(5));
//        var repetirBody = new ArrayList<String>();
//        repetirBody.add(instr("avanza", InstructionType.NORMAL, avanzaArgs, false));
//
//        var siArgs = new ArrayList<String>();
//
//        var compararArgs = new ArrayList<String>();
//        compararArgs.add(intArg(3));
//        compararArgs.add(intArg(5));
//        siArgs.add(instrArg(instr("comparar", InstructionType.LOGIC, compararArgs, false)));
//
//        var siBody = new ArrayList<String>();
//        siBody.add(instr("giraderecha", InstructionType.NORMAL, avanzaArgs, false));
//
//        repetirBody.add(instr("si", InstructionType.CONDITION, siArgs, siBody));
//
//        long start = System.nanoTime();
//        handler.add("avanza", InstructionType.NORMAL, avanzaArgs, false);
//        handler.add("repetir", InstructionType.NORMAL, repetirArgs, repetirBody);
//        System.out.println(System.nanoTime() - start);
//        handler.print();
//
//        String avanzaInstruction = handler.seeNext();
//        System.out.println(handler.getArgs(avanzaInstruction));
//        System.out.println(handler.getArgType(avanzaInstruction, 0));
//        System.out.println(handler.getIntArg(avanzaInstruction, 0));
    }

}
