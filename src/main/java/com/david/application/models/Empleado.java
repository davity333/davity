package com.david.application.models;

import java.util.ArrayList;

public class Empleado extends Persona{
    private String mensaje;
    private static String usuario = "david";
    private static String password = "1234";
    public static ArrayList<Producto> lista = new ArrayList<>();

   public Empleado(String mensaje, String nombre, int telefono, String usuario , String password) {
        super(nombre,telefono);
        this.mensaje = mensaje;
        this.usuario = usuario;
        this.password = password;
    }

    public boolean addComponent(Producto component){
        return lista.add(component);
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public static String getUsuario() {
        return usuario;
    }


    public static String getPassword() {
        return password;
    }


}