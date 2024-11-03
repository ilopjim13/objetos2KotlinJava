package ejercicioJava.gestorTareas;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        if (usuario.crearProyecto("pepe")) {
            System.out.println("Se ha creado un proyecto nuevo");
        } else {
            System.out.println("No se ha podido crear el proyecto");
        }

        Tarea tarea = new Tarea("tarea de pepe");

        if (usuario.agregarTarea(tarea)) {
            System.out.println("Se ha agregado la tarea al proyecto");
        } else {
            System.out.println("No se ha podido agregar la tarea al proyecto");
        }

        Tarea tarea2 = new Tarea("tarea 2 de pepe");

        if (usuario.agregarTarea(tarea2)) {
            System.out.println("Se ha agregado la tarea al proyecto");
        } else {
            System.out.println("No se ha podido agregar la tarea al proyecto");
        }

        if (usuario.marcarTarea(tarea2)) {
            System.out.println("Se ha marcado como completa la tarea al proyecto");
        } else {
            System.out.println("No se ha podido marcar como completa la tarea al proyecto");
        }
    }
}
