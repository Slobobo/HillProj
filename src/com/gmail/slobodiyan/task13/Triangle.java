package com.gmail.slobodiyan.task13;

public class Triangle implements GeometricalArea {

    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double squareCalculation() {
        return height * base * 0.5;
    }
}
