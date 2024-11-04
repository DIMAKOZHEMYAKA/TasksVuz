package com.example.task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Hexagon extends Shape {
    private double sideLength;

    public Hexagon(Color color, double x, double y, double sideLength) {
        super(color, x, y);
        this.sideLength = sideLength;
    }

    @Override
    double area() {
        return ((3 * Math.sqrt(3)) / 2) * sideLength * sideLength;
    }

    @Override
    void draw(GraphicsContext gc) {
        gc.setStroke(color);
        double angle = Math.PI / 3;
        double[] xPoints = new double[6];
        double[] yPoints = new double[6];

        for (int i = 0; i < 6; i++) {
            xPoints[i] = x + sideLength * Math.cos(i * angle);
            yPoints[i] = y + sideLength * Math.sin(i * angle);
        }

        gc.strokePolygon(xPoints, yPoints, 6);
    }


}