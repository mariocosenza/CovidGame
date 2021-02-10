package com.gameCovid;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ModeSelector {
    public Button buttonSimulazione;
    public Button buttonCovidGame;


    public void actionCovidGame(ActionEvent actionEvent) throws IOException
    {

        App.setRoot("player");
        App.mStage.sizeToScene();


    }

    public void actionSimulazione(ActionEvent actionEvent) throws IOException{
        App.setRoot("primary");
        App.mStage.sizeToScene();

    }
}
