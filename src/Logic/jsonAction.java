package Logic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.w3c.dom.ls.LSOutput;

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

    private String accion; // Accion a ejecutar, de ser el nombre de un procedimiento, ejecutarlo en la interfaz, de decir "conjunto" se refiere a que es son varios procedimientos, estos vienen en el ArrayList complejo
    private int repeticiones;  // Numero de veces a ejecutar dicha accion
    private ArrayList<Object> argumentos; // Argumentos para la accion a ejecutar

    private ArrayList<String> complejo; // Complejo de acciones a ejecutar.
    public jsonAction(){}; // Dummy constructor necesario para jackson

    public jsonAction(String accion, int repeticiones) {
        this.accion = accion;
        this.repeticiones = repeticiones;
        this.argumentos = null;
        this.complejo = new ArrayList<>();
    }

    public jsonAction(String accion, int repeticiones, ArrayList<Object> argumentos) {
        this.accion = accion;
        this.repeticiones = repeticiones;
        this.argumentos = argumentos;
        this.complejo = null;
    }

    /**
     * Convierte un jsonAction a su forma de json y lo agrega a complejo
     * @param accion jsonAction a agregar
     * */
    public void addComplejo(jsonAction accion){

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            complejo.add(objectMapper.writeValueAsString(accion));
        }catch(JsonProcessingException e){
            System.out.println(e);
        }

    }

    // Getters & Setters
    public ArrayList<String> getComplejo() {
        return complejo;
    }

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
