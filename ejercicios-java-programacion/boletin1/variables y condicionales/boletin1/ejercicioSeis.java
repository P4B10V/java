/*
Pedir dos números y decir si uno es múltiplo del otro.
 */

import java.util.Scanner;

public class ejercicioSeis {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        a = input.nextInt();

        System.out.println("Introduce el primer número: ");
        b = input.nextInt();

        if (a % b == 0){
            System.out.println(a + " es múltiplo de " + b);
        } else {
            System.out.println(a + " no es múltiplo de " + b);
        }
    }
}
