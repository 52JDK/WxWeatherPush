package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TemplateMsg {

    private Object value;

    private String color;

}
