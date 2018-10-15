package com.songbai.taxi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CitySystemTest {

    private Date daytime;

    @Before
    public void setUp() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        daytime = simpleDateFormat.parse("2018-10-15 10:11:00");
    }

    @Test
    public void shouldReturnCorrectResultWhenIsInnerRing() {
        String result = CitySystem.takeTaxi(true, daytime, 2);
        Assert.assertEquals("乘客白天在内环坐出租车，行驶2公里，应付费14.0元", result);
    }

    @Test
    public void shouldReturnCorrectResultWhenIsOuterRing() {
        String result = CitySystem.takeTaxi(false, daytime, 2);
        Assert.assertEquals("乘客白天在外环坐出租车，行驶2公里，应付费14.0元", result);
    }
}