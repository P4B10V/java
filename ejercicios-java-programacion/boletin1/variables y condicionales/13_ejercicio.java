/*
Pedir un número entre 0 y 9.999, decir si es capicúa.
 */

import java.util.Scanner;

public class ejercicioTrece {
    public static void main(String[] args){
        int numero;
        int a1, a2, a3, a4;
        int b1, b2, b3, b4;


        System.out.println("Introduce un número entre 0 y 9.999: ");
        Scanner input = new Scanner(System.in);
        numero = input.nextInt();

        if (numero > 0 && numero < 10){
            System.out.println("El número es capicúa.");
        } else if (numero >= 10 && numero < 100){
            a1 = numero % 10;
            b1 = numero / 10;

            if (a1 == b1){
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número introducido no es capicúa.");
            }

        } else if (numero >= 100 && numero < 1000){
            a1 = numero % 10;
            b1 = numero / 100;
            if (a1 == b1 ){
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número introducido no es capicúa.");
            }

        } else if ( numero>= 1000 && numero<10000){
            a1 = numero % 10;
            b1 = numero / 1000;

            a2 = (numero / 10) % 10;
            b3 = (numero / 100) % 10;
            if (a1 == b1 && a2 == b3){
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número introducido no es capicúa.");
            }

        } else {
            System.out.println("El número introducido no es capicúa.");
        }

    }

}
