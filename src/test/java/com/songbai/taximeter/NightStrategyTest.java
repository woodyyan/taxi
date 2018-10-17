package com.songbai.taximeter;

import com.songbai.taximeter.strategy.NightStrategy;
import com.songbai.taximeter.strategy.PriceStrategy;
import org.junit.Assert;
import org.junit.Test;

public class NightStrategyTest {
    @Test
    public void shouldAdjustChargesCorrectly() {
        PriceStrategy strategy = new NightStrategy();
        Charges charges = new Charges();
        strategy.adjust(charges);

        Assert.assertEquals(18, charges.getStartingPrice(), 0.0);
        Assert.assertEquals(3, charges.getUnitPrice(), 0.0);
        Assert.assertEquals(4.7, charges.getLongDistanceUnitPrice(), 0.0);
    }
}