package com.example.demo.server.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.config.WechatConfig;
import com.example.demo.server.TokenServer;
import com.example.demo.util.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TokenServerImpl implements TokenServer {

    public String token;

    @Autowired
    WechatConfig wechatConfig;

    @Override
    public String doGetToken() {
        String url = wechatConfig.accessTokenUrl;
        String realURL = url.replaceAll("APPID", wechatConfig.appId).replaceAll("APPSECRET", wechatConfig.appSecret);
        //调用获得access_token的接口
        JSONObject jsonObject;
        try {
            String result = HttpUtil.sendJson(realURL, "");
            jsonObject = JSONObject.parseObject(result);
            //从结果中取出access_token
            String access_token = jsonObject.get("access_token").toString();
            //把得到的token存在静态变量中
            log.info("do get token {}", access_token);
            token = access_token;
            return token;
        } catch (Exception e) {
            log.error("do get token error ", e);
            return null;
        }
    }

    @Override
    public String getToken() {
        return token;
    }

}
