package Compiler.Lex;

import java.io.*;

public class Analizador {
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
                    case Reservadas, Identificador, Constante, Operador, SimboloEspecial -> System.out.println(lexer.lexeme + ": Es un " + tokens);
                    case Error -> System.out.println("Simbolo no definido " + lexer.lexeme + " en linea " + lexer.line + " en columna " + lexer.column);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
