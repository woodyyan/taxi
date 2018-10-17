package com.songbai.utils;

import java.util.Calendar;
import java.util.Date;

public final class HourUtil {

    public static int getHour(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(true);
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }
}
