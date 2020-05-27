package com.example.github.Utils;

import com.alibaba.fastjson.JSON;

public class Convert {
    /**
     * 将对象转换成另一个对象
     * 对象字段要一致
     * @return
     */
    public static<T> T objectConvert(Object obj, Class<T> tClass){
        String s = JSON.toJSONString(obj);
        return JSON.parseObject(s ,tClass );
    }

    /**
     * 将json字符串转换成另一个对象
     * 对象字段要一致
     * @return
     */
    public static<T> T JsonToObjectConvert(String s, Class<T> tClass){
        return JSON.parseObject(s ,tClass );
    }
}
