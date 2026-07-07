/*
Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */

import java.util.Scanner;

public class ejercicioCuatro {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Introduce un número");
        int contador = 0;
        int x = i.nextInt();

        while ( x >= 0){
            System.out.println("Número " + x + " introducido.");
            contador++;
            System.out.println("Introduce otro número");
            x = i.nextInt();
        }

        contador++; //el negativo también se introduce por lo que lo voy a contar
        System.out.println("Has introducido "+ contador + " numeros.");
        System.out.println("Saliendo...");
    }
}
