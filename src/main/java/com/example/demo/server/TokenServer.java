package com.example.demo.server;

/**
 *
 * @author 程序员小R
 * @date 2022/8/24 16:17
 */
public interface TokenServer {

    /**
     * 获取Token
     *
     * @return {@link java.lang.String}
     */
    String doGetToken();

    /**
     * 获取token
     *
     * @return {@link java.lang.String}
     */
    String getToken();
}
