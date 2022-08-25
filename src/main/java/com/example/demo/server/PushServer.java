package com.example.demo.server;

import com.example.demo.domain.Weather;

/**
 *
 * @author 程序员小R
 * @date 2022/8/24 16:17
 */
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
