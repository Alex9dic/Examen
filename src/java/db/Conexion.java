/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author labtw04
 */
public class Conexion {
    String pass = "alexi";
    String user = "postgres";
    String host = "localhost";
    String nombrebd = "examen";
    Connection conexion;
    public Conexion() {
    }
    
    
    public Connection conectar() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://" + host + "/" + nombrebd, user, pass);
            System.out.println("conexión establecida");
            
        } catch (Exception ex) {
            System.out.println("Error al conectar:" + ex.getMessage());
        }
        return conexion;
    }
    
    
    
    
    public void desconectar() throws SQLException {
        if (conexion !=null && ! conexion.isClosed()){
            conexion.close();
        }
    }
    
    public Connection getConection() {
        
        return conexion;
    }
    
    public void getdesconectar() throws SQLException {
       
    }
    
    public static void main(String[] args) throws SQLException {
        Conexion co = new Conexion();
        co.conectar();
    }
}
