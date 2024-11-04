package com.example.task1;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    private Canvas canvas;

    private ColorPicker colorPicker = new ColorPicker(Color.BLACK);
    @FXML
    private void drawRectangle() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Rectangle rectangle = new Rectangle(colorPicker.getValue(), 50, 50, 100, 50);
        rectangle.draw(gc);
    }
    @FXML
    private void drawCircle() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Circle circle = new Circle(colorPicker.getValue(), 150, 150, 50);
        circle.draw(gc);
        System.out.println(circle.toString());
    }

    @FXML
    private void drawTriangle() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Triangle triangle = new Triangle(colorPicker.getValue(), 150, 150, 60);
        triangle.draw(gc);
        System.out.println(triangle.toString());
    }

    @FXML
    private void drawHexagon() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Hexagon hexagon = new Hexagon(colorPicker.getValue(), 150, 150, 40);
        hexagon.draw(gc);
        System.out.println(hexagon.toString());
    }
}