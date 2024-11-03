package org.example.ejercicioKotlin.sistemaReservaHotel

data class Cliente(val nombre: String, var habitacion: Habitacion? = null, var reserva: Reserva? = null) {
}