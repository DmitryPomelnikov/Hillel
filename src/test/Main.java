package test;
public class Main {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(a + "*" + i + "=" + (a * i) + " ");
            }
            System.out.println("");
            a++;
        }
    }
}
