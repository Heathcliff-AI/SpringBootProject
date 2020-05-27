package com.example.github.Service.Impl;

import com.example.github.Service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String DemoServicetest() {
        String s = testDemo("1");
        int i = 1/0;
        return i + s;
    }



    private String testDemo(String id){
        return id + "11111";
    }
}
