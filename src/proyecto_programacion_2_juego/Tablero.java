/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_programacion_2_juego;

/**
 *
 * @author MiguelAngel
 */
public class Tablero {

    String[][] tablero = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

    public boolean comprobacionMatriz(int coordenada1, int coordenada2) {
        boolean valor = false;
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[i].length; j++) {
                if (this.tablero[coordenada1][coordenada2] == " ") {
                    valor = true;
                } else {
                    valor = false;
                }
            }
        }
        return valor;
    }
    public void printMatriz() {
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[i].length; j++) {
                System.out.print("|" + this.tablero[i][j] + "|");
            }
            System.out.println("\n...........");
        }
    }
//    public boolean movimiento(){
//        boolean valor = false;
//        if (this.tablero[0][0]=="X"){
//            
//        }
//        
//        return valor;
//    }
    public boolean victoria() {

        boolean estado = false;
        if ((this.tablero[0][0] == "X") && (this.tablero[0][1] == "X") && (this.tablero[0][2] == "X")) {
            System.out.println("GANADOR JUGADOR 1");
            estado = true;
        }
        if ((this.tablero[1][0] == "X") && (this.tablero[1][1] == "X") && (this.tablero[1][2] == "X")) {
            System.out.println("GANADOR JUGADOR 1");
            estado = true;
        }
        if ((this.tablero[2][0] == "X") && (this.tablero[2][1] == "X") && (this.tablero[2][2] == "X")) {
            System.out.println("GANADOR JUGADOR 1");
            estado = true;
        }
        if ((this.tablero[0][0] == "O") && (this.tablero[0][1] == "O") && (this.tablero[0][2] == "O")) {
            System.out.println("GANADOR JUGADOR 2");
            estado = true;
        }
        if ((this.tablero[1][0] == "O") && (this.tablero[1][1] == "O") && (this.tablero[1][2] == "O")) {
            System.out.println("GANADOR JUGADOR 2");
            estado = true;
        }
        if ((this.tablero[2][0] == "O") && (this.tablero[2][1] == "O") && (this.tablero[2][2] == "O")) {
            System.out.println("GANADOR JUGADOR 2");
            estado = true;
        }
        if ((this.tablero[0][0] == "X") && (this.tablero[1][0] == "X") && (this.tablero[2][0] == "X")) {
            System.out.println("GANADOR JUGADOR 1");
            estado = true;
        }
        if ((this.tablero[0][1] == "X") && (this.tablero[1][1] == "X") && (this.tablero[2][1] == "X")) {
            System.out.println("GANADOR JUGADOR 1");
            estado = true;
        }
        if ((this.tablero[0][2] == "X") && (this.tablero[1][2] == "X") && (this.tablero[2][2] == "X")) {
            System.out.println("GANADOR JUGADOR 1");
            estado = true;
        }
        if ((this.tablero[0][0] == "O") && (this.tablero[1][0] == "O") && (this.tablero[2][0] == "O")) {
            System.out.println("GANADOR JUGADOR 2");
            estado = true;
        }
        if ((this.tablero[0][1] == "O") && (this.tablero[1][1] == "O") && (this.tablero[2][1] == "O")) {
            System.out.println("GANADOR JUGADOR 2");
            estado = true;
        }
        if ((this.tablero[0][2] == "O") && (this.tablero[1][2] == "O") && (this.tablero[2][2] == "O")) {
            System.out.println("GANADOR JUGADOR 2");
            estado = true;
        }

        if ((this.tablero[0][0] == "X") && (this.tablero[1][1] == "X") && (this.tablero[2][2] == "X")) {
            System.out.println("GANADOR JUGADOR 1");
            estado = true;
        }
        if ((this.tablero[0][2] == "X") && (this.tablero[1][1] == "X") && (this.tablero[2][0] == "X")) {
            System.out.println("GANADOR JUGADOR 1");
            estado = true;
        }
        if ((this.tablero[0][0] == "O") && (this.tablero[1][1] == "O") && (this.tablero[2][2] == "O")) {
            System.out.println("GANADOR JUGADOR 2");
            estado = true;
        }
        if ((this.tablero[0][2] == "O") && (this.tablero[1][1] == "O") && (this.tablero[2][0] == "O")) {
            System.out.println("GANADOR JUGADOR 2");
            estado = true;
        }
        return estado;
    }
}
