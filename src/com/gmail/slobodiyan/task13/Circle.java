package com.gmail.slobodiyan.task13;

public class Circle implements GeometricalArea {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double squareCalculation() {
        return Math.PI * radius * radius;
    }
}
