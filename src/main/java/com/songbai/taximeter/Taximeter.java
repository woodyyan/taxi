package com.songbai.taximeter;

import com.songbai.taximeter.strategy.PriceStrategy;

import java.util.ArrayList;
import java.util.List;

public class Taximeter {
    private static final double MIN_DISTANCE = 3;
    private static final double MAX_DISTANCE = 10;

    private List<PriceStrategy> priceStrategies = new ArrayList<>();


    public List<PriceStrategy> getPriceStrategies() {
        return priceStrategies;
    }

    public Double calculatePrice(Integer distance) {
        Charges adjustedCharges = new Charges();
        for (PriceStrategy strategy : priceStrategies) {
            strategy.adjust(adjustedCharges);
        }

        if (distance <= MIN_DISTANCE) {
            return adjustedCharges.getStartingPrice();
        } else if (distance <= MAX_DISTANCE) {
            return (distance - MIN_DISTANCE) * adjustedCharges.getUnitPrice() + adjustedCharges.getStartingPrice();
        } else {
            return (distance - MAX_DISTANCE) * adjustedCharges.getLongDistanceUnitPrice()
                    + (MAX_DISTANCE - MIN_DISTANCE) * adjustedCharges.getUnitPrice()
                    + adjustedCharges.getStartingPrice();
        }
    }
}
