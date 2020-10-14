package com.example.github.service.Impl;

import com.example.github.Utils.ResultEnpty;
import com.example.github.dao.TbAreaDao;
import com.example.github.entity.TbArea;
import com.example.github.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    private final Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TbAreaDao tbAreaDao;

    @Override
    public ResultEnpty DemoServicetest() {
        TbArea tbArea = new TbArea();
        tbArea.setAreaId(1);
        List<TbArea> tbAreas = tbAreaDao.queryAll(tbArea);

        String s = testDemo("1");
        int i = 10;
        for(int j= 1; j <100 ; j++){
            logger.info("异步日志打印"+ j);
        }
        System.out.println("谁先打印");
        return ResultEnpty.success("成功了" ,tbAreas);
    }



    private String testDemo(String id){
        return id + "11111";
    }
}
