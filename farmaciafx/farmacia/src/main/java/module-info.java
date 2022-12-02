module br.edu.cassio.farmacia {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.cassio.farmacia to javafx.fxml;
    exports br.edu.cassio.farmacia;
}
