package domain.Inmuebles.Locales;

import domain.Inmuebles.Casa;
import domain.Zona;

public class ALaCalle extends TipoDeLocal {
    private static double precioFijo = 2000;

    public static double getPrecioFijo() {
        return precioFijo;
    }

    @Override
    public double calcularTotal(Local unLocal){
        return unLocal.calcularTotal() + unLocal.calcularPlus() + getPrecioFijo();
    }
}
