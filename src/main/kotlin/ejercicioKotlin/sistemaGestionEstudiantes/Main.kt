package org.example.ejercicioKotlin.sistemaGestionEstudiantes

fun main() {

    val curso1 = Curso("Matemáticas", 8)
    val curso2 = Curso("Historia", 9)
    val curso3 = Curso("Biología", 7)
    val curso4 = Curso("Química", 8)
    val curso5 = Curso("Física", 9)
    val curso6 = Curso("Literatura", 8)

    val profesor = Profesor("Manolin")

    val pepe = Estudiante("Pepe", mutableListOf())

    if(profesor.asignarCurso(pepe, curso1)) println("Se le ha asignado correctamente la asignatura ${curso1.nomCurso}")
    if(profesor.asignarCurso(pepe, curso2)) println("Se le ha asignado correctamente la asignatura ${curso2.nomCurso}")
    if(profesor.asignarCurso(pepe, curso3)) println("Se le ha asignado correctamente la asignatura ${curso3.nomCurso}")
    if(profesor.asignarCurso(pepe, curso4)) println("Se le ha asignado correctamente la asignatura ${curso4.nomCurso}")
    if(profesor.asignarCurso(pepe, curso5)) println("Se le ha asignado correctamente la asignatura ${curso5.nomCurso}")
    if(profesor.asignarCurso(pepe, curso6)) println("Se le ha asignado correctamente la asignatura ${curso6.nomCurso}")

    val notaMedia = profesor.calificarEstudiante(pepe)

    println("La nota media de ${pepe.nombre} es de: $notaMedia")



}