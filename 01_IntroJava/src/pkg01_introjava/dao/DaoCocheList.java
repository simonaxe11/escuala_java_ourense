/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkg01_introjava.poo.interfaces.IDaoCoche;
import pkg01_introjava.poo.vehiculos.Coche;
import pkg01_introjava.poo.vehiculos.FabricaCoches;

/**
 *
 * @author PC
 */
public class DaoCocheList implements IDaoCoche {

    private List<Coche> listaCoches;

    public DaoCocheList() {
        listaCoches = new ArrayList<>();
    }

    @Override
    public Coche crear(String marca) throws Exception {
        Coche c = FabricaCoches.crear(marca);
        listaCoches.add(c);
        return c;
    }

    @Override
    public Coche crear(Coche cocheNuevo) throws Exception {
        listaCoches.add(cocheNuevo);
        return cocheNuevo;
    }

    @Override
    public Coche obtenerPorIndice(int index) {
        if (index < listaCoches.size()) {
            return listaCoches.get(index);
        } else {
            return null;
        }

    }

    @Override
    public Coche obtenerPorMarca(String marca) {
        for (Coche coche : listaCoches) {
            if (coche.getMarca().equals(marca)) {
                return coche;
            }
        }
        return null;
    }

    @Override
    public Coche modificar(int index, Coche objConDatosNuevo) throws Exception {
        //Sustituír
        //this.listaCoches.set(index, objConDatosNuevo);
        Coche c = this.listaCoches.get(index);
        c.setMarca(objConDatosNuevo.getMarca());
        c.setTipo(objConDatosNuevo.getTipo());
        c.arrancar(objConDatosNuevo.isArrancado() ? 4 : 1);
        return c;
    }

    @Override
    public void eliminar(int index) {
        this.listaCoches.remove(index);
    }

    @Override
    public void eliminar(Coche objConDatosNuevo) {
        this.listaCoches.remove(objConDatosNuevo);
    }

}
