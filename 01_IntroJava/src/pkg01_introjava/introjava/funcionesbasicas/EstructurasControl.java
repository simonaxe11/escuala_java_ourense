/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.introjava.funcionesbasicas;

/**
 *
 * @author PC
 */
public class EstructurasControl {

    public static void ejecutarBucles() {
        char arrayChar[] = {'a', 'B', '8', '*'};
        int index = 0;
        while (index < arrayChar.length) {
            System.out.println("Index = " + index + ", char" + arrayChar[index]);
            index = index + 1; //index++ // index+=1
        }

        for (index = 0; index < arrayChar.length; index++) { // (iniciacion ; condicion ; incremento
            System.out.println("Index = " + index + ", char= " + arrayChar[index]);
        }

        index = 0;
        do {
            System.out.println("Index = " + index + ", char= " + arrayChar[index]);
            index++;
        } while (index < arrayChar.length);

        for (char caracter : arrayChar) {
            System.out.println("char = " + caracter);
        }
    }

    public static void ejecutarCondiciones() {
        // Condicional simple
        if ("Palabra".length() > 5) {
            System.out.println("Palabra larga");
        }
        // Condicional compuestos
        if ("Texto".length() > 5) {
            //Por aqui no entra
        } else {
            System.out.println("Palabra corta");
        }

        if ("En un lugar de la mancha".contains("LUGAR")) {
            System.out.println("Tiene LUGAR");

        } else if ("En un lugar de la mancha".contains("MANCHA")) {

        } else if ("En un lugar de la mancha".contains("OTRO")) {

            System.out.println("Tiene OTRO");
        } else {
            System.out.println("No tiene ninguno porque están en mayúsculas");
        }

        //Switch
        int numeroPeq = 0;
        switch (numeroPeq + 5 - 5) {
            case 0:
                System.out.println("Num peq vale cero.");
                break;
            case 1:
                System.out.println("Num peq vale uno.");
                break;

            case 2:
                System.out.println("Num peq vale dos.");
                break;

            case 3:
                System.out.println("Num peq vale tres.");
                break;
            default:
                System.out.println("Es otro número");
                break;
        }
    }
}
