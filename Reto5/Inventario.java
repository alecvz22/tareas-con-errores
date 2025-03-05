/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yahel
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int capacidad;
        ArrayList<Producto> inventario = new ArrayList<>();
        
        System.out.println("Ingrese la capacidad de productos a agregar:");
        capacidad = scanner.nextInt();
        
        while (true){
            System.out.println("\nMenu:");
            System.out.println("1. Agregar un nuevo producto");
            System.out.println("2. Vender un producto existente");
            System.out.println("3. Reabastecer un producto existente");
            System.out.println("4. Mostrar informacion de todos los productos");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion");
            
            int opcion = scanner.nextInt();
            
            switch (opcion){
                case 1:
                    if (inventario.size() < capacidad){
                        agregarProducto(inventario, scanner);
                    } else {
                        System.out.println("El inventario esta lleno, no es posible agregar mas productos.");
                    }
                    break;
                case 2:
                    venderProducto(inventario, scanner);
                    break;
                case 3:
                    reabastecerProducto(inventario, scanner);
                    break;
                case 4:
                    mostrarInventario(inventario);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida. Por favor ingresa una de las que se muestran en el menu");
            }
            
        }
    }
    
    private static void agregarProducto(ArrayList<Producto> inventario, Scanner scanner){
        System.out.println("Ingrese el Id del producto:");
        int id = scanner.nextInt();
        scanner.nextLine(); //limpiar el buffer del teclado
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio del producto: $");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese la cantidad en stock del producto: ");
        int stock = scanner.nextInt();
        
        Producto nuevoProducto = new Producto (id, nombre, precio, stock);
        inventario.add(nuevoProducto);
        System.out.println("Prodcuto agregado al inventario");
    }
    
    private static void venderProducto(ArrayList<Producto> inventario, Scanner scanner){
        System.out.println("Ingrese el Id del producto a vender: ");
        int id = scanner.nextInt();
        System.out.println("Ingrese la cantidad a vender: ");
        int cantidad = scanner.nextInt();
        
        for(Producto producto : inventario){
            if(producto.getId() == id){
                producto.vender(cantidad);
                return;
            }
        }
        
        System.out.println("Producto no encontrado en el inventario");
    }
    
    private static void reabastecerProducto(ArrayList<Producto> inventario, Scanner scanner){
        System.out.println("Ingrese el id del producto a reabastecer: ");
        int id = scanner. nextInt();
        System.out.println("Ingrese la cantidad a reabastecer: ");
        int cantidad = scanner.nextInt();
        
        for(Producto producto : inventario){
            if(producto.getId()== id){
                producto.reabastecer(cantidad);
                return;
            }
        }
        
        System.out.println("Producto no encontrado en el inventario");
    }
    
    private static void mostrarInventario(ArrayList<Producto> inventario){
        if(inventario.isEmpty()){
            System.out.println("El inventario esta vacio");
        } else {
            System.out.println("Inventario:");
            System.out.println("Inventario:");
            for(Producto producto : inventario){
                producto.mostrarInformacion();
                System.out.println("-----------");
            }
        }
    }
}
    

