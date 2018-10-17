package com.songbai;

import com.songbai.taxi.CitySystem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {
    public static void main(String args[]) throws Exception {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date daytime = simpleDateFormat.parse("2018-10-15 10:11:00");
        Date night = simpleDateFormat.parse("2018-10-15 23:11:00");
        Date peakTime = simpleDateFormat.parse("2018-10-15 19:11:00");

        // 乘客白天在内环坐出租车，行驶2公里，应付费14元
        String result = CitySystem.takeTaxi(false, daytime, 2);
        System.out.println(result);

        // 乘客白天在内环坐出租车，行驶4公里，应付费16.5元
        result = CitySystem.takeTaxi(false, daytime, 4);
        System.out.println(result);

        // 乘客白天在内环坐出租车，行驶11公里，应付费35元
        result = CitySystem.takeTaxi(false, daytime, 11);
        System.out.println(result);

        // 乘客晚上在内环坐出租车，行驶2公里，应付费18元
        result = CitySystem.takeTaxi(false, night, 2);
        System.out.println(result);

        // 乘客晚上在内环坐出租车，行驶4公里，应付费21元
        result = CitySystem.takeTaxi(false, night, 4);
        System.out.println(result);

        // 乘客晚上在内环坐出租车，行驶11公里，应付费43.7元
        result = CitySystem.takeTaxi(false, night, 11);
        System.out.println(result);

        // 乘客白天在外环坐出租车，行驶2公里，应付费14元
        result = CitySystem.takeTaxi(true, daytime, 2);
        System.out.println(result);

        // 乘客白天在外环坐出租车，行驶4公里，应付费16.5元
        result = CitySystem.takeTaxi(true, daytime, 4);
        System.out.println(result);

        // 乘客白天在外环坐出租车，行驶11公里，应付费34元
        result = CitySystem.takeTaxi(true, daytime, 11);
        System.out.println(result);

        // 乘客晚上在外环坐出租车，行驶2公里，应付费18元
        result = CitySystem.takeTaxi(true, night, 2);
        System.out.println(result);

        // 乘客晚上在外环坐出租车，行驶4公里，应付费21元
        result = CitySystem.takeTaxi(true, night, 4);
        System.out.println(result);

        // 乘客晚上在外环坐出租车，行驶11公里，应付费42元
        result = CitySystem.takeTaxi(true, night, 11);
        System.out.println(result);

        // 乘客白天高峰期在内环坐出租车，行驶11公里，应付费56元
        result = CitySystem.takeTaxi(false, peakTime, 11);
        System.out.println(result);
    }
}
