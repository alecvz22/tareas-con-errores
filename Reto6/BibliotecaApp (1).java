/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecaapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brand
 */
public class BibliotecaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Libro> biblioteca = new ArrayList<>();
        
        //primero que nada aqui creamos el primer menu en donde se le dan las siguientes opciones:
        while(true){
            System.out.println("\nMenu de Opciones:");
            System.out.println("1. Agregar un libro a la biblioteca");
            System.out.println("2. Calcular el precio de alquiler de un libro");
            System.out.println("3. Mostrar informacion de un libro en particular");
            System.out.println("4. Salir de la aplicacion");
            System.out.println("Ingresa una opcion: ");
            
            // se declara lo que escribe el querido usuario
            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            
             //Aqui empieza nuestro switch case en donde en el primer caso
             //es donde se agrega el libro a la libreria, en este caso cuenta con 2 tipo de libros
             //uno de Ficcion y otro de No Ficcion
            switch (opcion){
                case 1:
                    System.out.println("Selecciona el tipo de libro");
                    System.out.println("1. Libro de Ficcion");
                    System.out.println("2. Libro de No Ficcion");
                    int tipoLibro = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Ingrese el titulo del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.println("Ingrese el numero de paginas del libro: ");
                    int numPaginas = scanner.nextInt();
                    scanner.nextLine();
                    
                //Aqui es donde se completa el guardado a la bibliteca mediante el biblioteca.add(libroFiccion)
                //En este switch es donde se va redirigido dependiendo del tipo de Libro
                //Con un default en caso de una opcion no valida para que el usuario no se asuste con las
                //letras rojas  
                switch (tipoLibro) {
                    case 1 -> {
                        System.out.println("Tiene ilustraciones? (true/false): ");
                        boolean tieneIlustraciones = scanner.nextBoolean();
                        scanner.nextLine();
                        LibroFiccion libroFiccion = new LibroFiccion(titulo, autor, numPaginas, tieneIlustraciones);
                        biblioteca.add(libroFiccion);
                        System.out.println("Libro de Ficcion agregado exitosamentea la biblioteca!");
                    }
                    case 2 -> {
                        System.out.println("Ingrese el tema del libro de No Ficcion: ");
                        String tema = scanner.nextLine();
                        LibroNoFiccion libroNoFiccion = new LibroNoFiccion(titulo, autor, numPaginas, tema);
                        biblioteca.add(libroNoFiccion);
                        System.out.println("Libro de No Ficcion agregado exitosamente a la biblioteca!");
                    }
                    default -> System.out.println("Opcion no valida. Intente de nuevo, por favor.");
                }
                    break;

          //En este SEGUNDO case es donde se realiza el calculo del precio del libro mediante el indice en la biblio
          //se obtiene el libro correspondiente de la lista biblioteca y calculas el precio de alquiler 
          // llamando al método calcularPrecioAlquiler() del libro    
          
                case 2:
                    System.out.println("Ingrese el indice del libro para calcular el precio de alquiler: ");
                    int indiceAlquiler = scanner.nextInt();
                    scanner.nextLine();
                    
                    if(indiceAlquiler >=0 && indiceAlquiler < biblioteca.size()){
                        Libro libroSeleccionado = biblioteca.get(indiceAlquiler);
                        double precioAlquiler = libroSeleccionado.calcularPrecioAlquiler();
                        System.out.println("El precio de alquiler del libro es: $" + precioAlquiler);
                    }else{
                        System.out.println("Indice no valido. Intente de nuevo, por favor.");
                    }
                    break;
                    
           // en el TERCER case se encientra la opcion de mostrar informacion acerca del libro
           //se obtiene de la biblioteca llamando al metodo mostrarInfo()         
                case 3:
                    System.out.println("Ingrese el indice del libro para mostrar su informacion: ");
                    int indiceInformacion = scanner.nextInt();
                    scanner.nextLine();
                    
                    if(indiceInformacion >=0 && indiceInformacion < biblioteca.size()){
                        Libro libroSeleccionado = biblioteca.get(indiceInformacion);
                        System.out.println("\nInformacion del libro:");
                        libroSeleccionado.mostrarInformacion();
                    }else{
                        System.out.println("Indice no valido. Intente de nuevo, por favor.");
                    }
                    break;
            // Y como case final no pudo faltar nuestra opcion de salir de la aplicacion
             //Esta en caso de que el usuario desee terminar lo realizado
                case 4:
                    System.out.println("Saliendo de la aplicacion");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida. Ingresa una opcion que aparezca en el menu.");
                    
            }

        }
    }
 }   
