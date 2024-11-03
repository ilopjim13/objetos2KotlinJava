package org.example.ejercicioKotlin.sistemaReservaHotel

fun main() {

    val habitacion1 = Habitacion(1)
    val habitacion2 = Habitacion(2)
    val habitacion3 = Habitacion(3)
    val habitacion4 = Habitacion(4)

    val pepe = Cliente("Pepe")
    val jose = Cliente("Jose")
    val antonio = Cliente("Antonio")
    val maria = Cliente("Maria")

    val gestorReservas = GestorReservas()

    if (gestorReservas.reservarHabitacion(pepe, habitacion1)) println("${pepe.nombre} ha reservado la habitacion: ${habitacion1.numeroHabitaciion}")
    if (gestorReservas.reservarHabitacion(jose, habitacion2)) println("${jose.nombre} ha reservado la habitacion: ${habitacion2.numeroHabitaciion}")
    if (gestorReservas.reservarHabitacion(antonio, habitacion3)) println("${antonio.nombre} ha reservado la habitacion: ${habitacion3.numeroHabitaciion}")
    if (gestorReservas.reservarHabitacion(maria, habitacion4)) println("${maria.nombre} ha reservado la habitacion: ${habitacion4.numeroHabitaciion}")

    gestorReservas.cancelarRerva(pepe)

    gestorReservas.mostrarReservas()

}