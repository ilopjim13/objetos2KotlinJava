package ejercicioJava.gestorTareas;

import java.util.List;

public class Proyecto {
    private String nombre;
    public List<Tarea> tareas;

    public Proyecto(String nombre, List<Tarea> tareas) {
        this.nombre = nombre;
        this.tareas = tareas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
}

