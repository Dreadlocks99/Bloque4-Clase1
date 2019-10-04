package domain.Operaciones;


import domain.Inmuebles.Inmueble;

public class Alquiler extends Operacion {
    private int cantMeses;

    public Alquiler(Inmueble unInmueble, int cantMeses, Operacion unaOperacion) {
        this.cantMeses = cantMeses;
    }

    @Override
    public double calcularComision(Inmueble unInmueble){
        return this.cantMeses * unInmueble.calcularTotal();
    }
}
