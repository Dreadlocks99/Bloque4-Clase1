package domain.Inmuebles;
import domain.Zona;

public class Casa extends Inmueble{
    private double valorParticular;

    public Casa(double metrosCuadrados, int cantAmbientes, Zona unaZona, double unValor){
        super(metrosCuadrados,cantAmbientes,unaZona);
        this.valorParticular = unValor;
    }

    @Override
    public double calcularTotal() {
        return this.valorParticular + calcularPlus();
    }


}
