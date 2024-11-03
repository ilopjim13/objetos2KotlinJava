package ejercicioJava.sistemaReservaHotel;

public class Cliente {
    private String nombre;
    private Habitacion habitacion;
    private Reserva reserva;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.habitacion = null;
        this.reserva = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}

