/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.poo;

/**
 *
 * @author PC
 */
public class Coche extends Vehiculo {

    /*public Coche() {
        // Constructor por defecto
    }*/
    private int numRuedas = 4;
    private String marca;
    protected boolean arrancado;

    // En el momento que creamos un constructor, el de por defecto deja de ser implementado por Java.
    public Coche() {
        numRuedas = 4;
        marca = "SIN MARCA";
        this.arrancado = false;
        tipo = TipoVehiculo.TURISMO;
    }

    public Coche(String marca) {
        this.marca = marca;
        this.arrancado = false;
        tipo = TipoVehiculo.TURISMO;
    }

    public boolean arrancar() {
        System.out.println(this.marca + " ha arrancado.");
        arrancado = true;
        return arrancado;
    }

    // Sobrecarga de método arrancar()
    /* Si la posición de la llave es 4, el coche arranca
     * No arranca en cualquier otro caso
     * @param posicionLlave puede ser un nº del 1 al 4
     * @return          Si se ha arrancado devuelve true
     */
    public boolean arrancar(int posicionLlave) { // 4 posiciones, la 4ª arrancada
        if (posicionLlave <1 || posicionLlave > 4) {
            throw new IllegalArgumentException("La llave ha de valer de 1 a 4");
        }
        arrancado = posicionLlave == 4 /*? true : false*/;
        System.out.println(this.marca
                + (arrancado ? " ha arrancado."
                             : " fallo al arrancar"));
        //if (posicionLlave == 4) arrancado = true; else arrancado = false;
        return arrancado;
    }
    
    
    
    public boolean arrancar(String orden){
        // CLEAN CODE: funciones no deben tener más de 20 líneas de código
        arrancado = ("arrancar".equals(orden));
        return arrancado;
    }
    /**
     * Simplemente muestra la marca y si está arrancado
     */
    @Override
    public void mostrarEstado(){
        System.out.println(toString());
    }
    
    public boolean isArrancado() {
        return arrancado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws Exception{
        //throws IllegalAccessException
        //Avisamos a quien invoca este método que podríamos lanzar la siguiente expepcion
        // Cuando existe una variable local con el mismo nombre
        // Obliga a usar this para acceder a la variable miembro con el mismo nombre
        if (marca != null && !"".equals((marca))) {
            this.marca = marca;
        }else{ // Lanzar la expepcion
            throw new IllegalAccessException("Debes asignar una marca.");
        }
    
    }

    public int getNumRueda() {
        return numRuedas;
    }

    @Override
    public void avanzar() {
        System.out.println("Ruedo un poco");
    }

    @Override
    public String toString() {
        return tipo + " - " + getMarca()
                    + (arrancado ? " arrancado."
                                 : " apagado.");
    }
  
}
