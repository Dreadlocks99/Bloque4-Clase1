package domain.Inmuebles.Locales;

import domain.Inmuebles.Casa;
import domain.Zona;

public class Local extends Casa {
    private TipoDeLocal tipo;

    public Local(double metrosCuadrados, int cantAmbientes, Zona unaZona, double unValor) {
        super(metrosCuadrados, cantAmbientes, unaZona, unValor);
    }

    @Override
    public boolean esVendible(){
        return false;
    }

    public void setTipo(TipoDeLocal tipo) {
        this.tipo = tipo;
    }


}
