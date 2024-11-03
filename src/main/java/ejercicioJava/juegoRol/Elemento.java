package ejercicioJava.juegoRol;

public enum Elemento {
    FUEGO("fuego"),
    HIELO("hielo"),
    AGUA("agua"),
    TIERRA("tierra"),
    VIENTO("viento");

    private String desc;

    Elemento(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

