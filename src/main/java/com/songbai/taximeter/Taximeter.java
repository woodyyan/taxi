package com.songbai.taximeter;

public abstract class Taximeter {
    protected static final double MIN_DISTANCE = 3;
    protected static final double MAX_DISTANCE = 10;

    private static final double DAYTIME_STARTING_PRICE = 14;
    private static final double DAYTIME_UNIT_PRICE = 2.5;
    private static final double DAYTIME_LONG_DISTANCE_UNIT_PRICE = 3.5;
    private static final double NIGHT_STARTING_PRICE = 18;
    private static final double NIGHT_UNIT_PRICE = 3;
    private static final double NIGHT_LONG_DISTANCE_UNIT_PRICE = 4.7;

    private double startingPrice = DAYTIME_STARTING_PRICE;
    private double unitPrice = DAYTIME_UNIT_PRICE;
    private double longDistanceUnitPrice = DAYTIME_LONG_DISTANCE_UNIT_PRICE;

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

    public abstract Double calculatePrice(Integer distance);

    public double getLongDistanceUnitPrice() {
        return longDistanceUnitPrice;
    }

    public void setLongDistanceUnitPrice(double longDistanceUnitPrice) {
        this.longDistanceUnitPrice = longDistanceUnitPrice;
    }

    public void switchPrice(boolean isDaytime) {
        if (isDaytime) {
            this.setStartingPrice(DAYTIME_STARTING_PRICE);
            this.setUnitPrice(DAYTIME_UNIT_PRICE);
            this.setLongDistanceUnitPrice(DAYTIME_LONG_DISTANCE_UNIT_PRICE);
        } else {
            this.setStartingPrice(NIGHT_STARTING_PRICE);
            this.setUnitPrice(NIGHT_UNIT_PRICE);
            this.setLongDistanceUnitPrice(NIGHT_LONG_DISTANCE_UNIT_PRICE);
        }
    }
}
