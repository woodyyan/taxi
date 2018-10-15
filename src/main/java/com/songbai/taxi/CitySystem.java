package com.songbai.taxi;

import com.songbai.taximeter.InnerTaximeter;
import com.songbai.taximeter.OuterTaximeter;
import com.songbai.taximeter.Taximeter;

import java.util.Calendar;
import java.util.Date;

public class CitySystem {
    public static String takeTaxi(boolean isInnerRing, Date startingTime, Integer distance) {
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(true);
        calendar.setTime(startingTime);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        boolean isDaytime = hour < 23 && hour >= 6;

        Taxi taxi = new Taxi();
        if (isInnerRing) {
            Taximeter innerTaximeter = new InnerTaximeter();
            taxi.setTaximeter(innerTaximeter);
        } else {
            Taximeter outerTaximeter = new OuterTaximeter();
            taxi.setTaximeter(outerTaximeter);
        }
        Double price = taxi.run(isDaytime, distance);

        String time = isDaytime ? "白天" : "晚上";
        String ring = isInnerRing ? "内环" : "外环";
        return String.format("乘客%s在%s坐出租车，行驶%s公里，应付费%s元", time, ring, distance, price);
    }
}
