/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author yaheli
 */
class NodoSimple<T> {
    T valor;
    NodoSimple<T> siguiente;

    public NodoSimple(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}
