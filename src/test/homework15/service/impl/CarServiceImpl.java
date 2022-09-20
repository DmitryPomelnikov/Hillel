package test.homework15.service.impl;

import test.homework15.dao.CarDao;
import test.homework15.dao.impl.CarDaoImpl;
import test.homework15.entity.impl.Car;

import java.util.List;

public class CarServiceImpl implements CarDao {
    private static final CarDao CDI = new CarDaoImpl();

    @Override
    public void addCar(Car car) {
        if (car != null) {
            CDI.addCar(car);
        }
    }

    @Override
    public List<Car> getAllCars() {
        return CDI.getAllCars();
    }

    @Override
    public void removeCar(int id) {
        CDI.removeCar(id);
    }

    @Override
    public Car updateCar(int id, String make, String model, int year) {
        return CDI.updateCar(id, make, model, year);
    }

    @Override
    public Car getCar(int id) {
        id--;
        return CDI.getCar(id);
    }
}
