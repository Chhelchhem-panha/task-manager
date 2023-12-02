module com.panhacode.taskmanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;


    opens com.panhacode.taskmanager to javafx.fxml;
    exports com.panhacode.taskmanager;
    exports com.panhacode.taskmanager.controller;
    opens com.panhacode.taskmanager.controller to javafx.fxml;
}