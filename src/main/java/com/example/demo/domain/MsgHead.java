package com.example.demo.domain;

import lombok.Data;

/**
 * @author shenhao
 * @date 2022/8/24 17:34
 */
@Data
public class MsgHead {


    private String touser = "oXpbp5wG3cfidmqBPHr6KJCm3Xpc";

    private String template_id ="8it93NOs0NQ4XrN6qY8DcoYM-sU9vKgomfScSsvK2OU";

    private String url = "http://weixin.qq.com/download";

    private String topcolor = "#FF0000";

    private MsgBody data;
}
