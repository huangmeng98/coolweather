package com.example.hp.coolweather.gson;

import java.util.List;

/**
 * Created by hp on 2017/12/6.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SuppressWarnings("daily_forecast")
    public List<Forecast> forecastList;
}
