package com.david.application.models;

import java.util.ArrayList;

public class Proveedor extends Persona{

    public Proveedor(String nombre, int telefono) {
        super(nombre, telefono);
    }
    private static ArrayList<Persona> provedor = new ArrayList<>();

    public static boolean addProvedor(Persona people){
        return provedor.add(people);
    }


    public static ArrayList<Persona> getProvedor() {
        return provedor;
    }
}
