package com.jikexueyuan.coolweather.model;


public class City {

    private int id;

    private String city_name;

    private String city_code;

    private int province_id;

    public void setId(int id) {
        this.id = id;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public int getId() {
        return id;
    }

    public int getProvince_id() {
        return province_id;
    }

    public String getCity_code() {
        return city_code;
    }

    public String getCity_name() {
        return city_name;
    }
}
