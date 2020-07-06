package Logic;

import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

/**
 * Clase del cursor, para almacenar la posición, rotación y color seleccionado.
 */
public class  Cursor {

    private Integer posX;
    private Integer posY;
    private Integer rotation;
    private Color currentColor;
    private ImageView icon;

    /**
     * Constructor para crear una instancia del cursor.
     * @param icon Imagen del cursor.
     * @param canvasWidth Ancho del canvas.
     * @param canvasHeight Alto del canvas.
     */
    public Cursor(ImageView icon, Integer canvasWidth, Integer canvasHeight) {
        this.icon = icon;

        // Poner el cursor en el centro del canvas.
        this.posX = canvasWidth / 2;
        this.posY = canvasHeight /2;
    }

    /**
     * Método para obtener la posición X del cursor.
     * @return Posición X del cursor.
     */
    public Integer getPosX() {
        return posX;
    }

    /**
     * Método para establecer la posición X del cursor.
     * @param posX Nueva posición X.
     */
    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    /**
     * Método para obtener la posición Y del cursor.
     * @return Posición Y del cursor.
     */
    public Integer getPosY() {
        return posY;
    }

    /**
     * Método para establecer la posición Y del cursor.
     * @param posY Nueva posición Y.
     */
    public void setPosY(Integer posY) {
        this.posY = posY;
    }

    /**
     * Método para obtener la rotación actual del cursor.
     * @return Rotación actual del cursor.
     */
    public Integer getRotation() {
        return rotation;
    }

    /**
     * Método para establecer la rotación actual del cursor.
     * @param rotation Nueva rotación del cursor.
     */
    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    /**
     * Método para rotar el cursor
     * @param rotation Grados a rotar el cursor
     */
    public void rotateCursor(Integer rotation) {
        this.rotation += rotation;
    }

    /**
     * Método para obtener el color de dibujo actual.
     * @return Color de dibujo actual.
     */
    public Color getCurrentColor() {
        return currentColor;
    }

    /**
     * Método para establecer el color de dibujo actual.
     * @param currentColor Nuevo color de dibujo.
     */
    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }

    /**
     * Método para obtener el ícono del cursor.
     * @return Ícono del cursor.
     */
    public ImageView getIcon() {
        return icon;
    }

    /**
     * Método para establecer el ícono del cursor.
     * @param icon Nuevo ícono del cursor.
     */
    public void setIcon(ImageView icon) {
        this.icon = icon;
    }

}
