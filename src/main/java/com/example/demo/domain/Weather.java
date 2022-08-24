package com.example.demo.domain;

import lombok.Data;

/**
 * @author shenhao
 * @date 2022/8/24 16:41
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
