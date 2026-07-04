/*
Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
 */

import java.util.Scanner;

public class ejercicioCatorce {
    public static void main(String[] args){
        System.out.println("Introduce tu nota: ");
        Scanner input = new Scanner(System.in);
        double x = Double.parseDouble(input.nextLine());
        // en este punto tuve problemas porque estaba usando input.nextDouble() y me daba un error de missmatch
        // la solución al final era tratar el input como cadena y después convertirlo yo

        if ( (x >= 0) && (x < 5) ){
            System.out.println("Insuficiente");
        } else if ( (x >= 5) && (x < 6) ){
            System.out.println("Suficiente");
        } else if ( (x >= 6) && (x < 7) ){
            System.out.println("Bien");
        } else if ( (x >= 7) && (x < 9) ){
            System.out.println("Notable");
        } else if ( (x >= 9) && (x <= 10) ){
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota introducida incorrecta.");
        }

    }
}
