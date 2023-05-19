module com.example.ui001extend {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ui001extend to javafx.fxml;
    exports com.example.ui001extend;
}