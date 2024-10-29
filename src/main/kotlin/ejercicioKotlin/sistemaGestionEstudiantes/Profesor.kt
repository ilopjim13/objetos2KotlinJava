package org.example.ejercicioKotlin.sistemaGestionEstudiantes

class Profesor(val nombre:String) {

    fun asignarCurso(estudiante: Estudiante, curso: Curso):Boolean {
        if (curso !in estudiante.cursos) {
            estudiante.cursos.add(curso)
            return true
        }
        return false

    }

    fun calificarEstudiante(estudiante: Estudiante):Int {
        var notaMedia = 0
        estudiante.cursos.forEach { notaMedia += it.notaALumno }
        return notaMedia / estudiante.cursos.size
    }

}