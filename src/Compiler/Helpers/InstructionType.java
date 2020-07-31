package Compiler.Helpers;

public enum InstructionType {
    NORMAL, //Instrucción normal
    LOGIC,  //Operación lógica
    OPERATION, //Operación aritmética
    VARIABLE, //Creación o modificación de variable
    CYCLE, // Ciclo "repite"
    CONDITION, //Instrucción "si"
    PROCEDURE //Procedimientos creados por el usuario
}
