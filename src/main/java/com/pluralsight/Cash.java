package com.pluralsight;

public class Cash extends Assets {
    // child constructor
    public Cash(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
    }

    // override method, even though it isn't much
    @Override
    public double getValue() {
        return getOriginalCost();
    }
}
