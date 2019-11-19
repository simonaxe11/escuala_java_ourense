/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn;

import com.vn.libreríaOperaArrays.OperarArraysDouble;
import com.vn.libreríaOperaArrays.OperarArraysDouble.FunCallbackOperarArrays;
import java.io.PrintStream;


/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {

        double[] array_A = {1, 2, 3, 4, 5};
        double[] array_B = {2, 3, 4, 5, 6};
        // Desde Java 8 permite las funciones callback
        double[] arraySumaAB
                = OperarArraysDouble.operarArrays(array_A, array_B, Main::suma);

        arrayEnTabla(System.out, arraySumaAB);
        FunCallbackOperarArrays divide = (double x, double y) -> {
            return x / y;
        };
        double[] arrayDivAB
                = OperarArraysDouble.operarArrays(array_A, array_B, divide);
        arrayEnTabla(System.out, arrayDivAB);

        double[] arrayRestaAB
                = OperarArraysDouble.operarArrays(
                        array_A, array_B, (double x, double y) -> {
                            return x - y;
                        });
        arrayEnTabla(System.out, arrayRestaAB);
    }

    public static double suma(double x, double y) {
        return x + y;
    }

    public static void arrayEnTabla(PrintStream salida, double[] array) {

        String tabla = "<table border=2><tr>\n";
        for (int index = 0; index < array.length; index++) {
            final double element = array[index];
            tabla += "<td>&nbsp; " + element + " &nbsp;</td>\n";
        }
        salida.println(tabla + "</tr></table>");
    }
}
