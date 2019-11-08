/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.poo.sistemasDesplazamiento;

import pkg01_introjava.poo.interfaces.Desplazable;

/**
 *
 * @author PC
 */
public class Avion implements Desplazable {

    @Override
    public void mover(float metros) {
        if (metros > 10) {
            volar(metros);
        } else{
            rodar(metros);
        }
    }
    
    public void volar(float m){
        System.out.println("Avión vuela vuela " + m + "!");
    }
    public void rodar(float m){
        System.out.println("Avión rueda para despegar " + m + "!");
    }
    
}
