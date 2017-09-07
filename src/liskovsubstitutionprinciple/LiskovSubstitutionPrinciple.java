/**
 * Alumno: Miranda Sanchez Maria Fernanda
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package liskovsubstitutionprinciple;

/**
 *
 * @author Fernanda
 */
public class LiskovSubstitutionPrinciple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro ObjetoPerro = new Perro();
        Gato ObjetoGato = new Gato();
        
        ObjetoPerro.Alimentarse();
        ObjetoGato.Alimentarse();
    }
    
}
