package domain;

import domain.EstadoOps.Concretado;
import domain.EstadoOps.NoReservado;
import domain.EstadoOps.Reservado;
import domain.Inmuebles.Casa;
import domain.Inmuebles.Departamento;
import domain.Inmuebles.PH;
import domain.Operaciones.Alquiler;
import domain.Operaciones.Operacion;
import domain.Operaciones.Venta;
import domain.Cliente;
import domain.Empleado;
import domain.Zona;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test1 {
    private Casa unaCasa;
    private Zona unaZona;
    private Cliente unCliente;
    private Empleado unEmpleado;
    private Operacion unaVenta;
    private Operacion unAlquiler;

    @Before
    public void init(){
        this.unaZona = new Zona(2.0,"Caballito");
        this.unaCasa = new Casa(100,4,unaZona,100000);
        this.unCliente = new Cliente("Ezequiel");
        this.unEmpleado = new Empleado();
        this.unaVenta = new Venta();
        this.unAlquiler = new Alquiler();
    }

    @Test
    public void comprobarReservaDeUnaVentaDeUnaCasa(){
        unaCasa.setUnaOperacion(unaVenta);
        unCliente.solicitarReservaDe(unaCasa,unEmpleado);
        Assert.assertTrue(unaCasa.estaReservada());
    }

    @Test
    public void comprobarReservaDeUnAlquilerDeUnaCasa(){
        unaCasa.setUnaOperacion(unAlquiler);
        unCliente.solicitarReservaDe(unaCasa,unEmpleado);
        Assert.assertTrue(unaCasa.estaReservada());
    }

    @Test
    public void comisionDeUnaVenta(){
        unaCasa.setUnaOperacion(unaVenta);
        unCliente.solicitarReservaDe(unaCasa,unEmpleado);
        Assert.assertEquals(0,unEmpleado.tamanioLista());
        unCliente.solicitarConcretacion(unaCasa,unEmpleado);
        Assert.assertEquals(1,unEmpleado.tamanioLista());
        Assert.assertEquals(150003.0,unEmpleado.comisionesPorOperacionesCerradas(),0.0);
    }

}



