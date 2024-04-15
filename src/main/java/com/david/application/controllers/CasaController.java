package com.david.application.controllers;

import com.david.application.App;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class CasaController {

    @FXML
    private Pane admin;

    @FXML
    private Pane empleado;

    @FXML
    void onClickAdminButton(MouseEvent event) {
        App.newStage("LoginAdmin-view", "App - Iniciar sesion");
    }

    @FXML
    void onClickEmpleadoButton(MouseEvent event) {
        App.newStage("login-view", "App - View Client");
    }

    @FXML
    void onClickExitButton(MouseEvent event) {
        Platform.exit();
    }

}
