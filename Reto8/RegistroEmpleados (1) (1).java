/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registroempleados;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yahel
 */
public class RegistroEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creacion de una lista para almacenar los empleados
        List<Empleado> listaEmpleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //bucle principal para el menu y las operaciones
        while (true) {
            //muestra el menu de opciones al usuario
            System.out.println("Menu:");
            System.out.println("1. Adicionar un Empleado Tiempo Completo");
            System.out.println("2. Adicionar un Empleado Tiempo Parcial");
            System.out.println("3. Eliminar un Empleado");
            System.out.println("4. Mostrar informacion de empleados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            //lee la opcion ingresada por el usuario
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    try {
                        scanner.nextLine(); // Limpiar el buffer del teclado
                        System.out.print("Nombre del Empleado Tiempo Completo: ");
                        String nombre = scanner.nextLine();
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Salario: ");
                        double salario = scanner.nextDouble();
                        System.out.print("Beneficios: ");
                        double beneficios = scanner.nextDouble();

                        //crea un nuevo emleado a tiempo completo y lo agrega a la lista
                        EmpleadoCompleto empleadoTiempoCompleto = new EmpleadoCompleto(nombre, id, salario, beneficios);
                        listaEmpleados.add(empleadoTiempoCompleto);
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Entrada de datos incorrecta.");
                        scanner.nextLine(); // Limpiar el buffer del teclado
                    }
                  }

                case 2 -> {
                    try {
                        scanner.nextLine(); // Limpiar el buffer del teclado
                        System.out.print("Nombre del Empleado Tiempo Parcial: ");
                        String nombre = scanner.nextLine();
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Salario: ");
                        double salario = scanner.nextDouble();

                        //crea un nuevo empleado a tiempo parcial y lo agrega a la lista
                        EmpleadoParcial empleadoParcial = new EmpleadoParcial(nombre, id, salario);
                        listaEmpleados.add(empleadoParcial);
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Entrada de datos incorrecta.");
                        scanner.nextLine(); // Limpiar el buffer del teclado
                    }
                  }

                case 3 -> {
                    System.out.print("ID del empleado a eliminar: ");
                    int idAEliminar = scanner.nextInt();

                    //busca al empleado por ID y lo elimina de la lista
                    for (Empleado empleado : listaEmpleados) {
                        if (empleado.getID() == idAEliminar) {
                            listaEmpleados.remove(empleado);
                            System.out.println("Empleado eliminado con exito.");
                            break;
                        }
                    }
                  }

                case 4 -> {
                    System.out.println("Informacion de Empleados Registrados:");
                    //muestra la informacion de todos los empleados en la lista
                    for (Empleado empleado : listaEmpleados) {
                        System.out.println("Nombre: " + empleado.getNombre());
                        System.out.println("ID: " + empleado.getID());
                        System.out.println("Salario: " + empleado.getSalario());
                        //verifica si es empleado a tiempo completo para mostrar los beneficios 
                        if (empleado instanceof EmpleadoCompleto empleadoTC) {
                            System.out.println("Beneficios: " + empleadoTC.getBeneficios());
                        }
                        System.out.println("Salario Total: " + empleado.calcularSalario());
                        System.out.println();
                    }
                  }

                case 5 -> {
                    //sale del programa
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                  }

                default -> System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }
    }
    
}
