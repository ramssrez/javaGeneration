package com.company.uber;

public class UberBlack extends UberDriver {
    private int minimum=10;
    private double ratePerKm = 2.0;
    private int ratePerMinute = 2;
    private int currentMonthSalary = 0;
    public UberBlack(String name, String carModel, String plate) {
        super(name, carModel, plate);
    }

    @Override
    public int getMinimum() {
        return minimum;
    }

    @Override
    public double getRatePerKm() {
        return ratePerKm;
    }

    @Override
    public int getRatePerMinute() {
        return ratePerMinute;
    }

    @Override
    public int getCurrentMonthSalary() {
        return currentMonthSalary;
    }

    @Override
    public double calculatePrice(double km) {
        return Math.max(ratePerKm*km,10);
    }
}
