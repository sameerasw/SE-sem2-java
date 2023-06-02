module com.example.ui003tut03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ui003tut03 to javafx.fxml;
    exports com.example.ui003tut03;
}