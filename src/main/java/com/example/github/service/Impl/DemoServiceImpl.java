package com.example.github.service.Impl;

import com.example.github.dao.TbAreaDao;
import com.example.github.entity.TbArea;
import com.example.github.service.DemoService;
import com.example.github.Utils.ResultEnpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private TbAreaDao tbAreaDao;

    @Override
    public ResultEnpty DemoServicetest() {
        TbArea tbArea = new TbArea();
        tbArea.setAreaId(1);
        List<TbArea> tbAreas = tbAreaDao.queryAll(tbArea);

        String s = testDemo("1");
        int i = 10;


        return ResultEnpty.success("成功了" ,tbAreas);
    }



    private String testDemo(String id){
        return id + "11111";
    }
}
