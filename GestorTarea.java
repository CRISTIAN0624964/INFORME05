import java.util.ArrayList;
import java.util.List;

public class GestorTarea<T> {
    private Node<T> cabeza;
    private List<T> tareasCompletadas;

    // Constructor
    public GestorTarea() {
        cabeza = null;
        tareasCompletadas = new ArrayList<>();
    }

    // Agregar tarea al final de la lista enlazada
    public void agregarTarea(T tarea) {
        Node<T> nuevoNodo = new Node<>(tarea);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Node<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    // Eliminar tarea si existe
    public boolean eliminarTarea(T tarea) {
        if (cabeza == null) return false;

        // Caso especial: eliminar la cabeza
        if (cabeza.valor.equals(tarea)) {
            cabeza = cabeza.siguiente;
            return true;
        }

        Node<T> actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.valor.equals(tarea)) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Verificar si la tarea existe
    public boolean contieneTarea(T tarea) {
        Node<T> actual = cabeza;
        while (actual != null) {
            if (actual.valor.equals(tarea)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Imprimir todas las tareas
    public void imprimirTareas() {
        Node<T> actual = cabeza;
        while (actual != null) {
            System.out.println(actual.valor);
            actual = actual.siguiente;
        }
    }

    // Contar tareas
    public int contarTareas() {
        int count = 0;
        Node<T> actual = cabeza;
        while (actual != null) {
            count++;
            actual = actual.siguiente;
        }
        return count;
    }

    // Obtener la tarea más prioritaria (si es tipo Tarea)
    public T obtenerTareaMasPrioritaria() {
        if (cabeza == null) return null;
        Node<T> actual = cabeza;
        T tareaMasPrioritaria = actual.valor;

        while (actual != null) {
            if (actual.valor instanceof Tarea) {
                Tarea tarea = (Tarea) actual.valor;
                if (((Tarea) tareaMasPrioritaria).getPrioridad() < tarea.getPrioridad()) {
                    tareaMasPrioritaria = (T) tarea;
                }
            }
            actual = actual.siguiente;
        }
        return tareaMasPrioritaria;
    }

    // Invertir la lista enlazada
    public void invertirTareas() {
        Node<T> prev = null;
        Node<T> current = cabeza;
        Node<T> next = null;
        while (current != null) {
            next = current.siguiente;
            current.siguiente = prev;
            prev = current;
            current = next;
        }
        cabeza = prev;
    }

    // Transferir una tarea a tareas completadas
    public void transferirTareaACompletadas(T tarea) {
        if (contieneTarea(tarea)) {
            tareasCompletadas.add(tarea);
            eliminarTarea(tarea);
        }
    }

    // Imprimir tareas completadas
    public void imprimirTareasCompletadas() {
        for (T tarea : tareasCompletadas) {
            System.out.println(tarea);
        }
    }
}
