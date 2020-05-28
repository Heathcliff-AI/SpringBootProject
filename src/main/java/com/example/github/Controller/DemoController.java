package com.example.github.Controller;

import com.example.github.entity.DO.DemoDO;
import com.example.github.service.DemoService;
import com.example.github.Utils.ResultEnpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对外接口控制层
 */
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("demoGet")
    public String DemoGet(String demo){
        return demo + "如何赚钱";
    }

    @PostMapping("demoPost")
    public ResultEnpty DemoPost(DemoDO demo) throws InterruptedException {
        ResultEnpty resultEnpty = demoService.DemoServicetest();
        Object date = resultEnpty.getDate();
        return resultEnpty;

    }
}
