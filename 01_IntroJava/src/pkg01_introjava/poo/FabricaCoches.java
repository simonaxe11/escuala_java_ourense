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
public class FabricaCoches {
    public static Coche crear(String marca) throws Exception{
        Coche c = new Coche();
        c.setMarca(marca);
        return c;
    }
}
