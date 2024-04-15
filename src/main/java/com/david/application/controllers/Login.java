package com.david.application.controllers;

import com.david.application.App;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Login {

    @FXML
    private Button closeButton;

    @FXML
    private Button ingresarBtn;

    @FXML
    private TextField nombre;

    @FXML
    private PasswordField password;
    @FXML
    private TextField vacio;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.close();
    }

    @FXML
    void onClickIngresar(MouseEvent event) {
        if (nombre.getText().equals("david") && password.getText().equals("1234")) {
            App.newStage("menuempleo-view","Hola empleado");
            vacio.setText("Datos correctos");
        }else{
            vacio.setText("Datos incorrectos");
        }
    }

    @FXML
    void initialize() {
        closeButton.getStyleClass().setAll("btn","btn-success");
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
    }

}











