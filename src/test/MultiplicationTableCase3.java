package test;

public class MultiplicationTableCase3 {
    public static void main(String[] args) {
        multiplicationTable(2, 6);
        System.out.println();
        multiplicationTable(6, 10);
    }

    private static void multiplicationTable(int startLoopSecond, int endLoopSecond) {
        for (int i = 2; i < 10; i++) {
            for (int j = startLoopSecond; j < endLoopSecond; j++) {
                int result = i * j;
                int w = result > 9 ? 6 : 7;
                System.out.printf(j + " * " + i + " = " + result + "%" + w + "s", "");
            }
            System.out.println();
        }
    }
}
