
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_Estudiante extends Ej2_Persona{

    public Ej2_Estudiante(String nombre) {
        super(nombre);
    }
    
    @Override public void presentarse(){
        System.out.println("el/la estudiante " + nombre + " se esta presentando");
    }
}
