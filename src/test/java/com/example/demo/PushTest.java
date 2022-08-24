package com.example.demo;

import com.example.demo.server.PushServer;
import org.junit.jupiter.api.Test;


import javax.annotation.Resource;

public class PushTest extends DemoApplicationTests {
    @Resource
    private PushServer pushServer;


    @Test
    public void push() {
        pushServer.weatherPush();
    }
}
