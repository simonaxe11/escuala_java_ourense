/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_tests.poo;

import java.util.ArrayList;
import static org.junit.Assert.*;
//import static org.junit.Assert.assertEquals;
import org.junit.Test;
import pkg01_introjava.poo.vehiculos.Coche;

/**
 *
 * @author PC
 */
public class ProbarGenericos {

    @Test
    public void testearMetodoNoGenericos() {

    }

    @Test
    public void testearClaseAnidada() {
        //Las clases anidadas generar su propio fichero bytecodes
        ProbarClaseInterfazGenericaYAnidadas.ClasePequePos c;
        c = new ProbarClaseInterfazGenericaYAnidadas.ClasePequePos(1f, 2f);
    }

    @Test
    public void testearMetodoGenericos() {
        ArrayList<Integer> listIn = new ArrayList<Integer>();
        int tres = 3, cinco = 5;
        //insertarIntegerDuplicado(listIn, 3);
        //insertarIntegerDuplicado(listIn, 5);
        insertarDuplicado(listIn, tres);
        insertarDuplicado(listIn, cinco);
        System.out.println("Tres sigue siendo " + tres);
        for (Integer integer : listIn) {
            System.out.println(" - " + integer);
        }
        //Inferir: Infiere, deduce el tipo pos su declaracion
        ArrayList<String> listStr = new ArrayList<>();
        //insertarIntegerDuplicado(listStr, "tres");
        //insertarIntegerDuplicado(listStr, "cinco");
        insertarDuplicado(listStr, "tres");
        insertarDuplicado(listStr, "cinco");
        for (String unString : listStr) {
            System.out.println("** " + unString);
        }
        // Ejercicio para el coche
        ArrayList<Coche> listaCoches = new ArrayList<Coche>();
        insertarDuplicado(listaCoches, new Coche("PepeCar"));
        insertarDuplicado(listaCoches, new Coche("PoliCar"));
        for (Coche coche : listaCoches) {
            System.out.println(">> " + coche);
        }
        Integer ultInt = mostrarYdevolverUltimo(listIn);
        String ultStr = mostrarYdevolverUltimo(listStr);
        Coche ultCoche = mostrarYdevolverUltimo(listaCoches);
        assertEquals((int) ultInt, 5);
        assertEquals(ultInt, (Integer) 5);
        assertEquals(ultStr, "cinco");
        assertEquals(ultCoche.getMarca(), "PoliCar");

    }

    //Ponemos entre < y > el nombre del tipo genérico.
    //Esto convierte el método en un "MÉTODO GENÉRICO"
    static <Tipo> void insertarDuplicado(ArrayList<Tipo> listaGenerica, Tipo objeto) {
        listaGenerica.add(objeto);
        listaGenerica.add(objeto);
        System.out.println(objeto + " añadido dos veces");
        // Esto no afecta fuera del método
        if (objeto instanceof Integer) {
            Integer i = (Integer) objeto;
            i = i + 2;
        }
        listaGenerica = null;
    }

    /* Métodos no genéricos
        static void insertarIntegerDuplicado(ArrayList<Integer> listaInt, int i) {
        listaInt.add(i);
        listaInt.add(i);
        System.out.println(i + " añadido dos veces");
        // Esto no afecta fuera del método
        i = i + 10;
        listaInt = null;
    }
    
    static void insertarIntegerDuplicado(ArrayList<String> listaString, String str) {
        listaString.add(str);
        listaString.add(str);
        System.out.println(str + " añadido dos veces");
        // Esto no afecta fuera del método
        str = str + 10;
        listaString = null;
    }*/
    //Ejercicio: lo mismo pero con coche
    static void insertarCoches(ArrayList<Coche> listaCoches, Coche car) {
        listaCoches.add(car);
        listaCoches.add(car);
    }

    // Método genérico que reciba un ArrayList<Tipo>, que lo muestre ( foreach ) y devuelva el último valor
    static <T> T mostrarYdevolverUltimo(ArrayList<T> lista) {
        for (T infusion : lista) {
            System.out.println(">> " + infusion.toString());
        }
        if (lista.size() > 0) {
            return lista.get(lista.size() - 1);
        } else {
            return null;
        }
    }
}
