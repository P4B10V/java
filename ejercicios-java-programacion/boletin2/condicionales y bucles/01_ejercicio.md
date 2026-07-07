/*
Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
negativo.
 */

import java.util.Scanner;

public class ejercicioUno {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Introduce un número");
        int x = i.nextInt();

        while ( x > 0){
            System.out.println( (int) Math.pow(x,2));
            System.out.println("Introduce otro número");
            x = i.nextInt();
        }

        System.out.println("Saliendo...");
    }
}
