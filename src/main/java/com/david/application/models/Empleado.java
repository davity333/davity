package com.david.application.models;

public class Empleado extends Persona{
    private String mensaje;
    private String usuario;
    private String password;

   public Empleado(String mensaje, String nombre, int telefono) {
        super(nombre,telefono);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
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

    public void enviarMensaje(){

    }

    public void agregarProducto(){

    }

}