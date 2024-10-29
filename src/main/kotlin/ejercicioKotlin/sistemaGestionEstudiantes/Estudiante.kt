package org.example.ejercicioKotlin.sistemaGestionEstudiantes

data class Estudiante(val nombre:String, val cursos:MutableList<Curso>) {
}