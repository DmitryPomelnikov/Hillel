package test.homework15.entity.impl;

import test.homework15.entity.Vehicle;

public class Car extends Vehicle {
    private int id;
    private String make;
    private String model;
    private int year;
    private static int index = 1;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public Car(String make, String model, int year) {
        this.id = incrementIdCar();
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(int id, String make, String model, int year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car() {
    }

    public int incrementIdCar() {
        return index++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void category() {
        System.out.println("Car is passenger category");
    }

    @Override
    public void quantityWheels() {
        System.out.println("Car has 4 wheels");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
