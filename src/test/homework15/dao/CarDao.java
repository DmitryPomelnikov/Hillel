package test.homework15.dao;

import test.homework15.entity.impl.Car;

import java.util.List;

public interface CarDao {
    void addCar(Car car);

    List<Car> getAllCars();

    void removeCar(int id);

    Car updateCar(int id, String make, String model, int year);

    Car getCar(int id);
}
