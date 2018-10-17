package com.songbai.taximeter;

import com.songbai.taximeter.strategy.PeakHourStrategy;
import com.songbai.taximeter.strategy.PriceStrategy;
import org.junit.Assert;
import org.junit.Test;

public class PeakHourStrategyTest {
    @Test
    public void shouldAdjustChargesCorrectly() {
        double peakRate = 2.0;
        PriceStrategy strategy = new PeakHourStrategy(peakRate);
        Charges charges = new Charges();
        strategy.adjust(charges);
        Assert.assertEquals(14, charges.getStartingPrice(), 0.0);
        Assert.assertEquals(5, charges.getUnitPrice(), 0.0);
        Assert.assertEquals(7, charges.getLongDistanceUnitPrice(), 0.0);
    }
}