package com.david.application.models;

import java.util.ArrayList;

public class Producto {
    private String nombre;
    private int cantidad;
    private String codigo;
    private double precio;
    private String caducidad;
    public Producto() {

    }

    public Producto(String nombre, int cantidad, String codigo, String caducidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.precio = precio;
        this.caducidad = caducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }


    @Override
    public String toString() {
        return nombre + "\n" +
                cantidad + "\n" +
                precio + "\n" +
                codigo + "\n" +
                caducidad;
    }

}