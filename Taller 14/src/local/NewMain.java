
package local;

/**
 *
 * @author Daniel
 */
public class NewMain {

    public static void main(String[] args) {
        
        //Ejercicio 1
        Ej1_Figura figura1 = new Ej1_Circulo(6); //Uso del polimorfismo
        Ej1_Figura figura2 = new Ej1_Rectangulo(6, 10); //Uso del polimorfismo
        
        figura1.calcularArea();
        figura1.mostrarArea();
        figura2.calcularArea();
        figura2.mostrarArea();
        
        //Ejercicio 2
        Ej2_Persona estudiante = new Ej2_Estudiante("Daniel");// Uso del polimorfismo
        Ej2_Persona profesor = new Ej2_Profesor("Andrea");// Uso del polimorfismo
        
        estudiante.presentarse();
        profesor.presentarse();
        
        //Ejercicio 4
        Ej4_Vehiculo coche = new Ej4_Coche();// Uso del polimorfismo
        Ej4_Vehiculo bicicleta = new Ej4_Bicicleta();// Uso del polimorfismo
        
        coche.mover();
        bicicleta.mover();
    }
    
}
