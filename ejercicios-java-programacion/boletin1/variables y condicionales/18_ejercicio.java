/*
Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene
siempre 28 días).
 */

import java.util.Scanner;

public class ejercicioDieciocho {
    public static void main(String[] args){

        int day, month, year;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce día: ");
        day = input.nextInt();

        System.out.println("Introduce mes: ");
        month = input.nextInt();

        System.out.println("Introduce año: ");
        year = input.nextInt();

        if (year > 0){
            switch (month){
                case 1,3,5,7,8,10,12:
                    if (day <= 31 && day >= 1){
                        System.out.println("La fecha introducida es correcta: " + day + "\\" + month + "\\" + year);
                        if (day < 31){
                            day++;
                        } else {
                            day = 1;
                            if (month == 12){
                                month = 1;
                                year++;
                            } else {
                                month++;
                            }

                        }
                        System.out.println("Mañana es: " + day + "\\" + month + "\\" + year);

                    }
                    break;
                case 2:
                    if (day <= 28 && day >= 1){
                        System.out.println("La fecha introducida es correcta: " + day + "\\" + month + "\\" + year);
                        if (day < 28){
                            day++;
                        } else {
                            day = 1;
                            month ++;
                        }
                        System.out.println("Mañana es: " + day + "\\" + month + "\\" + year);
                    }
                    break;
                case 4,6,9,11:
                    if (day <= 30 && day >= 1){
                        System.out.println("La fecha introducida es correcta: " + day + "\\" + month + "\\" + year);
                        if (day < 30){
                            day++;
                        } else {
                            day = 1;
                            month ++;
                        }
                        System.out.println("Mañana es: " + day + "\\" + month + "\\" + year);
                    }
                    break;
                default:
                    System.out.println("Fecha incorrecta");
                    break;
            }
        } else {
            System.out.println("Fecha incorrecta");
        }


    }
}
