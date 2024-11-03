package org.example.ejercicioKotlin.gestorTareas

fun main() {

    val usuario = Usuario()

    if (usuario.crearProyecto("pepe")) println("Se ha creado un proyecto nuevo")
    else println("No se ha podido crear el proyecto")

    val tarea = Tarea("tarea de pepe")

    if(usuario.agregarTarea(tarea)) println("Se ha agregado la tarea al proyecto")
    else println("No se ha podido agregar la tarea al prayecto")

    val tarea2 = Tarea("tarea 2 de pepe")

    if(usuario.agregarTarea(tarea2)) println("Se ha agregado la tarea al proyecto")
    else println("No se ha podido agregar la tarea al prayecto")


    if(usuario.marcarTarea(tarea2)) println("Se ha marcado como completa la tarea al proyecto")
    else println("No se ha podido marcar como completa la tarea al prayecto")

}