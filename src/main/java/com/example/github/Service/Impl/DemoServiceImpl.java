package com.example.github.Service.Impl;

import com.example.github.Dao.TbAreaDao;
import com.example.github.Entity.TbArea;
import com.example.github.Service.DemoService;
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
