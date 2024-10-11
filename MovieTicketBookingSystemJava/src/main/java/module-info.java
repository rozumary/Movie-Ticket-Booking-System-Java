module com.mycompany.movieticketbookingsystemjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.movieticketbookingsystemjava to javafx.fxml;
    exports com.mycompany.movieticketbookingsystemjava;
}
