/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_tests.poo;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg01_introjava.poo.Coche;
import pkg01_introjava.poo.CocheRally;
import pkg01_introjava.poo.FabricaCoches;

/**
 *
 * @author PC
 */
public class OperacionesBasicasObjectos {

    @Test
    public void creandoObjetos() {
        Coche miCoche = null;

        miCoche = new Coche();
        System.out.println("Texto de coche: " + miCoche.toString());

        Coche miCocheFindes = new Coche();
        assertNotNull(miCoche);
        assertNotNull(miCocheFindes);
        assertNotEquals(miCoche, miCocheFindes);

        try {
            //        miCoche.setmarca = "Kia"; No Compila

            miCoche.setMarca("Kia");
        } catch (Exception ex) {
            Logger.getLogger(OperacionesBasicasObjectos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            miCocheFindes.setMarca("Hummer");
        } catch (Exception ex) {
            Logger.getLogger(OperacionesBasicasObjectos.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("miCoche.marca    = " + miCoche.getMarca());
        System.out.println("miCocheFindes.marca = " + miCocheFindes.getMarca());
        assertEquals(miCoche.getMarca(), "Kia");

        miCocheFindes = miCoche;
        assertEquals(miCoche, miCocheFindes);
        try {
            miCoche.setMarca("Hummer Limusina");
        } catch (Exception ex) {
            Logger.getLogger(OperacionesBasicasObjectos.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("miCoche.marca    = " + miCoche.getMarca());
        System.out.println("miCocheFindes.marca = " + miCocheFindes.getMarca());

        // Intro polimorfismo
        Object refAmiCoche = miCoche;
        // No podemos porque no tiene la forma de coche
        // System.out.println("miCoche.marca   = " + refAmiCoche.getMarca());
        // Si podemos...
        assertTrue(refAmiCoche.equals(miCoche));
        miCoche.arrancar();
        assertEquals(miCoche.getNumRueda(), 4);
        //Crear nuevo objeto y intentar meterselo al coche
//        Coche cochito = null;
//        cochito = new Coche();

        //Le decimos al Recolector de Basura que queremos borrar todos los objetos
        miCoche = null;
        miCocheFindes = null;
        System.gc();
    }

    @Test
    public void testSobrecargaMetodos() {
//        Coche miCocheArrancado = null;
//        miCocheArrancado = new Coche();
//        assertNotNull(miCocheArrancado);
//        miCocheArrancado.isArrancado();
        Coche miCoche = null;
        miCoche = new Coche();
        
        assertTrue(miCoche.arrancar());
        for (int i = 1; i <= 4; i++) {
            if (i == 4) {
                assertTrue(miCoche.arrancar(i));
            }else{
                assertFalse(miCoche.arrancar(i));
            }
        }
    }
    
//    @Test (expected = IllegalArgumentException.class)
//    public void gestionExcepciones() throws Exception{
//        Coche c = FabricaCoches.crear("Una marca");
//    }
    
//    @Test (expected = IllegalArgumentException.class)
//    public void gestionExcepcionesMAL() throws Exception{
//        Coche c = FabricaCoches.crear("Una marca");
//    }
    
//    @Test //(expected = IllegalArgumentException.class)
//    public void gestionExcepciones2(){
//        
//        try {
//            Coche c = FabricaCoches.crear("");
//        } catch (Exception ex) {
//            Logger.getLogger(OperacionesBasicasObjectos.class.getName()).log(Level.SEVERE, null, ex);
//            assertTrue(ex instanceof IllegalArgumentException);
//        }   
//    }
    
    @Test
    public void usandoConstructoresSobrecargados(){
        Coche c = new Coche("Ferrari");
        assertEquals(c.getMarca(), "Ferrari");
    }
    
    
    
}
