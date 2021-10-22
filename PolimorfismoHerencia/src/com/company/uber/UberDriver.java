package com.company.uber;

public class UberDriver {
    private String name;
    private String carModel;
    private String plate;
    private int minimum=7;
    private double ratePerKm = 1.5;
    private int ratePerMinute = 1;
    private int currentMonthSalary = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
