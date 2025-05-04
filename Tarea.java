public class Tarea {
    private String titulo;
    private int prioridad;

    // Constructor
    public Tarea(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    // Método toString
    @Override
    public String toString() {
        return "Tarea: " + titulo + " | Prioridad: " + prioridad;
    }
}
