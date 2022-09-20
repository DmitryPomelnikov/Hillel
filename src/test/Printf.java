package test;

import java.util.Scanner;

public class Printf {
    static int lessons;
    static double homework;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Назовите своё имя");
        String name = scanner.nextLine();
        System.out.println("Сколько занятий по java уже прошло?");
        while (true) {
            try {
                lessons = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Введите числовое значение");
                scanner.next();
                continue;
            }
            if (lessons < 0) {
                System.out.println("Отрицательное количество уроков, это как? Введите актуальные данные");
            } else if (lessons > 16) {
                System.out.println("Курс расчитан на 16 занятий. Введите актуальные данные");
            } else break;
        }
        System.out.println("Сколько домашек вы сделали?");
        while (true) {
            try {
                homework = scanner.nextDouble();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Ещё одна попытка :)");
                scanner.next();
                continue;
            }
            int intHomework = (int) homework;
            if (lessons < intHomework) {
                System.out.println("Не забегайте вперёд, сделали домашек больше, чем задавали? Скажите правду :)");
            } else if (intHomework < 0) {
                System.out.println("Отрицательное количество домашек, это как? Введите актуальные данные");
            } else break;
        }
        int leftLessonsInteger = 16 - lessons;
        double leftHomeworkPercent = (homework * 100) / (double) lessons;

        if (lessons == 0) {
            System.out.printf("Здравствуйте, %1$s. Вы отметили, что занятий еще не было, а значит до встречи", name);
        } else if (lessons == (int) homework) {
            System.out.printf("Здравствуйте, %1$s. Количество прошедших уроков - %2$d, а значит осталось - %3$d. Вы выполнили все домашние задания, так держать!", name, lessons, leftLessonsInteger);
        } else if (homework == 0) {
            System.out.printf("Здравствуйте, %1$s. Количество прошедших уроков - %2$d, а значит осталось - %3$d. Начинайте делать домашние задания", name, lessons, leftLessonsInteger);
        } else {
            System.out.printf("Здравствуйте, %1$s. Количество прошедших уроков - %2$d, а значит осталось - %3$d. Процент выполнения домашних работ - %4$.2f %%", name, lessons, leftLessonsInteger, leftHomeworkPercent);
        }
        scanner.close();
    }
}
