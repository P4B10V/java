/*
Pedir tres números y mostrarlos ordenados de mayor a menor.
 */

import java.util.Scanner;

public class ejercicioNueve {
    public static void main(String[] args){
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        a = input.nextInt();

        System.out.println("Introduce el segundo número: ");
        b = input.nextInt();

        System.out.println("Introduce el tercer número: ");
        c = input.nextInt();

        if ( a > b && a > c){
            if (b > c){
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if ( b > a && b > c){
            if (a > c){
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (a > b){
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
/*
Pedir tres números y mostrarlos ordenados de mayor a menor.
 */

import java.util.Scanner;

public class ejercicioDiez {
    public static void main(String[] args){
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        a = input.nextInt();

        System.out.println("Introduce el segundo número: ");
        b = input.nextInt();

        System.out.println("Introduce el tercer número: ");
        c = input.nextInt();

        if ( a > b && a > c){
            if (b > c){
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if ( b > a && b > c){
            if (a > c){
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (a > b){
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
