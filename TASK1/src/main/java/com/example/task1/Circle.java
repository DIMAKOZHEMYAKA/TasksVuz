package com.example.task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Circle extends Shape {
    private double radius;

    public Circle(Color color, double x, double y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void draw(GraphicsContext gc) {
        gc.setStroke(color);
        gc.strokeOval(x - radius, y - radius, radius * 2, radius * 2);
    }

}