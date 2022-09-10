package test.homework10;

import java.util.Scanner;

public class ArrayFeelings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любой набор букв");
        String input = scanner.nextLine();
        System.out.println("\"" + input + "\" == " + countFeelings(input) + " feelings");
        scanner.close();
    }

    private static int countFeelings(String inputWord) {
        String[] feelings = {"anger", "awe", "joy", "love", "grief"};
        int counter = 0;
        for (String arrayFeelings : feelings) {
            String compareWord = inputWord.toLowerCase();
            int countingBoolean = 0;
            for (int q = 0; q < arrayFeelings.length(); q++) {
                String compareChar = Character.toString(arrayFeelings.charAt(q));
                if (!compareWord.contains(compareChar)) {
                    break;
                } else {
                    compareWord = compareWord.replaceFirst(compareChar, ".");
                    countingBoolean++;
                }
            }
            if (countingBoolean == arrayFeelings.length()) {
                counter++;
            }
        }
        return counter;
    }
}