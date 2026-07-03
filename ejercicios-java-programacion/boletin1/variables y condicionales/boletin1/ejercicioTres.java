/*
Pedir el radio de una circunferencia y calcular su longitud.
 */
import java.util.Scanner;

public class ejercicioTres {
    public static void main(String[] args){
        double l, r;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia: ");
        r = input.nextDouble();
        l = 2 * Math.PI * r;
        System.out.println("La longitud de la circunferencia es " + l);
    }
}
