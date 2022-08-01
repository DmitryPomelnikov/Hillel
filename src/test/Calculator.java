package test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
//чем отличается метод nextLine() от метода next()
//nextLine() - читает всю строку, до нажатия enter
//next() - заканчивается, когда читает пустой символ (например, пробел, возврат каретки, табуляция и т. Д.)
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        double firstValue = scanner.nextDouble();
        System.out.println("Введите второе число");
        double secondValue = scanner.nextDouble();

        String formatFirstValue = formatValue(firstValue);
        String formatSecondValue = formatValue(secondValue);
        String sum = formatValue(firstValue + secondValue);
        String minus = formatValue(firstValue - secondValue);
        String multiply = formatValue(firstValue * secondValue);
        String divide = formatValue(firstValue / secondValue);

        System.out.println("Какую операцию вы хотите произвести над введёнными цифрами, введите число, где \n 1. Сложение \n 2. Вычитание \n 3. Умножение \n 4. Деление \n 5. Показать все результаты");

        while (true) {
            int operation = scanner.nextInt();
            if (operation > 5 || operation < 1) {
                System.out.println("Пожалуйста, введите число от 1 до 5");
                continue;
            }
            String zero = (secondValue != 0) ? formatFirstValue + "/" + formatSecondValue + "=" + divide : "На ноль делить нельзя";
            switch (operation) {
                case 1:
                    System.out.println(formatFirstValue + "+" + formatSecondValue + "=" + sum);
                    break;
                case 2:
                    System.out.println(formatFirstValue + "-" + formatSecondValue + "=" + minus);
                    break;
                case 3:
                    System.out.println(formatFirstValue + "*" + formatSecondValue + "=" + multiply);
                    break;
                case 4:
                    System.out.println(zero);
                    break;
                default:
                    System.out.println(formatFirstValue + "+" + formatSecondValue + "=" + sum + "\n"
                            + formatFirstValue + "-" + formatSecondValue + "=" + minus + "\n" +
                            formatFirstValue + "*" + formatSecondValue + "=" + multiply + "\n" +
                            zero);
                    break;
            }
            break;
        }
    }

    public static String formatValue(double value) {
        NumberFormat nf = new DecimalFormat("#.######");
        return nf.format(value);
    }
}
