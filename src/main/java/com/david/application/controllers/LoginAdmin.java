package com.david.application.controllers;

import com.david.application.App;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginAdmin {

    @FXML
    private AnchorPane cuadro;

    @FXML
    private Button ingresarbutton;

    @FXML
    private Text iniciar;

    @FXML
    private Text nombre;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private Button salirbutton;

    @FXML
    private TextField usuariofield;

    @FXML
    private Text vacio;

    @FXML
    private Text vacio1;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void onClickIngresarButton(MouseEvent event) {
            if (usuariofield.getText().equals("david")&&passwordfield.getText().equals("poo")) {
                App.newStage("menuAdmin-view","hola admin");
                vacio1.setText("DATOS CORRECTOS");
            }else{
                vacio.setText("ERROR: DATOS INCORRECTOS");
            }
        }
    }





