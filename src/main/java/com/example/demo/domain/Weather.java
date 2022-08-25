package com.example.demo.domain;

import lombok.Data;

/**
 *
 * @author 程序员小R
 * @date 2022/8/24 16:17
 */
@Data
public class Weather {

    private String city;
    private String lastUpdateTime;
    private String date;
    private String weather;
    private String temp;
    private String humidity;
    private String wind;
    private String pm25;
    private String low;
    private String high;
    private String airData;
    private String airQuality;
    private String dateLong;
    private String weatherType;
    private String windLevel;
    private String province;
}
