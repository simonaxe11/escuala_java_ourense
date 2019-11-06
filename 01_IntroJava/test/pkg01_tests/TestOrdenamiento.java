/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg01_introjava.Ordenamiento;

/**
 *
 * @author PC
 */
public class TestOrdenamiento {

    public TestOrdenamiento() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
    }

//    @Test
    private void probarOrdenamientoSistemaHumano(int[] array, int[] arrayOrdenadoOk) {
//        int[] array = {4, 2, 3, 1};
//        int[] arrayOrdenadoOk = {1, 2, 3, 4};
        int[] arrayPorFuncion;
        arrayPorFuncion = Ordenamiento.ordenarArray(array);
        assertArrayEquals(arrayPorFuncion, arrayOrdenadoOk);

//        assertEquals(10, 10);
//        assertNotEquals("AA", "OO");
//        assertTrue(1 < 10);
    }

    @Test
    public void probarOrdenamientoSistemaHumano_1() {
        int[] array = {5, 4, 3, 2, 1};
        int[] arrayOrdenadoOk = {1, 2, 3, 4, 5};
//        int[] arrayPorFuncion;
//        arrayPorFuncion = Ordenamiento.ordenarArray(array);
//        assertArrayEquals(arrayPorFuncion, arrayOrdenadoOk);
        probarOrdenamientoSistemaHumano(array, arrayOrdenadoOk);
    }

    @Test
    public void probarOrdenamientoSistemaHumano_2() {
        probarOrdenamientoSistemaHumano(
                new int[]{5, 4, 3, 2, 1, 6, 9, 7, 8},
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    public void probarOrdenamientoSistemaHumano_2_2() {
        probarOrdenamientoSistemaHumano(
                new int[]{5, 4, 3, 2, 6, 6, 9, 7, 8},
                new int[]{2, 3, 4, 5, 6, 6, 7, 8, 9});
    }

    @Test
    public void probarOrdenamientoSistemaHumano_3() {
        probarOrdenamientoSistemaHumano(
                new int[]{5, 4},
                new int[]{4, 5});
    }

    @Test
    public void probarOrdenamientoSistemaHumano_4() {
        probarOrdenamientoSistemaHumano(
                new int[]{5, 4, -3, 2, 1, 6, -9, 7, 8},
                new int[]{-9, -3, 1, 2, 4, 5, 6, 7, 8});
    }

    @Test
    public void probarOrdenamientoSistemaHumano_5() {
        probarOrdenamientoSistemaHumano(
                new int[]{5, 4, 3, 2, 1, 6, 9, Integer.MAX_VALUE, 8},
                new int[]{1, 2, 3, 4, 5, 6, 8, 9, Integer.MAX_VALUE});
    }

    @Test
    public void probarOrdenamientoSistemaHumano_6() {
        probarOrdenamientoSistemaHumano(
                new int[]{5, 4, 3, 2, 1, 6, 9, Integer.MIN_VALUE, 8},
                new int[]{Integer.MIN_VALUE, 1, 2, 3, 4, 5, 6, 8, 9});
    }

    @Test
    public void probarOrdenamientoSistemaHumano_7() {
        probarOrdenamientoSistemaHumano(
                new int[]{2},
                new int[]{2});
    }

    @Test
    public void probarOrdenamientoSistemaHumano_8_1() {
        probarOrdenamientoSistemaHumano(
                new int[]{4, 3, 2, 1},
                new int[]{1, 2, 3, 4});
    }

    @Test
    public void probarOrdenamientoSistemaHumano_8() {
        probarOrdenamientoSistemaHumano(
                new int[]{},
                new int[]{});
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_9() {
        probarOrdenamientoSistemaHumano(
                null,
                null);
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano_10() {
        probarOrdenamientoSistemaHumano(
                new int[]{1,2,3,4,5},
                new int[]{1,2,3,4,5});
    }
//        int[] arrayPorFuncion;
//        arrayPorFuncion = Ordenamiento.ordenarArray(array);
//        assertArrayEquals(arrayPorFuncion, arrayOrdenadoOk);
}

//    @Test
//    public void probarOrdenamientoSistemaHumano_MAL() {
//
//        assertEquals(10, 5);
//        assertNotEquals("AA", "AA");
//        assertTrue(5.5f < 5.05f);
//    }
//}
