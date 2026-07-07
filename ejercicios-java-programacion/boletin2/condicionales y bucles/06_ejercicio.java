/*
Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
 */

import java.util.Scanner;

public class ejercicioSeis {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Introduce un número, para salir introduce 0: ");
        int x = i.nextInt();
        int sumatorio = 0;

        while ( x != 0){
            sumatorio += x;
            System.out.println("Introduce otro número, para salir introduce 0: ");
            x = i.nextInt();
        }



        System.out.println("La suma de todos los números es " + sumatorio);
        System.out.println("Saliendo...");
    }
}
