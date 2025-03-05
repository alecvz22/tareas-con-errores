/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroempleados;

/**
 *
 * @author yahel
 * esta clase representa un empleado a tiempo parcial y hereda de la clase de Empleado
 */
public class EmpleadoParcial extends Empleado{
    /**
    constructor d ela clase EmpleadoParcial
    @param nombre Nombre del empleado
    * @param ID Identificacion del empleado
    * @param  salario Salario del empleado a tiempo parcial
    */
    
    public EmpleadoParcial(String nombre, int ID, double salario) {
        //llama al constructor de la clase Empleado (clase padre)
        super(nombre, ID, salario);
    }
    
    /**
     * metodo para calcular el salario de un empleado a tiempo parcila
     * @return el salario del empleado a tiempo parcial
     */

    // Implementación del método abstracto para calcular el salario
    @Override
    public double calcularSalario() {
        //retorna el salario dle emepleado a tiempo parcial
        return getSalario();
    }
    
    /**
     * metodo para obtener el salario del empleado a tiempo parcial
     * 
     * @return el salario del empleado a tiempo parcial
     */

    @Override
    public double getSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
