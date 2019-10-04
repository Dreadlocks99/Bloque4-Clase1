package domain.Inmuebles;

import domain.Operaciones.Operacion;
import domain.Zona;

public abstract class Inmueble {
    private double metrosCuadrados;
    private int cantAmbientes;
    private Zona unaZona;
    private Operacion unaOperacion;

    public Inmueble(double metrosCuadrados, int cantAmbientes, Zona unaZona) {
        this.metrosCuadrados = metrosCuadrados;
        this.cantAmbientes = cantAmbientes;
        this.unaZona = unaZona;

    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public int getCantAmbientes() {
        return cantAmbientes;
    }

    public double calcularPlus(){
        return this.unaZona.getPlus();
    }

    public double calcularTotal(){
        return 0;
    }
}
