/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_intojava.patrones;

import pkg01_introjava.poo.vehiculos.Tractor;

/**
 *
 * @author PC
 */
public class TractorSingleton extends Tractor {
    
    
    private static TractorSingleton tractorSingleton;
    
    private TractorSingleton(){
        super();
    }
    
//    public static TractorSingleton getInstanciaTractor() throws Exception{
//
//    }
}
