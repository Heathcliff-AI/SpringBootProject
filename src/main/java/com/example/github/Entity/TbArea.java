package com.example.github.Entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbArea)实体类
 *
 * @author makejava
 * @since 2020-05-28 23:29:38
 */
public class TbArea implements Serializable {
    private static final long serialVersionUID = 508061095199407423L;
    
    private Date lastEditTime;
    
    private Date crateTime;
    
    private String areaName;
    
    private Integer priority;
    
    private Integer areaId;


    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

}