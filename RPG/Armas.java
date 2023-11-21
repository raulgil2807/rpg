package rpg;

/**
 * Creación de RPG para 1ºDAM
 *
 * @version 1.0 
 * @since NetBeans 19.0
 * @author Pedro y Raúl
 */
public class Armas {

    // DEFINIMOS LOS ATRIBUTOS AQUE TIENE NUESTRO RPG
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
        nombre = nombre;
    }

    /**
     *
     * @param ataque
     */
    public void setAtaque(int ataque) {
        ataque = ataque;
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
