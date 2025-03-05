/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbol;

/**
 *
 * @author yaheli
 */
class ArbolBinario<T extends Comparable<T>> {
    Nodo<T> raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void create(T valor) {
        raiz = new Nodo<>(valor);
    }

    public void addInsert(T elemento) {
        raiz = insertar(raiz, elemento);
    }

    private Nodo<T> insertar(Nodo<T> nodo, T elemento) {
        if (nodo == null) {
            return new Nodo<>(elemento);
        }

        if (elemento.compareTo(nodo.valor) < 0) {
            nodo.izquierdo = insertar(nodo.izquierdo, elemento);
        } else if (elemento.compareTo(nodo.valor) > 0) {
            nodo.derecho = insertar(nodo.derecho, elemento);
        }

        return nodo;
    }

    public void removeDelete(T elemento) {
        raiz = eliminar(raiz, elemento);
    }

    private Nodo<T> eliminar(Nodo<T> nodo, T elemento) {
        if (nodo == null) {
            return null;
        }

        if (elemento.compareTo(nodo.valor) < 0) {
            nodo.izquierdo = eliminar(nodo.izquierdo, elemento);
        } else if (elemento.compareTo(nodo.valor) > 0) {
            nodo.derecho = eliminar(nodo.derecho, elemento);
        } else {
            if (nodo.izquierdo == null) {
                return nodo.derecho;
            } else if (nodo.derecho == null) {
                return nodo.izquierdo;
            }

            nodo.valor = minimoValor(nodo.derecho);
            nodo.derecho = eliminar(nodo.derecho, nodo.valor);
        }

        return nodo;
    }

    private T minimoValor(Nodo<T> nodo) {
        T min = nodo.valor;
        while (nodo.izquierdo != null) {
            min = nodo.izquierdo.valor;
            nodo = nodo.izquierdo;
        }
        return min;
    }

    public void preorden() {
        preordenRec(raiz);
    }

    private void preordenRec(Nodo<T> nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preordenRec(nodo.izquierdo);
            preordenRec(nodo.derecho);
        }
    }

    public void inorden() {
        inordenRec(raiz);
    }

    private void inordenRec(Nodo<T> nodo) {
        if (nodo != null) {
            inordenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inordenRec(nodo.derecho);
        }
    }

    public void postorden() {
        postordenRec(raiz);
    }

    private void postordenRec(Nodo<T> nodo) {
        if (nodo != null) {
            postordenRec(nodo.izquierdo);
            postordenRec(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }

    public boolean find(T elemento) {
        return buscar(raiz, elemento);
    }

    private boolean buscar(Nodo<T> nodo, T elemento) {
        if (nodo == null) {
            return false;
        }

        if (nodo.valor.equals(elemento)) {
            return true;
        }

        return buscar(nodo.izquierdo, elemento) || buscar(nodo.derecho, elemento);
    }

    public int altura() {
        return calcularAltura(raiz);
    }

    private int calcularAltura(Nodo<T> nodo) {
        if (nodo == null) {
            return -1;
        }

        int alturaIzquierdo = calcularAltura(nodo.izquierdo);
        int alturaDerecho = calcularAltura(nodo.derecho);

        return Math.max(alturaIzquierdo, alturaDerecho) + 1;
    }

    public void rotacionIzquierda() {
        Nodo<T> nuevaRaiz = raiz.derecho;
        raiz.derecho = nuevaRaiz.izquierdo;
        nuevaRaiz.izquierdo = raiz;
        raiz = nuevaRaiz;
    }

    public void rotacionDerecha() {
        Nodo<T> nuevaRaiz = raiz.izquierdo;
        raiz.izquierdo = nuevaRaiz.derecho;
        nuevaRaiz.derecho = raiz;
        raiz = nuevaRaiz;
    }

    public int grado() {
        return calcularGrado(raiz);
    }

    private int calcularGrado(Nodo<T> nodo) {
        if (nodo == null) {
            return 0;
        }

        int gradoIzquierdo = calcularGrado(nodo.izquierdo);
        int gradoDerecho = calcularGrado(nodo.derecho);

        if (nodo.izquierdo != null && nodo.derecho != null) {
            return Math.max(gradoIzquierdo, gradoDerecho) + 1;
        }

        return Math.max(gradoIzquierdo, gradoDerecho);
    }

    public boolean estaCompleto() {
        int altura = altura();
        return estaCompletoRec(raiz, altura, 0);
    }

    private boolean estaCompletoRec(Nodo<T> nodo, int altura, int nivel) {
        if (nodo == null) {
            return true;
        }

        if (nodo.izquierdo == null && nodo.derecho == null) {
            return (altura == nivel + 1);
        }

        if (nodo.izquierdo == null || nodo.derecho == null) {
            return false;
        }

        return estaCompletoRec(nodo.izquierdo, altura, nivel + 1) &&
               estaCompletoRec(nodo.derecho, altura, nivel + 1);
    }

    public boolean estaEquilibrado() {
        return calcularEquilibrio(raiz) != -1;
    }

    private int calcularEquilibrio(Nodo<T> nodo) {
        if (nodo == null) {
            return 0;
        }

        int izq = calcularEquilibrio(nodo.izquierdo);
        int der = calcularEquilibrio(nodo.derecho);

        if (izq == -1 || der == -1 || Math.abs(izq - der) > 1) {
            return -1;
        }

        return Math.max(izq, der) + 1;
    }

       public void nivelPorNivel() {
        if (raiz == null) {
            return;
        }

        Cola<Nodo<T>> cola = new Cola<>();
        cola.agregar(raiz);

        while (!cola.estaVacia()) {
            int nodosEnNivel = cola.lista.size();

            while (nodosEnNivel > 0) {
                Nodo<T> nodoActual = cola.eliminar();
                System.out.print(nodoActual.valor + " ");

                if (nodoActual.izquierdo != null) {
                    cola.agregar(nodoActual.izquierdo);
                }

                if (nodoActual.derecho != null) {
                    cola.agregar(nodoActual.derecho);
                }

                nodosEnNivel--;
            }

            System.out.println();
        }
    }
}
