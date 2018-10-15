package com.songbai.taximeter;

public class InnerTaximeter extends Taximeter {

    @Override
    public Double calculatePrice(Integer distance) {
        if (distance <= MIN_DISTANCE) {
            return this.getStartingPrice();
        } else if (distance <= MAX_DISTANCE) {
            return (distance - MIN_DISTANCE) * this.getUnitPrice() + this.getStartingPrice();
        } else {
            return (distance - MAX_DISTANCE) * this.getLongDistanceUnitPrice()
                    + (MAX_DISTANCE - MIN_DISTANCE) * this.getUnitPrice()
                    + this.getStartingPrice();
        }
    }
}
