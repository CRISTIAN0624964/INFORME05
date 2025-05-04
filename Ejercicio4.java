public class Ejercicio4 {
    // Método para contar los nodos de una lista enlazada
    public static <T> int contarNodos(Node<T> head) {
        int count = 0;
        Node<T> actual = head;
        while (actual != null) {
            count++;
            actual = actual.siguiente;
        }
        return count;
    }

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.siguiente = new Node<>(2);
        head.siguiente.siguiente = new Node<>(3);

        System.out.println("Número total de nodos: " + contarNodos(head));  // 3
    }
}
