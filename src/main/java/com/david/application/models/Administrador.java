package com.david.application.models;

public class Administrador extends Persona{
  private String usuario;
  private String password;

    public Administrador(String nombre, int telefono, String usuario, String password) {
        super(nombre, telefono);
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void verAlmacen() {
    }

    public void agregarProveedor(){

    }

    public void leerMensaje(){

    }

}
