package domain.Operaciones;


import domain.Inmuebles.Inmueble;

public class Alquiler extends Operacion {
    private int cantMeses;

    public Alquiler(Inmueble unInmueble, int cantMeses, Operacion unaOperacion) {
        this.cantMeses = cantMeses;
    }

    public Alquiler() {

    }

    @Override
    public double calcularComision(){
        return this.cantMeses * unInmueble.calcularTotal();
    }
}
