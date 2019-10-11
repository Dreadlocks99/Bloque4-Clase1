package domain.Inmuebles;

import domain.Zona;

public class Departamento extends Inmueble {
    public static double precioPorAmbiente = 350000;

    public Departamento(double metrosCuadrados, int cantAmbientes, Zona unaZona) {
        super(metrosCuadrados, cantAmbientes, unaZona);
    }

    @Override
    public double calcularTotal(){
        return (super.getCantAmbientes() * Departamento.precioPorAmbiente) + calcularPlus();
    }

    public boolean estaReservada(){
        return unaOperacion.estaReservada();
    }
}
