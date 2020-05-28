package com.example.github.Utils;

import lombok.Data;

/**
 * 返回结果固定 对象
 */
@Data
public class ResultEnpty<T> {

    /**
     * 返回结果编码
     */
    private Integer code;

    /**
     * 返回结果信息
     */
    private String massage;

    /**
     * 返回结果数据
     */
    private T date;



    public static ResultEnpty success(String massage){
        ResultEnpty resultEnpty = new ResultEnpty();
        resultEnpty.setCode(200);
        resultEnpty.setMassage(massage);
        return resultEnpty;
    }
    public static <T> ResultEnpty success(String massage , T date){
        ResultEnpty resultEnpty = new ResultEnpty();
        resultEnpty.setCode(200);
        resultEnpty.setDate(date);
        resultEnpty.setMassage(massage);
        return resultEnpty;
    }

    public static  ResultEnpty error(String massage){
        ResultEnpty resultEnpty = new ResultEnpty();
        resultEnpty.setCode(-1);
        resultEnpty.setMassage(massage);
        return resultEnpty;
    }
    public static <T> ResultEnpty error(String massage , T date){
        ResultEnpty resultEnpty = new ResultEnpty();
        resultEnpty.setCode(-1);
        resultEnpty.setDate(date);
        resultEnpty.setMassage(massage);
        return resultEnpty;
    }



}
