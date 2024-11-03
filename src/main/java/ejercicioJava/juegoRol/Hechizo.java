package ejercicioJava.juegoRol;

public class Hechizo {
    public int danio;
    public Elemento elemento;

    public Hechizo(int danio, Elemento elemento) {
        this.danio = danio;
        this.elemento = elemento;
    }

    public int getDanio() {
        return danio;
    }

    public Elemento getElemento() {
        return elemento;
    }

}

