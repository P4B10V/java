/*
Pedir el radio de un círculo y calcular su área. A=PI*r^2.
 */

import java.util.Scanner;

class ejercicioDos {
     public static void main(String[] args){
         System.out.println("""
                 CÁLCULO ÁREA DE UN CIRCULO
                 
                 """);

         Scanner input = new Scanner(System.in);

         double r, A;
         System.out.println("Introduce el radio: ");
         r = input.nextDouble();

         A = Math.PI * r * r;

         System.out.println("El área del círculo es: " + A);

     }
}
