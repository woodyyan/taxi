package com.songbai.taxi;

import com.songbai.taximeter.Taximeter;

public abstract class Taxi {

    private Taximeter taximeter;

    public Taximeter getTaximeter() {
        return taximeter;
    }

    public void setTaximeter(Taximeter taximeter) {
        this.taximeter = taximeter;
    }

    public Double run(boolean isDaytime, Double distance) throws Exception {
        if (taximeter == null) {
            throw new Exception("No taximeter found.");
        }

        taximeter.switchPrice(isDaytime);
        return taximeter.calculatePrice(distance);
    }
}
