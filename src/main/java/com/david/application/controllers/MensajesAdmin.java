package com.david.application.controllers;

import com.david.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class MensajesAdmin {

    Chat mensajito = new Chat();
    @FXML
    private ImageView carta;

    @FXML
    private Label label;

    @FXML
    private ImageView lapiz;

    @FXML
    private Text mensaje;

    @FXML
    private ImageView regresar;

    @FXML
    private Text texto;

    @FXML
    String onClickRegresarButton() {
        App.getStageView().close();
        return null;
    }


    @FXML
    void initialize() {
        if (App.msn.size()>0)
            label.setText(App.msn.get(0));
    }
}

