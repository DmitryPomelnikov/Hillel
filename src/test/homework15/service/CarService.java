package test.homework15.service;

import test.homework15.entity.impl.Car;

import java.util.List;

public interface CarService {
    void addCar(Car car);

    List<Car> getAllCars(int index);

    void removeCar(int id);

    Car updateCar(int id, String make, String model, int year);

    Car getCar(int id);
}
