package ejercicioJava.sistemaReservaHotel;

public class Main {
    public static void main(String[] args) {
        Habitacion habitacion1 = new Habitacion(1);
        Habitacion habitacion2 = new Habitacion(2);
        Habitacion habitacion3 = new Habitacion(3);
        Habitacion habitacion4 = new Habitacion(4);

        Cliente pepe = new Cliente("Pepe");
        Cliente jose = new Cliente("Jose");
        Cliente antonio = new Cliente("Antonio");
        Cliente maria = new Cliente("Maria");

        GestorReservas gestorReservas = new GestorReservas();

        if (gestorReservas.reservarHabitacion(pepe, habitacion1)) {
            System.out.println(pepe.getNombre() + " ha reservado la habitacion: " + habitacion1.getNumeroHabitacion());
        }
        if (gestorReservas.reservarHabitacion(jose, habitacion2)) {
            System.out.println(jose.getNombre() + " ha reservado la habitacion: " + habitacion2.getNumeroHabitacion());
        }
        if (gestorReservas.reservarHabitacion(antonio, habitacion3)) {
            System.out.println(antonio.getNombre() + " ha reservado la habitacion: " + habitacion3.getNumeroHabitacion());
        }
        if (gestorReservas.reservarHabitacion(maria, habitacion4)) {
            System.out.println(maria.getNombre() + " ha reservado la habitacion: " + habitacion4.getNumeroHabitacion());
        }

        gestorReservas.cancelarReserva(pepe);

        gestorReservas.mostrarReservas();
    }
}

