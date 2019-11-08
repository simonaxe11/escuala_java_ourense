/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_tests.poo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ProbarClaseInterfazGenericaYAnidadas {

    public static class ClasePequePos< T > { // static para usarlo en cualquier partex

        T x, y;

        public ClasePequePos(T x, T y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(x = " + x.toString() + ", y = " + y.toString() + ")";
        }
    }

    @Test
    public void probarClaseAnidada() {
        ClasePequePos unPunto2D = new ClasePequePos(3f, 5f);
        System.out.println("PUNTO 2D: " + unPunto2D.toString());
        
    }

    @Test
    public void stProbarClaseAnidada() {
        ClasePequePos unPunto2D = new ClasePequePos(3f, 5f);
        System.out.println("PUNTO 2D: " + unPunto2D.toString());
        ClasePequePos<String> unPunro2Dstr = new ClasePequePos<String>("tres", "cinco"); //Aqui indicamos explicitamente el tipo
        System.out.println("PUNTO 2D str" + unPunto2D.toString());
    }
}
