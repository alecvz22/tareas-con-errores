/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg2.listas;

// LOS TIPOS DE DATOS SE ALMACENAN CON EL VALOR AnyData
 
class Node<AnyData> {
    AnyData data;
    Node<AnyData> next;

   //CONSTRUCTOR DEL NODO 
    Node(AnyData data) {
        this.data = data;
    }
}
