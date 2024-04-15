module com.david.application {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.charm.glisten;
    requires com.gluonhq.attach.display;


    opens com.david.application to javafx.fxml;
    exports com.david.application;
    exports com.david.application.controllers;
    opens com.david.application.controllers to javafx.fxml;
}