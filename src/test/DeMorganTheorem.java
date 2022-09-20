package test;

public class DeMorganTheorem {
    public static void main(String[] args) {
        test1(false, false);
        test2(false, true);
        test3(true, false);
        test4(true, true);
        test5(true, true);
        test6(true, false);
        test7(false, true);
        test8(false, false);
    }

    private static void test1(boolean firstValue, boolean secondValue) {
        System.out.println("Result of test1 = " + (!firstValue & !secondValue) + " and " + (!(firstValue | secondValue)));
    }

    private static void test2(boolean firstValue, boolean secondValue) {
        System.out.println("Result of test2 = " + (!firstValue & secondValue) + " and " + (!(firstValue | !secondValue)));
    }

    private static void test3(boolean firstValue, boolean secondValue) {
        System.out.println("Result of test3 = " + (firstValue & !secondValue) + " and " + (!(!firstValue | secondValue)));
    }

    private static void test4(boolean firstValue, boolean secondValue) {
        System.out.println("Result of test4 = " + (firstValue & secondValue) + " and " + (!(!firstValue | !secondValue)));
    }

    private static void test5(boolean firstValue, boolean secondValue) {
        System.out.println("Result of test5 = " + (!firstValue | !secondValue) + " and " + (!(firstValue & secondValue)));
    }

    private static void test6(boolean firstValue, boolean secondValue) {
        System.out.println("Result of test6 = " + (!firstValue | secondValue) + " and " + (!(firstValue & !secondValue)));
    }

    private static void test7(boolean firstValue, boolean secondValue) {
        System.out.println("Result of test7 = " + (firstValue | !secondValue) + " and " + (!(!firstValue & secondValue)));
    }

    private static void test8(boolean firstValue, boolean secondValue) {
        System.out.println("Result of test8 = " + (firstValue | secondValue) + " and " + (!(!firstValue & !secondValue)));
    }
}
