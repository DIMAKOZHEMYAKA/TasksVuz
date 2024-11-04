package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller {
    @FXML
    private RadioButton radio1;
    @FXML
    private RadioButton radio2;
    @FXML
    private RadioButton radio3;
    @FXML
    private RadioButton radio4;
    @FXML
    void initialize() {
        ToggleGroup tg = new ToggleGroup();
        radio1.setToggleGroup(tg);
        radio2.setToggleGroup(tg);
        radio3.setToggleGroup(tg);
        radio4.setToggleGroup(tg);

    }
    @FXML
    private Label label1;
    @FXML
    private TextField sum;
    @FXML
    public int k = 0;
    @FXML
    protected void on1() {
        k = 15;
    }
    @FXML
    protected void on2() {
        k = 10;
    }
    @FXML
    protected void on3() {
        k = 9;
    }
    @FXML
    protected void on4() {
        k = 3;
    }
    @FXML
    protected void calculate(){
        Percent x = new Percent();
        x.setSum(Float.parseFloat(sum.getText()));
        if (k == 0){
            label1.setText("Error. Choose percents");
        } else {
            label1.setText(Float.toString(x.countSum(k)));
        }

    }




}