package com.gameCovid;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;



public class SecondaryController {

    public Label labelGuide;
    @FXML
    private Label labelRisorse;
    @FXML
    private ProgressBar barAveregeLife;
    @FXML
    private Label labelName;
    @FXML
    private Button buttonNextRound;
    @FXML
    private Label labelLifeState;
    @FXML
    private Label labelPoint;
    @FXML
    private Button buttonGameInserisci;
    @FXML
    private TextField fieldName;
    @FXML
    private ProgressBar barNervoso;
    @FXML
    private ProgressBar barCircolatorio;
    @FXML
    private ProgressBar barRespiratorio;
    @FXML
    private Button buttonTAC;
    @FXML
    private ProgressBar barScheletrico;
    @FXML
    private ProgressBar barImmunitario;
    @FXML
    private Label labelNervoso;
    @FXML
    private Label labelRespiratorio;
    @FXML
    private Label labelCircolatorio;
    @FXML
    private Label labellScheletrico;
    @FXML
    private Label labelImmunitario;
    @FXML
    private Button buttonAnalgesici;
    @FXML
    private Button buttonImmunostimolanti;
    @FXML
    private Button buttonCorticosteroidi;
    @FXML
    private Button buttonVaccino;
    @FXML
    private Button buttonOssigeno;
    @FXML
    private Label labelVinto;

    private double sistemaNervoso       = 100;
    private double sistemaRespiratorio  = 100;
    private double sistemaScheletrico   = 100;
    private double sistemaImmunitario   = 100;
    private double sistemaCircolatorio  = 100;
    private double averageLife = 100;
    private byte point = 0;

    /**
     *
     */
    public double average(){
        averageLife = (sistemaNervoso + sistemaRespiratorio + sistemaScheletrico + sistemaImmunitario + sistemaCircolatorio) / 5;
        return averageLife;
    }
    public void randomSistemi(){  //da modificare i valori
        if (average () > 0 ) {
                if (averageLife > 80 && averageLife <= 100) {
                    sistemaNervoso -= Math.random() * (1 - 10);
                    sistemaScheletrico -= Math.random() * (1 - 7);
                    sistemaImmunitario -= Math.random() * (1 - 15);
                    sistemaRespiratorio -= Math.random() * (1 - 15);
                    sistemaCircolatorio -= Math.random() * (1 - 10);
                }
                else if (averageLife > 50 && averageLife <= 80) {
                    sistemaNervoso -= Math.random() * (1 - 15);
                    sistemaScheletrico -= Math.random() * (1 - 15);
                    sistemaImmunitario -= Math.random() * (1 - 20);
                    sistemaRespiratorio -= Math.random() * (1 - 25);
                    sistemaCircolatorio -= Math.random() * (1 - 15);
                }
                else if (averageLife > 30 && averageLife <= 50) {
                    sistemaNervoso -= Math.random() * (1 - 20);
                    sistemaScheletrico -= Math.random() * (1 - 20);
                    sistemaImmunitario -= Math.random() * (1 - 35);
                    sistemaRespiratorio -= Math.random() * (1 - 40);
                    sistemaCircolatorio -= Math.random() * (1 - 20);
                }
                else if (averageLife > 10 && averageLife <= 30) {
                    sistemaNervoso -= Math.random() * (1 - 25);
                    sistemaScheletrico -= Math.random() * (1 - 25);
                    sistemaImmunitario -= Math.random() * (1 - 40);
                    sistemaRespiratorio -= Math.random() * (1 - 50);
                    sistemaCircolatorio -= Math.random() * (1 - 30);
                }
                else if (averageLife <= 10) {
                    sistemaNervoso -= Math.random() * (1 - 30);
                    sistemaScheletrico -= Math.random() * (1 - 35);
                    sistemaImmunitario -= Math.random() * (1 - 60);
                    sistemaRespiratorio -= Math.random() * (1 - 70);
                    sistemaCircolatorio -= Math.random() * (1 - 45);
                }
                else {
                    sistemaNervoso -= Math.random() * (1 - 50);
                    sistemaScheletrico -= Math.random() * (1 - 50);
                    sistemaImmunitario -= Math.random() * (1 - 80);
                    sistemaRespiratorio -= Math.random() * (1 - 90);
                    sistemaCircolatorio -= Math.random() * (1 - 60);
                }
        }
        else {
            labelPoint.setVisible(false);
            labelRisorse.setVisible(false);
            labelCircolatorio.setVisible(false);
            labelLifeState.setVisible(false);
            labelImmunitario.setVisible(false);
            labelNervoso.setVisible(false);
            labelRespiratorio.setVisible(false);
            labellScheletrico.setVisible(false);
            barAveregeLife.setVisible(false);
            barCircolatorio.setVisible(false);
            barScheletrico.setVisible(false);
            barAveregeLife.setVisible(false);
            barImmunitario.setVisible(false);
            barRespiratorio.setVisible(false);
            barNervoso.setVisible(false);
            buttonAnalgesici.setVisible(false);
            buttonCorticosteroidi.setVisible(false);
            buttonImmunostimolanti.setVisible(false);
            buttonTAC.setVisible(false);
            buttonNextRound.setVisible(false);
            buttonOssigeno.setVisible(false);
            buttonVaccino.setVisible(false);
            buttonGameInserisci.setVisible(false);
            labelGuide.setVisible(false);
            fieldName.setVisible(false);
            labelVinto.setText("Hai perso! Riprova");
            labelVinto.setStyle( "-fx-text-fill: red");
            labelVinto.setVisible(true);

        }

    }

    public void stateButtonUpgrade (){

        if  (point < 3){ //niente
            buttonAnalgesici.setDisable(true);
            buttonCorticosteroidi.setDisable(true);
            buttonImmunostimolanti.setDisable(true);
            buttonTAC.setDisable(true);
            buttonOssigeno.setDisable(true);
            buttonVaccino.setDisable(true);
        }
        else if (point >= 3 && point < 5){ //analgesici
            buttonAnalgesici.setDisable(false);
            buttonCorticosteroidi.setDisable(true);
            buttonImmunostimolanti.setDisable(true);
            buttonTAC.setDisable(true);
            buttonOssigeno.setDisable(true);
            buttonVaccino.setDisable(true);

        }
        else if (point >=5 && point <8){ //analgesici e corticosteroidi
            buttonAnalgesici.setDisable(false);
            buttonCorticosteroidi.setDisable(false);
            buttonImmunostimolanti.setDisable(true);
            buttonTAC.setDisable(true);
            buttonOssigeno.setDisable(true);
            buttonVaccino.setDisable(true);

        }
        else if (point >=8 && point <10){ //analgesici, corticosteroidi e farmaci Immunostimolanti
            buttonAnalgesici.setDisable(false);
            buttonCorticosteroidi.setDisable(false);
            buttonImmunostimolanti.setDisable(false);
            buttonTAC.setDisable(true);
            buttonOssigeno.setDisable(true);
            buttonVaccino.setDisable(true);

        }
        else if (point >=10 && point <15){ //analgesici, corticosteroidi, farmaci Immunostimolanti e  TAC
            buttonAnalgesici.setDisable(false);
            buttonCorticosteroidi.setDisable(false);
            buttonImmunostimolanti.setDisable(false);
            buttonTAC.setDisable(false);
            buttonOssigeno.setDisable(true);
            buttonVaccino.setDisable(true);

        }
        else if (point >=15 && point <50){ //analgesici, corticosteroidi, farmaci Immunostimolanti, TAC, ossigeno
            buttonAnalgesici.setDisable(false);
            buttonCorticosteroidi.setDisable(false);
            buttonImmunostimolanti.setDisable(false);
            buttonTAC.setDisable(false);
            buttonOssigeno.setDisable(false);
            buttonVaccino.setDisable(true);

        }
        else { //tutto
            buttonAnalgesici.setDisable(false);
            buttonCorticosteroidi.setDisable(false);
            buttonImmunostimolanti.setDisable(false);
            buttonTAC.setDisable(false);
            buttonOssigeno.setDisable(false);
            buttonVaccino.setDisable(false);
        }
    }

    public void actionNextRound(ActionEvent actionEvent) {
        point += Math.random()*(1 - 10);
        labelPoint.setText(String.valueOf((point)));
        stateButtonUpgrade();
    }

    public void actionAnalgesici(ActionEvent actionEvent) {
       stateButtonUpgrade();
       point -= 3;
       labelPoint.setText(String.valueOf((point)));
    }


    public void actionImmunostimolanti(ActionEvent actionEvent) {
        stateButtonUpgrade();
        point -= 8;
        labelPoint.setText(String.valueOf((point)));
    }

    public void actionCorticosteroidi(ActionEvent actionEvent) {
        stateButtonUpgrade();
        point -= 5;
        labelPoint.setText(String.valueOf((point)));
    }

    public void actionVaccino(ActionEvent actionEvent) {
        labelPoint.setVisible(false);
        labelRisorse.setVisible(false);
        labelCircolatorio.setVisible(false);
        labelLifeState.setVisible(false);
        labelImmunitario.setVisible(false);
        labelNervoso.setVisible(false);
        labelRespiratorio.setVisible(false);
        labellScheletrico.setVisible(false);
        barAveregeLife.setVisible(false);
        barCircolatorio.setVisible(false);
        barScheletrico.setVisible(false);
        barAveregeLife.setVisible(false);
        barImmunitario.setVisible(false);
        barRespiratorio.setVisible(false);
        barNervoso.setVisible(false);
        buttonAnalgesici.setVisible(false);
        buttonCorticosteroidi.setVisible(false);
        buttonImmunostimolanti.setVisible(false);
        buttonTAC.setVisible(false);
        buttonNextRound.setVisible(false);
        buttonOssigeno.setVisible(false);
        buttonVaccino.setVisible(false);
        buttonGameInserisci.setVisible(false);
        labelGuide.setVisible(false);
        fieldName.setVisible(false);
        labelVinto.setVisible(true);



    }

    public void actionOssigeno(ActionEvent actionEvent) {
        stateButtonUpgrade();
        point -= 15;
        labelPoint.setText(String.valueOf((point)));
    }

    public void actionTAC(ActionEvent actionEvent) {
        stateButtonUpgrade();
        point -= 10;
        labelPoint.setText(String.valueOf((point)));
    }

    public void actionInserisci(ActionEvent actionEvent) {
        labelName.setText(fieldName.getText().trim());
        labelPoint.setVisible(true);
        labelRisorse.setVisible(true);
        labelCircolatorio.setVisible(true);
        labelLifeState.setVisible(true);
        labelImmunitario.setVisible(true);
        labelNervoso.setVisible(true);
        labelRespiratorio.setVisible(true);
        labellScheletrico.setVisible(true);
        barAveregeLife.setVisible(true);
        barCircolatorio.setVisible(true);
        barScheletrico.setVisible(true);
        barAveregeLife.setVisible(true);
        barImmunitario.setVisible(true);
        barRespiratorio.setVisible(true);
        barNervoso.setVisible(true);
        buttonAnalgesici.setVisible(true);
        buttonCorticosteroidi.setVisible(true);
        buttonImmunostimolanti.setVisible(true);
        buttonTAC.setVisible(true);
        buttonNextRound.setVisible(true);
        buttonOssigeno.setVisible(true);
        buttonVaccino.setVisible(true);
        buttonGameInserisci.setVisible(false);
        labelGuide.setVisible(false);
        fieldName.setVisible(false);
        barRespiratorio.setProgress(1);
        barNervoso.setProgress(1);
        barImmunitario.setProgress(1);
        barAveregeLife.setProgress(1);
        barScheletrico.setProgress(1);
        barCircolatorio.setProgress(1);
        buttonAnalgesici.setDisable(true);
        buttonCorticosteroidi.setDisable(true);
        buttonImmunostimolanti.setDisable(true);
        buttonTAC.setDisable(true);
        buttonOssigeno.setDisable(true);
        buttonVaccino.setDisable(true);

    }




    /*@FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }*/
}