package com.david.application;

import com.david.application.controllers.Producto;
import com.david.application.models.Administrador;
import com.david.application.models.Persona;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;


import java.io.IOException;
import java.util.ArrayList;
//ORIGINAL SUBIDO A GIT
public class App extends javafx.application.Application {
    private static Stage stageView;
    private static Stage stageRoot;
    static String  mensajote;
    public static ArrayList<String> msn = new ArrayList<>();
    public static ArrayList<String> addproduct = new ArrayList<>();
    public static ArrayList<String> mensajedevuelta = new ArrayList<>();
    //////
    public static ArrayList<String> proveedor = new ArrayList<>();


////////////
    @Override
    public void start(Stage stage) throws IOException {
        stageRoot = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("casa-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("NameApplication - Home");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void newStage(String fxml, String title) {
        stageView = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(loadFXML(fxml));
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            stageView.setTitle(title);
            stageView.setScene(scene);
            stageView.centerOnScreen();
            stageView.initOwner(stageRoot);
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Stage getStageView(){
        return stageView;
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }


    public static void main(String[] args) {
        launch();
        System.exit(1);
    }
    /*
    static Chat mensaje = new Chat(mensajote);
    public static String menssaje = mensaje.getMensaje();


     */
   // App.products.add(product);



}