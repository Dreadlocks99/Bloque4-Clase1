package domain;

public class Zona {
    private double plus;
    private String nombre;

    public Zona(double plus, String nombre) {
        this.plus = plus;
        this.nombre = nombre;
    }

    public double getPlus() {
        return plus;
    }

    public void setPlus(double plus) {
        this.plus = plus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
