/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_tests.poo;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg01_introjava.poo.vehiculos.Coche;
import pkg01_introjava.poo.vehiculos.CocheRally;

/**
 *
 * @author PC
 */
public class ProbarColecciones {

    public ProbarColecciones() {
    }

    @Test
    public void testArrayListNoGenericaMuyMal() {

        ArrayList lista = new ArrayList(); // Un arraylist se define como un array dinámico
        // Con el ArrayList podemos mezlar churras con merinas
        // ¡¡¡ NO USAR NUNCA!!!
        lista.add(new Object());
        lista.add(new Coche("Coche"));
        lista.add("Texto cualquiera");
        lista.add(100);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elem [" + i + "]" + lista.get(i).toString());
        }
    }

    public void testArrayListGenericoOK() {
        ArrayList<CocheRally> misCoches = new ArrayList<CocheRally>();
        misCoches.add(new CocheRally("Subaru Lunes"));
        misCoches.add(new CocheRally("Toyota Martes"));
        misCoches.add(new CocheRally("Hummer Fin de"));

        misCoches.get(2).arrancar("encender");
        misCoches.get(2).mostrarEstado();
        
        for (CocheRally miCoche : misCoches) {
            miCoche.avanzar();
        }
    }
}
