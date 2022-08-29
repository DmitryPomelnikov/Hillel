package test.homework7;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int inputValue = scanner.nextInt();
        System.out.println(positiveNegative(inputValue) + "\n" + primeComposite(inputValue) + "\n" + division(inputValue));
        scanner.close();
    }

    private static String positiveNegative(int value) {
        return value > 0 ? value + " - положительно число" : value < 0 ? value + " - негативное число" : value + " является нулём";
    }

    private static String primeComposite(int value) {
        int counter = 0;
        if (value <= 0) {
            return value + " не является натуральным числом";
        } else {
            for (int i = 1; i < value; i++) {
                if (value % i == 0) {
                    counter++;
                }
            }
        }
        return counter > 1 ? value + " является составным числом" : value + " является простым числом";
    }

    private static StringBuilder division(int value) {
        StringBuilder result = new StringBuilder(value + " без остатка делится на ");
        StringBuilder negativeResult = new StringBuilder("Ни на одно из чисел 2, 5, 3, 6, 9 число - " + value + " не делится");
        StringBuilder resultForNull = new StringBuilder(value + " - некорректно 0 делить на какие-то числа");
        int counter = 0;
        int[] array = {2, 3, 5, 6, 9};
        if (value == 0) {
            return resultForNull;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (value % array[i] == 0) {
                    result.append(array[i] + ", ");
                    counter++;
                }
            }
        }
        result.setLength(result.length() - 2);
        return counter > 0 ? result : negativeResult;
    }
}
