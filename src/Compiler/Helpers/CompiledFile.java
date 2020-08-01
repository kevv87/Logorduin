package Compiler.Helpers;


import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Representa la estructura en el archivo compilado
 * */
public class CompiledFile {
    InstructionHandler instructions;  // Instrucciones
    ProcedureHandler procedures; // Procedimientos

    // Dummy constructor for jackson
    public CompiledFile() {
      
    }

    public CompiledFile(InstructionHandler instructions, ProcedureHandler procedures) {
        this.instructions = instructions;
        this.procedures = procedures;
    }

    public InstructionHandler getInstructions() {
        return instructions;
    }

    public void setInstructions(InstructionHandler instructions) {
        this.instructions = instructions;
    }

    public ProcedureHandler getProcedures() {
        return procedures;
    }

    public void setProcedures(ProcedureHandler procedures) {
        this.procedures = procedures;
    }
}
