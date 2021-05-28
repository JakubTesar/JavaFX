package cz.educanet.gui;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {
    String variables[] = {"+", "-", "*", "/"};


    @FXML
    public javafx.scene.control.Button btnSolve;
    public TextField input1;
    public TextField input2;
    public ComboBox comboBoy; //     = ((ComboBox) FXCollections.observableArrayList(variables));


    public void onClickSolve(ActionEvent actionEvent) {
        int one = Integer.parseInt(input1.getText());
        int two = Integer.parseInt(input2.getText());

    }

    public void getInput1(ActionEvent actionEvent) {
        input1.getText();
        System.out.println();
    }

    public void getInput2(ActionEvent actionEvent) {

    }

    public void onComboBoxClick(ActionEvent actionEvent) {
        ComboBox combo_box =
                new ComboBox(FXCollections
                        .observableArrayList(variables));

    }
}
