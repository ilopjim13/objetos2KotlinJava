package ejercicioJava.SistemaGestionBiblioteca;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El señor de los anillos");
        Libro libro2 = new Libro("Harry Potter");

        Usuario usuario = new Usuario("Pepe");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibros(libro);
        biblioteca.agregarLibros(libro2);

        if (biblioteca.prestarUsuario(usuario, libro)) {
            System.out.println("Se le ha prestado el libro correctamente.");
        } else {
            System.out.println("No se ha podido prestar el libro");
        }

        if (biblioteca.devolverLibro(usuario)) {
            System.out.println("Se ha devuelto el libro correctamente");
        } else {
            System.out.println("No se ha podido devolver el libro");
        }
    }
}

