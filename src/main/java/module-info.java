module com.hit.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hit.demo to javafx.fxml;
    exports com.hit.demo;
}