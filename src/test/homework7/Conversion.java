package test.homework7;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму денег");
        double money = scanner.nextDouble();
        System.out.println("Введите курс для конвертации");
        double exchange = scanner.nextDouble();
        currency(money, exchange);
        scanner.close();
    }

    private static void currency(double money, double exchange) {
        System.out.printf("Total = %.2f", money * exchange);
    }
}
