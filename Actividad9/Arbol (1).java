/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbol;

/**
 *
 * @author yaheli
 */
public class Arbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario<Integer> arbol = new ArbolBinario<>();

        // Crear el árbol
        arbol.create(50);
        arbol.addInsert(30);
        arbol.addInsert(70);
        arbol.addInsert(20);
        arbol.addInsert(40);
        arbol.addInsert(60);
        arbol.addInsert(80);

        // Imprimir el árbol en preorden, inorden y postorden
        System.out.println("Recorrido preorden:");
        arbol.preorden();
        System.out.println("\nRecorrido inorden:");
        arbol.inorden();
        System.out.println("\nRecorrido postorden:");
        arbol.postorden();

        // Buscar un elemento en el árbol
        int elementoBuscado = 40;
        if (arbol.find(elementoBuscado)) {
            System.out.println("\nEl elemento " + elementoBuscado + " esta en el arbol.");
        } else {
            System.out.println("\nEl elemento " + elementoBuscado + " no esta en el arbol.");
        }

        // Obtener la altura del árbol
        System.out.println("Altura del arbol: " + arbol.altura());

        // Realizar una rotación a la izquierda
        arbol.rotacionIzquierda();
        System.out.println("Arbol despues de rotacion a la izquierda (preorden):");
        arbol.preorden();

        // Realizar una rotación a la derecha
        arbol.rotacionDerecha();
        System.out.println("\nArbol despues de rotacion a la derecha (preorden):");
        arbol.preorden();

        // Obtener el grado del árbol
        System.out.println("\nGrado del arbol: " + arbol.grado());

        // Verificar si el árbol está completo
        System.out.println("El arbol esta completo?: " + arbol.estaCompleto());

        // Verificar si el árbol está equilibrado
        System.out.println("El arbol esta equilibrado?: " + arbol.estaEquilibrado());

        // Imprimir el árbol por niveles
        System.out.println("Recorrido por niveles:");
        arbol.nivelPorNivel();
        
        
        arbol.nivelPorNivel();
    }
    
}
