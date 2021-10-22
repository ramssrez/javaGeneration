package com.company.uber;

public class UberDriver {
    private String name;
    private String carModel;
    private String plate;
    private final int minimum=7;
    private final double ratePerKm = 1.5;
    private final int ratePerMinute = 1;
    private final int currentMonthSalary = 0;

    public UberDriver(String name, String carModel, String plate) {
        this.name = name;
        this.carModel = carModel;
        this.plate = plate;
    }

    public int getMinimum() {
        return minimum;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public int getRatePerMinute() {
        return ratePerMinute;
    }

    public int getCurrentMonthSalary() {
        return currentMonthSalary;
    }

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
     public double calculatePrice(double km) {
        return Math.max(ratePerKm*km,7);
    }
}
