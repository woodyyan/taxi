package com.songbai.taximeter.strategy;

import com.songbai.taximeter.Charges;

public class PeakHourStrategy extends PriceStrategy {

    private double peakRate;

    public PeakHourStrategy(double peakRate) {
        this.peakRate = peakRate;
    }

    @Override
    public void adjust(Charges charges) {
        charges.setUnitPrice(charges.getUnitPrice() * peakRate);
        charges.setLongDistanceUnitPrice(charges.getLongDistanceUnitPrice() * peakRate);
    }
}
