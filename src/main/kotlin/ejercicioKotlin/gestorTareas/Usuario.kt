package org.example.ejercicioKotlin.gestorTareas

class Usuario(val nombre:String, val tareas:MutableList<Tarea>) {

    fun crearProyecto() {
        
    }


    fun agregarTarea(tarea: Tarea):Boolean {
        if (tarea !in tareas) {
            tareas.add(tarea)
            return true
        }
        return false
    }


    fun marcarTarea(tarea:Tarea) {
        if (tarea in tareas) {
            tareas.map { if (tarea == it) it.completada = true }
        }
    }
}