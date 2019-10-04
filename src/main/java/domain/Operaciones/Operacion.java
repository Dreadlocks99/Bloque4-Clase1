package domain.Operaciones;

import domain.EstadoOps.EstadoOperacion;
import domain.Inmuebles.Inmueble;

public abstract class Operacion {
    private EstadoOperacion estado;

    public double calcularComision(Inmueble unInmueble){
        return 0;
    }


    public void reservar(this){

    }


}
