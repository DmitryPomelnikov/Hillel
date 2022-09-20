package test.homework7;


public class Calculator {
    public static void main(String[] args) {
        calculate(4, 5, 10);
    }

    private static double calculate(int firstValue, int secondValue, int thirdValue) {
        double average = (double) (firstValue + secondValue + thirdValue) / 3;
        System.out.printf("Среднеарифмеческое значение аргументов " + firstValue + ", " + secondValue + ", " + secondValue + " = " + "%.2f\n", average);
        return average;
    }
}
