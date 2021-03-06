package Compiler.Exceptions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompilerException extends Exception{

    String mensaje;
    String instruccion;

    public CompilerException(String mensaje, String instruccion) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            if(instruccion == null){
                this.mensaje = mensaje;
                this.instruccion = null;
            }else{
                JsonNode instructionJ = mapper.readTree(instruccion);
                this.mensaje = "Error en linea " + instructionJ.get("line") + ": " +mensaje;
                this.instruccion = instruccion;
            }

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
        ObjectMapper mapper = new ObjectMapper();
        JsonNode instructionJ = null;
        try {
            instructionJ = mapper.readTree(instruccion);
            this.mensaje = "Error en linea " + instructionJ.get("line") + ": " +mensaje;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
