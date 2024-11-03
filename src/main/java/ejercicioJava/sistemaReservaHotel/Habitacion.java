package ejercicioJava.sistemaReservaHotel;

public class Habitacion {
    public int numeroHabitacion;
    private boolean disponibilidad;

    public Habitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.disponibilidad = true;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
