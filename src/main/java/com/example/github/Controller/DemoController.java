package com.example.github.Controller;

import com.example.github.Entity.DO.DemoDO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对外接口控制层
 */
@RestController
public class DemoController {

    @GetMapping("demoGet")
    public String DemoGet(String demo){
        return demo + "如何赚钱";
    }

    @PostMapping("demoPost")
    public String DemoPost(DemoDO demo){
        int i = 1 / 0;
        return demo + "如何赚钱";
    }
}
