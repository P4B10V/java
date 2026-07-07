/*
Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
 */

import java.util.Scanner;

public class ejercicioCatorce {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int contadorSueldos = 0;
        int sumatorio = 0;

        for ( int sueldos = 0 ; sueldos < 10 ; sueldos ++){
            System.out.println("Introduce un sueldo: " );
            int x = i.nextInt();
            if ( x > 1000){
                contadorSueldos += 1;
            }
            sumatorio += x;
        }

        System.out.println("La suma de todos los sueldos es: " + sumatorio);
        System.out.println("En total hay " + contadorSueldos + " sueldo/s mayor/es de 1000€");

    }
}

