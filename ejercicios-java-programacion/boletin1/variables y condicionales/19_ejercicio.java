/*
Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30
días.
 */

import java.util.Scanner;

public class ejercicioDiecinueve {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int diff;
        int d1,m1,y1,d1_total;
        int d2,m2,y2,d2_total;

        System.out.println("Introduce día de la primera fecha: ");
        d1 = input.nextInt();
        System.out.println("Introduce mes de la primera fecha: ");
        m1 = input.nextInt();
        System.out.println("Introduce año de la primera fecha: ");
        y1 = input.nextInt();

        System.out.println("Introduce día de la segunda fecha: ");
        d2 = input.nextInt();
        System.out.println("Introduce mes de la segunda fecha: ");
        m2 = input.nextInt();
        System.out.println("Introduce año de la segunda fecha: ");
        y2 = input.nextInt();

        d1_total = d1 + ( m1 * 30 ) + ( y1 * 365);
        d2_total = d2 + ( m2 * 30 ) + ( y2 * 365);

        diff = Math.abs(d1_total - d2_total);
        System.out.println("Hay una diferencia de " + diff + " días.");
    }
}
