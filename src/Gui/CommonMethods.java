package Gui;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Clase con métodos necesarios para diferentes clases
 */
public class CommonMethods {
    private static final String cwd = System.getProperty("user.dir");

    /**
     * Método para obtener el directorio actual
     * @return String con la dirección
     */
    public static String getCwd() {
        return cwd;
    }

    /**
     * Métod para cargar un ImageView
     * @param path Ruta del archivo
     * @param height Altura de la imagen
     * @param width Ancho de la imagen
     * @return Un objeto ImageView de la imagen agregada
     */
    public static ImageView loadImageView(String path, Integer height, Integer width){
        Image tokenImage = imageLoader(cwd.replaceAll("\\\\", "/") + path);
        ImageView addTokenImage = new ImageView(tokenImage);
        addTokenImage.setFitHeight(height);
        addTokenImage.setFitWidth(width);

        return addTokenImage;
    }

    /**
     * Método para cargar una imagen
     * @param path Ruta de la imagen
     * @return El objeto de la imagen creada
     */
    public static Image imageLoader(String path){
        try{
            FileInputStream i = new FileInputStream(path);
            return new Image(i);
        }catch (FileNotFoundException e){
            System.out.println("Couldn't load images!");
        }
        System.out.println("Could not find " + path);
        return null;
    }
}
