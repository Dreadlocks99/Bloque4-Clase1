package domain.Operaciones;

import domain.Inmuebles.Inmueble;

public class Venta extends Operacion {
    private static double porcentajeValor = 1.5;

    public Venta(Inmueble unInmueble, Operacion unaOperacion){

    }

    @Override
    public double calcularComision(Inmueble unInmueble){
        return porcentajeValor * unInmueble.calcularTotal();
    }

}
