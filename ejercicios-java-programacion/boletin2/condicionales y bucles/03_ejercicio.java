/*
Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 */


import java.util.Scanner;

public class ejercicioTres {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("Introduce un número");
        int x = i.nextInt();

        while ( x != 0){
            if ( x % 2 == 0){
                System.out.println(x + " es par.");
                System.out.println("Introduce otro número: ");

            } else {
                System.out.println(x + " es impar.");
                System.out.println("Introduce otro número: ");

            }

            x = i.nextInt();
        }

        System.out.println("Saliendo...");
    }
}
