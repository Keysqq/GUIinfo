module com.example.guiinfo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.guiinfo to javafx.fxml;
    exports com.example.guiinfo;
}