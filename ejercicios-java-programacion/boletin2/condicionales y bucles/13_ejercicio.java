/*
Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
la cantidad de ceros.
 */

import java.util.Scanner;

public class ejercicioTrece {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        int sumaPositivos = 0;
        int sumaNegativos = 0;

        for ( int x = 0 ; x < 10 ; x++){
            System.out.println("Introduce un número: ");
            int y = i.nextInt();

            if ( y > 0) {
                sumaPositivos += y;
                positivos+=1;
            } else if ( y < 0 ){
                sumaNegativos += y;
                negativos+=1;
            } else {
                ceros+=1;
            }

        }

        System.out.println("MEDIA NÚMEROS POSITIVOS: " + ( sumaPositivos/positivos ));
        System.out.println("MEDIA NÚMEROS POSITIVOS: " + ( sumaNegativos/negativos) );
        System.out.println("CANTIDAD DE CEROS: " + ceros);

    }
}
