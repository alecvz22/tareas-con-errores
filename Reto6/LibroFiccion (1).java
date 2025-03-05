/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaapp;

/**
 *
 * @author brand
 */

// en esta clase se declara que se vuelve herencia de Libro
public class LibroFiccion extends Libro {
   
private boolean tieneIlustraciones;
    
// en este constuctor se nos declaran las vareables como titulo,, autor, paginas,etc
    public LibroFiccion(String titulo, String autor, int numPaginas, boolean tieneIlustraciones){
        super(titulo, autor, numPaginas);
        this.tieneIlustraciones = tieneIlustraciones;
    }
    
    // en este public void es donde se mostrar informacion sale, lo cual conlleva a preguntar las ilustraciones del libro
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tiene Ilustraciones: " + tieneIlustraciones);
    }
    
    public double calcularPrecioAlquiler(){
        //logica para calcular el precio de alquiler de un libro
        return getNumPaginas() * 0.1;
    }
    
}