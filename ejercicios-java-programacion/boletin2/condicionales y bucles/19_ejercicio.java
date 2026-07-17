/*
Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */

import java.util.Scanner;

public class ejercicioDiecineve {
    public static void main(String[] args){

        Scanner i = new Scanner(System.in);
        int aprobados = 0, suspensos = 0, condicionados = 0;
        int x;
        double nota;


        for (x = 0 ; x < 6 ; x++){

            nota = i.nextDouble();

            if ( nota == 4) {
                condicionados ++;
            } else if ( nota >= 5){
                aprobados ++;
            } else {
                suspensos ++;
            }
        }

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Condicionados: " + condicionados);


    }
}
