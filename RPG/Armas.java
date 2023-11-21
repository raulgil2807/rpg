package rpg;

/**
 * Creación de RPG para 1ºDAM
 *
 * @version 6.4
 * @since Visual Studio Code 1.84.2
 * @author Pedro Jesús Gómez Pérez y Raúl Gil Jiménez
 */
public class Armas {

    // DEFINIMOS LOS ATRIBUTOS QUE TIENE NUESTRO RPG
    private String nombre;
    private int ataque;

    // CONSTRUCTOR POR PARÁMETRO
    /**
     *
     * @param nombre
     * @param ataque
     */
    public Armas(String nombre, int ataque) {
        this.nombre = nombre;
        this.ataque = ataque;
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
    public int getAtaque() {
        return ataque;
    }
    //SETTERS

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param ataque
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    //@OVERRIDE SIRVE PARA LA SOBRECARGA
    /**
     *
     * @return
     */
    @Override
    //IMPRIME Y RESUME TODOS LOS MÉTODOS EN UNA SOLA VEZ.
    public String toString() {
        String mensajeArmas = "Nombre : " + nombre + "\n" + "Ataque : " + ataque + "\n";
        return mensajeArmas;
    }

}
