module com.sd.blackjack {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sd7.blackjack to javafx.fxml;
    exports com.sd7.blackjack;
}