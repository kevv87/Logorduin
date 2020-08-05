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
    public void printTokens2(String ruta) {
        try {
            Reader reader = new BufferedReader(new FileReader(ruta));
            Lexer lexer = new Lexer(reader);
            while (true) {
                Integer token = lexer.yylex();
                if (token == null) {
                    System.out.println("Análisis completado! :D");
                    return;
                }
                if (token == 81) {
                    System.out.println(lexer.getErrorMessage() + " en linea " + (lexer.getLine()+1) + " en columna " + lexer.getColumn());
//                    System.out.println("Simbolo no definido " + lexer.getSemantic() + " en linea " + lexer.getCurrentLine() + " en columna " + lexer.getCurrentColumn());
                }
//                else {
//                    System.out.println(lexer.lexeme + ", código: " + token);
//                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Método principal
     * @param args ...
     */
    public static void main(String[] args) {
//        String pathL = "/src/Compiler/Lex/lexical.jflex";
        String pathL = "/src/Compiler/Lex/flexer.jflex";
        String rutaL  = System.getProperty("user.dir").replaceAll("\\\\", "/") + pathL;
        Lexico.generarLexer(rutaL);

//        String path = "/src/Compiler/Lex/parse.txt";
        String path = "/src/Compiler/Lex/parse.txt";
        String ruta  = System.getProperty("user.dir").replaceAll("\\\\", "/") + path;
        Analizador analizador = new Analizador();
//        analizador.printTokens(ruta);
        analizador.printTokens2(ruta);


    }
}
