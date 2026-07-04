/*
Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...
 */

import java.util.Scanner;

public class ejercicioVeintiuno {
    public static void main(String[] args){
        int nota;
        Scanner i = new Scanner(System.in);

        System.out.println("Introduce un número entero entre 0 y 10.");
        nota = i.nextInt();

        switch (nota){
            case 0:
                System.out.println("Cero.");
                break;   
            case 1:
                System.out.println("Uno.");
                break;
            case 2:
                System.out.println("Dos.");
                break;
            case 3:
                System.out.println("Tres.");
                break;
            case 4:
                System.out.println("Cuatro.");
                break;
            case 5:
                System.out.println("Cinco.");
                break;
            case 6:
                System.out.println("Seis.");
                break;
            case 7:
                System.out.println("Siete.");
                break;
            case 8:
                System.out.println("Ocho.");
                break;
            case 9:
                System.out.println("Nueve.");
                break;
            case 10:
                System.out.println("Diez.");
                break;
            default:
                System.out.println("Numero incorrecto.");
                break;
        }
    }
}
