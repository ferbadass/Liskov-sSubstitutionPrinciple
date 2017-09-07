/**
 * Alumno: López Esquivel Andrés
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package liskovsubstitutionprinciple;

/**
 * La clase Gato hereda de la clase Animal
 * @author Andrés
 */
public class Gato extends Animal{

    /**
     * Método abstacto: muestra del polimorfismo de un método creado por
     * la clase padre
     */
    @Override
    public void Alimentarse() {
        System.out.println("Soy un gato, me alimento de ratones");
    }
    
}
