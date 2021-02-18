package com.gameCovid;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class ModeSelector {
    public Button buttonSimulazione;
    public Button buttonCovidGame;
    private Media media = new Media(new File("src/main/resources/com/gameCovid/horrorThemeCreepyVIVEK-ABHISHEK.mp3").toURI().toString());
    public MediaPlayer mediaPlayer = new MediaPlayer(media);



    public void actionCovidGame(ActionEvent actionEvent) throws IOException
    {
        App.setRoot("player");
        App.mStage.sizeToScene();
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
        App.mStage.setTitle("CovidGame! - PlayerMode");
    }

    public void actionSimulazione(ActionEvent actionEvent) throws IOException
    {
        App.setRoot("primary");
        App.mStage.sizeToScene();
        App.mStage.setTitle("CovidGame! - Simulazione");
    }
}
