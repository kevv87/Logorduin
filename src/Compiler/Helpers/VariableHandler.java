package Compiler.Helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.HashMap;

public class VariableHandler {

    private final HashMap<String, String> _vars;
    private final ObjectMapper _mapper;
    private String _currentScope;

    public VariableHandler() {
        _vars = new HashMap<>();
        _mapper = new ObjectMapper();
        _currentScope = "ALL";

        _mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    /**
     * Método para establecer el alcance actual
     * @param newScope Nuevo alcance
     */
    public void setScope(String newScope) {
        this._currentScope = newScope;
    }

    /**
     * Método para obtener el alcance actual
     * @return Alcance actual
     */
    public String getScope() {
        return this._currentScope;
    }

    /**
     * Método para restablecer el alcance
     */
    public void resetScope() {
        this._currentScope = "ALL";
    }

    /**
     * Método para agregar una variable nueva con valor entero
     * @param identifier Identificador de la variable
     * @param value Valor entero a asignar
     */
    public void add(String identifier, Integer value) {
        createVar(identifier, NumberType.TYPE_INT, value.toString(), _currentScope);
    }

    /**
     * Método para agregar una variable nueva con valor entero y un alcance dado
     * @param identifier Identificador de la variable
     * @param value Valor entero a asignar
     * @param scope Alcance de la variable
     */
//    public void add(String identifier, Integer value, String scope) {
//        createVar(identifier, NumberType.TYPE_INT, value.toString(), scope);
//    }

    /**
     * Método para agregar una variable nueva con valor flotante
     * @param identifier Identificador de la variable
     * @param value Valor flotante a asignar
     */
    public void add(String identifier, Float value) {
        createVar(identifier, NumberType.TYPE_FLOAT, value.toString(), _currentScope);
    }

    /**
     * Método para agregar una variable nueva con valor flotante y un alcance dado
     * @param identifier Identificador de la variable
     * @param value Valor flotante a asignar
     * @param scope Alcance de la variable
     */
//    public void add(String identifier, Float value, String scope) {
//        createVar(identifier, NumberType.TYPE_FLOAT, value.toString(), scope);
//    }

    /**
     * Método para agregar una variable nueva sin inicializarla
     * @param identifier Identificador de la variable
     */
    public void add(String identifier) {
        createVar(identifier, NumberType.TYPE_NULL, null, _currentScope);
    }

    /**
     * Método para agregar una variable nueva sin inicializarla con un alcance dado
     * @param identifier Identificador de la variable
     * @param scope Alcance de la variable
     */
//    public void add(String identifier, String scope) {
//        createVar(identifier, NumberType.TYPE_NULL, null, scope);
//    }

    /**
     * Método para crear el objeto JSON con la información de una variable
     * @param id Identificador de la variable
     * @param type Tipo de la variable
     * @param value Valor de la variable
     */
    private void createVar(String id, NumberType type, String value, String scope) {
        if (exists(id, scope)) {
            onError("Variable <" + id + "> redeclarada");
        }

        ObjectNode node = _mapper.createObjectNode();
        node.put("name", id);
        node.put("type", type.toString());
        node.put("value", value);
        node.put("scope", scope);
        node.put("initialized", (type != NumberType.TYPE_NULL));
        save(id, scope, node);
    }

    /**
     * Método para verificar si una variable existe
     * @param identifier Identificador de la variable a verificar
     * @return True si existe, False caso contrario
     */
    public Boolean exists(String identifier, String scope) {
        if (!_vars.containsKey(identifier + ":" + scope)) return false;

        try {
            JsonNode variable = _mapper.readTree(_vars.get(identifier + ":" + scope));
            return variable.get("scope").asText().equals(scope);
        } catch (JsonProcessingException ex) {
            onError("No se pudo recuperar el identificador <" + identifier + ">");
            return false;
        }
    }

    public Boolean exists(String identifier) {
        return exists(identifier, _currentScope);
    }

    /**
     * Método para verificar si una variable es del tipo dado
     * @param identifier Identificador de la variable a verificar
     * @param type Tipo a verificar
     * @return True si la variable es del tipo dado, False caso contrario
     */
    public Boolean isType(String identifier, NumberType type, String scope) {
        JsonNode var = getVar(identifier, scope);
        if (var == null) return false;

        return (NumberType.valueOf(var.get("type").asText()) == type);
    }

    public Boolean isType(String identifier, NumberType type) {
        return isType(identifier, type, _currentScope);
    }

    /**
     * Método para verificar si una variable está inicializada
     * @param identifier Identificador de la variable a verificar
     * @return True si la variable está inicializada, False caso contrario
     */
    public Boolean isInitialized(String identifier, String scope) {
        JsonNode var = getVar(identifier, scope);
        if (var == null) return false;

        return (NumberType.valueOf(var.get("type").asText()) != NumberType.TYPE_NULL);
    }

    public Boolean isInitialized(String identifier) {
        return isInitialized(identifier, _currentScope);
    }

    /**
     * Método para modificar una variable con un valor de tipo entero
     * @param identifier Identificador de la variable a modificar
     * @param newValue Nuevo valor entero a asignar
     */
    public void modify(String identifier, Integer newValue) {
        modifyVar(identifier, NumberType.TYPE_INT, newValue.toString(), _currentScope);
    }

//    public void modify(String identifier, Integer newValue, String scope) {
//        modifyVar(identifier, NumberType.TYPE_INT, newValue.toString(), scope);
//    }

    /**
     * Método para modificar una variable con un valor de tipo flotante
     * @param identifier Identificador de la variable a modificar
     * @param newValue Nuevo valor flotante a asignar
     */
    public void modify(String identifier, Float newValue) {
        modifyVar(identifier, NumberType.TYPE_FLOAT, newValue.toString(), _currentScope);
    }

//    public void modify(String identifier, Float newValue, String scope) {
//        modifyVar(identifier, NumberType.TYPE_FLOAT, newValue.toString(), scope);
//    }

    /**
     * Método para modificar el valor de una variable existente
     * @param id Identificador de la variable a modificar
     * @param newType Tipo de valor a asignar
     * @param newValue Nuevo valor a asignar
     */
    private void modifyVar(String id, NumberType newType, String newValue, String scope) {
        if (!exists(id, scope)) {
            onError("Identificador <" + id + "> no está declarado");
            return;
        }

        JsonNode current = getVar(id, scope);
        if (current == null) return;

        if (isInitialized(id, scope) && !isType(id, newType, scope)) {
            onError("Valor " + newType + " incompatible con identificador <" + id + ":" + current.get("type").asText() + ">");
            return;
        }

        ObjectNode newVar = _mapper.createObjectNode();
        newVar.put("name", id);
        newVar.put("type", newType.toString());
        newVar.put("value", newValue);
        newVar.put("scope", scope);
        newVar.put("initialized", true);

        try {
            _vars.replace(id + ":" + scope, _mapper.writeValueAsString(newVar));
        } catch (JsonProcessingException ex) {
            onError("No se pudo modificar el identificador " + id);
        }
    }

    public Integer getInt(String identifier) {
        return getInt(identifier, _currentScope);
    }

    /**
     * Método para obtener el valor de una variable de tipo entero
     * @param identifier Identificador de la variable a recuperar
     * @return Valor entero asociado al identificador
     */
    public Integer getInt(String identifier, String scope) {
        if (!exists(identifier, scope)) {
            onError("Identificador <" + identifier + "> no está declarado");
            return null;
        }

        if (!isInitialized(identifier, scope)) {
            onError("Identificador <" + identifier + "> no está inicializado");
            return null;
        }

        JsonNode var = getVar(identifier, scope);
        if (var == null) return null;

        if (NumberType.valueOf(var.get("type").asText()) != NumberType.TYPE_INT) {
            onError("Identificador <" + identifier + "> no es de tipo int");
            return null;
        }

        return var.get("value").asInt();
    }

    public Float getFloat(String identifier) {
        return getFloat(identifier, _currentScope);
    }

    /**
     * Método para obtener el valor de una variable de tipo flotante
     * @param identifier Identificador de la variable a recuperar
     * @return Valor flotante asociado al identificador
     */
    public Float getFloat(String identifier, String scope) {
        if (!exists(identifier, scope)) {
            onError("Identificador <" + identifier + "> no está declarado");
            return null;
        }

        if (!isInitialized(identifier, scope)) {
            onError("Identificador <" + identifier + "> no está inicializado");
            return null;
        }

        JsonNode var = getVar(identifier, scope);
        if (var == null) return null;

        if (NumberType.valueOf(var.get("type").asText()) != NumberType.TYPE_INT) {
            onError("Identificador <" + identifier + "> no es de tipo int");
            return null;
        }

        return Float.parseFloat(var.get("value").asText());
    }

    /**
     * Método para obtener el Json asociado a un identificador
     * @param id Identificador a obtener
     * @return Json asociado al identificador
     */
    private JsonNode getVar(String id, String scope) {
        if (!exists(id, scope)) {
            onError("Identificador <" + id + "> no está definido");
            return null;
        }

        try {
            return _mapper.readTree(_vars.get(id + ":" + scope));
        } catch (JsonProcessingException ex) {
            onError("No se pudo recuperar el identificador <" + id + ">");
            return null;
        }
    }

    /**
     * Método para guardar el Json de la variable creada
     * @param id Identificador de la variable a guardar
     * @param node Json a guardar
     */
    private void save(String id, String scope, ObjectNode node) {
        try {
            String variable = _mapper.writeValueAsString(node);
            _vars.put(id + ":" + scope, variable);
            System.out.println("Variable <" + id + "> creada");
        } catch (JsonProcessingException ex) {
            onError("No se pudo guardar identificador <" + id + ">");
        }
    }

    /**
     * Método que se ejecuta cuando ocurre algún error
     * @param msg Mensaje de error
     */
    private void onError(String msg) {
        //TODO: mostrar error en la interfaz;
        System.err.println(msg);
    }

    /**
     * Método para imprimir todas las variables almacenadas
     */
    public void printVars() {
        System.out.println("\nVariables table");
        System.out.println("###############");
        _vars.forEach((key, value) -> System.out.println(value));
    }

    public static void main(String[] args) {
        VariableHandler handler = new VariableHandler();
        handler.add("myvar", 10);
        handler.printVars();
        handler.setScope("Espiral");
        handler.add("myvar", 10);
        handler.resetScope();
        handler.printVars();
    }
}
