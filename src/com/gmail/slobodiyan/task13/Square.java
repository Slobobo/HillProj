package com.gmail.slobodiyan.task13;

public class Square implements GeometricalArea {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double squareCalculation() {
        return side * side;
    }
}
