import java.util.LinkedList;

// Clase para representar un pedido
class Order {
    String productType;
    String membershipLevel;

    public Order(String productType, String membershipLevel) {
        this.productType = productType;
        this.membershipLevel = membershipLevel;
    }
}

// Clase para representar un nodo en la cola de prioridad
class Node {
    Order order;
    int priority;

    public Node(Order order, int priority) {
        this.order = order;
        this.priority = priority;
    }
}

// Clase para la cola de prioridad
class PriorityQueue {
    LinkedList<Node> queue;

    public PriorityQueue() {
        queue = new LinkedList<>();
    }

    // Método para agregar un pedido a la cola con su respectiva prioridad
    public void push(Order order, int priority) {
        Node newNode = new Node(order, priority);
        if (queue.isEmpty()) {
            queue.add(newNode);
        } else {
            int i;
            for (i = 0; i < queue.size(); i++) {
                if (priority > queue.get(i).priority) {
                    break;
                }
            }
            queue.add(i, newNode);
        }
    }

    // Método para extraer el pedido de mayor prioridad de la cola
    public Node pop() {
        return queue.poll();
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Método para mostrar los pedidos en orden de prioridad
    public void showOrderPriority() {
        for (Node node : queue) {
            System.out.println("Product Type: " + node.order.productType + ", Membership Level: " + node.order.membershipLevel + ", Priority: " + node.priority);
        }
    }

    // Método para mostrar los pedidos en el orden en que fueron recibidos
    public void showOrderInput() {
        for (Node node : queue) {
            System.out.println("Product Type: " + node.order.productType + ", Membership Level: " + node.order.membershipLevel);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear una cola de prioridad
        PriorityQueue priorityQueue = new PriorityQueue();

        // Ejemplo de pedidos
        Order order1 = new Order("Fresh Produce", "Premium");
        Order order2 = new Order("Electronics", "Standard");
        Order order3 = new Order("Fashion", "Premium");

        // Agregar pedidos a la cola con su respectiva prioridad
        priorityQueue.push(order1, 3); // Alta prioridad
        priorityQueue.push(order2, 2); // Media prioridad
        priorityQueue.push(order3, 1); // Baja prioridad

        // Mostrar los pedidos en orden de prioridad
        System.out.println("Pedidos en orden de prioridad:");
        priorityQueue.showOrderPriority();

        // Procesar los pedidos
        System.out.println("\nProcesando pedidos...");
        while (!priorityQueue.isEmpty()) {
            Node processedOrder = priorityQueue.pop();
            System.out.println("Procesando pedido: Product Type - " + processedOrder.order.productType + ", Membership Level - " + processedOrder.order.membershipLevel);
        }
    }
}
