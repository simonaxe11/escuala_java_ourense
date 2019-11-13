/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.poo.interfaces;

import pkg01_introjava.dao.IGenericDao;
import pkg01_introjava.poo.vehiculos.Coche;
import pkg01_introjava.poo.vehiculos.FabricaCoches;

/**
 *
 * @author PC
 */
public interface IDaoCoche extends IGenericDao<Coche> {
    
    public Coche crear(String marca) throws Exception; 
    
    public Coche obtenerPorMarca(String marca);
    
}