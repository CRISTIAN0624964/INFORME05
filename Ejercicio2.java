public class Ejercicio2 {
    // Método para invertir una lista enlazada
    public static <T> Node<T> invertirLista(Node<T> head) {
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;

        while (current != null) {
            next = current.siguiente; //G
            current.siguiente = prev; //I
            prev = current; //MOVEMOS AL ACTUAL
            current = next; //MOVEMOS CURRENTE AL SIGUIENTE NODO
        }
        return prev;
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
        head.siguiente.siguiente = new Node<>(3);

        System.out.println("Lista original:");
        imprimirLista(head);  // 1 2 3

        Node<Integer> listaInvertida = invertirLista(head);
        System.out.println("Lista invertida:");
        imprimirLista(listaInvertida);  // 3 2 1
    }
}
