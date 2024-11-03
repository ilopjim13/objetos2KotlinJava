package ejercicioJava.SistemaGestionEstudiantes;

import java.util.List;

public class Profesor {
    public String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public boolean asignarCurso(Estudiante estudiante, Curso curso) {
        List<Curso> cursos = estudiante.getCursos();
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            return true;
        }
        return false;
    }

    public int calificarEstudiante(Estudiante estudiante) {
        int notaMedia = 0;
        List<Curso> cursos = estudiante.getCursos();
        for (Curso curso : cursos) {
            notaMedia += curso.getNotaAlumno();
        }
        return notaMedia / cursos.size();
    }
}

