package com.ht.bean;

import jxl.write.DateTime;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by ArrayBin on 2017/3/17.
 */
public class Files {

    private int id;//文档主键
    private String name; //文档名字
    private int days; //查询天数
    private String brand; //商品品牌
    private String pType; //商品类型
    private String pStatus; //商品状态
    private String fType; //文档类型
    private String fStatus; //文档状态
    private String fPath; //文件路径
    private Timestamp createTime; //创建时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getpStatus() {
        return pStatus;
    }

    public void setpStatus(String pStatus) {
        this.pStatus = pStatus;
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType;
    }

    public String getfStatus() {
        return fStatus;
    }

    public void setfStatus(String fStatus) {
        this.fStatus = fStatus;
    }

    public String getfPath() {
        return fPath;
    }

    public void setfPath(String fPath) {
        this.fPath = fPath;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Files{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", days=" + days +
                ", brand='" + brand + '\'' +
                ", pType='" + pType + '\'' +
                ", pStatus='" + pStatus + '\'' +
                ", fType='" + fType + '\'' +
                ", fStatus='" + fStatus + '\'' +
                ", fPath='" + fPath + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}