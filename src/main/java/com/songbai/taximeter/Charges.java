package com.songbai.taximeter;

public class Charges {
    private static final double DEFAULT_STARTING_PRICE = 14;
    private static final double DEFAULT_UNIT_PRICE = 2.5;
    private static final double DEFAULT_LONG_DISTANCE_UNIT_PRICE = 3.5;

    private double startingPrice = DEFAULT_STARTING_PRICE;
    private double unitPrice = DEFAULT_UNIT_PRICE;
    private double longDistanceUnitPrice = DEFAULT_LONG_DISTANCE_UNIT_PRICE;

    public double getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(double startingPrice) {
        this.startingPrice = startingPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getLongDistanceUnitPrice() {
        return longDistanceUnitPrice;
    }

    public void setLongDistanceUnitPrice(double longDistanceUnitPrice) {
        this.longDistanceUnitPrice = longDistanceUnitPrice;
    }
}
