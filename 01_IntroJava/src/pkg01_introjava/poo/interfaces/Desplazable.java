/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.poo.interfaces;

/** La forma en que se comunican las clases que la implementan
 * Es cómo una clase abstracta con sólo métodos abstractos
 *
 * @author PC
 */
public interface Desplazable {

//    No se deben usar variables miembro en interfaces
//    int propiedadNoApropiada = 4;

    // Unicamente declaracion de metodos abstractos
    /* public abstract*/ void mover(float metros);
    
    // public void mover(int metros);
    
    //public void detener();
    
}
