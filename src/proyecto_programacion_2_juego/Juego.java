/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_programacion_2_juego;

import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Juego {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean salir = false;
        System.out.println("Introduzca que quiere hacer");
        System.out.println("1: Jugar ");
        System.out.println("2: Salir");
        int opcion = scan.nextInt();
        while (salir == false) {
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca que quiere hacer");
                    System.out.println("1: Multijugador ");
                    System.out.println("2: Jugar contra IA");
                    System.out.println("3: Salir");
                    int opcion2 = scan.nextInt();
                    switch (opcion2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            salir = true;
                            break;
                        default:
                            System.out.println("Solo 1 o 2 ");
                    }
                case 2:
                    salir = true;
                    System.out.println("Vuelva cuando quiera jugar");
                    break;
                default:

                    System.out.println("Solo 1 o 2 ");
            }

        }

    }
}
