package Compiler.Helpers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.ArrayList;
import java.util.HashMap;

public class ProcedureHandler {

    private final HashMap<String, String> _procs;
    @JsonIgnore
    private final ObjectMapper _mapper;


    public ProcedureHandler() {
        _procs = new HashMap<>();
        _mapper = new ObjectMapper();

        _mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public void add(String name, ArrayList<String> parameters, ArrayList<String> instructions) {
        ObjectNode procedure = _mapper.createObjectNode();
        procedure.put("name", name);
        procedure.put("argsCount", parameters.size());

        ArrayNode params = _mapper.createArrayNode();
        for (String arg: parameters) {
            params.add(arg);
        }
        procedure.putArray("params").addAll(params);

        ArrayNode instr = _mapper.createArrayNode();
        for (String instruction: instructions) {
            instr.add(instruction);
        }
        procedure.putArray("instructions").addAll(instr);

        save(name, procedure);
    }

    public void add(String name, ArrayList<String> instructions) {
        ObjectNode procedure = _mapper.createObjectNode();
        procedure.put("name", name);
        procedure.put("argsCount", 0);
        procedure.putArray("params");
        procedure.putArray("paramsValues");

        ArrayNode instr = _mapper.createArrayNode();
        for (String instruction: instructions) {
            instr.add(instruction);
        }
        procedure.putArray("instructions").addAll(instr);

        save(name, procedure);
    }

    private void save(String name, ObjectNode procedure) {
        try {
            _procs.put(name, _mapper.writeValueAsString(procedure));
            System.out.println("Procedimiento <" + name + "> almacenado correctamente");
        } catch (JsonProcessingException ex) {
            onError("No se pudo almacenar el procedimiento <" + name + ">");
        }
    }

    public void onError(String msg) {
        //TODO: mostrar errores en la interfaz
        System.err.println(msg);
    }

    public void printProcedures() {
        System.out.println("\nProcedures table");
        System.out.println("#################");
        _procs.forEach((name, json) -> {
            System.out.println("Procedure: " + name);
            System.out.println(json);
        });
    }

    public static void main(String[] args) {
        ProcedureHandler handler = new ProcedureHandler();

        var params = new ArrayList<String>();
        params.add("cantidad");
        params.add("radio");

        var instr = new ArrayList<String>();
        instr.add("{/*Instrucción 1*/}");
        instr.add("{/*Instrucción 2*/}");
        instr.add("{/*Instrucción 3*/}");

        handler.add("Espirales", params, instr);
        handler.printProcedures();

        /*
        PARA Espirales cantidad radio
            AVANZA cantidad;
            GIRADERECHA radio;
        FIN

        Espirales 100 90;

        PARA Espirales cantidad
            ...
        FIN

        Espirales 100;
         */
    }

    public ObjectMapper get_mapper() {
        return _mapper;
    }

    public HashMap<String, String> get_procs() {
        return _procs;
    }
}
