/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.poo;


/**
 *
 * @author PC
 */
public abstract class Tractor extends Vehiculo {

    public Tractor() {
        super();
        tipo = TipoVehiculo.TRACTOR;
    }
    
    public void mostrarEstado(){
        System.out.println("Coche " + getTipo());
    }
    
    @Override
    public void avanzar() {
        System.out.println("Ruedo y siego");
    }
}
