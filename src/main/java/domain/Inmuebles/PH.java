package domain.Inmuebles;

import domain.Zona;

public class PH extends Inmueble {

    private static double precioBase = 500000;
    private static double precioPorMetroCuadrado = 14000;

    public PH(double metrosCuadrados, int cantAmbientes, Zona unaZona){
        super(metrosCuadrados,cantAmbientes,unaZona);
    }

    @Override
    public double calcularTotal(){
        return ((getMetrosCuadrados() * PH.precioPorMetroCuadrado) + precioBase) + calcularPlus();
    }

    public boolean estaReservada(){
        return unaOperacion.estaReservada();
    }



}
