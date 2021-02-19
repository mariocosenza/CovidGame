module com.gameCovid {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
//

    opens com.gameCovid to javafx.fxml;
    exports com.gameCovid;
}