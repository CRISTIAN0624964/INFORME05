public class Ejercicio1 {
    // Método para buscar un elemento en una lista enlazada
    public static <T> boolean buscarElemento(Node<T> head, T valor) {
        Node<T> actual = head;
        while (actual != null) {
            if (actual.valor.equals(valor)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.siguiente = new Node<>(2);
        head.siguiente.siguiente = new Node<>(3);

        System.out.println(buscarElemento(head, 2));  
        System.out.println(buscarElemento(head, 3));  
    }
}
