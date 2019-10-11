package domain.EstadoOps;

import domain.Cliente;
import domain.Empleado;
import domain.Inmuebles.Inmueble;
import domain.Operaciones.Operacion;

public class Reservado extends EstadoOperacion{

    @Override
    public void reservar(Inmueble unInmueble, Empleado unEmpleado, Cliente unCliente, Operacion unaOperacion){

    }
    @Override
    public void concretar(Inmueble unInmueble, Empleado unEmpleado, Cliente unCliente, Operacion unaOperacion) {
        unaOperacion.cambiarEstado(new Concretado(unEmpleado,unaOperacion));
    }

    @Override
    public boolean estaReservado(){
        return true;
    }
}
