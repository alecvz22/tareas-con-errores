/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author yaheli
 */
public class Nodo<T> {
    T valor;
    Nodo<T> izquierdo;
    Nodo<T> derecho;

    public Nodo(T valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}

