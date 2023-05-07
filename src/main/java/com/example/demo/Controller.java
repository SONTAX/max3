package com.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private Label result;

    @FXML
    private ImageView img;

    @FXML
    private Slider slider;

    @FXML
    private ProgressBar pb;

    @FXML
    private CheckBox chb;
    @FXML
    private RadioButton rb1;
    @FXML
    private RadioButton rb2;


    private double calculate(int x) {
        return x * Math.sin(Math.sqrt(x));
    }

    @FXML
    protected void onButtonClick() {
        if (chb.isSelected()) {
            if (rb1.isSelected()) {
                result.setText(String.valueOf(slider.getValue() * (calculate(2) + calculate(9) + calculate(13))));
            } else if (rb2.isSelected()) {
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("Результат = " + slider.getValue() * ((calculate(2) + calculate(9) + calculate(13))));
                a.show();
            }
        }
    }

    @FXML
    protected void initialize() {
        img.setImage(new Image("D:\\IdeaProjects\\demo\\x.png"));
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            pb.setProgress(slider.getValue() / 100);
        });
        slider.setValue(1);
    }
}