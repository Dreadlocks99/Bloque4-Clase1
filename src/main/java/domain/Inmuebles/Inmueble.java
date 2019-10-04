package domain.Inmuebles;

import domain.Operaciones.Operacion;
import domain.Zona;

public abstract class Inmueble {
    private double metrosCuadrados;
    private int cantAmbientes;
    private Zona unaZona;
    private Operacion unaOperacion;

    public Inmueble(double metrosCuadrados, int cantAmbientes, Zona unaZona, Operacion unaOperacion) {
        this.metrosCuadrados = metrosCuadrados;
        this.cantAmbientes = cantAmbientes;
        this.unaZona = unaZona;
        this.unaOperacion = unaOperacion;
    }

}
