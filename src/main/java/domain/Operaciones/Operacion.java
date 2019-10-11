package domain.Operaciones;

import domain.Cliente;
import domain.Empleado;
import domain.EstadoOps.EstadoOperacion;
import domain.EstadoOps.NoReservado;
import domain.Inmuebles.Inmueble;
import domain.Zona;

public abstract class Operacion {
    protected EstadoOperacion estado;
    protected Inmueble unInmueble;

    public Operacion() {
        this.estado = new NoReservado();
    }

    public double calcularComision(){
        return 0;
    }


    public void reservar(Inmueble unInmueble, Empleado unEmpleado, Cliente unCliente){
        this.estado.reservar(unInmueble, unEmpleado, unCliente, this);
    }
    public void concretar(Inmueble unInmueble, Empleado unEmpleado, Cliente unCliente){
        this.estado.concretar(unInmueble, unEmpleado, unCliente, this);
    }

    public void cambiarEstado(EstadoOperacion estado){
        this.estado = estado;
    }

    public boolean estaCerrada(){
        return this.estado.estaCerrada();
    }

    public void setInmueble(Inmueble unInmueble) {
        this.unInmueble = unInmueble;
    }

    public boolean estaReservada(){
        return this.estado.estaReservado();
    }

    public Zona zonaDelInmueble(){
        return unInmueble.getUnaZona();
    }
}
