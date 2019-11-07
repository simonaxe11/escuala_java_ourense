/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.poo;



/** Clase abstracta que no puede ser instanciada
 * Por falta de sentido
 * @author PC
 */
public abstract class Vehiculo {
    
    protected TipoVehiculo tipo;

    public TipoVehiculo getTipo() {
        return tipo;
    }
    
    public void mostrarEstado(){
        System.out.println("Coche " + getTipo());
    }
    
    /**
     * Metodo declarado e implementado
     * @param tipo 
     */
    public void setTipo(TipoVehiculo tipo) { //Declacracion
        this.tipo = tipo; //Implementacion
    }
    public abstract void avanzar(); //Declaracion
}
