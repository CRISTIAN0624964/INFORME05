public class Maind {
    public static void main(String[] args) {
        // Crear el gestor de tareas para objetos Tarea
        GestorTarea<Tarea> gestor = new GestorTarea<>();

        // Crear algunas tareas
        Tarea tarea1 = new Tarea("Estudiar matemáticas", 3);
        Tarea tarea2 = new Tarea("Comprar víveres", 2);
        Tarea tarea3 = new Tarea("Hacer ejercicio", 1);

        // Agregar tareas
        gestor.agregarTarea(tarea1);
        gestor.agregarTarea(tarea2);
        gestor.agregarTarea(tarea3);

        // Imprimir tareas
        System.out.println("Tareas actuales:");
        gestor.imprimirTareas();

        // Eliminar una tarea
        gestor.eliminarTarea(tarea2);

        // Imprimir tareas después de eliminar
        System.out.println("\nTareas después de eliminar 'Comprar víveres':");
        gestor.imprimirTareas();

        // Verificar si existe una tarea
        System.out.println("\n¿Existe 'Hacer ejercicio'? " + gestor.contieneTarea(tarea3));

        // Invertir las tareas
        gestor.invertirTareas();
        System.out.println("\nTareas invertidas:");
        gestor.imprimirTareas();

        // Obtener tarea más prioritaria
        Tarea tareaMasPrioritaria = gestor.obtenerTareaMasPrioritaria();
        System.out.println("\nTarea más prioritaria: " + tareaMasPrioritaria);

        // Transferir tarea a completadas
        gestor.transferirTareaACompletadas(tarea1);

        // Mostrar tareas completadas
        System.out.println("\nTareas completadas:");
        gestor.imprimirTareasCompletadas();

        // Mostrar tareas actuales después de la transferencia
        System.out.println("\nTareas restantes:");
        gestor.imprimirTareas();
    }
}
