/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava;

//import java.util.Arrays;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.crypto.dsig.TransformException;
import pkg01_introjava.excepciones.UsoNormalExcepciones;
import pkg01_introjava.poo.vehiculos.Coche;
import pkg01_introjava.poo.vehiculos.FabricaCoches;

/**
 * Clase principal del proyecto Ejemplos JAVA
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
//        //Error no capturado, se detiene el programa
//        while(args.length > -1)
//            ((Object) null).equals(args);hb
        try {
            //Primer codigo con error
            System.out.println("Tipos de datos: ");
            Coche c = FabricaCoches.crear("Seat en main");
            c.mostrarEstado();
//            return;
//            c = FabricaCoches.crear(null); // IllegalArgumentException
            c = FabricaCoches.crear("Un coche");
            c.mostrarEstado();

            //Segundo codigo con error
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
            unObj.metodoPeligroso();

            throw new TransformException("Optimus prime se ha quedado sin batería");
            
            //Tercer codigo con error
//            Object objNulo = null;
//            System.out.println("Fallará: " + objNulo.toString());
        } //Se pueden anidar los catch
        catch (IllegalArgumentException ex) {
            //Captura cualquier Excepcion cuyo tipo sea el indicado el catch ó CUALQUIERA de sus clases hijas
            System.out.println("ARGUMENTO INVÁLIDO. DECIRLE AL USUARIO LO QUÉ: ");
            Logger.getLogger("<< LOG >> :" + Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RuntimeException ex) {
            //Captura cualquier Excepcion cuyo tipo sea el indicado el catch ó CUALQUIERA de sus clases hijas
            System.out.println("Cualquier tipo de RuntimeException: ");
            Logger.getLogger("<< LOG >> :" + Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            //Captura cualquier Excepcion cuyo tipo sea el indicado el catch ó CUALQUIERA de sus clases hijas
            System.out.println("Cualquier tipo de Exception: ");
            Logger.getLogger("<< LOG >> :" + Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally { //Siempre se ejecuta
            // Incluso antes que un return
            System.out.println("******* FIN DEL TRY - CATCH");
        }
        //System.out.println("******* FIN DEL PROGRAMA");
    }

    /**
     * Función que se ejecuta al arrancar el programa
     *
     * @param args the command line arguments
     */
    public static void mainTryCatchPorSeparado(String[] args) {
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
        try {
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
            unObj.metodoPeligroso();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepcion " + ex.getMessage());
            System.out.println("\nPila de llamadas " + Arrays.toString(ex.getStackTrace()));
        }
        try {
            Object objNulo = null;
            System.out.println("Fallará: " + objNulo.toString());
        } catch (NullPointerException ex) {
            System.out.println("Excepcion " + ex.toString());
        }

    }
}
