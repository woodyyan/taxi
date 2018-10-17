package com.songbai;

import com.songbai.taxi.Taxi;
import com.songbai.taximeter.PeakHour;
import com.songbai.taximeter.Taximeter;
import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaxiTest {
    @Test(expected = InvalidParameterException.class)
    public void shouldThrowExceptionWhenTaximeterIsNull() {
        Taxi taxi = new Taxi(false);
        Date date = new Date();
        taxi.run(date, 2);
    }

    @Test
    public void shouldReturnCorrectPriceWhenTaxiRun() {
        Taxi taxi = new Taxi(false);
        taxi.setTaximeter(new Taximeter());
        Date date = new Date();
        Double price = taxi.run(date, 2);
        Assert.assertEquals(14, price, 0.0);
    }

    @Test
    public void shouldReturnCorrectPriceGivenPeakHours() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date startingTime = simpleDateFormat.parse("2018-10-15 19:11:00");
        Date from = simpleDateFormat.parse("2018-10-15 17:00:00");
        Date to = simpleDateFormat.parse("2018-10-15 20:00:00");

        Taxi taxi = new Taxi(false);
        PeakHour peakHour = new PeakHour();
        peakHour.setRate(2);
        peakHour.setFrom(from);
        peakHour.setTo(to);
        taxi.getPeakHours().add(peakHour);
        taxi.setTaximeter(new Taximeter());
        Double price = taxi.run(startingTime, 2);
        Assert.assertEquals(14, price, 0.0);
    }

    @Test
    public void shouldReturnCorrectPriceWhenIsNight() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date startingTime = simpleDateFormat.parse("2018-10-15 23:11:00");

        Taxi taxi = new Taxi(false);
        taxi.setTaximeter(new Taximeter());
        Double price = taxi.run(startingTime, 2);
        Assert.assertEquals(18, price, 0.0);
    }
}