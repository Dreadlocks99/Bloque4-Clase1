package domain.EstadoOps;

import domain.Cliente;
import domain.Empleado;
import domain.Inmuebles.Inmueble;
import domain.Operaciones.Operacion;

public abstract class EstadoOperacion {

    public void reservar(Inmueble unInmueble, Empleado unEmpleado, Cliente unCliente, Operacion unaOperacion){

    }
    public void concretar(Inmueble unInmueble, Empleado unEmpleado, Cliente unCliente, Operacion unaOperacion){

    }
    public boolean estaCerrada(){
        return false;
    }

    public boolean estaReservado(){
        return false;
    }
}
