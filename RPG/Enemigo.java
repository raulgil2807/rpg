package rpg;

/**
 *
 * @author raulg
 */
public class Enemigo {

    // DEFINIMOS LOS ATRIBUTOS AQUE TIENE NUESTRO RPG
    private String nombre;
    private int ataque;

    // CONSTRUCTOR POR PARÁMETRO

    /**
     *
     * @param nombre
     * @param ataque
     */
    public Enemigo(String nombre, int ataque) {
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

    // SETTERS

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

    //@OVERRIDE SIRVE PARA LA SOBRECARGA Y DARLE AL MÉTODO NUEVA FUNCIONALIDAD

    /**
     *
     * @return
     */
    @Override
    //IMPRIME Y RESUME TODOS LOS MÉTODOS EN UNA SOLA VEZ.
    public String toString() {
        String mensaje_enemigo = "Nombre : " + nombre + "\n" + "Ataque : " + ataque + "\n";
        return mensaje_enemigo;
    }

}// CLASS ENEMIGO
