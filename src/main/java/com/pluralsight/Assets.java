package com.pluralsight;

public abstract class Assets {
    // my properties for my parent class, as of now I made them protected.
    protected String description, dateAcquired;
    protected double originalCost;

    // parent constructor
    public Assets(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;

    }

    // method(s) ~ made this an abstract method, only needs to be done in the parent class.
    public abstract double getValue();


    // getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }
}
