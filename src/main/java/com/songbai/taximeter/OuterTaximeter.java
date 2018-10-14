package com.songbai.taximeter;

public class OuterTaximeter extends Taximeter {

    @Override
    public Double calculatePrice(Double distance) {
        if (distance <= MIN_DISTANCE) {
            return this.getStartingPrice();
        } else {
            return (distance - MIN_DISTANCE) * this.getUnitPrice()
                    + this.getStartingPrice();
        }
    }
}
