package domain;

import domain.EstadoOps.Concretado;
import domain.Inmuebles.Inmueble;
import domain.Operaciones.Operacion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Empleado {

    private List<Operacion> operaciones;

    public Empleado() {
        this.operaciones = new ArrayList<>();
    }

    public double comisionesPorOperacionesCerradas(){
        return operacionesCerradas()
                .stream()
                .mapToDouble(o -> o.calcularComision())
                .sum();
    }

    public int tamanioLista(){
        return operaciones
                .size();
    }

    public int cantOperacionesCerradas(){
        return operacionesCerradas()
                .size();
    }

    public int cantOperacionesReservadas(){
        return operacionesCerradas()
                .size();
    }

    public List<Operacion> operacionesCerradas(){
        return this.operaciones
                .stream()
                .filter(o -> o.estaCerrada())
                .collect(Collectors.toList());
    }

    public List<Operacion> operacionesReservadas(){
        return this.operaciones
                .stream()
                .filter(o -> o.estaReservada())
                .collect(Collectors.toList());
    }

    public List<Zona> zonasOperacionesCerradas(){
        return operacionesCerradas()
                .stream()
                .map(o -> o.zonaDelInmueble())
                .collect(Collectors.toList());
    }

    public void agregarOperacionCerrada(Operacion unaOperacion){
        this.operaciones
                .add(unaOperacion);
    }

    public void reservar(Inmueble unInmueble,Cliente unCliente){
        unInmueble.serReservadoPor(this ,unCliente);
    }

    public void concretar(Inmueble unInmueble,Cliente unCliente){
        unInmueble.serConcretadoPor(this,unCliente);

    }



    public boolean podesTenerProblemasCon(Empleado otroEmpleado){
        return cerrasteOperacionesEnLaMismaZonaQue(otroEmpleado) && concretasteOperacionReservadaPor(otroEmpleado);
    }

    private boolean cerrasteOperacionesEnLaMismaZonaQue(Empleado otroEmpleado){
        List<Zona> misZonas = zonasOperacionesCerradas();
        List<Zona> zonasDelOtro = otroEmpleado.zonasOperacionesCerradas();
        return misZonas.stream().anyMatch(z -> zonasDelOtro.contains(z));
    }

    private boolean concretasteOperacionReservadaPor(Empleado otroEmpleado){
        List<Operacion> operacionesReservadasPorElOtro = otroEmpleado.operacionesReservadas();
        return this.operacionesCerradas()
                .stream()
                .anyMatch(o -> operacionesReservadasPorElOtro.contains(o));
    }
}
