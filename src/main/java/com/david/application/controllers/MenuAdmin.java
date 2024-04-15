package com.david.application.controllers;

import com.david.application.App;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MenuAdmin {

    @FXML
    private Pane cerrarsesion;

    @FXML
    private Pane mensaje;

    @FXML
    private Pane productos;

    @FXML
    private Text vacio;

    @FXML
    private Pane proveedor;

    @FXML
    void onClickcerrarsesion(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void onClickmensaje(MouseEvent event) {
        App.newStage("MensajesAdmin-view","MENSAJES");
    }

    @FXML
    void onClickproducto(MouseEvent event) {
       App.newStage("ProductosAdmin-view","PRODUCTOS");
    }

    @FXML
    void onClickproveedor(MouseEvent event) {
        App.newStage("propeedor-view","Proveedores");
    }
}


