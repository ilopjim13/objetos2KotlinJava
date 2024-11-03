package ejercicioJava.juegoRol;

public class Guerrero extends Personaje {
    public int danio;

    public Guerrero(String nombre, int vida, int danio) {
        super(nombre, vida);
        this.danio = danio;
    }

    public int atacar() {
        return danio;
    }
}

