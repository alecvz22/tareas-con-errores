/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaapp;

/**
 *
 * @author brand
 */
public class Libro {

//En esta clase se encuentran todos los constructores, getters y setters   
//en donde se llenan los campos de el titulo, num pag, autor y se rellena la vareable    
private String titulo;
    private String autor;
    private int numPaginas;
    
    public Libro(){
        this.titulo = "";
        this.autor = "";
        this.numPaginas = 0;
    }
    
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = 0;
    }
    
    public Libro (String titulo, String autor, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de Paginas: " + numPaginas);
    }

    double calcularPrecioAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
}    

