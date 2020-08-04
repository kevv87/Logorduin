package Compiler.Exceptions;

public class CompilerException extends Exception{

    String mensaje;
    String instruccion;

    public CompilerException(String mensaje, String instruccion) {
        //super(cause);
        this.mensaje = mensaje;
        this.instruccion = instruccion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getInstruccion() {
        return instruccion;
    }
}
