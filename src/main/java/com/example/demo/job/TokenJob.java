package com.example.demo.job;


import com.example.demo.server.TokenServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 *
 * @author 程序员小R
 * @date 2022/8/24 16:17
 */
@Component
@Slf4j
public class TokenJob {

    @Autowired
    private TokenServer tokenServer;

    @Scheduled(cron = "0 0 */4 * * ? ")
    public void refreshToken() {
        log.info("refresh token start !!!");
        tokenServer.doGetToken();
        log.info("refresh token end !!!");
    }
}
