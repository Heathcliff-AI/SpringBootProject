package com.example.github.Controller;

import com.example.github.Utils.Enumeration;
import com.example.github.Utils.RedisUtils;
import com.example.github.Utils.ResultEnpty;
import com.example.github.entity.DO.DemoDO;
import com.example.github.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 对外接口控制层
 */
@RestController
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private DemoService demoService;

    @Resource
    private RedisUtils redisUtils;

    @GetMapping("demoGet")
    public String DemoGet(String demo){
        Map<String , Object > map = new HashMap<>();
        map.put("游离" , "当所有想的说的要的爱的,都挤在心脏,行李箱里装不下我 想去的远方");
        String msg = Enumeration.OPERATION_SUCCESS.getMsg();
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        boolean b = redisUtils.hmset("孤独", map, 1000);
        return msg + "如何赚钱" + b;
    }

    @PostMapping("demoPost")
    public ResultEnpty DemoPost(DemoDO demo) throws InterruptedException {
        ResultEnpty resultEnpty = demoService.DemoServicetest();
        Object date = resultEnpty.getDate();
        return resultEnpty;

    }
}
