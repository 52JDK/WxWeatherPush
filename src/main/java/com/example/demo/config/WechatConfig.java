package com.example.demo.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WechatConfig {

    @Value("${wechat.appId}")
    public String appId;

    @Value("${wechat.appSecret}")
    public String appSecret;

    @Value("${wechat.accessTokenUrl}")
    public String accessTokenUrl;

    @Value("${wechat.wxTemplateUrl}")
    public String wxTemplateUrl;

    @Value("${wechat.toUser}")
    public String toUser;

    @Value("${wechat.templateId}")
    public String templateId;

    @Value("${weather.url}")
    public String weatherUrl;

    @Value("${weather.region}")
    public String weatherRegion;
}
