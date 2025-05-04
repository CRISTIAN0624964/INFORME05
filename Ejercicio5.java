public class Ejercicio5 {
    // Método para comparar dos listas enlazadas
    public static <T> boolean sonIguales(Node<T> head1, Node<T> head2) {
        Node<T> actual1 = head1;
        Node<T> actual2 = head2;

        while (actual1 != null && actual2 != null) {
            if (!actual1.valor.equals(actual2.valor)) {
                return false;
            }
            actual1 = actual1.siguiente;
            actual2 = actual2.siguiente;
        }
        return actual1 == null && actual2 == null;
    }

    public static void main(String[] args) {
        Node<Integer> head1 = new Node<>(1);
        head1.siguiente = new Node<>(2);
        head1.siguiente.siguiente = new Node<>(3);

        Node<Integer> head2 = new Node<>(1);
        head2.siguiente = new Node<>(2);
        head2.siguiente.siguiente = new Node<>(3);

        System.out.println("¿Son iguales las listas?: " + sonIguales(head1, head2));  // true

        Node<Integer> head3 = new Node<>(1);
        head3.siguiente = new Node<>(2);
        System.out.println("¿Son iguales las listas?: " + sonIguales(head1, head3));  // false
    }
}
