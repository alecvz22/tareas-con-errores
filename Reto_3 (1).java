/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto_3;

import java.util.Scanner;

/**
 *
 * @author yahel
 */
public class Reto_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //aquí empieza para la conversión de decimal a binario
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el decimal para convertir a binario");
        
        //se declaran la variables para el decimal a convertir
        int decimal= sc.nextInt();
        int residuo;
        int i = 0;
        
        //se crea el arreglo con un tamaño suficiente para almacenar los residuos
        int [] residuos = new int[100];
        
        /**
         * se crea un ciclo en donde hasta que el decimal sea igual a 0
         */
        while(decimal > 0){
            /**
             * el residuo es igual al decimal entre el modulo de 2 (que es la base del binario)
             * luego guardamos nuestro residuo en nuestro arreglo de residuos
             * después nuestro decimal lo dividimos entre el mismo entre la base del binario para tener nuestra siguiente division
             * luego incrementamos nuestro contador en el arreglo
             */
            residuo = decimal % 2;
            residuos[i] = residuo;
            decimal = decimal/2;
            i++;
        }
        
        for(int j = i -1; j >= 0; j--){
            //residuos[j] esta imprimiendo todos los residuos del decimal
            System.out.print(" " + residuos[j]);
            
            
        }
        System.out.println(" ");
        
        //aquí empieza la conversión de decimal a octal
        System.out.println("Dime el decimal para convertir a octal");
        
        int ii = 0;
        int decimalOctal = sc.nextInt();
        int [] residuoOctal = new int [100];
        residuo = 0;
        
        while(decimalOctal > 0){
            /**
             * el residuo es igual al decimal entre el modulo de 8 (que es la base del octal)
             * luego guardamos nuestro residuo en nuestro arreglo de residuos
             * después nuestro decimal lo dividimos entre el mismo entre la base del octal para tener nuestra siguiente division
             * luego incrementamos nuestro contador en el arreglo
             */
            residuo = decimalOctal % 8;
            residuoOctal[ii] = residuo;
            decimalOctal = decimalOctal/8;
            ii++;
        }
        
        for(int j = ii -1; j >= 0; j--){
            //residuos[j] esta imprimiendo todos los residuos del decimal
            System.out.print(" " + residuoOctal[j]);
            
        }
    }
    
}
