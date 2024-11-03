package ejercicioJava.SistemaGestionEstudiantes;

public class Curso {
    public String nomCurso;
    public int notaAlumno;

    public Curso(String nomCurso, int notaAlumno) {
        this.nomCurso = nomCurso;
        this.notaAlumno = notaAlumno;
    }

    public String getNomCurso() { return nomCurso; }

    public int getNotaAlumno() {
        return notaAlumno;
    }

}

