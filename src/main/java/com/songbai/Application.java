package com.songbai;

import com.songbai.taxi.CitySystem;

public class Application {
    public static void main(String args[]) throws Exception {

        // 乘客白天在内环坐出租车，行驶2公里，应付费14元
        String result = CitySystem.takeTaxi(true, true, 2);
        System.out.println(result);

        // 乘客白天在内环坐出租车，行驶4公里，应付费16.5元
        result = CitySystem.takeTaxi(true, true, 4);
        System.out.println(result);

        // 乘客白天在内环坐出租车，行驶11公里，应付费35元
        result = CitySystem.takeTaxi(true, true, 11);
        System.out.println(result);

        // 乘客晚上在内环坐出租车，行驶2公里，应付费18元
        result = CitySystem.takeTaxi(true, false, 2);
        System.out.println(result);

        // 乘客晚上在内环坐出租车，行驶4公里，应付费21元
        result = CitySystem.takeTaxi(true, false, 4);
        System.out.println(result);

        // 乘客晚上在内环坐出租车，行驶11公里，应付费43.7元
        result = CitySystem.takeTaxi(true, false, 11);
        System.out.println(result);

        // 乘客白天在外环坐出租车，行驶2公里，应付费14元
        result = CitySystem.takeTaxi(false, true, 2);
        System.out.println(result);

        // 乘客白天在外环坐出租车，行驶4公里，应付费16.5元
        result = CitySystem.takeTaxi(false, true, 4);
        System.out.println(result);

        // 乘客白天在外环坐出租车，行驶11公里，应付费34元
        result = CitySystem.takeTaxi(false, true, 11);
        System.out.println(result);

        // 乘客晚上在外环坐出租车，行驶2公里，应付费18元
        result = CitySystem.takeTaxi(false, false, 2);
        System.out.println(result);

        // 乘客晚上在外环坐出租车，行驶4公里，应付费21元
        result = CitySystem.takeTaxi(false, false, 4);
        System.out.println(result);

        // 乘客晚上在外环坐出租车，行驶11公里，应付费42元
        result = CitySystem.takeTaxi(false, false, 11);
        System.out.println(result);
    }
}
