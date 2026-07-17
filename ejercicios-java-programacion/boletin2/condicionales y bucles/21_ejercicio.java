/*
Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
 */

import java.util.Scanner;

public class ejercicioVeintiuno {
    public static void main(String[] args){

        Scanner i = new Scanner(System.in);

        int x,y;

        boolean negativo = false;


        for (x = 0 ; x < 10 ; x++){
            System.out.println("Introduce un número: ");

            y = i.nextInt();

            if ( y < 0){
                negativo = true;
            }

        }

        if (negativo){
            System.out.println("Se ha introducido un número negativo.");
        }


    }
}
