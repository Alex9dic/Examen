/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author labtw04
 */
public class Usuario extends Persona{
    int codigo;
    String nombre;
    String sexo;
    int edad;

    public Usuario(int codigo, String nombre, String sexo, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
