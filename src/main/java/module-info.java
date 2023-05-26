module com.example.ui002login {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ui002login to javafx.fxml;
    exports com.example.ui002login;
}