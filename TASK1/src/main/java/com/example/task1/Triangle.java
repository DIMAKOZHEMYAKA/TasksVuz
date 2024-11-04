package com.example.task1;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Triangle extends Shape {
    private double sideLength;

    public Triangle(Color color, double x, double y, double sideLength) {
        super(color, x, y);
        this.sideLength = sideLength;
    }

    @Override
    double area() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }

    @Override
    void draw(GraphicsContext gc) {
        gc.setStroke(color);
        double height = (Math.sqrt(3) / 2) * sideLength;
        double[] xPoints = {x, x - sideLength / 2, x + sideLength / 2};
        double[] yPoints = {y, y + height, y + height};
        gc.strokePolygon(xPoints, yPoints, 3);
    }


}