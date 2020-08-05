package Compiler.Helpers;

import Compiler.Exceptions.CompilerException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.HashMap;
import java.util.Stack;

public class VariableHandler {

    private final HashMap<String, String> _vars;
    private final ObjectMapper _mapper;
    private Stack<String> _currentScope; // Es un stack para poder volver al scope anterior cuando se termine un scope

    public VariableHandler() {
        _vars = new HashMap<>();
        _mapper = new ObjectMapper();
        _currentScope = new Stack<String>();
        _currentScope.push("ALL");

        _mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    /**
     * Método para establecer el alcance actual
     * @param newScope Nuevo alcance
     */
    public void setScope(String newScope) {
        this._currentScope.push(newScope);
    }

    /**
     * Método para obtener el alcance actual
     * @return Alcance actual
     */
    public String getScope() {
        return this._currentScope.peek();
    }

    /**
     * Método para restablecer el alcance al alcance anterior. De no haber anterior restaura a ALL.
     */
    public void resetScope() {
        _currentScope.pop();
        if(_currentScope.empty()){
            _currentScope.push("ALL");
        }
    }

    /**
     * Método para agregar una variable nueva con valor entero
     * @param identifier Identificador de la variable
     * @param value Valor entero a asignar
     */
    public void add(String identifier, Integer value) throws CompilerException {
        createVar(identifier, NumberType.TYPE_INT, value.toString(), _currentScope.peek());
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
    public void add(String identifier, Float value) throws CompilerException {
        createVar(identifier, NumberType.TYPE_FLOAT, value.toString(), _currentScope.peek());
    }

    /**
     * Método para agregar una variable nueva con valor flotante
     * @param identifier Identificador de la variable
     * @param value Valor flotante a asignar
     */
    public void add(String identifier, Boolean value) throws CompilerException {
        createVar(identifier, NumberType.TYPE_BOOL, value.toString(), _currentScope.peek());
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
    public void add(String identifier) throws CompilerException {
        createVar(identifier, NumberType.TYPE_NULL, null, _currentScope.peek());
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
    public void createVar(String id, NumberType type, String value, String scope) throws CompilerException {
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
    public Boolean exists(String identifier, String scope) throws CompilerException {
        if (!_vars.containsKey(identifier + ":" + scope)) return false;

        try {
            JsonNode variable = _mapper.readTree(_vars.get(identifier + ":" + scope));
            return variable.get("scope").asText().equals(scope);
        } catch (JsonProcessingException ex) {
            onError("No se pudo recuperar el identificador <" + identifier + ">");
            return false;
        }
    }

    public Boolean exists(String identifier) throws CompilerException {
        return exists(identifier, _currentScope.peek());
    }

    /**
     * Método para verificar si una variable es del tipo dado
     * @param identifier Identificador de la variable a verificar
     * @param type Tipo a verificar
     * @return True si la variable es del tipo dado, False caso contrario
     */
    public Boolean isType(String identifier, NumberType type, String scope) throws CompilerException {
        JsonNode var = getVar(identifier, scope);
        if (var == null) return false;

        return (NumberType.valueOf(var.get("type").asText()) == type);
    }

    public Boolean isType(String identifier, NumberType type) throws CompilerException {
        return isType(identifier, type, _currentScope.peek());
    }

    /**
     * Método para verificar si una variable está inicializada
     * @param identifier Identificador de la variable a verificar
     * @return True si la variable está inicializada, False caso contrario
     */
    public Boolean isInitialized(String identifier, String scope) throws CompilerException {
        JsonNode var = getVar(identifier, scope);
        if (var == null) return false;

        return (NumberType.valueOf(var.get("type").asText()) != NumberType.TYPE_NULL);
    }

    public Boolean isInitialized(String identifier) throws CompilerException {
        return isInitialized(identifier, _currentScope.peek());
    }

    /**
     * Método para modificar una variable con un valor de tipo entero
     * @param identifier Identificador de la variable a modificar
     * @param newValue Nuevo valor entero a asignar
     */
    public void modify(String identifier, Integer newValue) throws CompilerException {
        modifyVar(identifier, NumberType.TYPE_INT, newValue.toString(), _currentScope.peek());
    }

//    public void modify(String identifier, Integer newValue, String scope) {
//        modifyVar(identifier, NumberType.TYPE_INT, newValue.toString(), scope);
//    }

    /**
     * Método para modificar una variable con un valor de tipo flotante
     * @param identifier Identificador de la variable a modificar
     * @param newValue Nuevo valor flotante a asignar
     */
    public void modify(String identifier, Float newValue) throws CompilerException {
        modifyVar(identifier, NumberType.TYPE_FLOAT, newValue.toString(), _currentScope.peek());
    }


    /**
     * Método para modificar una variable con un valor de tipo booleano
     * @param identifier Identificador de la variable a modificar
     * @param newValue Nuevo valor flotante a asignar
     */
    public void modify(String identifier, Boolean newValue) throws CompilerException {
        modifyVar(identifier, NumberType.TYPE_BOOL, newValue.toString(), _currentScope.peek());
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
    private void modifyVar(String id, NumberType newType, String newValue, String scope) throws CompilerException {
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

    public Integer getInt(String identifier) throws CompilerException {
        return getInt(identifier, _currentScope.peek());
    }

    /**
     * Método para obtener el valor de una variable de tipo entero
     * @param identifier Identificador de la variable a recuperar
     * @return Valor entero asociado al identificador
     */
    public Integer getInt(String identifier, String scope) throws CompilerException {
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

    public Boolean getBoolean(String identifier) throws CompilerException {
        return getBoolean(identifier, _currentScope.peek());
    }

    public Boolean getBoolean(String identifier, String scope) throws CompilerException {
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

        if (NumberType.valueOf(var.get("type").asText()) != NumberType.TYPE_BOOL) {
            onError("Identificador <" + identifier + "> no es de tipo boolean");
            return null;
        }

        return var.get("value").asBoolean();
    }

    public Float getFloat(String identifier) throws CompilerException {
        return getFloat(identifier, _currentScope.peek());
    }

    /**
     * Método para obtener el valor de una variable de tipo flotante
     * @param identifier Identificador de la variable a recuperar
     * @return Valor flotante asociado al identificador
     */
    public Float getFloat(String identifier, String scope) throws CompilerException {
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

        if (NumberType.valueOf(var.get("type").asText()) != NumberType.TYPE_FLOAT) {
            onError("Identificador <" + identifier + "> no es de tipo float");
            return null;
        }

        return Float.parseFloat(var.get("value").asText());
    }

    /**
     * Método para obtener el Json asociado a un identificador
     * @param id Identificador a obtener
     * @return Json asociado al identificador
     */
    private JsonNode getVar(String id, String scope) throws CompilerException {
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
    private void save(String id, String scope, ObjectNode node) throws CompilerException {
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
    private void onError(String msg) throws CompilerException {
        //TODO: mostrar error en la interfaz;
        throw new CompilerException("No se pudo agregar ni modificar una variable", null);
    }

    /**
     * Metodo para saber si hay que ignorar las instrucciones debido a un if con condicion falsa.
     * */
    public boolean isIgnore(){
        return _currentScope.search("ignore")>0;
    }

    /**
     * Método para imprimir todas las variables almacenadas
     */
    public void printVars() {
        System.out.println("\nVariables table");
        System.out.println("###############");
        _vars.forEach((key, value) -> System.out.println(value));
    }

    // Getters & Setters for jackson
    public HashMap<String, String> get_vars() {
        return _vars;
    }

    public ObjectMapper get_mapper() {
        return _mapper;
    }

    public Stack<String> get_currentScope() {
        return _currentScope;
    }

    public void set_currentScope(Stack<String> _currentScope) {
        this._currentScope = _currentScope;
    }

    public static void main(String[] args) throws CompilerException {
        VariableHandler handler = new VariableHandler();
        handler.add("myvar", 10);
        handler.printVars();
        handler.setScope("Espiral");
        handler.add("myvar", 10);
        handler.resetScope();
        handler.printVars();
    }
}
