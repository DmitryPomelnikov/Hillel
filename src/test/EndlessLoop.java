package test;

import java.util.ArrayList;
import java.util.Scanner;

public class EndlessLoop {
    static String name;
    static int age;
    static int counter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {
            System.out.println("Введите имя студента (для завершения программы введите - q)");
            name = scanner.nextLine();
            if (name.equals("q")) {
                break;
            }
            names.add(name);
            System.out.println("Введите возраст студента");

            while (true) {
                try {
                    age = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Введите числовое значение");
                    scanner.next();
                    continue;
                }
                if (age < 18) {
                    System.out.println("Маловат как для студента, введите реальный возраст");
                } else {
                    ages.add(age);
                    counter++;
                    scanner.nextLine();
                    break;
                }
            }
        }
        scanner.close();
        for (int i = 0; i < names.size(); i++) {
            int length = 15 - names.get(i).length();
            System.out.printf("%1$s%2$" + length + "d\n", names.get(i), ages.get(i));
        }
    }
}
