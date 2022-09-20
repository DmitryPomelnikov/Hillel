package test.homework11.rectangle;

public class Rectangle {
    private double side1;
    private double side2;

    double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    double perimeterCalculator(double side1, double side2) {
        return (side1 + side2) * 2;
    }
}

