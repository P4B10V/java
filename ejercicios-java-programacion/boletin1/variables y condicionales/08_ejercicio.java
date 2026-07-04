/*
Pedir dos números y decir cual es el mayor o si son iguales.
 */

import java.util.Scanner;

public class ejercicioSiete {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        a = input.nextInt();

        System.out.println("Introduce el primer número: ");
        b = input.nextInt();

        if (a < b){
            System.out.println(a + " es mayor que " + b);
        } else if (a > b) {
            System.out.println(a + " es menor que " + b);
        } else {
            System.out.println(a + " y " + b + " son iguales.");
        }
    }
}
