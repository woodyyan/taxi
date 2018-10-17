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
}