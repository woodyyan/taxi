package com.songbai.taximeter;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PeakHourTest {
    @Test
    public void shouldReturnTrueWhenHourIsBetweenFromAndTo() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date startingTime = simpleDateFormat.parse("2018-10-15 10:11:00");

        Date fromTime = simpleDateFormat.parse("2018-10-15 06:00:00");
        Date toTime = simpleDateFormat.parse("2018-10-15 23:00:00");

        PeakHour peakHour = new PeakHour();
        peakHour.setFrom(fromTime);
        peakHour.setTo(toTime);
        boolean contains = peakHour.contains(startingTime);
        Assert.assertTrue(contains);
    }
}