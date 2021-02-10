package com.gameCovid;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;


public class PrimaryController extends Player {

    public TableView<String> TableView;
    public TableColumn tableNome;
    public TableColumn tableGenere;
    public TableColumn tableVita;
    public TableColumn tableEtà;
    @FXML private Label labelEtà;
    @FXML private Button buttonInserisci;
    @FXML private TextField fieldNome;
    @FXML private Button buttonSimula;
    @FXML private RadioButton radioButtonUomo;
    @FXML private ComboBox<String> comboBoxEtà;
    @FXML private RadioButton radioButtonDonna;
    @FXML private ToggleGroup toggleGenere;
    private final Simulazione simula = new Simulazione();

    public void clickInserisci(ActionEvent actionEvent) {
        setNome(fieldNome.getText().trim(), totaleInseriti);
        try {
            switch (comboBoxEtà.getValue()) {
                case "1-17":
                    setEtà(totaleInseriti, 1);
                    break;
                case "18-39":
                    setEtà(totaleInseriti, 2);
                    break;
                case "40-59":
                    setEtà(totaleInseriti, 3);
                    break;
                case "60-79":
                    setEtà(totaleInseriti, 4);
                    break;
                case "80+":
                    setEtà(totaleInseriti, 5);
                    break;
                default:
                    break;
            }
        }
        catch (NullPointerException e)
        {
            /*
            Alert a = new Alert(AlertType.ERROR);
            a.setTitle("Errore");
            a.setHeaderText("Non hai scelto l'età!");
            a.setContentText("Scegliere età!!");
            a.showAndWait();
            */
            labelEtà.setTextFill(Color.web("#FF0000"));
        }

                setGenere(totaleInseriti, toggleGenere.getSelectedToggle()== radioButtonUomo); //vero se uomo falso donnna
    }

    public void clickSimula(ActionEvent actionEvent) {
        simula.randomVita(totaleInseriti);

    }
    public void showResult(){

    }






}
