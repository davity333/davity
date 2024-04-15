package com.david.application.controllers;

import com.david.application.App;
import com.david.application.models.Persona;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Proveedor {

    @FXML
    private ImageView agregar;

    @FXML
    private ImageView eliminar;

    @FXML
    private Label label;

    @FXML
    private TextField nombreproveedor;

    @FXML
    private TextField numerotelefonico;

    @FXML
    private ImageView salir;
    @FXML
    private TextField eliminarproveedor;


    @FXML
    void onClickagregar(MouseEvent event) {
            String nombre = nombreproveedor.getText();
            String numero = numerotelefonico.getText();
            App.proveedor.add(nombre);
            App.proveedor.add(numero);

        if (nombre.isEmpty() || numero.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Advertencia");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, ingresa los datos que se te piden");
            alert.showAndWait();
        } else {
            App.proveedor.add(nombre);
            App.proveedor.add(numero);


            if (App.proveedor.size() > 0) {
                StringBuilder sb = new StringBuilder();
                for (String proveedor : App.proveedor) {
                    sb.append(proveedor);
                    sb.append("\n");
                }
                label.setText(sb.toString());
            }
        }
    }


    @FXML
    void onClickeliminar(MouseEvent event) {

        String nombre = nombreproveedor.getText();
        String numero = numerotelefonico.getText();
        boolean encontrado = false;
        for(int i = 0; i < App.proveedor.size(); i += 2) {
            String proveedorNombre = App.proveedor.get(i);
            String proveedorNumero = App.proveedor.get(i + 1);
            if (proveedorNombre.equals(nombre) && proveedorNumero.equals(numero)) {
                App.proveedor.remove(i + 1);
                App.proveedor.remove(i);
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            // Actualiza la etiqueta con la lista actualizada
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < App.proveedor.size(); i += 2) {
                String proveedorNombre = App.proveedor.get(i);
                String proveedorNumero = App.proveedor.get(i + 1);
                sb.append(proveedorNombre);
                sb.append("\n");
                sb.append(proveedorNumero);
                sb.append("\n");
            }
            label.setText(sb.toString());
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Proveedor");
            alert.setHeaderText(null);
            alert.setContentText("Este proveedor no fue encontrado");
            alert.showAndWait();
        }

    }


    @FXML
    void onClicksalir(MouseEvent event) {
        App.getStageView().close();
    }

}
