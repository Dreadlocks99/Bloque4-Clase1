package domain.EstadoOps;

import domain.Empleado;
import domain.Operaciones.Operacion;

public class Concretado extends EstadoOperacion {

    public Concretado(Empleado unEmpleado, Operacion unaOperacion) {
        unEmpleado.agregarOperacionCerrada(unaOperacion);
    }

    @Override
    public boolean estaCerrada(){
        return true;
    }
}
