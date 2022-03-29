/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.Conexion;
import entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labtw04
 */
public class UsuarioModelImpl implements IUsuarioModel {

    Conexion c = new Conexion();
    private Conexion conexion;
    private Connection connection;

    @Override
    public void crearRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConection();
            String sql = "INSERT INTO usuario(nombre,edad,sexo) values(?,?,?)";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, usuario.getNombre());
            ps.setInt(2, usuario.getEdad());
            ps.setString(3, usuario.getSexo());
            ps.executeUpdate();
            System.out.println("Datos insertados correctamente");
            conexion.desconectar();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
      @Override
    public List<Usuario> obtenerRegistros() {
        List<Usuario> users = new ArrayList<Usuario>();
        try {
            ResultSet resultSet;
            
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConection();
            String sql = "SELECT * FROM usuario";
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                resultSet = ps.executeQuery();

                while (resultSet.next()) {
                    Usuario usuarios = new Usuario();
                    usuarios.setCodigo(resultSet.getInt(1));
                    usuarios.setNombre(resultSet.getString(2));
                    usuarios.setEdad(resultSet.getInt(3));
                    usuarios.setSexo(resultSet.getString(4));
                   
                    users.add(usuarios);
                    System.out.println("Datos obtenidos correcatmente");
                }
                conexion.desconectar();
            }
        } catch (Exception e) {
            System.out.println("Error al obtener registros " + e.getMessage());
        }
        return users;
    }
    
    public static void main(String[] args) throws SQLException {
        UsuarioModelImpl user = new UsuarioModelImpl();
        Usuario usuario = new Usuario();
        
        usuario.setNombre("Jaziel");
        usuario.setEdad(20);
        usuario.setSexo("M");
        user.crearRegistro(usuario);
        
         
    }

   
    
}


