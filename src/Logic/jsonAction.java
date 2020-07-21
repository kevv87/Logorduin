package Logic;

import java.util.ArrayList;

/**
 * El archivo compilado va a guardar acciones en forma de jsons, esta clase representa dichas acciones
 * además sirve para realizar el parseo a la hora de traducir el código máquina en la interfaz
 *
 *  @author Kevin Zeledon
 *   @version 1.0
 *    @since  07/16/2020
 *
 */
public class jsonAction {

    private String accion; // Accion a ejecutar
    private int repeticiones;  // Numero de veces a ejecutar dicha accion
    private ArrayList<Object> argumentos; // Argumentos para la accion a ejecutar

    public jsonAction(){}; // Dummy constructor necesario para jackson

    public jsonAction(String accion, int repeticiones, ArrayList<Object> argumentos) {
        this.accion = accion;
        this.repeticiones = repeticiones;
        this.argumentos = argumentos;
    }

    // Getters & Setters
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public ArrayList<Object> getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(ArrayList<Object> argumentos) {
        this.argumentos = argumentos;
    }
}
