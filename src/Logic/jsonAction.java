package Logic;

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
    private String[] argumentos; // Argumentos para la accion a ejecutar

    public jsonAction(){}; // Dummy constructor necesario para jackson

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

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }
}
