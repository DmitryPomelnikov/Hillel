package test.homework15.controller;

import test.homework15.dao.impl.CarDaoImpl;
import test.homework15.entity.Vehicle;
import test.homework15.entity.impl.Car;

import java.util.Scanner;

public class ConsoleHandler {
    public static Car inputCars() {
        Vehicle car = new Car();
        CarDaoImpl carDao = new CarDaoImpl();
        int counter = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input make of car (Input - q for the end working with DB)");
            car.setMake(scanner.nextLine());
            if (car.getMake().equals("q")) {
                car.setModel("default");
                car.setYear(0);
                carDao.addCar(new Car(car.getMake(), car.getModel(), car.getYear()));
                carDao.removeCar(counter);
                scanner.close();
                break;
            }
            System.out.println("Input model of car");
            car.setModel(scanner.nextLine());
            System.out.println("Input year of car");
            car.setYear(scanner.nextInt());
            carDao.addCar(new Car(car.getMake(), car.getModel(), car.getYear()));
            ++counter;
        }
        return null;
    }
}
