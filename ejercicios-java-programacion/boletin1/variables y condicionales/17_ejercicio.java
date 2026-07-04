/*
Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos
los meses tienen 30 días.
 */

import java.util.Scanner;

public class ejercicioDiecisiete {
    public static void main(String[] args){

        int day, month, year;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce día: ");
        day = input.nextInt();

        System.out.println("Introduce mes: ");
        month = input.nextInt();

        System.out.println("Introduce año: ");
        year = input.nextInt();

        if ( year > 0){
            if (day >= 1 && day < 30){
                System.out.println("La fecha introducida es correcta: " + day + "\\" + month + "\\" + year);
                System.out.println("Mañana es: " + (day + 1) + "\\" + month + "\\" + year);
            } else if (day == 30){
                System.out.println("La fecha introducida es correcta: " + day + "\\" + month + "\\" + year);
                day = 1;
                System.out.println("Mañana es: " + day + "\\" + ( month + 1 ) + "\\" + year);
            } else {
                System.out.println("Fecha incorrecta");
            }
        } else {
            System.out.println("Fecha incorrecta");
        }


    }
}
