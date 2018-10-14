package com.songbai;

import org.junit.Assert;
import org.junit.Test;

import static com.songbai.TaxiType.INNER_RING_TAXI;

public class TaximeterTest {
    @Test
    public void shouldReturn14WhenInnerTaxiRun2kmDuringDay() {
        Taximeter taximeter = new Taximeter();
        taximeter.setStartingPrice(14);
        taximeter.setUnitPrice(2.5);

        Double price = taximeter.calculatePrice(true, 2.0, INNER_RING_TAXI);

        Assert.assertEquals(14, price, 0.0);
    }
}