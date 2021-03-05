package com.gameCovid;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App CovidGame
 */
public class App extends Application {

    private static Scene scene;
    public static Stage mStage;


    @Override
    public void start(Stage stage) throws IOException {
        mStage=stage;
        scene = new Scene(loadFXML("modeSelector"));
        stage.setTitle("CovidGame! - ModeSelector");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }


    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    //05/03/2021
}