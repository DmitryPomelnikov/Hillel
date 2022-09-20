package test.homework11.computer;

import java.util.Arrays;

public class Computer {
    private int id;

    public Computer(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Object[] computers = new Object[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer(i + 1);
        }
        System.out.println(Arrays.toString(computers));
    }
}
