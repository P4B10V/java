/*
 Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
 */

import java.util.Scanner;

public class ejercicioDieciseis {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Tabla de multiplicar");
        System.out.println("Introduce numero");
        int y = i.nextInt();
        if ( y < 0 || y > 10){
            System.out.println("El número debe estar entre 0 y 10");
            System.out.println("Introduce numero");
            y = i.nextInt();
        }

        for ( int x = 1 ; x < 11 ; x++){
            System.out.println(y + " * " + x + " = " + (y * x));
        }


    }
}
