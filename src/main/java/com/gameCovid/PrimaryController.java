package com.gameCovid;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;


public class PrimaryController extends Player {


    @FXML private Label labelSimula;
    @FXML private Label labelName;
    @FXML private Label labelGenere;
    @FXML private Pane mainPane;
    @FXML private StackPane stackPane;
    @FXML private Label labelEtà;
    @FXML private TextField fieldNome;
    @FXML private Button buttonSimula;
    @FXML private RadioButton radioButtonUomo;
    @FXML private ComboBox<String> comboBoxEtà;
    @FXML private RadioButton radioButtonDonna;
    @FXML private ToggleGroup toggleGenere;
    private final Simulazione simula = new Simulazione();

    public void clickInserisci() {

        try {
            setEta(comboBoxEtà.getValue());
        }
        catch (NullPointerException e)
        {

            Alert a = new Alert(AlertType.ERROR);
            a.setTitle("Errore");
            a.setHeaderText("Non hai scelto l'età!");
            a.setContentText("Scegliere età!!");
            a.showAndWait();
            labelEtà.setTextFill(Color.web("#FF0000"));
        }

                setGenere(toggleGenere.getSelectedToggle()== radioButtonUomo); //vero se uomo falso donnna
    }

    public void clickSimula() {
        clickInserisci();
        simula.randomVita();
        mainPane.setVisible(false);
        stackPane.setVisible(true);
        labelSimula.setText("Simulazione: " + getNome()+ " è " + isGenere());


    }
    public void showResult(){

    }

//05/03/2021

}
