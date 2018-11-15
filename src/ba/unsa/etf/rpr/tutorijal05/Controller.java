package ba.unsa.etf.rpr.tutorijal05;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;



import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {


    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button zero;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button equals;
    @FXML
    private Button mod;
    @FXML
    private Button mul;
    @FXML
    private Button div;
    @FXML
    private Label calField;
    Float data;
    int operation = -1;

    public void pressBtn(ActionEvent actionEvent) {
        if (actionEvent.getSource() == one)  calField.setText(calField.getText()+"1");
        if (actionEvent.getSource() == two) calField.setText(calField.getText() + "2");
        if (actionEvent.getSource() == three) calField.setText(calField.getText() + "3");
        if (actionEvent.getSource() == four) calField.setText(calField.getText() + "4");
        if (actionEvent.getSource() == five) calField.setText(calField.getText() + "5");
        if (actionEvent.getSource() == six) calField.setText(calField.getText() + "6");
        if (actionEvent.getSource() == seven) calField.setText(calField.getText() + "7");
        if (actionEvent.getSource() == eight) calField.setText(calField.getText() + "8");
        if (actionEvent.getSource() == nine) calField.setText(calField.getText() + "9");
        if (actionEvent.getSource() == zero) calField.setText(calField.getText() + "0");

        if (actionEvent.getSource() == plus) {
            data = Float.parseFloat(calField.getText());
            operation = 1;
            calField.setText("");

        }

        if (actionEvent.getSource() == minus) {
            data = Float.parseFloat(calField.getText());
            operation = 2;
            calField.setText("");

        }

        if (actionEvent.getSource() == div) {
            data = Float.parseFloat(calField.getText());
            operation = 3;
            calField.setText("");

        }

        if (actionEvent.getSource() == mul) {
            data = Float.parseFloat(calField.getText());
            operation = 4;
            calField.setText("");

        }

        if (actionEvent.getSource() == mod) {
            data = Float.parseFloat(calField.getText());
            operation = 5;
            calField.setText("");

        }

        if (actionEvent.getSource() == equals) {
            Float secondOperand = Float.parseFloat(calField.getText());

            switch (operation) {
                case 1:
                    Float ans = data + secondOperand;
                    calField.setText(String.valueOf(ans));
                    break;
                case 2:
                    ans = data - secondOperand;
                    calField.setText(String.valueOf(ans));
                    break;
                case 3:
                    ans = data * secondOperand;
                    calField.setText(String.valueOf(ans));
                    break;
                case 4:
                    ans = data / secondOperand;
                    calField.setText(String.valueOf(ans));
                    break;
                case 5:
                    ans = data % secondOperand;
                    calField.setText(String.valueOf(ans));
                    break;
            }

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //
    }

}






