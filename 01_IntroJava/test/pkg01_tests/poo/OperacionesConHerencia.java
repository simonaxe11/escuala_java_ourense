/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_tests.poo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg01_introjava.poo.Coche;
import pkg01_introjava.poo.CocheRally;
import pkg01_introjava.poo.TipoVehiculo;
import pkg01_introjava.poo.Tractor;
import pkg01_introjava.poo.Vehiculo;

/**
 *
 * @author PC
 */
public class OperacionesConHerencia {

    static Coche turismo;
    static CocheRally supra;

    @BeforeClass
    public static void setUpClass() throws Exception {
        supra = new CocheRally();
        supra.setMarca("Toyota");
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testSobreescrituraMetodos() {

        supra.setRozamiento(7f);
        assertTrue(supra.getRozamiento() == 7f);
        //Usando T.D.D
        assertTrue(supra.arrancar("arrancar"));
        assertTrue(supra.arrancar("ARRANcar"));
        assertTrue(supra.arrancar("Encender"));
        supra.mostrarEstado();
    }

    @Test
    public void testPolimorfismo() {
        supra.setRozamiento(15f);

        turismo = supra;
        // En java todos los métodos virtuales
        // Si un hijo tiene un método , se invoca al del hijo
        turismo.mostrarEstado();
    }

    @Test
    public void testEnumerado() {
        supra.setTipo(TipoVehiculo.RALLY);
        // Un enumerado es un int, limitado a lista de valores indicados
        System.out.println(" Tipo: " + supra.getTipo().toString());
        System.out.println(" Tipo: " + (long) supra.getTipo().ordinal());

        Tractor miTractorAmarillo = new Tractor() {
        };
        miTractorAmarillo.setTipo(TipoVehiculo.valueOf("TRACTOR"));
        System.out.println(" Tipo desde String: "
                + miTractorAmarillo.getTipo());

        miTractorAmarillo.setTipo(TipoVehiculo.values()[2]);
        System.out.println(" Tipo desde int: "
                + miTractorAmarillo.getTipo());
    }

    @Test
    public void testClasesAbstractas() {
        // Vehiculo vehDesc = new Vehiculo(); NO SE PUEDE AL SER ABSTRACTO
        Vehiculo vehDesc = new Coche("Dacia");
        Vehiculo subaru = new CocheRally("Subaru");
        Vehiculo miTrac = new Tractor() {};
        vehDesc.avanzar();
        miTrac.avanzar();
        // Mediante un casting explicito podemos invocar a sus metodos
        assertEquals(((CocheRally)subaru).getMarca(), "Subaru");
        
        Vehiculo[] misVehiculos = new Vehiculo[] {
            vehDesc,
            miTrac,
            new Coche("Electrico"),
            subaru
        };
        for (Vehiculo miVehiculo : misVehiculos) {
            System.out.println(" - " + miVehiculo.getTipo());
            miVehiculo.avanzar();
        }
    }
}
