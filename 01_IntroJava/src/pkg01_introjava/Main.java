/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava;

//import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkg01_introjava.poo.Coche;
import pkg01_introjava.poo.FabricaCoches;

/**
 * Clase principal del proyecto Ejemplos JAVA
 *
 * @author PC
 */
public class Main {

    /**
     * Función que se ejecuta al arrancar el programa
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        DatosBasicos.mostrarTiposDatos();
//        EstructurasControl.ejecutarBucles();
//        EstructurasControl.ejecutarCondiciones();
//        DatosBasicos.probarOperadores();
//        Ordenamiento.ordenarArray();

        try {
            System.out.println("Tipos de datos: ");

            Coche c = FabricaCoches.crear("Seat en main");
            c.mostrarEstado();
            c = FabricaCoches.crear(null);
            c.mostrarEstado();
        } catch (Exception ex) {
            System.err.println("<< LOG >> :");
            Logger.getLogger("<< LOG >> :" + Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
