package ejercicioJava.SistemaGestionBiblioteca;

public class Libro {
    public String nombre;
    public boolean prestado;

    public Libro(String nombre) {
        this.nombre = nombre;
        this.prestado = false;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrestado(boolean prestado) { this.prestado = prestado; }
    public boolean isPrestado() { return prestado; }
}
