module com.gameCovid {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.gameCovid to javafx.fxml;
    exports com.gameCovid;
}