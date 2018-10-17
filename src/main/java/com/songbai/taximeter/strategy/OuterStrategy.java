package com.songbai.taximeter.strategy;

import com.songbai.taximeter.Charges;

public class OuterStrategy extends PriceStrategy {
    @Override
    public void adjust(Charges charges) {
        charges.setLongDistanceUnitPrice(charges.getUnitPrice());
    }
}
