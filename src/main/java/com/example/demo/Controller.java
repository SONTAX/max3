package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;

public class HelloController {
    @FXML
    private Label result;

    @FXML
    private ImageView img;

    private double calculate(int x) {
        return x * Math.sin(Math.sqrt(x));
    }

    @FXML
    protected void onButtonClick() {
        result.setText(String.valueOf(calculate(2) + calculate(9) + calculate(13)));
    }

    @FXML
    protected void initialize() {
        img.setImage(new Image("D:\\IdeaProjects\\demo\\x.png"));
    }
}