module com.example.crud_renan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crud_renan to javafx.fxml;
    exports com.example.crud_renan;
}