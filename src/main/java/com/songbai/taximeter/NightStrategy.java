package com.songbai.taximeter;

public class NightStrategy extends PriceStrategy {
    private static final double NIGHT_STARTING_PRICE = 18;
    private static final double NIGHT_UNIT_PRICE = 3;
    private static final double NIGHT_LONG_DISTANCE_UNIT_PRICE = 4.7;

    @Override
    public void adjust(Charges charges) {
        charges.setStartingPrice(NIGHT_STARTING_PRICE);
        charges.setUnitPrice(NIGHT_UNIT_PRICE);
        charges.setLongDistanceUnitPrice(NIGHT_LONG_DISTANCE_UNIT_PRICE);
    }
}
