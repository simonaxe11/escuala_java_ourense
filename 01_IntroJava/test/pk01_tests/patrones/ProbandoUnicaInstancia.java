/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk01_tests.patrones;

import org.junit.Test;
import static org.junit.Assert.*;
import pkg01_intojava.patrones.CocheEspecialUnico;
import pkg01_intojava.patrones.TractorSingleton;

/**
 *
 * @author PC
 */
public class ProbandoUnicaInstancia {

    public ProbandoUnicaInstancia() {
    }

//    @Test
//    public void instanciaUnica() throws Exception{
//        TractorSingleton miTractorSingleton = TractorSingleton.getInstanciaTractor();
//        
//    }
    
    @Test
    public void instanciaUnicaInsTrisTras() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
        //miUnicoCoche.setMarca("Unico coche 3");
        miUnicoCoche.mostrarEstado();
    }
    @Test
    public void instanciaUnicaIns() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
//      CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;
        //miUnicoCoche.setMarca("Unico coche 1");
        miUnicoCoche.mostrarEstado();
    }

    @Test
    public void instanciaUnicaInsBis() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
//      CocheEspecialUnico.unicoCocheEsp = miUnicoCoche;
        //miUnicoCoche.setMarca("Unico coche 2");
        miUnicoCoche.mostrarEstado();
    }

    @Test
    public void instanciaUnicaInsTris() throws Exception {
        CocheEspecialUnico miUnicoCoche = CocheEspecialUnico.getInstancia();
        //miUnicoCoche.setMarca("Unico coche 3");
        miUnicoCoche.mostrarEstado();
    }
}
