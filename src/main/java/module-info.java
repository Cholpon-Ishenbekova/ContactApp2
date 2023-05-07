module com.example.contact1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contact1 to javafx.fxml;
    exports com.example.contact1;
}