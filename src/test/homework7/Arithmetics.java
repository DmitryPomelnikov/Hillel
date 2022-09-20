package test.homework7;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstScanner = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondScanner = scanner.nextInt();
        System.out.println("Введите знак арифметической операции");
        char operation = scanner.next().charAt(0);
        calculatorMethod(firstScanner, secondScanner, operation);
        scanner.close();
    }

    private static int add(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    private static int sub(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    private static int mul(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    private static String div(int firstValue, int secondValue) {
        try {
            double exceptionDiv = (double) firstValue / secondValue;
        } catch (Exception e) {
            return "На ноль делить нельзя";
        }
        double anotherDiv = (double) firstValue / secondValue;
        return String.valueOf(anotherDiv);
    }

    private static void calculatorMethod(int firstValue, int secondValue, char operation) {
        if (secondValue == 0 && operation == '/') {
            System.out.println("На ноль делить нельзя");
        } else {
            switch (operation) {
                case '+':
                    System.out.println(firstValue + " + " + secondValue + " = " + add(firstValue, secondValue));
                    break;
                case '-':
                    System.out.println(firstValue + " - " + secondValue + " = " + sub(firstValue, secondValue));
                    break;
                case '*':
                    System.out.println(firstValue + " * " + secondValue + " = " + mul(firstValue, secondValue));
                    break;
                case '/':
                    String rule = firstValue % secondValue == 0 ? "%.0f" : "%.2f";
                    System.out.printf(firstValue + " / " + secondValue + " = " + rule, Double.parseDouble(div(firstValue, secondValue)));
                    break;
                default:
                    System.out.println("Вы ввели некорректный знак арифметической операции");
            }
        }
    }
}
