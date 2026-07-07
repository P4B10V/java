/*
Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
cuando el usuario acierta
 */

import java.util.Scanner;

public class ejercicioCinco {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Introduce el número a adivinar");
        int N = i.nextInt();

        System.out.println("Intenta adivinar el número: ");
        int a = i.nextInt();

        while (a != N){
            if (a > N){
                System.out.println("Te has pasado, prueba otra vez: ");
            } else {
                System.out.println("Te has quedado corto, prueba otra vez: ");
            }
            a = i.nextInt();
        }

        System.out.println("Has acertado!");
        System.out.println("Saliendo...");
    }
}
