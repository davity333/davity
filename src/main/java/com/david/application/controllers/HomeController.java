
package com.david.application.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.david.application.App;
import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button exitButton;
    @FXML
    private BottomNavigationButton petButton;
    @FXML
    private BottomNavigationButton clientButton;

    @FXML
    void onMouseClickExitButton(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void onClickClientButton(MouseEvent event) {
        App.newStage("login-view", "App - View Client");
    }

    @FXML
    void onClickPetButton(MouseEvent event) {
        App.newStage("LoginAdmin-view", "App - Iniciar sesion");
    }

    @FXML
    void initialize() {
        exitButton.getStyleClass().setAll("btn","btn-gl","btn-success");
        exitButton.setStyle("-fx-font-size: 20px; -fx-font-weight: 900; -fx-alignment: center;");
    }

}
