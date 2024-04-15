package com.david.application.controllers;

import com.david.application.App;
import com.david.application.models.Inventario;
import com.david.application.models.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

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
    Inventario inventario = new Inventario();
    ArrayList<Producto> listaProductos = inventario.getLista();

    @FXML
    public void initialize() {

        // Verificar si la lista de productos no está vacía
        if (listaProductos.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (Producto producto : listaProductos) {
                sb.append(producto).append("\n"); // Agregar cada producto a StringBuilder
            }
            // Asignar el contenido de StringBuilder al texto del Label
            label1.setText(sb.toString());
        } else {
            // Si la lista de productos está vacía, mostrar un mensaje en el Label
            label1.setText("No hay productos en el inventario");
        }

    }

    @FXML
    void onClickalta(MouseEvent event) {
        if(listaProductos.size() > 0){
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













