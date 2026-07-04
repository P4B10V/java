/*
Pedir tres números y mostrarlos ordenados de mayor a menor.
 */

import java.util.Scanner;

public class ejercicioNueve {
    public static void main(String[] args){
        int a,b;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        a = input.nextInt();

        System.out.println("Introduce el segundo número: ");
        b = input.nextInt();

        if (a > b){
            System.out.println(a + " , " + b);
        } else {
            System.out.println(b + " , " + a);  
        }
    }
}
