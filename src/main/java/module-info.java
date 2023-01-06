module com.example.search_engine2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.sql;
    opens com.example.search_engine2 to javafx.fxml;
    exports com.example.search_engine2;
}