package com.songbai.taxi;

import com.songbai.taximeter.PeakHour;
import com.songbai.taximeter.Taximeter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.songbai.config.GlobalConfigs.*;

public class CitySystem {
    public static String takeTaxi(boolean isOuterRing, Date startingTime, Integer distance) throws ParseException {

        Taxi taxi = new Taxi(isOuterRing);
        taxi.getPeakHours().add(generateMorningPeakHour());
        taxi.getPeakHours().add(generateEveningPeakHour());
        taxi.setTaximeter(new Taximeter());
        Double price = taxi.run(startingTime, distance);

        String ring = isOuterRing ? "内环" : "外环";
        return String.format("乘客在%s点坐%s出租车，行驶%s公里，应付费%s元", startingTime, ring, distance, price);
    }

    private static PeakHour generateMorningPeakHour() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_TIME_FORMAT);
        Date from = simpleDateFormat.parse(MORNING_FROM_PEAK_TIME);
        Date to = simpleDateFormat.parse(MORNING_TO_PEAK_TIME);
        PeakHour peakHour = new PeakHour();
        peakHour.setFrom(from);
        peakHour.setTo(to);
        peakHour.setRate(MORNING_PEAK_RATE);
        return peakHour;
    }

    private static PeakHour generateEveningPeakHour() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_TIME_FORMAT);
        Date from = simpleDateFormat.parse(EVENING_FROM_PEAK_TIME);
        Date to = simpleDateFormat.parse(EVENING_TO_PEAK_TIME);
        PeakHour peakHour = new PeakHour();
        peakHour.setFrom(from);
        peakHour.setTo(to);
        peakHour.setRate(EVENING_PEAK_RATE);
        return peakHour;
    }
}
