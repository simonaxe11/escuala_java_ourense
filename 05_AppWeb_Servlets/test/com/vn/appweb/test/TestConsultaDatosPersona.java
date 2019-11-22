package com.vn.appweb.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.vn.appweb.modelo.ConsultaSQL;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class TestConsultaDatosPersona {
    
    public TestConsultaDatosPersona() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSelectSQL() {
        ConsultaSQL conSQL = new ConsultaSQL();
        assertEquals(0, conSQL.leerTabla("Nomb****eba").size());
        
        assertEquals("Pepe", conSQL.leerTabla("Pepe").get(0).getNombre());
        
    }
}
