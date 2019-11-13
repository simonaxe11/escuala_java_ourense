/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk01_tests.excepciones;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg01_introjava.excepciones.UsoNormalExcepciones;

/**
 *
 * @author PC
 */
public class ProbandoExcepciones {

    @Test
    public void gestionarExcepcion() {
        try {
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
            unObj.metodoPeligroso();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepcion " + ex.getMessage());
            System.out.println("\nPila de llamadas " + Arrays.toString(ex.getStackTrace()));
        }
    }
}
