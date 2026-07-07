/*
 Pedir un número y calcular su factorial.
 */

import java.util.Scanner;

public class ejercicioDoce {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);

        int contador = 0;
        int factorial = 1;

        System.out.println("""
                CÁLCULO FACTORIAL
                """);
        System.out.print("Introduce un número: ");
        int x = i.nextInt();

        while (x > contador){
            factorial *= x;
            x--;
        }
        System.out.println(factorial);
    }
}
