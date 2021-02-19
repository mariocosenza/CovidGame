package com.gameCovid;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.effect.ColorAdjust;


public class SecondaryController {
    @FXML
    public Label labelGuide;
    @FXML
    private ColorAdjust effectBar;
    @FXML
    private Label labelRisorse;
    @FXML
    public ProgressBar barAverageLife;
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
    public ProgressBar barNervoso;
    @FXML
    public ProgressBar barCircolatorio;
    @FXML
    public ProgressBar barRespiratorio;
    @FXML
    private Button buttonTAC;
    @FXML
    public ProgressBar barScheletrico;
    @FXML
    public ProgressBar barImmunitario;
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


    
    public double average(){
        averageLife = (sistemaNervoso + sistemaRespiratorio + sistemaScheletrico + sistemaImmunitario + sistemaCircolatorio) / 5;
        return averageLife;
    }

    public void numRandom (int maxNervoso, int maxScheletrico, int maxImmunitario, int maxRespiratorio, int maxCircolatorio) {
       switch ((int)(Math.random() * 5)){
           case 1:
                   if ((int) (Math.random() * 4) == 0){
                       sistemaNervoso -= Math.random() * maxNervoso;
                   }
                   else if ((int) (Math.random()*4) == 1){
                       sistemaScheletrico -= Math.random() * maxScheletrico;
                   }
                   else if ((int) (Math.random()*4) == 2){
                       sistemaImmunitario -= Math.random() * maxImmunitario;
                   }
                   else if ((int) (Math.random()*4) == 3){
                       sistemaRespiratorio -= Math.random() * maxRespiratorio;
                   }
                   else  {
                       sistemaCircolatorio -= Math.random() * maxCircolatorio;
                   }
                   break;
           case 2:
                   if ((int) (Math.random()*4) == 0){
                       sistemaNervoso     -= Math.random() * maxNervoso;
                       sistemaScheletrico -= Math.random() * maxScheletrico;
                   }
                   else if ((int) (Math.random()*4) == 1){
                       sistemaImmunitario  -= Math.random() * maxImmunitario;
                       sistemaRespiratorio -= Math.random() * maxRespiratorio;
                   }
                   else if ((int) (Math.random()*4) == 2){
                       sistemaCircolatorio -= Math.random() * maxCircolatorio;
                       sistemaRespiratorio -= Math.random() * maxRespiratorio;
                   }
                   else if ((int) (Math.random()*4) == 3){
                       sistemaImmunitario  -= Math.random() * maxImmunitario;
                       sistemaScheletrico  -= Math.random() * maxScheletrico;
                   }
                   else  {
                       sistemaNervoso      -= Math.random() * maxNervoso;
                       sistemaCircolatorio -= Math.random() * maxCircolatorio;
                   }
               break;

           case 3:
                   if ((int) (Math.random()*4) == 0){
                       sistemaNervoso      -= Math.random() * maxNervoso;
                       sistemaScheletrico  -= Math.random() * maxScheletrico;
                       sistemaImmunitario  -= Math.random() * maxImmunitario;
                   }
                   else if ((int) (Math.random()*4) == 1){
                       sistemaImmunitario  -= Math.random() * maxImmunitario;
                       sistemaRespiratorio -= Math.random() * maxRespiratorio;
                       sistemaCircolatorio -= Math.random() * maxCircolatorio;
                   }
                   else if ((int) (Math.random()*4) == 2){
                       sistemaScheletrico  -= Math.random() * maxScheletrico;
                       sistemaRespiratorio -= Math.random() * maxRespiratorio;
                       sistemaImmunitario  -= Math.random() * maxImmunitario;
                   }
                   else if ((int) (Math.random()*4) == 3){
                       sistemaImmunitario  -= Math.random() * maxImmunitario;
                       sistemaScheletrico  -= Math.random() * maxScheletrico;
                       sistemaNervoso      -= Math.random() * maxNervoso;
                   }
                   else  {
                       sistemaNervoso      -= Math.random() *  maxNervoso;
                       sistemaCircolatorio -= Math.random() *  maxCircolatorio;
                       sistemaScheletrico  -= Math.random() *  maxScheletrico;
                   }
               break;

           case 4:
                   if ((int) (Math.random()*1) == 0){
                       sistemaNervoso      -= Math.random() * maxNervoso;
                       sistemaScheletrico  -= Math.random() * maxScheletrico;
                       sistemaImmunitario  -= Math.random() * maxImmunitario;
                       sistemaCircolatorio -= Math.random() * maxCircolatorio;
                   }
                   else  {
                       sistemaNervoso      -= Math.random() * maxNervoso;
                       sistemaCircolatorio -= Math.random() * maxCircolatorio;
                       sistemaScheletrico  -= Math.random() * maxScheletrico;
                       sistemaRespiratorio -= Math.random() * maxRespiratorio;
                   }
                   break;
    
               case 5:
                   sistemaNervoso      -= Math.random() * maxNervoso;
                   sistemaCircolatorio -= Math.random() *  maxCircolatorio;
                   sistemaScheletrico  -= Math.random() *  maxScheletrico;
                   sistemaImmunitario  -= Math.random() * maxImmunitario;
                   sistemaRespiratorio -= Math.random() * maxRespiratorio;
               break;
           case 0:
           default:
               break;

       }

    }

    public void randomSistemi(){  //da modificare i valori
        if ( average () > 8 ) {
                if (averageLife > 80 && averageLife <= 100) {
                  numRandom(15, 15, 20,20,20);
                  barCircolatorio.setProgress(sistemaCircolatorio/100);
                  barScheletrico.setProgress(sistemaScheletrico/100);
                  barRespiratorio.setProgress(sistemaRespiratorio/100);
                  barNervoso.setProgress(sistemaNervoso/100);
                  barImmunitario.setProgress(sistemaImmunitario/100);
                }
                else if (averageLife > 50 && averageLife <= 80) {
                    numRandom(15, 20, 20,25,20);
                    barCircolatorio.setProgress(sistemaCircolatorio/100);
                    barScheletrico.setProgress(sistemaScheletrico/100);
                    barRespiratorio.setProgress(sistemaRespiratorio/100);
                    barNervoso.setProgress(sistemaNervoso/100);
                    barImmunitario.setProgress(sistemaImmunitario/100);
                }
                else if (averageLife > 30 && averageLife <= 50) {
                    numRandom(10, 15, 10,10,10);
                    barCircolatorio.setProgress(sistemaCircolatorio/100);
                    barScheletrico.setProgress(sistemaScheletrico/100);
                    barRespiratorio.setProgress(sistemaRespiratorio/100);
                    barNervoso.setProgress(sistemaNervoso/100);
                    barImmunitario.setProgress(sistemaImmunitario/100);
                }
                else if (averageLife > 10 && averageLife <= 30) {
                    numRandom(5, 10, 15,15,10);
                    barCircolatorio.setProgress(sistemaCircolatorio/100);
                    barScheletrico.setProgress(sistemaScheletrico/100);
                    barRespiratorio.setProgress(sistemaRespiratorio/100);
                    barNervoso.setProgress(sistemaNervoso/100);
                    barImmunitario.setProgress(sistemaImmunitario/100);
                }
                else  {
                    numRandom(5, 10, 10,15,15);
                    barCircolatorio.setProgress(sistemaCircolatorio/100);
                    barScheletrico.setProgress(sistemaScheletrico/100);
                    barRespiratorio.setProgress(sistemaRespiratorio/100);
                    barNervoso.setProgress(sistemaNervoso/100);
                    barImmunitario.setProgress(sistemaImmunitario/100);
                }
        }
        else {
            labelName.setVisible(false);
            labelPoint.setVisible(false);
            labelRisorse.setVisible(false);
            labelCircolatorio.setVisible(false);
            labelLifeState.setVisible(false);
            labelImmunitario.setVisible(false);
            labelNervoso.setVisible(false);
            labelRespiratorio.setVisible(false);
            labellScheletrico.setVisible(false);
            barAverageLife.setVisible(false);
            barCircolatorio.setVisible(false);
            barScheletrico.setVisible(false);
            barAverageLife.setVisible(false);
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
        else if (point >= 3 && point < 5) { //analgesici
            buttonAnalgesici.setDisable(false);
            buttonCorticosteroidi.setDisable(true);
            buttonImmunostimolanti.setDisable(true);
            buttonTAC.setDisable(true);
            buttonOssigeno.setDisable(true);
            buttonVaccino.setDisable(true);
        }

        else if (point >=5 && point <8) { //analgesici e corticosteroidi
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
        randomSistemi();
        point += Math.random()*6;
        labelPoint.setText(String.valueOf((point)));
        stateButtonUpgrade();
        barAverageLife.setProgress(average()/100);
    }

    public void actionAnalgesici(ActionEvent actionEvent) {
       point -= 3;
       labelPoint.setText(String.valueOf((point)));
       stateButtonUpgrade();
      sistemaNervoso = sumMaxLife(sistemaNervoso , 5);
      sistemaScheletrico = sumMaxLife(sistemaScheletrico , 5);
      barNervoso.setProgress(sistemaNervoso/100);
      barScheletrico.setProgress(sistemaScheletrico/100);
      barAverageLife.setProgress(average()/100);
    }


    public void actionImmunostimolanti(ActionEvent action) {
        point -= 8;
        labelPoint.setText(String.valueOf((point)));
        stateButtonUpgrade();
        sistemaImmunitario = sumMaxLife(sistemaImmunitario, 15);
        barImmunitario.setProgress(sistemaImmunitario/100);
        barAverageLife.setProgress(average()/100);
    }
//
    public void actionCorticosteroidi(ActionEvent actionEvent) {
        point -= 5;
        labelPoint.setText(String.valueOf((point)));
        stateButtonUpgrade();
        sistemaCircolatorio = sumMaxLife(sistemaCircolatorio, 7);
        barCircolatorio.setProgress(sistemaCircolatorio/100);
        sistemaRespiratorio = sumMaxLife(sistemaRespiratorio, 7);
        barRespiratorio.setProgress(sistemaRespiratorio/100);
        barAverageLife.setProgress(average()/100);
    }

    public void actionOssigeno(ActionEvent actionEvent) {
        point -= 15;
        labelPoint.setText(String.valueOf((point)));
        stateButtonUpgrade();
        sistemaRespiratorio = sumMaxLife(sistemaRespiratorio, 15);
        barRespiratorio.setProgress(sistemaRespiratorio/100);
        sistemaCircolatorio = sumMaxLife(sistemaCircolatorio, 10);
        barCircolatorio.setProgress(sistemaCircolatorio/100);
        barAverageLife.setProgress(average()/100);
    }

    public void actionTAC(ActionEvent actionEvent) {
        point -= 10;
        labelPoint.setText(String.valueOf((point)));
        stateButtonUpgrade();
        sistemaRespiratorio = sumMaxLife(sistemaRespiratorio, 15);
        barRespiratorio.setProgress(sistemaRespiratorio/100);
        barAverageLife.setProgress(average()/100);
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
        barAverageLife.setVisible(false);
        barCircolatorio.setVisible(false);
        barScheletrico.setVisible(false);
        barAverageLife.setVisible(false);
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
        labelName.setVisible(false);
        labelNick.setVisible(false);
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
        barAverageLife.setVisible(true);
        barCircolatorio.setVisible(true);
        barScheletrico.setVisible(true);
        barAverageLife.setVisible(true);
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
        barAverageLife.setProgress(1);
        barScheletrico.setProgress(1);
        barCircolatorio.setProgress(1);
        buttonAnalgesici.setDisable(true);
        buttonCorticosteroidi.setDisable(true);
        buttonImmunostimolanti.setDisable(true);
        buttonTAC.setDisable(true);
        buttonOssigeno.setDisable(true);
        buttonVaccino.setDisable(true);
    }

    public double sumMaxLife (double sistema, double sum) {
        if (sistema+sum >= 100) {
            sistema = 100;
        }
        else {
            sistema += sum;
        }
        return sistema;
    }



    /*@FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }*/
}