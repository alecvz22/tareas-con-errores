/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author yaheli
 */
class ListaLigada<T> {
    NodoSimple<T> cabeza;
    int size;

    public ListaLigada() {
        this.cabeza = null;
        this.size = 0;
    }

    public void agregar(T elemento) {
        NodoSimple<T> nuevoNodo = new NodoSimple<>(elemento);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoSimple<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        size++;
    }

    public T eliminar() {
        if (cabeza == null) {
            return null;
        }
        T valor = cabeza.valor;
        cabeza = cabeza.siguiente;
        size--;
        return valor;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int size() {
        return size;
    }
}
