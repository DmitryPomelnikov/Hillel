package test.homeworkEnum;

public enum Animal {
    DOG(3), CAT(10), OX(2), FROG(1), WOLF(2), RACCOON(4), BEAR(8), FOX(5);
    public int age;

    Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }
}
