module be.inf1.ataribreakout {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens be.inf1.ataribreakout to javafx.fxml;
    exports be.inf1.ataribreakout;
}
