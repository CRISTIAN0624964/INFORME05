public class Ejercicio3 {
    // Método para insertar un nodo al final de la lista
    public static <T> Node<T> insertarAlFinal(Node<T> head, T valor) {
        Node<T> nuevoNodo = new Node<>(valor);
        if (head == null) {
            return nuevoNodo;
        }
        Node<T> actual = head;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevoNodo;
        return head;
    }

    // Método para imprimir la lista
    public static <T> void imprimirLista(Node<T> head) {
        Node<T> actual = head;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.siguiente = new Node<>(2);

        System.out.println("Lista original:");
        imprimirLista(head);  // 1 2

        head = insertarAlFinal(head, 3);
        System.out.println("Lista después de insertar 3 al final:");
        imprimirLista(head);  // 1 2 3
    }
}
