module com.example.crudfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.crudfx to javafx.fxml;
    exports com.example.crudfx;
    exports com.example.crudfx.controller;
    opens com.example.crudfx.controller to javafx.fxml;

    opens controller to javafx.fxml;
}