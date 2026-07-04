/*
Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
Sin años bisiestos.
 */

import java.util.Scanner;

public class ejercicioDieciseis {
    public static void main(String[] args) {

        int day, month, year;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce día: ");
        day = input.nextInt();

        System.out.println("Introduce mes: ");
        month = input.nextInt();

        System.out.println("Introduce año: ");
        year = input.nextInt();

        if (year != 0){
            switch (month){
                case 1,3,5,7,8,10,12:
                    if (day <= 31 && day >= 1){
                        System.out.println("La fecha introducida es correcta: " + day + "\\" + month + "\\" + year);
                    } else {
                        System.out.println("Fecha incorrecta.");
                    }
                    break;
                case 2:
                    if (day <= 28 && day >= 1){
                        System.out.println("La fecha introducida es correcta: " + day + "\\" + month + "\\" + year);
                    } else {
                        System.out.println("Fecha incorrecta.");
                    }
                    break;
                case 4,6,9,11:
                    if (day <= 30 && day >= 1){
                        System.out.println("La fecha introducida es correcta: " + day + "\\" + month + "\\" + year);
                    } else {
                        System.out.println("Fecha incorrecta.");
                    }
                    break;
                default:
                    System.out.println("Fecha incorrecta.");
                    break;
            }
        } else {
            System.out.println("Fecha incorrecta.");
        }


    }

}
