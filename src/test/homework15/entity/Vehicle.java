package test.homework15.entity;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public abstract void category();

    public abstract void quantityWheels();

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
