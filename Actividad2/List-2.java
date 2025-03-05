/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg2.listas;

 //CLASE QUE REPRESENTA UNA LISTA ENLAZADA, AQUÍ ALMACENAMOS LAS FUNCIONES PARA MANIPULARLA
class List<AnyData> {

    private Node<AnyData> head;
    private int size = 0;

    // REGRESA "True" SI LA LISTA ESTÁ VACÍA, False SI TIENE ELEMENTOS.
    boolean isEmpty() {
        return this.head == null;
    }

    // INSERTA NODOS AL PRINCIPIO DE CADA LISTA
    void insertAtFirst(AnyData data) {
        Node<AnyData> nodeToInsert = new Node<>(data);
        nodeToInsert.next = head;
        head = nodeToInsert;
        size++;
    }

    // INSERTA NODOS AL FINAL DE CADA LISTA
    void insertAtEnd(AnyData data) {
        Node<AnyData> nodeToInsert = new Node<>(data);

        if (head == null) {
            head = nodeToInsert;
        } else {
            Node<AnyData> tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = nodeToInsert;
        }
        size++;
    }

    // INSERTA UN NUEVO NODO EN UNA POSICIÓN ESPECÍFICA DE LA LISTA
    void insertbyPosition(int position, AnyData data) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            insertAtFirst(data);   //SE INSERTA AL PRINCIPIO 
        } else if (position == size) {
            insertAtEnd(data);    //SE INSERTA AL FINAL 
        } else {
            Node<AnyData> nodeToInsert = new Node<>(data);
            Node<AnyData> tmp = head;

            for (int j = 0; j < position - 1; j++) {
                tmp = tmp.next;
            }

            nodeToInsert.next = tmp.next;
            tmp.next = nodeToInsert;
            size++;
        }
    }

    // FUNCIÓN QUE IMPRIME LOS ELEMENTOS DE LA LISTA
    void print() {
        Node<AnyData> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println("");
    }

    // FUNCIÓN BOOLEANA QUE VERIFICA SI UN DATO ESPECÍFICO EXISTE EN LA LISTA
    // REGRESA TRUE SI EL DATO EXISTE
    boolean isExist(AnyData data) {
        Node<AnyData> tmp = head;
        while (tmp != null) {
            if (tmp.data.equals(data)) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    // ELIMINA EL PRIMER NODO DE LA LISTA
    void removeFirstPosition() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    // ELIMINA EL ÚLTIMO NODO DE LA LISTA
    void removeLastPosition() {
        if (head == null || head.next == null) {
            head = null;
            size = 0;
            return;
        }

        Node<AnyData> tmp = head;
        while (tmp.next.next != null) {
            tmp = tmp.next;
        }
        tmp.next = null;
        size--;
    }

    // ELIMINA EL NODO EN UNA POSICIÓN ESPECÍFICA DE LA LISTA
    void removeByPosition(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            removeFirstPosition();
        } else {
            Node<AnyData> tmp = head;
            for (int i = 0; i < position - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            size--;
        }
    }

    // ELIMINA EL NODO QUE CONTIENE DATOS ESPECÍFICOS DE LA LISTA
    void removeByData(AnyData data) {
        Node<AnyData> tmp = head;

        if (tmp != null && tmp.data.equals(data)) {
            head = tmp.next;
            size--;
            return;
        }

        while (tmp != null && !tmp.data.equals(data)) {
            tmp = tmp.next;
        }

        if (tmp == null) {
            System.out.println("Data not found");
            return;
        }

        tmp.next = tmp.next.next;
        size--;
    }

    // RETORNA LA POSICIÓN DE LA PRIMERA OCURRENCIA DE UN DATO ESPECÍFICO EN LA LISTA
    // UTILIZA DE PARAMETRO DATA PARA BUSCAR EN LA LISTA
    // REGRESA LA POSICIÓN DEL DATO EN LA LISTA O -1 SI NO SE LLEGA A ENCONTRAR
    int getPositionByData(AnyData data) {
        Node<AnyData> tmp = head;
        int position = 0;
        while (tmp != null) {
            if (tmp.data.equals(data)) {
                return position;
            }
            tmp = tmp.next;
            position++;
        }
        return -1;
    }

    // RETORNA LOS DATOS DE UNA POSICIÓN ESPECÍFICA EN LA LISTA
    // COMO PARAMETRO UTILIZAMOS LA POSICIÓN, PARA ENCONTRAR LOS DATOS QUE SE QUIEREN OBTENER
    // REGRESA DATOS EN LA POSICIÓN ESPECÍFICA
    AnyData getDataByPosition(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return null;
        }

        Node<AnyData> tmp = head;
        for (int i = 0; i < position; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    // OBTIENE EL TAMAÑO ACTUAL DE LA LISTA
    public int getSize() {
        return size;
    }
}



