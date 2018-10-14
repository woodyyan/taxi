package com.songbai;

public class Taximeter {
    private double startingPrice;
    private double unitPrice;

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

    public Double calculatePrice(boolean isDaytime, Double distance, TaxiType type) {
        if (distance > 3) {
            return (distance - 3) * unitPrice + startingPrice;
        }
        return startingPrice;
    }
}
