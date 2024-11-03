package org.example.ejercicioKotlin.juegoRol

fun main() {

    val guerrero = Guerrero("Pepe", 100, 14)

    val ataque = guerrero.atacar()
    println("El guerrero ${guerrero.nombre} ha atacado con un total de $ataque de daño.")

    val mago = Mago("Jose", 80, Hechizo(20, Elemento.AGUA))
    val hechizo = mago.usarHechizo()
    println("El mago ${mago.nombre} ha utilizado un hechido de ${hechizo.elemento.desc} con un total de ${hechizo.danio} de daño.")

}