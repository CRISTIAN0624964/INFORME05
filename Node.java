public class Node<T> {
    T valor;
    Node<T> siguiente;

    // Constructor
    public Node(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

