package Lessons.lesson15;

public class Mobile extends Computer {
    Phone getPhone() {
        return new Phone() {
            void process() {
                super.process();
                System.out.println("Mobile");
            }
        };
    }

    @Override
    void process() {
        super.process();
        System.out.println("Mobile");
    }
}

