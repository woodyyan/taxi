package com.songbai.taximeter;

import org.junit.Assert;
import org.junit.Test;

public class InnerTaximeterTest {
    @Test
    public void shouldReturn14WhenInnerTaxiRun2kmDuringDay() {
        Taximeter taximeter = new InnerTaximeter();
        taximeter.setStartingPrice(14);
        taximeter.setUnitPrice(2.5);
        taximeter.setLongDistanceUnitPrice(3.5);

        Double price = taximeter.calculatePrice(2);

        Assert.assertEquals(14, price, 0.0);
    }

    @Test
    public void shouldReturn16_5WhenInnerTaxiRun4kmDuringDay() {
        Taximeter taximeter = new InnerTaximeter();
        taximeter.setStartingPrice(14);
        taximeter.setUnitPrice(2.5);
        taximeter.setLongDistanceUnitPrice(3.5);

        Double price = taximeter.calculatePrice(4);

        Assert.assertEquals(16.5, price, 0.0);
    }

    @Test
    public void shouldReturnCorrectPriceWhenInnerTaxiRun11kmDuringDay() {
        Taximeter taximeter = new InnerTaximeter();
        taximeter.setStartingPrice(14);
        taximeter.setUnitPrice(2.5);
        taximeter.setLongDistanceUnitPrice(3.5);

        Double price = taximeter.calculatePrice(11);

        Assert.assertEquals(14 + 7 * 2.5 + 3.5, price, 0.0);
    }

    @Test
    public void shouldReturn18PriceWhenInnerTaxiRun2kmDuringNight() {
        Taximeter taximeter = new InnerTaximeter();
        taximeter.setStartingPrice(18);
        taximeter.setUnitPrice(3);
        taximeter.setLongDistanceUnitPrice(4.7);

        Double price = taximeter.calculatePrice(2);

        Assert.assertEquals(18, price, 0.0);
    }

    @Test
    public void shouldReturn21PriceWhenInnerTaxiRun4kmDuringNight() {
        Taximeter taximeter = new InnerTaximeter();
        taximeter.setStartingPrice(18);
        taximeter.setUnitPrice(3);
        taximeter.setLongDistanceUnitPrice(4.7);

        Double price = taximeter.calculatePrice(4);

        Assert.assertEquals(21, price, 0.0);
    }

    @Test
    public void shouldReturnCorrectPriceWhenInnerTaxiRun11kmDuringNight() {
        Taximeter taximeter = new InnerTaximeter();
        taximeter.setStartingPrice(18);
        taximeter.setUnitPrice(3);
        taximeter.setLongDistanceUnitPrice(4.7);

        Double price = taximeter.calculatePrice(11);

        Assert.assertEquals(18 + 7 * 3 + 4.7, price, 0.0);
    }

}