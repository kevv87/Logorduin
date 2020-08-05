package Compiler.Helpers;

public enum ArgType {
    INT_CONSTANT,
    FLOAT_CONSTANT,
    STRING_CONSTANT,
    BOOL_CONSTANT,
    INT_VARIABLE,
    FLOAT_VARIABLE,
    VARIABLE,
    OPERATION,
    INSTRUCTION //Argumento es una instrucción que necesita ejecutarse antes.
}
