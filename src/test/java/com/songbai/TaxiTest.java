package com.songbai;

import com.songbai.taxi.Taxi;
import com.songbai.taximeter.Taximeter;
import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;
import java.util.Date;

public class TaxiTest {
    @Test(expected = InvalidParameterException.class)
    public void shouldThrowExceptionWhenTaximeterIsNull() {
        Taxi taxi = new Taxi(false);
        Date date = new Date();
        taxi.run(date, 2);
    }

    @Test
    public void shouldReturnPrice() {
        Taxi taxi = new Taxi(false);
        taxi.setTaximeter(new Taximeter());
        Date date = new Date();
        Double price = taxi.run(date, 2);
        Assert.assertEquals(14, price, 0.0);
    }
}