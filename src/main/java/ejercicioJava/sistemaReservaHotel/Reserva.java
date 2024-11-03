package ejercicioJava.sistemaReservaHotel;

public class Reserva {
    public Cliente cliente;
    public Habitacion habitacion;

    public Reserva(Cliente cliente, Habitacion habitacion) {
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.getNombre() + ", Numero de habitación: " + habitacion.getNumeroHabitacion();
    }
}

