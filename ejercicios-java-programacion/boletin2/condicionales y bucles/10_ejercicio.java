/*
Pedir 15 números y escribir la suma total.
 */

import java.util.Scanner;

public class ejercicioDiez {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);

// Se podría pedir los números uno a uno pero sería ineficiente, creo que lo correcto sería
// crear un bucle que me pida números hasta llegar a 15.

        int sumatorio = 0;
        int contador = 15;
        System.out.println("Introduce un número, quedan " + contador + " por introducir: ");
        int a = i.nextInt();

        sumatorio += a;

        for ( int x = 1 ; x < 15 ; x++){
            contador--;
            System.out.println("Introduce un número, quedan " + contador + " por introducir: ");
            a = i.nextInt();
            sumatorio += a;

        }

        System.out.println("La suma de todos los números introducidos es: " + sumatorio);

    }
}
