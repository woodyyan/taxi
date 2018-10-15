package com.songbai.taximeter;

import org.junit.Assert;
import org.junit.Test;

public class OuterTaximeterTest {
    @Test
    public void shouldReturn14PriceWhenOuterTaxiRun2kmDuringDay() {
        Taximeter taximeter = new OuterTaximeter();
        taximeter.setStartingPrice(14);
        taximeter.setUnitPrice(2.5);
        taximeter.setLongDistanceUnitPrice(2.5);

        Double price = taximeter.calculatePrice(2);

        Assert.assertEquals(14, price, 0.0);
    }

    @Test
    public void shouldReturn16_5PriceWhenOuterTaxiRun4kmDuringDay() {
        Taximeter taximeter = new OuterTaximeter();
        taximeter.setStartingPrice(14);
        taximeter.setUnitPrice(2.5);
        taximeter.setLongDistanceUnitPrice(2.5);

        Double price = taximeter.calculatePrice(4);

        Assert.assertEquals(16.5, price, 0.0);
    }

    @Test
    public void shouldReturn16_5PriceWhenOuterTaxiRun11kmDuringDay() {
        Taximeter taximeter = new OuterTaximeter();
        taximeter.setStartingPrice(14);
        taximeter.setUnitPrice(2.5);
        taximeter.setLongDistanceUnitPrice(2.5);

        Double price = taximeter.calculatePrice(11);

        Assert.assertEquals(14 + 8 * 2.5, price, 0.0);
    }

    @Test
    public void shouldReturn18PriceWhenOuterTaxiRun2kmDuringNight() {
        Taximeter taximeter = new OuterTaximeter();
        taximeter.setStartingPrice(18);
        taximeter.setUnitPrice(3);
        taximeter.setLongDistanceUnitPrice(3);

        Double price = taximeter.calculatePrice(2);

        Assert.assertEquals(18, price, 0.0);
    }

    @Test
    public void shouldReturn21PriceWhenOuterTaxiRun4kmDuringNight() {
        Taximeter taximeter = new OuterTaximeter();
        taximeter.setStartingPrice(18);
        taximeter.setUnitPrice(3);
        taximeter.setLongDistanceUnitPrice(3);

        Double price = taximeter.calculatePrice(4);

        Assert.assertEquals(21, price, 0.0);
    }

    @Test
    public void shouldReturnCorrectPriceWhenOuterTaxiRun11kmDuringNight() {
        Taximeter taximeter = new OuterTaximeter();
        taximeter.setStartingPrice(18);
        taximeter.setUnitPrice(3);
        taximeter.setLongDistanceUnitPrice(3);

        Double price = taximeter.calculatePrice(11);

        Assert.assertEquals(18 + 8 * 3, price, 0.0);
    }
}