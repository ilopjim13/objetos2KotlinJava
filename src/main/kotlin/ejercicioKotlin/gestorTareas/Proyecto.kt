package org.example.ejercicioKotlin.gestorTareas

data class Proyecto(val nombre:String, val tareas:MutableList<Tarea>) {
}