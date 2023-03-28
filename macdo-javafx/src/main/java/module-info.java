module com.simplon.macdo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.simplon.macdo to javafx.fxml;
    exports com.simplon.macdo;
    exports com.simplon.macdo.model;
    opens com.simplon.macdo.model to javafx.fxml;
}