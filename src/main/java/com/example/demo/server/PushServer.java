package com.example.demo.server;

import com.example.demo.domain.Weather;

public interface PushServer {

    /**
     * 天气push
     */
    void weatherPush();

    /**
     * 获取天气
     *
     * @return {@link Weather}
     */
    Weather getWeather();

}
