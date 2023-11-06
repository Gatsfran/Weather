module com.example.pogoda {
    requires javafx.controls;
    requires javafx.fxml;
    requires json;


    opens com.example.pogoda to javafx.fxml;
    exports com.example.pogoda;
    exports sample;
    opens sample to javafx.fxml;
}