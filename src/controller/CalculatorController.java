/*
Ersteller: Muckenhuber Marcel
Datum: 15.10.2020
Beschreibung: Standard Taschenrechner
 */
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class CalculatorController {

    @FXML // fx:id="ausgabe"
    private TextField ausgabe;

    @FXML
    void handleButtonClear(ActionEvent event) {
        ausgabe.setText("");
    }

    @FXML
    void handleButtonDivide(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("/"));
    }

    @FXML
    void handleButtonEight(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("8"));
    }

    @FXML
    void handleButtonEquals(ActionEvent event) {
        calculate(ausgabe);
    }

    @FXML
    void handleButtonFive(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("5"));
    }

    @FXML
    void handleButtonFour(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("4"));
    }

    @FXML
    void handleButtonMinus(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("-"));
    }

    @FXML
    void handleButtonMultiply(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("*"));
    }

    @FXML
    void handleButtonNine(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("9"));
    }

    @FXML
    void handleButtonOne(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("1"));
    }

    @FXML
    void handleButtonPlus(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("+"));

    }

    @FXML
    void handleButtonSeven(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("7"));
    }

    @FXML
    void handleButtonSix(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("6"));
    }

    @FXML
    void handleButtonThree(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("3"));
    }

    @FXML
    void handleButtonTwo(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("2"));
    }

    @FXML
    void handleButtonZero(ActionEvent event) {
        ausgabe.setText(ausgabe.getText().concat("0"));
    }

    private void calculate(TextField ausgabe) {
        String ausgabeCalc = ausgabe.getText();
        if (ausgabeCalc.contains("+")) {
            double p1 = Double.parseDouble(ausgabeCalc.substring(0, ausgabeCalc.indexOf("+")));
            double p2 = Double.parseDouble(ausgabeCalc.substring(ausgabeCalc.indexOf("+") + 1));
            Double added = p1 + p2;
            ausgabe.setText(added.toString());
        }
        else if (ausgabeCalc.contains("-")) {
            double p1 = Double.parseDouble(ausgabeCalc.substring(0, ausgabeCalc.indexOf("-")));
            double p2 = Double.parseDouble(ausgabeCalc.substring(ausgabeCalc.indexOf("-") + 1));
            Double subtracted = p1 - p2;
            ausgabe.setText(subtracted.toString());
        }
        else if (ausgabeCalc.contains("*")) {
            double p1 = Double.parseDouble(ausgabeCalc.substring(0, ausgabeCalc.indexOf("*")));
            double p2 = Double.parseDouble(ausgabeCalc.substring(ausgabeCalc.indexOf("*") + 1));
            Double multiplied = p1 * p2;
            ausgabe.setText(multiplied.toString());
        }
        else if (ausgabeCalc.contains("/")) {
            double p1 = Double.parseDouble(ausgabeCalc.substring(0, ausgabeCalc.indexOf("/")));
            double p2 = Double.parseDouble(ausgabeCalc.substring(ausgabeCalc.indexOf("/") + 1));
            if(p2 == 0){
                ausgabe.setText("Division durch 0 nicht möglich");
            }
            else {
                Double divided = p1 / p2;
                ausgabe.setText(divided.toString());
            }

        }
    }
}
