package com.company.resolucion;

public class UberDirver {
    String name;
    String carModel;
    String plate;
    int minimum=7;
    double ratePerKm = 1.5;
    int ratePerMinute = 1;
    int currentMonthSalary = 0;

    double calculatePrice(double km) {
        return Math.max(ratePerKm*km,7);
    }
}
