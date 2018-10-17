package com.songbai.taximeter;

import org.junit.Assert;
import org.junit.Test;

public class TaximeterTest {
    @Test
    public void shouldReturnCorrectPriceWhenRunDistanceIs2() {
        Taximeter taximeter = new Taximeter();
        Double price = taximeter.calculatePrice(2);
        Assert.assertEquals(14, price, 0.0);
    }

    @Test
    public void shouldReturnCorrectPriceWhenRunDistanceIs4() {
        Taximeter taximeter = new Taximeter();
        Double price = taximeter.calculatePrice(4);
        Assert.assertEquals(16.5, price, 0.0);
    }

    @Test
    public void shouldReturnCorrectPriceWhenRunDistanceIs11() {
        Taximeter taximeter = new Taximeter();
        Double price = taximeter.calculatePrice(11);
        Assert.assertEquals(35, price, 0.0);
    }
}