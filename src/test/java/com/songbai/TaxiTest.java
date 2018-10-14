package com.songbai;

import org.junit.Assert;
import org.junit.Test;

import static com.songbai.TaxiType.INNER_RING_TAXI;

public class TaxiTest {
    @Test
    public void shouldReturn14WhenInnerTaxiRun2kmDuringDay() {
        Taximeter taximeter = new Taximeter();
        Taxi innerTaxi = new Taxi(INNER_RING_TAXI, taximeter);

        Double price = innerTaxi.run(true, 2.0);

        Assert.assertEquals(14, price, 0.0);
    }
}