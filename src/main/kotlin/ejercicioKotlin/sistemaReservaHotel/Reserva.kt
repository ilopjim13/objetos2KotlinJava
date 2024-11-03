package org.example.ejercicioKotlin.sistemaReservaHotel

data class Reserva(val cliente: Cliente?,  val habitacion: Habitacion?) {

    override fun toString(): String {
        return "Cliente: ${cliente?.nombre}, Numbero de habitación: ${habitacion?.numeroHabitaciion}"
    }

}