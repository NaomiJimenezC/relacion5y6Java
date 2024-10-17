package org.example.relacion5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ejercicio1 {
    public static void mostrarArrayBidimensional(){
      int[][] matrizBidimensional = new int[3][6];
      matrizBidimensional[0][0] = 0;
      matrizBidimensional[0][1] = 30;
      matrizBidimensional[0][2] = 2;
      matrizBidimensional[0][5] = 30;
      matrizBidimensional[1][0] = 75;
      matrizBidimensional[1][4] = 0;
      matrizBidimensional[2][2] = -2;
      matrizBidimensional[2][3] = 9;
      matrizBidimensional[2][5] = -2;

        for (int i = 0; i < matrizBidimensional.length; i++) {
            for (int j = 0; j < matrizBidimensional[i].length; j++) {
                System.out.print(matrizBidimensional[i][j] + "  ");  // Tabulación entre elementos
            }
            System.out.println();  // Salto de línea al final de cada fila
        }
    }
    public static void main(String[] args) {
        mostrarArrayBidimensional();
    }
}
