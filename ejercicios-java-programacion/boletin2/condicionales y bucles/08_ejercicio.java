/*
Pedir un número N, y mostrar todos los números del 1 al N.
 */

import java.util.Scanner;

public class ejercicioOcho {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int x = i.nextInt();
        int contador = 1;
        System.out.print(contador + " ");
        while (contador != x){
            contador++;
            System.out.print(contador + " ");
        }

        System.out.println(x);

        System.out.println("Saliendo...");
    }
}
