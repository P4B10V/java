/*
 Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
 */

import java.util.Scanner;

public class ejercicioVeinte {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int n,x;
        int sueldo = 0;
        int max = 0;

        System.out.println("Introduce un número: ");

        n = i.nextInt();

        for ( x = 0 ; x < n ; x++){
            System.out.println("Introduce un sueldo: ");
            sueldo = i.nextInt();

            if ( sueldo > max){
                max = sueldo;
            }

        }

        System.out.println("El sueldo máximo es: " + max);
    }
}
