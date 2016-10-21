/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema19;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double angulo;    // TODO code application logic here
    
    angulo= pedirAngulo();
    mostrarResultado(angulo);
    }
    public static double pedirAngulo() {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca el valor númerico de un angulo (0 a 360)");
        return entrada.nextDouble();
    }
    public static void mostrarResultado(double x) {
        double y = Math.toRadians(x);
        System.out.println("Para el angulo "+x+" grados tenemos:");
        System.out.println("Seno igual a "+Math.sin(y)+", Coseno igual a "+Math.cos(y)+" y tangente de "+Math.tan(y));
    }
    
}
