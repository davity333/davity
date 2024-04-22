package com.david.application.controllers;

import com.david.application.App;
import com.david.application.models.Empleado;
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

    String name = Empleado.getUsuario();
    String pass = Empleado.getPassword();

    @FXML
    void onClickIngresar(MouseEvent event) {
        if (nombre.getText().equals(name) && password.getText().equals(pass)) {
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











