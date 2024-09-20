package com.example.lb2_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.util.Objects;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Canvas canvas;

    @FXML
    private Button draw;


    @FXML
    private TextField textField;


    @FXML
    private ColorPicker colorPicker;

    @FXML
    protected void onHelloButtonClick() {

        GraphicsContext gc = canvas.getGraphicsContext2D();
        Color color = colorPicker.getValue();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        String command = textField.getText();
        if (Objects.equals(command, "Линия")) {
            Line line = new Line(10, 100, color);
            line.draw(gc);
        }
        if(Objects.equals(command, "Квадрат")) {
            Rectangle rectangle = new Rectangle(100,200,color);
            rectangle.draw(gc);
        }
        if(Objects.equals(command, "Треугольник")) {
            Triangle triangle = new Triangle(color);
            triangle.draw(gc);
        }
        if(Objects.equals(command, "Круг")) {
            Circle circle = new Circle(color);
            circle.draw(gc);
        }
        else
            System.out.println("Error!");
    }

}