/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ochoreinas;

import java.util.Scanner;

/**
 *
 * @author yaheli
 */
public class OchoReinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int reinas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas reinas quiere? ");
        reinas = sc.nextInt();
          
        // inicializa el tablero
        int tablero[][] = new int[reinas][reinas];

        // Inicializamos el tablero
        for (int i = 0; i < reinas; i++)
            for (int j = 0; j < reinas; j++)
                tablero[i][j] = 0;

        if (!resolverReinasUtil(tablero, 0, reinas)) {
            System.out.println("No existe solución");
            return;
        }

        imprimirTablero(tablero, reinas);
    }
    
    /*
     Método para imprimir el tablero de ajedrez con las reinas colocadas.
     * @param tablero la matriz que representa el tablero de ajedrez
     * @param reinas la cantidad de reinas en el tablero
    */
    static void imprimirTablero(int tablero[][], int reinas) {
        for (int i = 0; i < reinas; i++) {
            for (int j = 0; j < reinas; j++)
                System.out.print(" " + tablero[i][j] + " ");
            System.out.println();
        }
    }
    
    /*
    Método que verifica si es seguro colocar una reina en una determinada posición del tablero.
     * @param tablero la matriz que representa el tablero de ajedrez
     * @param fila la fila en la que se desea colocar la reina
     * @param columna la columna en la que se desea colocar la reina
     * @param reinas la cantidad de reinas en el tablero
     * @return true si es seguro colocar la reina en esa posición, false en caso contrario
    */
    
    // 
    static boolean esSeguro(int tablero[][], int fila, int columna, int reinas) {
        int i, j;

        // Verificar esta fila en la izquierda
        for (i = 0; i < columna; i++)
            if (tablero[fila][i] == 1)
                return false;

        // Verificar la diagonal superior izquierda
        for (i = fila, j = columna; i >= 0 && j >= 0; i--, j--)
            if (tablero[i][j] == 1)
                return false;

        // Verificar la diagonal inferior izquierda
        for (i = fila, j = columna; j >= 0 && i < reinas; i++, j--)
            if (tablero[i][j] == 1)
                return false;

        return true;
    }
    
    // Método principal de resolución del problema de las Ocho Reinas utilizando backtracking
    static boolean resolverReinasUtil(int tablero[][], int columna, int reinas) {
        // Si todas las reinas están colocadas, entonces retorna true. Es la condicion de salida
        if (columna >= reinas)
            return true;

        // Intenta colocar esta reina en todas las filas una por una
        for (int i = 0; i < reinas; i++) {
            // Verifica si la reina se puede colocar en tablero[i][columna]
            if (esSeguro(tablero, i, columna, reinas)) {
                // Coloca la reina en tablero[i][columna]
                tablero[i][columna] = 1;

                // Recursivamente coloca las reinas restantes
                if (resolverReinasUtil(tablero, columna + 1, reinas))
                    return true;

                // Si colocar la reina en tablero[i][columna] no lleva a una solución, entonces remuévela
                tablero[i][columna] = 0;
            }
        }

        // Si la reina no puede ser colocada en ninguna fila de esta columna, entonces retorna false
        return false;
    }

}
