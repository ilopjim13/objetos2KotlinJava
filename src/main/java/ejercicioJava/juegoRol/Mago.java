package ejercicioJava.juegoRol;

public class Mago extends Personaje {
    public Hechizo hechizo;

    public Mago(String nombre, int vida, Hechizo hechizo) {
        super(nombre, vida);
        this.hechizo = hechizo;
    }

    public Hechizo usarHechizo() {
        return hechizo;
    }
}

