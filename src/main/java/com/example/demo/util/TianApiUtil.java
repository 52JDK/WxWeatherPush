package com.example.demo.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shenhao
 * @date 2022/8/24 19:44
 */
public class TianApiUtil {

    /**
     * 获取彩虹屁
     * @return
     */
    public static String getCaiHongPi() {
        String httpUrl = "http://api.tianapi.com/caihongpi/index?key=8babebeb012a120cf60029df547a70be";
        String result = null;
        try {
            result = HttpUtil.sendPost(httpUrl, "");
            System.out.println(result);
        } catch (Exception ignored) {

        }
        JSONObject jsonObject = JSONObject.parseObject(result);
        JSONArray newslist = jsonObject.getJSONArray("newslist");
        String content = newslist.getJSONObject(0).getString("content");
        return content;
    }

    /**
     * 获取英文优美句子
     * @return
     */
    public static Map<String,String> getEnsentence() {
        String httpUrl = "http://api.tianapi.com/ensentence/index?key=8babebeb012a120cf60029df547a70be";
        String result = null;
        try {
            result = HttpUtil.sendPost(httpUrl, "");
            System.out.println(result);
        } catch (Exception ignored) {

        }
        JSONObject jsonObject = JSONObject.parseObject(result);
        JSONArray newslist = jsonObject.getJSONArray("newslist");
        String en = newslist.getJSONObject(0).getString("en");
        String zh = newslist.getJSONObject(0).getString("zh");
        Map<String, String> map = new HashMap<>();
        map.put("zh", zh);
        map.put("en", en);
        return map;

    }

    public static void main(String[] args) {
        System.out.println(getEnsentence());
    }
}
