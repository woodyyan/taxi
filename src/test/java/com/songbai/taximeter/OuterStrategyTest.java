package com.songbai.taximeter;

import com.songbai.taximeter.strategy.OuterStrategy;
import com.songbai.taximeter.strategy.PriceStrategy;
import org.junit.Assert;
import org.junit.Test;

public class OuterStrategyTest {
    @Test
    public void shouldAdjustChargesCorrectly() {
        PriceStrategy strategy = new OuterStrategy();
        Charges charges = new Charges();
        strategy.adjust(charges);
        Assert.assertEquals(charges.getUnitPrice(), charges.getLongDistanceUnitPrice(), 0.0);
    }
}