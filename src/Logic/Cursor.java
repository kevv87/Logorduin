package Logic;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

/**
 * Clase del cursor, para almacenar la posición, rotación y color seleccionado.
 */
public class  Cursor {

    private Double posX;
    private Double posY;
    private Integer rotation;
    private Color currentColor;
    private ImageView icon;
    private GraphicsContext gc;
    private boolean lapiz; // True: Dibuja por donde pasa la tortuga. False: No dibujo por donde pasa la tortuga.

    /**
     * Constructor para crear una instancia del cursor.
     * @param icon Imagen del cursor.
     * @param canvasWidth Ancho del canvas.
     * @param canvasHeight Alto del canvas.
     */
    public Cursor(ImageView icon, Integer canvasWidth, Integer canvasHeight, GraphicsContext gc) {
        this.icon = icon;
        this.gc = gc;
        // Poner el cursor en el centro del canvas.
        this.posX = (double)canvasWidth / 2;
        this.posY = (double)canvasHeight /2;
        this.rotation = 0;
        lapiz =true;
    }

    /**
     * Mueve el cursor hacia adelante la cantidad especificada. Dibuja si el lapiz esta abajo
     * @param cantidad Cantidad de pixeles a mover el cursor.
     */
    public void move(int cantidad, boolean avanzar){
        Double oldX = this.posX;
        Double oldY = this.posY;
        posY = (oldY - (Math.cos(2*Math.PI*rotation/360)*cantidad));
        posX = (oldX + (Math.sin(2*Math.PI*rotation/360)*cantidad));
        if(lapiz){  // De tener el lapiz pintando, pintar
            if(avanzar) {
                gc.strokeLine(oldX,oldY,posX,posY);
            }
            else {
                gc.strokeLine(oldX,oldY, -posX, -posY);
            }
        }
    }

    /**
     * Método para obtener la posición X del cursor.
     * @return Posición X del cursor.
     */
    public Double getPosX() {
        return posX;
    }

    /**
     * Método para establecer la posición X del cursor.
     * @param posX Nueva posición X.
     */
    public void setPosX(Double posX) {
        this.posX = posX;
    }

    /**
     * Método para obtener la posición Y del cursor.
     * @return Posición Y del cursor.
     */
    public Double getPosY() {
        return posY;
    }

    /**
     * Método para establecer la posición Y del cursor.
     * @param posY Nueva posición Y.
     */
    public void setPosY(Double posY) {
        this.posY = posY;
    }

    /**
     * Metodo para reubicar el cursor
     * @param newPosX nueva posicion X.
     * @param newPosY nueva posicion Y.
     */
    public void realocate(Double newPosX, Double newPosY) {
        setPosX(newPosX);
        setPosY(newPosY);
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
    public void updateRotation(Integer rotation, boolean clockwise) {
        if(clockwise) {
            this.rotation += rotation;
        }
        else {
            this.rotation -= rotation;
        }
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
     * Método para determinar estado del lapiz.
     */
    public boolean isLapiz() {
        return lapiz;
    }

    /**
     * Método para establecer estado del lapiz.
     * @param lapiz estado del lapiz
     */
    public void setLapiz(boolean lapiz) {
        this.lapiz = lapiz;
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
