package com.songbai.taximeter;

import com.songbai.utils.HourUtil;

import java.util.Date;

public class PeakHour {
    private Date from;
    private Date to;
    private double rate;

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean contains(Date startingTime) {
        int hour = HourUtil.getHour(startingTime);
        int fromHour = HourUtil.getHour(from);
        int toHour = HourUtil.getHour(to);
        return hour >= fromHour && hour <= toHour;
    }
}
