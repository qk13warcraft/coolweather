package com.example.mc.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by mc on 2017/4/20.
 *
 * 城市数据库表
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int privinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getPrivinceId() {
        return privinceId;
    }

    public void setPrivinceId(int privinceId) {
        this.privinceId = privinceId;
    }
}
