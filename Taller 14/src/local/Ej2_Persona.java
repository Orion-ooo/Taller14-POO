
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_Persona {
    public String nombre;

    public Ej2_Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public void presentarse(){
        System.out.println("la persona" + nombre + "se esta presentando");
    }
}
