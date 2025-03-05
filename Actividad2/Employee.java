/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg2.listas;

/**
 *
 * @author carlo
 */

public class Employee {
    //ATRIBUTOS DE LA CLASE EMPLEADO: NOMBRE, ID, POSICIÓN Y SALARIO 
     private String name;
    private int employeeId;
    private String position;
    private double salary;
    
    //CONSTRUCRO DE LA CLASE EMPLEADO 
    public Employee(String name, int employeeId, String position, double salary) {
        //INICIALIZA LOS ATRIBUTOS DE LA CLASE, CON LOS VALORES PROPORCIONADOS 
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;
    }
       //SOBRESCRIBE EL MÉTODO TO STRING PARA IMPRIMIR INFORMACIÓN LEGIBLE DEL EMPLEADO EN LA CONSOLA 
@Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", employeeId=" + employeeId +
               ", position='" + position + '\'' +
               ", salary=" + salary +
               '}';
    }
    
}
