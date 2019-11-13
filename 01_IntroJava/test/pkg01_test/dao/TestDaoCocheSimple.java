/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_test.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import pkg01_introjava.dao.DaoCocheList;
import pkg01_introjava.dao.DaoCocheMap;
import pkg01_introjava.dao.DaoUsuarioList;
import pkg01_introjava.dao.Usuario;
import pkg01_introjava.poo.interfaces.IDaoCoche;
import pkg01_introjava.poo.interfaces.IDaoUsuario;
import pkg01_introjava.poo.vehiculos.Coche;

/**
 *
 * @author PC
 */
public class TestDaoCocheSimple {

    @Test
    public void testDaoCocheList() throws Exception {
        testInterfaceDaoCoche(new DaoCocheList());
    }

    @Test
    public void testDaoCocheMap() throws Exception {
        testInterfaceDaoCoche(new DaoCocheMap());
    }

    void testInterfaceDaoCoche(IDaoCoche daoCoche) throws Exception {
        daoCoche.crear("Coche A");
        daoCoche.crear("Coche B");
        Coche cc = daoCoche.crear("Coche C");

        assertEquals("Coche B", daoCoche.obtenerPorIndice(1).getMarca());
        assertEquals("Coche C", daoCoche.obtenerPorMarca("Coche C").getMarca());
        assertEquals("Coche C", daoCoche.obtenerPorIndice(2).getMarca());

        Coche modificar = new Coche("Coche B ahora X");
        daoCoche.modificar(1, modificar);
        assertEquals("Coche B ahora X", daoCoche.obtenerPorIndice(1).getMarca());
        assertEquals("Coche B ahora X", daoCoche.obtenerPorMarca("Coche B ahora X").getMarca());

        modificar = new Coche("Coche C");
        modificar.arrancar();
        daoCoche.modificar(2, modificar); // El nº 2 debe ser arrancado aqui dentro
        assertEquals(modificar.isArrancado(), cc.isArrancado());

        daoCoche.eliminar(1);  //Eliminar el B
        daoCoche.eliminar(daoCoche.obtenerPorMarca("Coche A")); // El A, queda el C
//        daoCoche.eliminar(new Coche("Coche A")); //Eliminamos un coche creado
        assertNull(daoCoche.obtenerPorIndice(1));
        assertNull(daoCoche.obtenerPorMarca("Coche A"));

        if (daoCoche instanceof DaoCocheList) {
            assertEquals("Coche C", daoCoche.obtenerPorIndice(0).getMarca());// El indice baja
        } else {
            assertEquals("Coche C", daoCoche.obtenerPorIndice(2).getMarca()); // El indice no cambia
        }
    }

    @Test
    public void testUsuarioDaoList() throws Exception {
        IDaoUsuario daoUsuario = new DaoUsuarioList();
        testUsuarioDao(daoUsuario);
    }

    public void testUsuarioDao(IDaoUsuario daoUsuario) throws Exception {
        daoUsuario.crear(new Usuario("Juan", 30));
        daoUsuario.crear(new Usuario("Ana", 31));
        daoUsuario.crear(new Usuario("Bea", 32));
        daoUsuario.crear(new Usuario("Luis", 29));
        assertEquals("Ana", daoUsuario.obtenerPorIndice(1).getNombre());
        assertEquals(32, daoUsuario.obtenerPorNombre("Bea").getEdad());

        daoUsuario.modificar(1, new Usuario("Ana Modif", 21));
        assertEquals("Ana Modif", daoUsuario.obtenerPorIndice(1).getNombre());
        assertEquals(21, daoUsuario.obtenerPorIndice(1).getEdad());

        daoUsuario.eliminar(daoUsuario.obtenerPorIndice(0));
        daoUsuario.eliminar(1); // El 1 ahora es Bea
        // El 1 ahora es Luis
        assertEquals("Luis", daoUsuario.obtenerPorIndice(1).getNombre());
    }
}
