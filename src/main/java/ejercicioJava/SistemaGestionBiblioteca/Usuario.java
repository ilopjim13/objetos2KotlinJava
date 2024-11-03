package ejercicioJava.SistemaGestionBiblioteca;

public class Usuario {
    public String nombre;
    public Libro libro;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.libro = null;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Libro getLibro() { return libro; }
    public void setLibro(Libro libro) { this.libro = libro; }
}