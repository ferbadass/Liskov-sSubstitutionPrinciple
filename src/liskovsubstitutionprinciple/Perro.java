/**
 * Alumno: Miranda Sanchez Maria Fernanda
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package liskovsubstitutionprinciple;

/**
 * La clase Perro hereda de la clase Animal
 * @author Fernanda
 */
public class Perro extends Animal {
    
    /**
     * Método abstacto: muestra del polimorfismo de un método creado por
     * la clase padre
     */
    @Override
    public void Alimentarse() {
        System.out.println("Soy un perro, me alimento de croquetas");
    }
}
