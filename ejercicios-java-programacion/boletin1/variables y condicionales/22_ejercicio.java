/*
Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.
 */

import java.util.Scanner;

public class ejercicioVeintidos {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);

        int n = i.nextInt();
        int n1 = n / 10;
        int n2 = n % 10;

        if ( n >= 0 && n <= 9){
            switch(n2) {
                case 1:
                    System.out.println("Uno. ");
                    break;
                case 2:
                    System.out.println("Dos. ");
                    break;
                case 3:
                    System.out.println("Tres. ");
                    break;
                case 4:
                    System.out.println("Cuatro. ");
                    break;
                case 5:
                    System.out.println("Cinco. ");
                    break;
                case 6:
                    System.out.println("Seis. ");
                    break;
                case 7:
                    System.out.println("Siete. ");
                    break;
                case 8:
                    System.out.println("Ocho. ");
                    break;
                case 9:
                    System.out.println("Nueve. ");
                    break;
                default:
                    break;
            }
        } else{
                switch (n1) {
                    case 1:
                        System.out.println("Diez ");
                        break;
                    case 2:
                        System.out.println("Veinte ");
                        break;
                    case 3:
                        System.out.println("Treinta ");
                        break;
                    case 4:
                        System.out.println("Cuarenta ");
                        break;
                    case 5:
                        System.out.println("Cincuenta ");
                        break;
                    case 6:
                        System.out.println("Sesenta ");
                        break;
                    case 7:
                        System.out.println("Setenta ");
                        break;
                    case 8:
                        System.out.println("Ochenta ");
                        break;
                    case 9:
                        System.out.println("Noventa ");
                        break;
                    default:
                        break;
                    }

                    System.out.print(" y ");

                    switch(n2) {
                        case 1:
                            System.out.print("uno. ");
                            break;
                        case 2:
                            System.out.print("dos. ");
                            break;
                        case 3:
                            System.out.print("tres. ");
                            break;
                        case 4:
                            System.out.print("cuatro. ");
                            break;
                        case 5:
                            System.out.print("cinco. ");
                            break;
                        case 6:
                            System.out.print("seis. ");
                            break;
                        case 7:
                            System.out.print("siete. ");
                            break;
                        case 8:
                            System.out.print("ocho. ");
                            break;
                        case 9:
                            System.out.print("nueve. ");
                            break;
                        default:
                            break;


                }



        }

    }
}
