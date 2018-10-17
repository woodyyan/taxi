package com.songbai;

import com.songbai.taxi.Taxi;
import com.songbai.taximeter.Taximeter;
import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;

public class TaxiTest {
    @Test(expected = InvalidParameterException.class)
    public void shouldThrowExceptionWhenTaximeterIsNull() {
        Taxi taxi = new Taxi();
        taxi.run(true, 2);
    }

    @Test
    public void shouldReturnPrice() {
        Taxi taxi = new Taxi();
        Taximeter taximeter = new InnerTaximeter();
        taxi.setTaximeter(taximeter);
        Double price = taxi.run(true, 2);
        Assert.assertEquals(14, price, 0.0);
    }
}