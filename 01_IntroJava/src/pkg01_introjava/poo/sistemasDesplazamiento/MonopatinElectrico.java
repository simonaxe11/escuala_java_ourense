/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.poo.sistemasDesplazamiento;

import pkg01_introjava.poo.interfaces.Electrico;

/**
 *
 * @author PC
 */
public class MonopatinElectrico extends Monopatin implements Electrico{

    @Override
    public void cargarBateria(double voltios) {
        System.out.println("Carga bateria " + voltios + " voltios.");
    }
    
}
