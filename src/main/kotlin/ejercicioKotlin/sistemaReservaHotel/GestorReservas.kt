package org.example.sistemaReservaHotel

class GestorReservas {

    private val reservas:MutableList<Reserva> = mutableListOf()

    fun reservarHabitacion(cliente: Cliente, habitacion: Habitacion):Boolean {
        if(cliente.habitacion == null && habitacion.disponibilidad) {
            cliente.habitacion = habitacion
            habitacion.disponibilidad = false
            val reserva = Reserva(cliente, habitacion)
            cliente.reserva = reserva
            reservas.add(reserva)
            return true
        }
        return false
    }

    fun cancelarRerva(cliente: Cliente) {
        if (cliente.habitacion != null) cliente.habitacion!!.disponibilidad = true
        reservas.remove(cliente.reserva)
        cliente.reserva = null
    }

    fun mostrarReservas() {
        reservas.forEach { println(it) }
    }

}