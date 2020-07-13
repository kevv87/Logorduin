package Compiler.Lex;

import java.io.*;

/**
 * Clase que hace el analisis a los tokens
 */
public class Analizador {

    /**
     * Método para imprimir los tokens
     * @param ruta Ruta del archivo a analizar
     */
    public void printTokens(String ruta) {
        try {
            Reader reader = new BufferedReader(new FileReader(ruta));
            Lexer lexer = new Lexer(reader);
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    System.out.println("Analisis Completado");
                    return;
                }
                switch (tokens) {
                    case Reservadas, Identificador, Constante, Operador, SimboloEspecial, Procedimiento, Procedimiento1, Procedimiento1P, Procedimiento2, ProcedimientoN, ProcedimientoP -> System.out.println(lexer.lexeme + ": Es un " + tokens);
                    case Error -> System.out.println("Simbolo no definido " + lexer.lexeme + " en linea " + lexer.line + " en columna " + lexer.column);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método principal
     * @param args ...
     */
    public static void main(String[] args) {
        String pathL = "/src/Compiler/Lex/lexical.jflex";
        String rutaL  = System.getProperty("user.dir").replaceAll("\\\\", "/") + pathL;
        Lexico.generarLexer(rutaL);

        String path = "/src/Compiler/Lex/parse.txt";
        String ruta  = System.getProperty("user.dir").replaceAll("\\\\", "/") + path;
        Analizador analizador = new Analizador();
        analizador.printTokens(ruta);
    }
}
