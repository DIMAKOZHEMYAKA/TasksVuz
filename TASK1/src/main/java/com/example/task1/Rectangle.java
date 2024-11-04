package com.example.task1;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(Color color, double x, double y, double width, double height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    void draw(GraphicsContext gc) {
        gc.setStroke(color);
        gc.strokeRect(x, y, width, height);
    }
}