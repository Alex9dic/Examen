/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Usuario;
import java.util.List;

/**
 *
 * @author labtw04
 */
public interface IUsuarioModel {
     public void crearRegistro(Usuario usuario);
     
     public List<Usuario> obtenerRegistros(); 
}
