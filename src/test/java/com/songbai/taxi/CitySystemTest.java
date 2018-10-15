package com.songbai.taxi;

import org.junit.Assert;
import org.junit.Test;

public class CitySystemTest {
    @Test
    public void shouldReturnCorrectResultWhenIsInnerRing() {
        String result = CitySystem.takeTaxi(true, true, 2);
        Assert.assertEquals("乘客白天在内环坐出租车，行驶2公里，应付费14.0元", result);
    }

    @Test
    public void shouldReturnCorrectResultWhenIsOuterRing() {
        String result = CitySystem.takeTaxi(false, true, 2);
        Assert.assertEquals("乘客白天在外环坐出租车，行驶2公里，应付费14.0元", result);
    }
}