package org.example.ejercicioKotlin.juegoRol

class Guerrero(nombre:String, vida:Int, private val danio:Int): Personaje(nombre, vida) {

    fun atacar():Int {
        return danio
    }

}