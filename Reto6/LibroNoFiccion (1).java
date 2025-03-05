/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaapp;

/**
 *
 * @author brand
 */

// En esta clse practicamente se repite lo de la clase LibroFiccion, dando los mismos resultados
//Ponganos 100 profe
public class LibroNoFiccion extends Libro {
  private String tema;
    
    public LibroNoFiccion(String titulo, String autor, int numPaginas, String tema){
        super(titulo, autor, numPaginas);
        this.tema = tema;
    }
    
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tema: " + tema);
    }
    
    public double calcularPrecioAlquiler(){
        return getNumPaginas() * 0.05;
    }
}