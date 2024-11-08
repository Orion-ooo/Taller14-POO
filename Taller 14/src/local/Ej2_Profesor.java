
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_Profesor extends Ej2_Persona{

    public Ej2_Profesor(String nombre) {
        super(nombre);
    }
    
    @Override public void presentarse(){
        System.out.println("el/la profesor(a) " + nombre + " se esta presentando");
    }
}
