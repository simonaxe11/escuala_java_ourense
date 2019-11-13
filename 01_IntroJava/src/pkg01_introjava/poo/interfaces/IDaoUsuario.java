/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_introjava.poo.interfaces;

import pkg01_introjava.dao.IGenericDao;
import pkg01_introjava.dao.Usuario;

/**
 *
 * @author PC
 */
public interface IDaoUsuario extends IGenericDao<Usuario> {

    public Usuario obtenerPorNombre(String nombre);

}
