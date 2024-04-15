package com.david.application.models;

import java.util.ArrayList;

public class Inventario {

    public static ArrayList<Producto> lista = new ArrayList<>();

    public boolean addComponent(Producto component){
        return lista.add(component);
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }
}
