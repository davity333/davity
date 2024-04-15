package com.david.application.controllers;

import com.david.application.App;
import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EmpleadoController {

    @FXML
    private BottomNavigationButton añadirbutton;

    @FXML
    private BottomNavigationButton añadirbutton2;

    @FXML
    private BottomNavigationButton añadirbutton3;

    @FXML
    private BottomNavigationButton clientButton1;

    @FXML
    private BottomNavigationButton clientButton11;

    @FXML
    private Text vaciotext;

    @FXML
    void onClickClientButton(MouseEvent event) {
    }

    @FXML
    void onClickClientButton2(MouseEvent event) {

    }

    @FXML
    void onClickClientButton3(MouseEvent event) {

    }

    public void onClicksalir(MouseEvent mouseEvent) {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    public void onClickchat(MouseEvent mouseEvent) {
     App.newStage("chat-view","MENSAJE PARA EL ADMINISTRADOR");
    }

    public void onClickproducto(MouseEvent mouseEvent) {
        App.newStage("producto-view","Añadir productos");
    }
    
}
