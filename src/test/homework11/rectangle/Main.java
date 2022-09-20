package test.homework11.rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        System.out.println("Введите первое число");
        double side1 = scanner.nextDouble();
        System.out.println("Введите второе число");
        double side2 = scanner.nextDouble();
        scanner.close();

        System.out.println("areaCalculator: " + rec.areaCalculator(side1, side2));
        System.out.println("perimeterCalculator: " + rec.perimeterCalculator(side1, side2));
    }
}
