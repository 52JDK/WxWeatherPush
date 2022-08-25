package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author 程序员小R
 * @date 2022/8/24 16:17
 */
@Data
@Builder
public class TemplateMsg {

    private Object value;

    private String color;

}
