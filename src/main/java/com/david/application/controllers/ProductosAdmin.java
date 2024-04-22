package com.david.application.controllers;

import com.david.application.App;
import com.david.application.models.Empleado;
import com.david.application.models.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class ProductosAdmin {
    @FXML
    private Text devolvido;

    @FXML
    private Label label1;

    @FXML
    private ImageView regresar;

    @FXML
    void onClickregresar(MouseEvent event) {
        App.getStageView().close();
        devolvido.setText("");
    }
    Empleado empleado = new Empleado("","",3,"","");
    ArrayList<Producto> listaProductos = empleado.getLista();

    @FXML
    public void initialize() {
        if (listaProductos.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (Producto producto : listaProductos) {
                sb.append(producto).append("\n");
            }
            label1.setText(sb.toString());
        } else {
            label1.setText("No hay productos en el inventario");
        }

    }

    @FXML
    void onClickalta(MouseEvent event) {
        if(listaProductos.size() > 1){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Subido");
            alert.setHeaderText(null);
            alert.setContentText("No tiene ningun producto");
            alert.showAndWait();
        }else{
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Subido");
            alert.setHeaderText(null);
            alert.setContentText("El producto a sido subido al supermercado ✔");
            listaProductos.clear();
            label1.setText("");
            alert.showAndWait();

        }

    }

    @FXML
    void onClickdevolver(MouseEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Advertencia");
        alert.setHeaderText(null);
        alert.setContentText("Información de producto devuelta");
        alert.showAndWait();

        devolvido.setText("--Producto devuelto al empleado se le llegara un mensaje de texto--");
        listaProductos.clear();
        App.mensajedevuelta.clear();
        App.mensajedevuelta.add("El administrador devolvio tu producto porque no ingresastes bien los datos");
    }

    }













