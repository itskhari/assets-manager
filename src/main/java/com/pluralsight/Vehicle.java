package com.pluralsight;

public class Vehicle extends Assets {
    // child properties, unique to a vehicle
    private String makeModel;
    private int odometer, year;

    // child constructor
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int odometer, int year) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.odometer = odometer;
        this.year = year;
    }
    // method(s)
    @Override
    public double getValue() {
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - year;
        double value = getOriginalCost();

        // depreciation logic
        if (age <= 3) {
            value -= value * (0.03 * age);
        } else if (age <= 6) {
            value -= value * (0.06 * age);
        } else if (age <= 10) {
            value -= value * (0.08 * age);
        } else {
            value = 1000.0;
        }

        // honda and toyota exceptions
        if (odometer > 100000) {
            String lower = makeModel.toLowerCase();
            if (!lower.contains("honda") && !lower.contains("toyota")) {
                value *= 0.75; // 25%
            }
        }

        return value;
    }

    // getters and setters
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
