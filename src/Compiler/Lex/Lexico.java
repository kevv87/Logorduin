package Compiler.Lex;

import java.io.File;

/**
 * Clase del analizador lexico
 */
public class Lexico {

    /**
     * Método para generar la clase lexer
     * @param ruta Ruta del archivo .jflex
     */
    public static void generarLexer(String ruta) {
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }

//    public static void main(String[] args) {
//        String path = "/src/Compiler/Lex/lexical.jflex";
//        String ruta  = cwd.replaceAll("\\\\", "/") + path;
//        generarLexer(ruta);
//    }
}
