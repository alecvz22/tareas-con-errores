/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author yahel
 */
public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
        this.id = 0;
        this.nombre = "";
        this.precio = 0.0;
        this.stock = 0;
    }

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void vender(int cantidad){
        if (cantidad <= stock){
            stock -= cantidad;
            System.out.println("Venta realiza correctamente");
        } else {
            System.out.println("No hay suficiente stock para realizar la venta");
        }
    }
    
    public void reabastecer(int cantidad){
        stock += cantidad;
        System.out.println("Reabastecimiento realizado correctamente");
    }
    
    public void mostrarInformacion(){
        System.out.println("Id: " + id);
        System.out.println("Nombre:" + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }
    
        }
    
    
    
    

