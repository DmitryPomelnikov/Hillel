package test.homework15;

import test.homework15.controller.ConsoleHandler;
import test.homework15.dao.impl.CarDaoImpl;

public class Main {
    public static void main(String[] args) {
        CarDaoImpl carDao = new CarDaoImpl();
        carDao.addCar(ConsoleHandler.inputCars());
        System.out.println(carDao.getAllCars());
        System.out.println(carDao.getCar(2));
        carDao.updateCar(2, "Mazda", "3", 2016);
        System.out.println(carDao.getAllCars());
        System.out.println(carDao.getCar(2));
    }
}
