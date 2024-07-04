package com.gmail.slobodiyan.task13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GeometricalArea> shapes = initializeShapes();

        double totalArea = calculateTotalArea(shapes);

        System.out.println("Загальна площа всіх фігур: " + totalArea);
    }

    public static List<GeometricalArea> initializeShapes() {
        List<GeometricalArea> shapes = new ArrayList<>();
        shapes.add(new Circle(2.3));
        shapes.add(new Square(5.1));
        shapes.add(new Triangle(4.2, 5.7));
        return shapes;
    }

    public static double calculateTotalArea(List<GeometricalArea> shapes) {
        double totalArea = 0;
        for (GeometricalArea shape : shapes) {
            totalArea += shape.squareCalculation();
        }
        return totalArea;
    }
}
