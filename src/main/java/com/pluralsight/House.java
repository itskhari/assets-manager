package com.pluralsight;

public class House extends Assets {
    // child properties, things unique to a house.
    private String address;
    private int condition, sqft, lotSize;

    // child constructor
    public House(String description, String dateAcquired, double originalCost, String address, int condition, int sqft, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.sqft = sqft;
        this.lotSize = lotSize;
    }

    // method(s)
    @Override
    public double getValue() {
        double rate;

        switch (condition) {
            case 1:
                rate = 180.0;
                break;
            case 2:
                rate = 130.0;
                break;
            case 3:
                rate = 90.0;
                break;
            case 4:
                rate = 80.0;
                break;
            default:
                rate = 0.0;
        }

        return (sqft * rate) + (lotSize * 0.25);
    }


    // getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSqft() {
        return sqft;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
