package com.songbai;

import com.songbai.taximeter.InnerTaximeter;
import com.songbai.taximeter.Taximeter;
import org.junit.Assert;
import org.junit.Test;

public class TaximeterTest {
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

    @Test
    public void shouldReturn14PriceWhenOuterTaxiRun2kmDuringDay() {
        Taximeter taximeter = new InnerTaximeter();
        taximeter.setStartingPrice(14);
        taximeter.setUnitPrice(2.5);
        taximeter.setLongDistanceUnitPrice(2.5);

        Double price = taximeter.calculatePrice(2);

        Assert.assertEquals(14, price, 0.0);
    }

    @Test
    public void shouldReturn16_5PriceWhenOuterTaxiRun4kmDuringDay() {
        Taximeter taximeter = new InnerTaximeter();
        taximeter.setStartingPrice(14);
        taximeter.setUnitPrice(2.5);
        taximeter.setLongDistanceUnitPrice(2.5);

        Double price = taximeter.calculatePrice(4);

        Assert.assertEquals(16.5, price, 0.0);
    }

    @Test
    public void shouldReturn16_5PriceWhenOuterTaxiRun11kmDuringDay() {
        Taximeter taximeter = new InnerTaximeter();
        taximeter.setStartingPrice(14);
        taximeter.setUnitPrice(2.5);
        taximeter.setLongDistanceUnitPrice(2.5);

        Double price = taximeter.calculatePrice(11);

        Assert.assertEquals(14 + 8 * 2.5, price, 0.0);
    }

    @Test
    public void shouldReturn18PriceWhenOuterTaxiRun2kmDuringNight() {
        Taximeter taximeter = new InnerTaximeter();
        taximeter.setStartingPrice(18);
        taximeter.setUnitPrice(3);
        taximeter.setLongDistanceUnitPrice(3);

        Double price = taximeter.calculatePrice(2);

        Assert.assertEquals(18, price, 0.0);
    }

    @Test
    public void shouldReturn21PriceWhenOuterTaxiRun4kmDuringNight() {
        Taximeter taximeter = new InnerTaximeter();
        taximeter.setStartingPrice(18);
        taximeter.setUnitPrice(3);
        taximeter.setLongDistanceUnitPrice(3);

        Double price = taximeter.calculatePrice(4);

        Assert.assertEquals(21, price, 0.0);
    }

    @Test
    public void shouldReturnCorrectPriceWhenOuterTaxiRun11kmDuringNight() {
        Taximeter taximeter = new InnerTaximeter();
        taximeter.setStartingPrice(18);
        taximeter.setUnitPrice(3);
        taximeter.setLongDistanceUnitPrice(3);

        Double price = taximeter.calculatePrice(11);

        Assert.assertEquals(18 + 8 * 3, price, 0.0);
    }
}