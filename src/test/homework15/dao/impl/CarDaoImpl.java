package test.homework15.dao.impl;

import test.homework15.dao.CarDao;
import test.homework15.entity.impl.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private static final List<Car> CAR_LIST = new ArrayList<>();

    @Override
    public void addCar(Car car) {
        if (car != null) {
            CAR_LIST.add(car);
        }
    }

    @Override
    public List<Car> getAllCars() {
        return CAR_LIST;
    }

    @Override
    public void removeCar(int id) {
        CAR_LIST.remove(id);
    }

    @Override
    public Car getCar(int id) {
        id--;
        return CAR_LIST.get(id);
    }

    @Override
    public Car updateCar(int id, String make, String model, int year) {
        int index = id;
        id--;
        return CAR_LIST.set(id, new Car(index, make, model, year));
    }
}
