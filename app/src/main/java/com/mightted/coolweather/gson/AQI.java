package com.mightted.coolweather.gson;

/**
 * Created by 晓深 on 2017/3/7.
 */

public class AQI {
    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;
    }
}
