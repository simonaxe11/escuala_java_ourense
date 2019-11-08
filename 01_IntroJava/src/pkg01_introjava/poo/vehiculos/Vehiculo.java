/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.poo.vehiculos;

import pkg01_introjava.poo.interfaces.Desplazable;

/**
 * Clase abstracta que no puede ser instanciada Por falta de sentido
 *
 * @author PC
 */
public abstract class Vehiculo

    extends Object
    implements Desplazable

    {
    
    protected TipoVehiculo tipo;

    public TipoVehiculo getTipo() {
        return tipo;
    }

    /**
     * Metodo declarado e implementado
     *
     * @param tipo
     */
    public void setTipo(TipoVehiculo tipo) { //Declacracion
        this.tipo = tipo; //Implementacion
    }

    public abstract void avanzar(); //Declaracion

    public abstract void mostrarEstado();

    @Override
    public String toString() {
        return "Vehiculo{" + "tipo=" + tipo + '}';
    }
}
