package domain.Operaciones;

import domain.Inmuebles.Inmueble;

public class Venta extends Operacion {
    private static double porcentajeValor = 1.5;

    public Venta() {

    }

    @Override
    public double calcularComision(){
        return porcentajeValor * super.unInmueble.calcularTotal();
    }

}
