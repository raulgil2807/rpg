package rpg;

// DEFINIMOS LOS ATRIBUTOS QUE TIENE NUESTRO RPG

/**
 * Creación de RPG para 1ºDAM
 * @version 1.0 
 * @since Visual Studio Code 1.84.2
 * @author Pedro Jesús Gómez Pérez y Raúl Gil Jiménez
 */
public class Jugador {

    private String nombre;
    private int salud, ataque, dinero, keys;

// CONSTRUCTOR POR PARÁMETRO

    /**
     *
     * @param nombre
     * @param salud
     * @param ataque
     * @param dinero
     * @param keys
     */
    public Jugador(String nombre, int salud, int ataque, int dinero, int keys) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
        this.dinero = dinero;
        this.keys = keys;

    }

    // GETTERS

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public int getKeys() {
        return keys;
    }

    /**
     *
     * @return
     */
    public int getSalud() {
        return salud;
    }

    /**
     *
     * @return
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     *
     * @return
     */
    public int getDinero() {
        return dinero;
    }

    // SETTERS

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param salud
     */
    public void setSalud(int salud) {
       this.salud = salud;
    }

    /**
     *
     * @param ataque
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     *
     * @param keys
     */
    public void setKeys(int keys) {
        this.keys = keys;
    }

    /**
     *
     * @param dinero
     */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    //@OVERRIDE SIRVE PARA LA SOBRECARGA Y DARLE AL MÉTODO NUEVA FUNCIONALIDAD

    /**
     *
     * @return
     */
    @Override
    //IMPRIME Y RESUME TODOS LOS MÉTODOS EN UNA SOLA VEZ.
    public String toString() {
        String mensaje = "Nombre : " + nombre + "\n" + "Salud :  " + salud + "\n" + "Ataque : " + ataque + "\n"
                + "Dinero :  "
                + dinero + " oros " + "\n" + "Llaves : " + keys;
        return mensaje;
    }

    /**
     *
     * @return
     */
    public int getkeys() {
        return keys;
    }

    /**
     *
     * @param keys
     */
    public void setkeys(int keys) {
        keys = keys;
    }

}// CIERRE CLASE
