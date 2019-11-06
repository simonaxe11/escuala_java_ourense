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
public class Ordenamiento {

    public static int[] ordenarArray(int[] array) {
//        Declarar un array de enteros
//        Programar todo lo que haga falta para ordenarlo
        //int[] array = {10, 2, 5, 7};

        int x;

//         DESCENDENTE
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 1; j < array.length; j++) {
//                if (array[j] > array[j - 1]) {
//                    x = array[j - 1];
//                    array[j - 1] = array[j];
//                    array[j] = x;
//                }
//            }
//        }
//         ASCENDENTE
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    x = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = x;
                }
            }
        }
//        for (int j = 0; j < array.length; j++) {
//            System.out.println(array[j]);
//        }
        //Con sort
//        int [] array = {10, 2, 5, 7};
//        Arrays.sort(array);
//        System.out.println("Arrays ordenados: " + Arrays.toString(array));
        //Hecho por profesor
//        int[] array = {4, 2, 3, 1};
//        int[] arrayOrdenado = new int[array.length];
//        int inicio = 0;
//        int menor, posMenor = -1;
//        do {
//            menor = array[inicio]; //Integer.MAX_VALUE
//            posMenor = inicio;
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] < menor) {
//                    menor = array[i];
//                    posMenor = i;
//                }
//            }
//            array[posMenor] = Integer.MAX_VALUE;
//            arrayOrdenado[inicio] = menor;
//            inicio++;
//            menor = array[inicio];
//            System.out.println(array[i] + ", ");
//            System.out.println("Menor: " + menor);
//            for (int i = 0; i < array.length; i++) {
//                System.out.println(arrayOrdenado[i] + ", ");
//            }
//
//        } while (inicio < array.length);
        return array;
    }
}
