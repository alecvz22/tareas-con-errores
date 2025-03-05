/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto_4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yahel
 */
public class Reto_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variables declaradas para las filas y columnas
        int filas, columnas;
        //datos de los integrantes del equipo
        System.out.println("Programa creado por:");
        System.out.println("Brandon Garza Santos");
        System.out.println("Yaheli Mayed Garza Romero");
        System.out.println("Alessia Elan Cavazos Rodriguez");
        
        //inicio del programa donde al usuario se le pide que elija lo que desea hacer
        System.out.println("\nBienvenido, que accion deseas realizar?");
      
        //opciones que puede realizar el usuario
        System.out.println("1--Deseo realizar una Suma de Matrices");
        System.out.println("2--Deseo reealizar una Multiplicacion de un entero por la matriz");
        System.out.println("3--Deseo realizar una Impresion de Matriz");
        
try{
   
    
        int opcion = scanner.nextInt(); // lee la opcion seleccionada por el usuario
        
        //evalua la opcion seleeccionada usando un swithc
        switch (opcion) {
            
            //suma de matrices
            case 1 -> {
                
                //solicita al usuario ingresar le numero de filas para las matrices
                System.out.print("Ingrese el numero de filas de las matrices: ");
                
                //lee y almacena el numero de filas
                filas = scanner.nextInt();
                
                //socilita al usuario ingresa el numeor de columnas para las matrices
                System.out.print("Ingrese el numero de columnas de las matrices: ");

                //lee y almacena el numero de columnas
                columnas = scanner.nextInt();
                
                
                //crea dos matrices con las dimensiones que el usuario eligio
                int[][] matriz1 = new int[filas][columnas];
                int[][] matriz2 = new int[filas][columnas];
                
                //solicita al usuario ingresar lo elementos de la primera matriz
                System.out.println("Ingrese los elementos de la primera matriz:");
                //lee la primera matriz con los valores ingresado
                Matriz(matriz1, scanner);
                //solicita al usuario ingresar lo elementos de la segunda matriz
                System.out.println("Ingrese los elementos de la segunda matriz:");
                //lee la segunda matriz con los valores ingresado
                Matriz(matriz2, scanner);

                //calcula la suma de las dos matrices
                int[][] resultado1 = sumaMatrices(matriz1, matriz2);
                System.out.println("Resultado de la suma de matrices:");
                //imprime el resultado
                imprimirMatriz(resultado1);
                }
            case 2 -> {
                //multiplicacion de matriz por un entero

                //solicita al usuario que ingrese le numero de filas para la matriz
                System.out.print("Ingrese el numero de filas de la matriz: ");
                //lee y almacena el numero de filas
                filas = scanner.nextInt();
                
                //socilita al usuario ingresa el numeor de columnas para la matriz
                System.out.print("Ingrese el numero de columnas de la matriz: ");
                //lee y almacena el numero de columnas
                columnas = scanner.nextInt();
                
                //crea la matriz con las dimensiones que el usuario eligio
                int[][] matriz = new int[filas][columnas];
                
                //solicita al usaurio ingresas los elementos de la matriz
                System.out.println("Ingrese los elementos de la matriz:");
                //llena la matriz con los valores ingresado
                Matriz(matriz, scanner);
                //solicuta al usuario ingresar le numero entero para la multiplicacion
                System.out.print("Ingrese un entero para la multiplicacion: ");
                
                //lee valor del entero a multiplicar
                int multiplicador = scanner.nextInt();
                
                //realiza la multiplicacion de la matriz por el numeor entero
                int[][] resultado2 = multiplicar(matriz, multiplicador);
                
                System.out.println("Resultado de la multiplicacion por entero:");
                //imprimer el resultado de la matriz
                imprimirMatriz(resultado2);
                }
            case 3 -> {
                //creacion e impresion de una matriz
               
                //solicita al usaurio ingresar el numero de filas para la matriz
                System.out.print("Ingrese el numero de filas de la matriz: ");
                //lee y almacena el numero de filas
                filas = scanner.nextInt();
                
                //solicita al usuario ingresar el numero de columnas de la matriz
                System.out.print("Ingrese el numero de columnas de la matriz: ");
                //lee y almacena el numero de columnas
                columnas = scanner.nextInt();
                
                //crea una matriz con las dimensiones proporcionadad
                int[][] matrizCreada = new int[filas][columnas];
                
                //solicita al usuario ingresar los elementos de la matriz
                System.out.println("Ingrese los elementos de la matriz:");
                //llena la matriz con los valores ingresados
                Matriz(matrizCreada, scanner);
                System.out.println("Matriz ingresada:");
                //imprime la matriz ingresada
                imprimirMatriz(matrizCreada);
                }
            
           
        }
    }

/*
captira una excepci[on en caso de que el usuario ingrese un valor no valido
*/
       catch(InputMismatchException e)
       {
           System.out.println("Escribiste algo mal");
       }
        catch(ArithmeticException e)
        {
            System.out.println("El calculo fallo");
        } 
    }
        
/*
    esta funcion permite al usuario ingresar valores para llenar una matriz
    2matriz" para la matriz que se va a llenar con valores ingresados por el usuario
    "scanner" para un objeto Scanner utiilizado para recibir la entrada del usuario
    */
    public static void Matriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el elemento en la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    /*
    esta funcion suma dos matrices y devuelve el resultado
    "matriz1" para la primera matriz que se va a sumar
    "matriz2" para la segunda matriz que se va a sumar
    "return" para una nueva matriz que contiene la suma de las dos matrices de entrada
    */
    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    /*
    esta funcion multiplica cada elemento de una matriz por un valor multiplicador dado
    "matriz" para la matriz que se va multiplicar
    "multiplicador" para el valor por le cual multiplicar cada elemento de la matriz
    "return" para una nueva matriz que contiene le resultado de la multiplicacion
    */
    public static int[][] multiplicar(int[][] matriz, int multiplicador) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz[i][j] * multiplicador;
            }
        }

        return resultado;
    }

    /*
    esta funcion imprime una mtriz en la consola
    "matriz" para la matriz que se va a imprimir
    */
    public static void imprimirMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
       
  
    }
}
    

