package domain;

import domain.Inmuebles.Inmueble;

public class Cliente {
    private String nombre;

    public Cliente(String unNombre){

    }

    public void solicitarReservaDe(Inmueble unInmueble, Empleado unEmpleado){
        unEmpleado.reservar(unInmueble,this);
    }

    public void solicitarConcretacion(Inmueble unInmueble, Empleado unEmpleado){
        unEmpleado.concretar(unInmueble,this);
    }

}
