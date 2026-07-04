/*
Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de
30 días
 */

import java.util.Scanner;

public class ejercicioQuince {
    public static void main(String[] args) {

    int day, month, year;
    Scanner input = new Scanner(System.in);

    System.out.println("Introduce día: ");
    day =input.nextInt();
        while ( (day > 30) || (day < 1 ) ){
            System.out.println("Día incorrecto, introduce otro: ");
            day = input.nextInt();
        }

    System.out.println("Introduce mes: ");
    month =input.nextInt();
        while ( (month > 12) || (month < 1 ) ){
            System.out.println("Mes incorrecto, introduce otro: ");
            month = input.nextInt();
        }

    System.out.println("Introduce año: ");
    year =input.nextInt();
        while ( (year > 2100) || (year < 1800 ) ){ // Para evitar números raros
        System.out.println("Año incorrecto, introduce otro: ");
        year = input.nextInt();
        }

        System.out.println("La fecha introducida es correcta: " + day + "\\" + month + "\\" + year);
    }

}
