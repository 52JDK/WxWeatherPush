package com.example.demo;

import com.example.demo.server.PushServer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    private PushServer pushServer;

    @Test
    void contextLoads() {
        pushServer.weatherPush();
    }


}
