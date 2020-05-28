package com.example.github.FrameworkConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 捕获异常的处理方式
 */
@ControllerAdvice
public class ExceptionHandlerConfig {

    private Logger logger = LoggerFactory.getLogger(SpringAopConfig.class);
    /**
     * 全局异常处理，反回异常返回统一格式的map
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map<String,Object> exceptionHandler(Exception ex){
        Map<String,Object> map  = new HashMap<>();
        map.put("code",-1);
        map.put("mag",ex.getMessage());
        //发生异常进行日志记录，写入数据库或者其他处理，此处省略
        logger.error("捕获异常" , ex);
        return map;
    }

}

