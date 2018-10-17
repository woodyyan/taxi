package com.songbai.utils;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HourUtilTest {
    @Test
    public void shouldReturn10GivenDateIs10() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = simpleDateFormat.parse("2018-10-15 10:11:00");
        int hour = HourUtil.getHour(date);
        Assert.assertEquals(10, hour);
    }
}