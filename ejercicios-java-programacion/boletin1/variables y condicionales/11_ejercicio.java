/*
Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene
 */

import java.util.Scanner;

public class ejercicioOnce {
    public static void main(String[] args){
        int a;

        System.out.println("Introduce un número entre 0 y 9.999: ");
        Scanner input = new Scanner(System.in);

        a = input.nextInt();

        if (a >= 0 && a < 10){
            System.out.println("El número tiene una cifra.");
        } else if (a >= 10 && a < 100){
            System.out.println("El número tiene dos cifras.");
        } else if (a >= 100 && a < 1000){
            System.out.println("El número tiene tres cifras.");
        } else if (a >= 1000 && a < 10000){
            System.out.println("El número tiene cuatro cifras.");
        } else {
            System.out.println("Número incorrecto.");
        }

    }
}
