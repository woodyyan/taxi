package com.songbai.taxi;

import com.songbai.taximeter.Taximeter;

import java.security.InvalidParameterException;

public class Taxi {

    private Taximeter taximeter;

    public Taximeter getTaximeter() {
        return taximeter;
    }

    public void setTaximeter(Taximeter taximeter) {
        this.taximeter = taximeter;
    }

    public Double run(boolean isDaytime, Integer distance) {
        if (taximeter == null) {
            throw new InvalidParameterException("No taximeter found.");
        }

        taximeter.switchPrice(isDaytime);
        return taximeter.calculatePrice(distance);
    }
}
