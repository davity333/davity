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
        int numero = Integer.parseInt(numerotelefonico.getText());
        com.david.application.models.Proveedor proveedores = new com.david.application.models.Proveedor(nombre,numero);

        if (nombre.isEmpty()|| numero<0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Advertencia");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, ingresa los datos que se te piden");
            alert.showAndWait();
        } else {
            com.david.application.models.Proveedor.addProvedor(proveedores);


            if(com.david.application.models.Proveedor.getProvedor().size()>0){
                StringBuilder sb = new StringBuilder();
                for (Persona proveedor : com.david.application.models.Proveedor.getProvedor()) {
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
        int numero = Integer.parseInt(numerotelefonico.getText());
        boolean vacio = false;
        ArrayList<Persona> prover = com.david.application.models.Proveedor.getProvedor();
        com.david.application.models.Proveedor proveedores = new com.david.application.models.Proveedor(nombre,numero);
        System.out.println(prover);

        if(nombre.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Advertencia");
            alert.setHeaderText(null);
            alert.setContentText("El nombre está vacío");
            alert.showAndWait();
            return;
        }

        if (!vacio) {
            boolean encontrado = false;
            for (int i = 0; i < prover.size(); i++) {
                String nombreActual = prover.get(i).getNombre();
                System.out.println("Nombre actual: " + nombreActual);
                if (nombre.equals(nombreActual)) {
                    prover.remove(i);
                    StringBuilder sb = new StringBuilder();
                    for (Persona proveedor : prover) {
                        sb.append(proveedor);
                        sb.append("\n");
                    }
                    label.setText(sb.toString());
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Advertencia");
                alert.setHeaderText(null);
                alert.setContentText("No existe");
                alert.showAndWait();
            }
        }


    }


    @FXML
    void onClicksalir(MouseEvent event) {
       // App.getStageView().close();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();
    }

}
