package org.example.ejercicioKotlin.gestorTareas

class Usuario {

    var proyecto: Proyecto? = null

    fun crearProyecto(nombre:String):Boolean {
        if (proyecto == null) {
            proyecto = Proyecto(nombre, mutableListOf())
            return true
        }
        return false
        
    }


    fun agregarTarea(tarea: Tarea):Boolean {
        if (proyecto != null) {
            if (tarea !in proyecto!!.tareas) {
                proyecto!!.tareas.add(tarea)
                return true
            }
        }

        return false
    }


    fun marcarTarea(tarea:Tarea):Boolean {
        if (proyecto != null) {
            if (tarea in proyecto!!.tareas) {
                proyecto!!.tareas.map { if (tarea == it) it.completada = true }
                return true
            }
        }
       return false
    }
}