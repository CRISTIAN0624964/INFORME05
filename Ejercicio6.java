public class Ejercicio6 {
    // Método para concatenar dos listas enlazadas
    public static <T> Node<T> concatenarListas(Node<T> head1, Node<T> head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node<T> actual = head1;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = head2;
        return head1;
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
        Node<Integer> head1 = new Node<>(1);
        head1.siguiente = new Node<>(2);

        Node<Integer> head2 = new Node<>(3);
        head2.siguiente = new Node<>(4);

        System.out.println("Lista 1:");
        imprimirLista(head1);  // 1 2

        System.out.println("Lista 2:");
        imprimirLista(head2);  // 3 4

        Node<Integer> listaConcatenada = concatenarListas(head1, head2);
        System.out.println("Lista concatenada:");
        imprimirLista(listaConcatenada);  // 1 2 3 4
    }
}
