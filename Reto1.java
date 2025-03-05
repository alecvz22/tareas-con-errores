/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;

import java.util.Scanner;
class clase{
    
}

/**
 *
 * @author alessiacavazos
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     * 
     */
    
    
    public static void main(String[] args) {
        // operaciones basicas
        
        // 1.-inicio
        // declarar variables
       int op;
       int a;
       int b;
       float resp;
       int suma; 
       int serie;
       double factorial = 1;
       double aa;
       double bb;
       
    
       
        
        // menu
       
        
        Scanner sc = new Scanner(System.in); 
    
        
        System.out.println("Menu");
        
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Porcentaje");
        System.out.println("6. Logaritmo");
        System.out.println("7. Factorial");
        System.out.println("8. Fibonacci");
        op = sc.nextInt();
        
        op = sc.nextInt();
        
          
             
    System.out.println("Ingresa el primer numero"); 
    a = sc.nextInt(); 
        
    System.out.println("Ingrea el segundo numero"); 
    b = sc.nextInt(); 
    
    
         switch(op){
                case 1:
                   resp = a + b;
                    
                    System.out.println("El resultado de la suma: " + (a + b) + 
                            "es igual a" + resp);
                    break;
                    
                    case 2:
                        resp = a - b;
                  
                   System.out.println("El resultado de la resta: " + (a - b)+ 
                           "es igual a" + resp);
                    break;
                    
                    case 3:
                        resp = a * b;
                    
                    
                    System.out.println("El resultado de la multiplicacion:"
                            + (a * b) +  "es igual a "+ resp);
                    break;
                    
                    case 4:
                        resp = a / b;
                    
                    System.out.println("El resultado de la division: " 
                            +(a / b) + "es igual a" + resp);
                    
                    break;
                    
                    case 5:
                        resp = (a % b);
                    
                    System.out.println("El porcentaje de:" + (a % b) + 
                            "equivale a " + resp);
                       
                    break;
                    
                     case 6:
                         aa = Math.log(a);
                         bb = Math.log(b);
                    
                    
                    System.out.println("El log de" + a + "es" + aa); 
                    System.out.println("El log de" + b + "es" + bb);
                    
                         
                    break;
                    
                    case 7:
                        
                        if(a > 1)
		{
			while (a!=0) 
			{
				 factorial=factorial*a; 
				 a--;
                        
                     System.out.println("El factorial es" +  a);
                    break;
    
                
            
        
   
        
                  
                 
            
                    //fin
                }
            }
        }                
      
    }
         
}