/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroempleados;

/**
 *
 * @author yahel
 * clase que representa a un empleado a tiempo completo, hereda de la clase Empleado
 */
public class EmpleadoCompleto extends Empleado{
    private double beneficios; // beneficios adicionales para el empleado a tiempo completo

    /**
     * constructor de la clase EmpleadoCompleto
     *
     * @param nombre     nombre del empleado a tiempo completo
     * @param ID         identificacion del empleado a tiempo completo
     * @param salario    salario base del empleado a tiempo completo
     * @param beneficios beneficios adicionales del empleado a tiempo completo
     */
    public EmpleadoCompleto (String nombre, int ID, double salario, double beneficios) {
        //llama al constructor de la clase Empleado (clase padre)
        super(nombre, ID, salario);
        this.beneficios = beneficios;
    }
    
     /**
     * metodo para obtener los beneficios adicionales del empleado a tiempo completo
     *
     * @return los beneficios adicionales del empleado a tiempo completo
     */

    // Getters y setters para los atributos adicionales
    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }

    // Implementación del método abstracto para calcular el salario
     @Override
    public double calcularSalario() {
        return getSalario() + beneficios;
    }

     @Override
    public double getSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
