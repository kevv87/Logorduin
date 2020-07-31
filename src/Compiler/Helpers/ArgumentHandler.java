package Compiler.Helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ArgumentHandler {

    private final ObjectMapper _mapper;

    public ArgumentHandler() {
        _mapper = new ObjectMapper();
    }

    /**
     * Método para crear un json a partir de un valor entero
     * @param value Valor entero del cual crear el argumento
     * @return Json representando al argumento
     */
    public String intArg(Integer value) {
        return create(ArgType.INT_CONSTANT, value.toString());
    }

    /**
     * Método para crear un json a partir de un valor flotante
     * @param value Valor flotante del cual crear el argumento
     * @return Json representando al argumento
     */
    public String floatArg(Float value) {
        return create(ArgType.FLOAT_CONSTANT, value.toString());
    }

    public String stringArg(String value) {
        return create(ArgType.STRING_CONSTANT, value);
    }

    public String varArg(String name) {
        return create(ArgType.VARIABLE, name);
    }

    public String instrArg(String instr) {
        return create(ArgType.INSTRUCTION, instr);
    }

    public String varIntArg(String value) {
        return create(ArgType.INT_VARIABLE, ArgValueType.INTEGER, value);
    }

    public String varFloatArg(String value) {
        return create(ArgType.FLOAT_VARIABLE, ArgValueType.FLOAT, value);
    }

    public String boolArg(Boolean value) {
        return create(ArgType.BOOL_CONSTANT, value.toString());
    }

    /**
     * Método para crear un json a partir de una instrucción
     * @param instruction Json que representa a la instrucción de la cual se creará el argumento
     * @return Json representando al argumento
     */
    public String instructionArg(String instruction) {
        return create(ArgType.INSTRUCTION, instruction);
    }

    /**
     * Método para generar un argumento del tipo y valor especificado
     * @param type Tipo de argumento a crear
     * @param value Valor del argumento a crear
     * @return Json representando al argumento
     */
    private String create(ArgType type, ArgValueType valType, String value) {
        ObjectNode argument = _mapper.createObjectNode();
        argument.put("type", type.toString());
        if (valType != null) {
            argument.put("valType", valType.toString());
        }
        argument.put("value", value);
        try {
            return _mapper.writeValueAsString(argument);
        } catch (JsonProcessingException ex) {
            System.err.println("No se pudo crear el argumento dado");
            return null;
        }
    }

    private String create(ArgType type, String value) {
        return create(type, null, value);
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
     * Método para obtener los argumentos de una instrucción
     * @param instr Json representando la instrucción
     * @return Los argumentos de la instrucción dada
     */
    public JsonNode getArgs(String instr) {
        JsonNode instrNode = getNode(instr);
        if (instrNode == null) return null;

        JsonNode args = instrNode.get("args");
        if (!args.isArray()) {
            args = getNode(args.textValue());
        }
        return args;
    }

    /**
     * Método para obtener el tipo del argumento en el índice dado
     * @param instr Json representado la instrucción de donde obtener el argumento
     * @param index Índice del argumento
     * @return Tipo del argumento en el índice dado
     */
    public ArgType getArgType(String instr, int index) {
        JsonNode args = getArgs(instr);
        if (args == null) return null;
        return getArgType(args, index);
    }

    /**
     * Método para obtener el tipo del argumento en el índice dado
     * @param args JsonNode representado la lista de argumentos de una instrucción
     * @param index Índice del argumento
     * @return Tipo del argumento en el índice dado
     */
    public ArgType getArgType(JsonNode args, int index) {
        JsonNode arg = args.get(index);
        if (!arg.isObject()) {
            arg = getNode(arg.textValue());
        }
        if (arg == null) return null;
        return ArgType.valueOf(arg.get("type").textValue());
    }

    /**
     * Método para obtener el valor entero del argumento en el índice dado
     * @param instr Json representado la instrucción de donde obtener el argumento
     * @param index Índice del argumento
     * @return Valor entero del argumento en el índice dado
     */
    public Integer getIntArg(String instr, int index) {
        JsonNode args = getArgs(instr);
        if (args == null) return null;
        return getIntArg(args, index);
    }

    /**
     * Método para obtener valor entero del argumento en el índice dado
     * @param args JsonNode representado la lista de argumentos de una instrucción
     * @param index Índice del argumento
     * @return Valor entero del argumento en el índice dado
     */
    public Integer getIntArg(JsonNode args, int index) {
        JsonNode arg = args.get(index);
        if (!arg.isObject()) {
            arg = getNode(arg.textValue());
        }
        if (arg == null) return null;
        return arg.get("value").asInt();
    }

    /**
     * Método para obtener el valor flotante del argumento en el índice dado
     * @param instr Json representado la instrucción de donde obtener el argumento
     * @param index Índice del argumento
     * @return Valor flotante del argumento en el índice dado
     */
    public Float getFloatArg(String instr, int index) {
        JsonNode args = getArgs(instr);
        if (args == null) return null;
        return getFloatArg(args, index);
    }

    /**
     * Método para obtener el valor flotante del argumento en el índice dado
     * @param args JsonNode representado la lista de argumentos de una instrucción
     * @param index Índice del argumento
     * @return Valor flotante del argumento en el índice dado
     */
    public Float getFloatArg(JsonNode args, int index) {
        JsonNode arg = args.get(index);
        if (!arg.isObject()) {
            arg = getNode(arg.textValue());
        }
        if (arg == null) return null;
        return Float.parseFloat(arg.get("value").textValue());
    }

    /**
     * Método para obtener la instrucción del argumento en el índice dado
     * @param instr Json representado la instrucción de donde obtener el argumento
     * @param index Índice del argumento
     * @return Instrucción del argumento en el índice dado
     */
    public String getInstructionArg(String instr, int index) {
        JsonNode args = getArgs(instr);
        if (args == null) return null;
        return getInstructionArg(args, index);
    }

    /**
     * Método para obtener la instrucción del argumento en el índice dado
     * @param args JsonNode representado la lista de argumentos de una instrucción
     * @param index Índice del argumento
     * @return Instrucción del argumento en el índice dado
     */
    public String getInstructionArg(JsonNode args, int index) {
        JsonNode arg = args.get(index);
        if (!arg.isObject()) {
            arg = getNode(arg.textValue());
        }
        if (arg == null) return null;
        return arg.get("value").textValue();
    }

}
