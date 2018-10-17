package com.songbai.taxi;

import com.songbai.taximeter.PeakHour;
import com.songbai.taximeter.Taximeter;
import com.songbai.taximeter.strategy.NightStrategy;
import com.songbai.taximeter.strategy.OuterStrategy;
import com.songbai.taximeter.strategy.PeakHourStrategy;
import com.songbai.utils.HourUtil;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Taxi {

    private boolean isOuterTaxi;
    private Taximeter taximeter;
    private List<PeakHour> peakHours = new ArrayList<>();

    public Taxi(boolean isOuterTaxi) {
        this.isOuterTaxi = isOuterTaxi;
    }

    public Taximeter getTaximeter() {
        return taximeter;
    }

    public void setTaximeter(Taximeter taximeter) {
        this.taximeter = taximeter;
    }

    public List<PeakHour> getPeakHours() {
        return peakHours;
    }

    public Double run(Date startingTime, Integer distance) {
        if (this.getTaximeter() == null) {
            throw new InvalidParameterException("No taximeter found.");
        }

        if (checkIsNight(startingTime)) {
            this.getTaximeter().getPriceStrategies().add(new NightStrategy());
        }
        if (isOuterTaxi) {
            this.getTaximeter().getPriceStrategies().add(new OuterStrategy());
        }
        if (checkIsPeakHour(startingTime)) {
            double peakRate = getPeakRate(startingTime);
            this.getTaximeter().getPriceStrategies().add(new PeakHourStrategy(peakRate));
        }

        return this.getTaximeter().calculatePrice(distance);
    }

    private double getPeakRate(Date startingTime) {
        PeakHour defaultPeakHour = new PeakHour();
        int defaultRate = 1;
        defaultPeakHour.setRate(defaultRate);
        return peakHours.stream().filter(it -> it.contains(startingTime)).findFirst().orElse(defaultPeakHour).getRate();
    }

    private boolean checkIsPeakHour(Date startingTime) {
        return peakHours.stream().anyMatch(it -> it.contains(startingTime));
    }

    private boolean checkIsNight(Date startingTime) {
        int hour = HourUtil.getHour(startingTime);
        int defaultFromTime = 23;
        int defaultToTime = 6;
        return hour >= defaultFromTime || hour < defaultToTime;
    }
}
