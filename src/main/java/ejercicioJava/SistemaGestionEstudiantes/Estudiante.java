package ejercicioJava.SistemaGestionEstudiantes;

import java.util.List;

public class Estudiante {
    private String nombre;
    public List<Curso> cursos;

    public Estudiante(String nombre, List<Curso> cursos) {
        this.nombre = nombre;
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}

