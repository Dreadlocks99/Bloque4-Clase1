package domain.Inmuebles.Locales;

import domain.Zona;

public class Galpones extends TipoDeLocal {
    private static double divisorDePrecio = 2;

    @Override
    public double calcularTotal(Local unLocal){
        return unLocal.calcularTotal()/divisorDePrecio;
    }
}
