package com.songbai.taximeter.strategy;

import com.songbai.taximeter.Charges;
import com.songbai.taximeter.strategy.PriceStrategy;

public class OuterStrategy extends PriceStrategy {
    @Override
    public void adjust(Charges charges) {
        charges.setLongDistanceUnitPrice(charges.getUnitPrice());
    }
}
