package domain;

import domain.Inmuebles.Inmueble;

public class Empleado {


    public void reservar(Inmueble unInmueble,Cliente unCliente){
        unInmueble.serReservadoPor(this );
    }
}
