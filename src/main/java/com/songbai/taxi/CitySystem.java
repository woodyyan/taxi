package com.songbai.taxi;

import com.songbai.taximeter.Taximeter;

import java.util.Date;

public class CitySystem {
    public static String takeTaxi(boolean isOuterRing, Date startingTime, Integer distance) {
        Taxi taxi = new Taxi(isOuterRing);
        taxi.setTaximeter(new Taximeter());
        Double price = taxi.run(startingTime, distance);

        String ring = isOuterRing ? "内环" : "外环";
        return String.format("乘客在%s点坐%s出租车，行驶%s公里，应付费%s元", startingTime, ring, distance, price);
    }
}
