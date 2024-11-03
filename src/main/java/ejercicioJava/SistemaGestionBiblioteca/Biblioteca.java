package ejercicioJava.SistemaGestionBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    public List<Libro> libros = new ArrayList<>();

    public void agregarLibros(Libro libro) {
        if (!libros.contains(libro)) {
            libros.add(libro);
        }
    }

    private void registrarUsuarioLibro(Usuario usuario, Libro libro) {
        usuario.setLibro(libro);
        libro.setPrestado(true);
    }

    public boolean prestarUsuario(Usuario usuario, Libro libro) {
        if (!libro.isPrestado()) {
            registrarUsuarioLibro(usuario, libro);
            return true;
        }
        return false;
    }

    public boolean devolverLibro(Usuario usuario) {
        if (usuario.getLibro() != null) {
            devolverUsuarioLibro(usuario, usuario.getLibro());
            return true;
        }
        return false;
    }

    private void devolverUsuarioLibro(Usuario usuario, Libro libro) {
        usuario.setLibro(null);
        libro.setPrestado(false);
    }
}

