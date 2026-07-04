/*
Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
 */

import java.util.Scanner;

public class ejercicioDoce {
    public static void main(String[] args){
        int a, b, c, d;

        int x;

        System.out.println("Introduce un número entre 0 y 9.999: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();


        if (a > 0 && a < 10){
            System.out.println(a);
        } else if (a >= 10 && a < 100){
            b = a % 10;
            x = a / 10;

            System.out.println(b + "" + x);
        } else if (a >= 100 && a < 1000){
            b = a % 10;
            x = a / 10;
            c = x % 10;
            x = a / 100;

            System.out.println(b + "" + c + "" + x );
        } else if ( a>= 1000 && a<10000){
            b = a % 10;
            x = a / 10;
            c = x % 10;
            x = a / 100;
            d = x % 10;
            x = a / 1000;

            System.out.println(b + "" + c + "" + "" + d + "" + x );
        } else {
            System.out.println("Número incorrecto");
        }
    }
}
