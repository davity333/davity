package com.david.application.models;

import java.util.ArrayList;

public class Proveedor extends Persona{

    public Proveedor(String nombre, int telefono) {
        super(nombre,telefono);

    }
public static ArrayList<Persona> provedores = new ArrayList<>();

    public boolean addProvedor(Persona people){
        return provedores.add(people);
    }

    public ArrayList<Persona> showProvedores(){
        return provedores;
    }
}
