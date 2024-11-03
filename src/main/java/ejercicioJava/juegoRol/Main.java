package ejercicioJava.juegoRol;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Pepe", 100, 14);
        int ataque = guerrero.atacar();
        System.out.println("El guerrero " + guerrero.getNombre() + " ha atacado con un total de " + ataque + " de daño.");

        Mago mago = new Mago("Jose", 80, new Hechizo(20, Elemento.AGUA));
        Hechizo hechizo = mago.usarHechizo();
        System.out.println("El mago " + mago.getNombre() + " ha utilizado un hechizo de " + hechizo.getElemento().getDesc() + " con un total de " + hechizo.getDanio() + " de daño.");
    }
}

