package com.songbai.taximeter;

public class OuterStrategy extends PriceStrategy {
    @Override
    public void adjust(Charges charges) {
        charges.setLongDistanceUnitPrice(charges.getUnitPrice());
    }
}
