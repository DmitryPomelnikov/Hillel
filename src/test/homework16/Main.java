package test.homework16;

public class Main {
    public static void main(String[] args) {
        for (Animal animals : Animal.values()) {
            System.out.println(animals.name() + " - " + animals.toString());
        }
    }
}