package com.example.github.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbArea)实体类
 *
 * @author makejava
 * @since 2020-05-28 23:29:38
 */
@Data
public class TbArea implements Serializable {
    private static final long serialVersionUID = 508061095199407423L;
    
    private Date lastEditTime;
    
    private Date crateTime;
    
    private String areaName;
    
    private Integer priority;
    
    private Integer areaId;


}