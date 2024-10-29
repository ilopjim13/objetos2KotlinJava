package org.example.ejercicioKotlin.juegoRol

class Mago(nombre:String, vida:Int, val hechizo: Hechizo): Personaje(nombre, vida) {

    fun usarHechizo():Hechizo {
        return hechizo
    }
}