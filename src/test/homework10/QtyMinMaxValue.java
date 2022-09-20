package test.homework10;

import java.util.Arrays;

public class QtyMinMaxValue {
    public static void main(String[] args) {
        int[] array = randomValuesIntoArray();
        System.out.println(Arrays.toString(array));
        System.out.println("Количество минимальных значений в массиве - " + countyMin(array));
        System.out.println("Количество максимальных значений в массиве - " + countyMax(array));
    }

    private static int[] randomValuesIntoArray() {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) (Math.random() * (20 + 1)) - 10;
        }
        Arrays.sort(array);
        return array;
    }

    private static int countyMin(int[] array) {
        int countMin = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[0] == array[i]) {
                countMin++;
            } else break;
        }
        return countMin;
    }

    private static int countyMax(int[] array) {
        int countMax = 1;
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[array.length - 1] == array[i]) {
                countMax++;
            } else break;
        }
        return countMax;
    }
}
