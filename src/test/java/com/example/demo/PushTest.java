package com.example.demo;

import com.example.demo.server.PushServer;
import com.example.demo.server.TokenServer;
import org.junit.jupiter.api.Test;


import javax.annotation.Resource;

public class PushTest extends DemoApplicationTests {

    @Resource
    private TokenServer tokenServer;

    @Resource
    private PushServer pushServer;

    @Test
    public void getToken() {
        tokenServer.doGetToken();
    }

    @Test
    public void push() {
        pushServer.weatherPush();
    }

    @Test
    public void getWeather() {
        pushServer.getWeather();
    }

}
