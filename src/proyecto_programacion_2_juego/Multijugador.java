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
public class Multijugador {
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ficha1="X";
        String ficha2="X";
        String ficha3="X";
        int jugador1 = 0;
        int jugador2 = 0;
        int jugador1coordenada1 = -1;
        int jugador1coordenada2 = -1;
        int jugador2coordenada1 = -1;
        int jugador2coordenada2 = -1;
        boolean entraJugador1 = true;
        boolean entraJugador2 = true;
        boolean escape = true;
        
        Tablero p = new Tablero();
        while (escape) {
            boolean res = false;
            boolean res2 = false;
            do {

                entraJugador1 = true;

                while (entraJugador1) {
                    System.out.println("Elija la ficha Jugador 1");
                    jugador1 = scan.nextInt();
                    int limite = jugador1;

                    if ((limite > 0) && (limite <= 3)) {
                        entraJugador1 = false;
                    } else {
                        entraJugador1 = true;
                    }
                    
                    System.out.println("Coloque la ficha Jugador 1");
                    jugador1 = scan.nextInt();
                    int limite2 = jugador1;

                    if ((limite2 > 0) && (limite2 <= 3)) {
                        entraJugador1 = false;
                    } else {
                        entraJugador1 = true;
                    }
                }
                
                if (jugador1 == 1) {
                    jugador1coordenada1 = 0;
                    jugador1coordenada2 = 0;
                } else if (jugador1 == 2) {
                    jugador1coordenada1 = 0;
                    jugador1coordenada2 = 1;
                } else if (jugador1 == 3) {
                    jugador1coordenada1 = 0;
                    jugador1coordenada2 = 2;
                } else if (jugador1 == 4) {
                    jugador1coordenada1 = 1;
                    jugador1coordenada2 = 0;
                } else if (jugador1 == 5) {
                    jugador1coordenada1 = 1;
                    jugador1coordenada2 = 1;
                } else if (jugador1 == 6) {
                    jugador1coordenada1 = 1;
                    jugador1coordenada2 = 2;
                } else if (jugador1 == 7) {
                    jugador1coordenada1 = 2;
                    jugador1coordenada2 = 0;
                } else if (jugador1 == 8) {
                    jugador1coordenada1 = 2;
                    jugador1coordenada2 = 1;
                } else if (jugador1 == 9) {
                    jugador1coordenada1 = 2;
                    jugador1coordenada2 = 2;
                }
                if (p.comprobacionMatriz(jugador1coordenada1, jugador1coordenada2) == true) {
                    p.tablero[jugador1coordenada1][jugador1coordenada2] = "X";
                    res = false;
                } else {
                    System.out.println("Posición ocupada, vuelve a introducir los datos");
                    res = true;
                }
                if (p.victoria() != true) {
                    p.printMatriz();
                } else {
                    escape = false;
                    p.printMatriz();
                }

            } while (res == true);

            if (p.victoria() != true) {

                do {

                    entraJugador2 = true;

                    while (entraJugador2) {
                        System.out.println("Coloca Jugador 2");
                        jugador2 = scan.nextInt();
                        int limite = jugador2;

                        if ((limite > 0) && (limite <= 9)) {
                            entraJugador2 = false;
                        } else {
                            entraJugador2 = true;
                        }
                    }

                    if (jugador2 == 1) {
                        jugador2coordenada1 = 0;
                        jugador2coordenada2 = 0;
                    } else if (jugador2 == 2) {
                        jugador2coordenada1 = 0;
                        jugador2coordenada2 = 1;
                    } else if (jugador2 == 3) {
                        jugador2coordenada1 = 0;
                        jugador2coordenada2 = 2;
                    } else if (jugador2 == 4) {
                        jugador2coordenada1 = 1;
                        jugador2coordenada2 = 0;
                    } else if (jugador2 == 5) {
                        jugador2coordenada1 = 1;
                        jugador2coordenada2 = 1;
                    } else if (jugador2 == 6) {
                        jugador2coordenada1 = 1;
                        jugador2coordenada2 = 2;
                    } else if (jugador2 == 7) {
                        jugador2coordenada1 = 2;
                        jugador2coordenada2 = 0;
                    } else if (jugador2 == 8) {
                        jugador2coordenada1 = 2;
                        jugador2coordenada2 = 1;
                    } else if (jugador2 == 9) {
                        jugador2coordenada1 = 2;
                        jugador2coordenada2 = 2;
                    }
                    if (p.comprobacionMatriz(jugador2coordenada1, jugador2coordenada2) == true) {
                        p.tablero[jugador2coordenada1][jugador2coordenada2] = "O";
                        res2 = false;
                    } else {
                        System.out.println("Posición ocupada, vuelve a introducir los datos");
                        res2 = true;
                    }
                    if (p.victoria() != true) {
                        p.printMatriz();
                    } else {
                        escape = false;
                        p.printMatriz();
                    }
                } while (res2 == true);
            }
        }
    }
}
