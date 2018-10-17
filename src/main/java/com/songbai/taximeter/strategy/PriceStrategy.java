package com.songbai.taximeter.strategy;

import com.songbai.taximeter.Charges;

public abstract class PriceStrategy {

    public abstract void adjust(Charges charges);
}
