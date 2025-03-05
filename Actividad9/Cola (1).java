/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author yaheli
 */
class Cola<T> {
    ListaLigada<T> lista;

    public Cola() {
        lista = new ListaLigada<>();
    }

    public void agregar(T elemento) {
        lista.agregar(elemento);
    }

    public T eliminar() {
        return lista.eliminar();
    }

    public boolean estaVacia() {
        return lista.estaVacia();
    }
}

