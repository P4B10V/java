/*
Pedir números hasta que se introduzca uno negativo, y calcular la media
 */


import java.util.Scanner;

public class ejercicioSiete {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Introduce un número, para salir introduce número negativo: ");
        int x = i.nextInt();
        int sumatorio = 0;
        int contador = 0;

        while ( x > 0){
            sumatorio += x;
            contador++;
            System.out.println("Introduce otro número, para salir introduce 0: ");
            x = i.nextInt();
        }



        System.out.println("La media de todos los números es " + sumatorio/contador);
        System.out.println("Saliendo...");
    }
}
