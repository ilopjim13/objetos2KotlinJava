package ejercicioJava.gestorTareas;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private Proyecto proyecto;

    public Usuario() {
        this.proyecto = null;
    }

    public boolean crearProyecto(String nombre) {
        if (proyecto == null) {
            proyecto = new Proyecto(nombre, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean agregarTarea(Tarea tarea) {
        if (proyecto != null) {
            if (!proyecto.getTareas().contains(tarea)) {
                proyecto.getTareas().add(tarea);
                return true;
            }
        }
        return false;
    }

    public boolean marcarTarea(Tarea tarea) {
        if (proyecto != null) {
            List<Tarea> tareas = proyecto.getTareas();
            for (Tarea t : tareas) {
                if (t.equals(tarea)) {
                    if (!t.isCompletada()) t.setCompletada(true);
                    return true;
                }
            }
        }
        return false;
    }
}

