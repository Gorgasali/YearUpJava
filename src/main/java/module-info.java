module com.example.homework_week2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;

    opens com.example.homework_week2 to javafx.fxml;
    exports com.example.homework_week2;
}