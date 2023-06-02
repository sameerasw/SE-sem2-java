module com.example.ui003tut {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ui003tut to javafx.fxml;
    exports com.example.ui003tut;
}