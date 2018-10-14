package com.songbai;

public class Taxi {
    private Taximeter taximeter;
    private TaxiType type;

    public Taxi(TaxiType type, Taximeter taximeter) {
        this.type = type;
        this.taximeter = taximeter;
    }

    public TaxiType getType() {
        return type;
    }

    public Taximeter getTaximeter() {
        return taximeter;
    }

    public Double run(boolean isDaytime, Double distance) {
        return taximeter.calculatePrice(isDaytime, distance, type);
    }
}
