module com.example.ui004tut {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ui004tut to javafx.fxml;
    exports com.example.ui004tut;
}