package com.david.application.controllers;

import com.david.application.App;
import com.david.application.models.Empleado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Chat {



    @FXML
    private Button enviar;

    @FXML
    private ImageView flecha;

    @FXML
    private TextArea mensaje;

    @FXML
    void onClickEnviarButton(MouseEvent event) throws InterruptedException {
        String mensajes = mensaje.getText();
        App.msn.add(mensajes);
        System.out.println("MSN enviado");
    }

    @FXML
    void onClickFlechaButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void initialize() {

    }

}









