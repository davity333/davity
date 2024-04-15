package com.david.application.controllers;

import com.david.application.App;
import com.david.application.models.Inventario;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.control.Alert;

import java.util.ArrayList;

public class Producto {

    @FXML
    private TextField caducidadlabel;

    @FXML
    private TextField codigolabel1;

    @FXML
    private TextField nombrecantidad;

    @FXML
    private TextField nombrelabel;

    @FXML
    private TextField preciolabel;
    @FXML
    private Text devuelta;

    //

    //
    @FXML
    void eventKey(KeyEvent event){
        Object evt = event.getSource();
        if(evt.equals(nombrelabel)){
            if(!Character.isLetter(event.getCharacter().charAt(0)) && !event.getCharacter().equals(" ")){
                event.consume();
            }

        }else if (evt.equals(nombrecantidad)){
            if(!Character.isDigit(event.getCharacter().charAt(0))){
                event.consume();
            }


        }else if (evt.equals(preciolabel)){
            if(!Character.isDigit(event.getCharacter().charAt(0))){
                event.consume();
            }

        }else if (evt.equals(codigolabel1)){
            if(!Character.isDigit(event.getCharacter().charAt(0))){
                event.consume();
            }

        }else if (evt.equals(caducidadlabel)){
            if(!Character.isLetter(event.getCharacter().charAt(0)) && !event.getCharacter().equals(" ")){
                event.consume();
            }
        }
    }

Inventario invent = new Inventario();
@FXML
void onClickdatos(MouseEvent event) {
    String nombre = nombrelabel.getText();
    int cantidad = Integer.parseInt(nombrecantidad.getText());
    String codigo = codigolabel1.getText();
    String caducidad = caducidadlabel.getText();
    double precio = Double.parseDouble(preciolabel.getText());

    com.david.application.models.Producto productos = new com.david.application.models.Producto(nombre, cantidad, codigo, caducidad, precio);

    if (invent.addComponent(productos)) {
        System.out.println("Registro exitoso");
    } else {
        System.out.println("No se metio");
    }


    Alert alert;
    alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("AGREGADO");
    alert.setHeaderText(null);
    alert.setContentText("Producto agregado ✔");
    alert.showAndWait();
}

//
    @FXML
    void onClicksalir(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void initialize(){
        if (App.mensajedevuelta.size()>0)
            devuelta.setText(App.mensajedevuelta.get(0));
        App.mensajedevuelta.clear();
    }

}








