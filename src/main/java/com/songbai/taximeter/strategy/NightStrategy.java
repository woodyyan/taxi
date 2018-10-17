package com.songbai.taximeter.strategy;

import com.songbai.taximeter.Charges;

import static com.songbai.config.GlobalConfigs.*;

public class NightStrategy extends PriceStrategy {

    @Override
    public void adjust(Charges charges) {
        charges.setStartingPrice(NIGHT_STARTING_PRICE);
        charges.setUnitPrice(NIGHT_UNIT_PRICE);
        charges.setLongDistanceUnitPrice(NIGHT_LONG_DISTANCE_UNIT_PRICE);
    }
}
