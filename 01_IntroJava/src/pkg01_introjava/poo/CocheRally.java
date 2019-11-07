/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.poo;

/**
 * Clase CocheRally para controlar otros características específicas de los
 * rallies
 *
 * @author PC
 */
public class CocheRally extends Coche {

    private float rozamiento;

    public CocheRally() {
        super();
        rozamiento = 5f;
        tipo = TipoVehiculo.RALLY;
       
    public void mostrarEstado() {
        System.out.println("Coche " + getMarca() + getTipo());
    }
}

/**
 * Constructor con parámetros Al implementar un constructor, el de por defecto
 * deja de ser implementado por Java
 *
 * @param marca
 */
public CocheRally(String marca) {
        super(marca);
        rozamiento = 5f;
    }

    public CocheRally(float rozamiento, String marca) {
        super(marca);
        this.rozamiento = rozamiento;
    }
    
    /**
     * Obtener valor de rozamiento
     *
     * @return the value of rozamiento
     */
    public float getRozamiento() {
        return rozamiento;
    }

    /**
     * Establecer valor de rozamiento
     *
     * @param rozamiento new value of rozamiento
     */
    public void setRozamiento(float rozamiento) {
        this.rozamiento = rozamiento;
    }

    @Override //NO ES OBLIGATORIO
        public boolean arrancar(String orden) {
        if (super.arrancar(orden)) {
            return super.arrancado;
        } else if ("arrancar".equalsIgnoreCase(orden)) {
            arrancado = true;
        } else {
            arrancado = "encender".equals(orden.toLowerCase());
            //return super.arrancar(orden); //To change body of generated methods, choose Tools | Templates.
        }
        return arrancado;
    }
    // Ejercicio: 
    // 1º Sobreescribir el método mostrarEstado para que también muestre el rozamiento

    //@Override
    public void mostrarEstadoAntiguo() {
        super.mostrarEstado();
        System.out.println("    - Rozamiento: " + getRozamiento());
    }
    // 2º que indique que es Coche de rally: <marca>, rozamiento, arrancado

    @Override
        public void mostrarEstado() {
        System.out.println("Coche de rally: " + getMarca()
                + ", rozamiento = " + rozamiento
                + (isArrancado() ? " arrancado."
                        : " apagado."));
    }
}
