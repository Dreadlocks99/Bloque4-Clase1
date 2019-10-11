package domain.Inmuebles;

import domain.Cliente;
import domain.Empleado;
import domain.Operaciones.Operacion;
import domain.Zona;

public abstract class Inmueble {
    private double metrosCuadrados;
    private int cantAmbientes;
    private Zona unaZona;
    protected Operacion unaOperacion;

    public Inmueble(double metrosCuadrados, int cantAmbientes, Zona unaZona) {
        this.metrosCuadrados = metrosCuadrados;
        this.cantAmbientes = cantAmbientes;
        this.unaZona = unaZona;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public int getCantAmbientes() {
        return cantAmbientes;
    }

    public void setUnaOperacion(Operacion unaOperacion) {
        this.unaOperacion = unaOperacion;
        unaOperacion.setInmueble(this);
    }

    public double calcularPlus(){
        return this.unaZona.getPlus();
    }

    public double calcularTotal(){
        return 0;
    }

    public void serReservadoPor(Empleado unEmpleado, Cliente unCliente){
        this.unaOperacion.reservar(this, unEmpleado,unCliente);
    }

    public void serConcretadoPor(Empleado unEmpleado, Cliente unCliente){
        this.unaOperacion.concretar(this,unEmpleado,unCliente);
    }

    public Zona getUnaZona() {
        return unaZona;
    }

    public boolean esVendible(){
        return true;
    }
}
