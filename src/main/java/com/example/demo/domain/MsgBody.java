package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author shenhao
 * @date 2022/8/24 17:32
 */
@Data
@Builder
public class MsgBody {


    private TemplateMsg nowTem;

    private TemplateMsg date;

    private TemplateMsg lowTem;

    private TemplateMsg highTem;

    private TemplateMsg wind;

    private TemplateMsg loveDate;

    private TemplateMsg birthday;

    private TemplateMsg weather;

    private TemplateMsg caihongpi;

    private TemplateMsg enText;

    private TemplateMsg zhText;


}
