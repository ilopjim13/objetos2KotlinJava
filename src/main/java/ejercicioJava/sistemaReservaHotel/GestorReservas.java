package ejercicioJava.sistemaReservaHotel;

import java.util.ArrayList;
import java.util.List;

public class GestorReservas {

    public List<Reserva> reservas = new ArrayList<>();

    public boolean reservarHabitacion(Cliente cliente, Habitacion habitacion) {
        if (cliente.getHabitacion() == null && habitacion.isDisponibilidad()) {
            cliente.setHabitacion(habitacion);
            habitacion.setDisponibilidad(false);
            Reserva reserva = new Reserva(cliente, habitacion);
            cliente.setReserva(reserva);
            reservas.add(reserva);
            return true;
        }
        return false;
    }

    public void cancelarReserva(Cliente cliente) {
        if (cliente.getHabitacion() != null) {
            cliente.getHabitacion().setDisponibilidad(true);
        }
        reservas.remove(cliente.getReserva());
        cliente.setReserva(null);
    }

    public void mostrarReservas() {
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}

