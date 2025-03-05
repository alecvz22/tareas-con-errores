/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroempleados;

/**
 *
 * @author yahel
 * clase abstracta que sirve como plantilla base para representar a un empleado
 */
public abstract class Empleado {
    private String nombre; //nombre del empleado
    private int ID; // identificacion del empleado
    private double salario; //salario del empleado
    
    /**
     * constructor de la clase Empleado
     * @param nombre nombre del empleado
     * @param ID identificacion del empleado
     * @param salario salario del empleado
     */

    public Empleado(String nombre, int ID, double salario) {
        this.nombre = nombre;
        this.ID = ID;
        this.salario = salario;
    }
    
    /**
     * metodo para obtener el nombre del empleado
     * @return el nombre del empleado
     */
    
     public String getNombre() {
        return nombre;
    }
     
     /**
      * metodo para establecer el nombre del empleado
      * @param nombre nombre a establecer del empleado
      */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * metodo para obtener la identificacion del empleado
     * @return la identificacion del empleado
     */

    public int getID() {
        return ID;
    
    }
    
    /**
     * metodo para establecer la identificacion del empleado
     *
     * @param ID identificacion a establecer para el empleado
     */
      public void setID(int ID) {
        this.ID = ID;
    }
      
      /**
     * metodo para obtener el salario del empleado
     *
     * @return el salario del empleado
     */

    public double getSalario() {
        return salario;
    }
    
    /**
     * metodo para establecer el salario del empleado
     *
     * @param salario aalario a establecer para el empleado
     */

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    /**
     * metodo abstracto para calcular el salario del empleado
     *
     * @return el calculo del salario del empleado (debe ser implementado por las subclases)
     */

    // metodo abstracto para calcular el salario
    public abstract double calcularSalario();
}
