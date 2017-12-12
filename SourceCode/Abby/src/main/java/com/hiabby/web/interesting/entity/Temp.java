package com.hiabby.web.interesting.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author：Arthas
 * @Created：2017/4/24
 */
@Table(name = "temp")
public class Temp {
    @Id
    private int id;
    private String temp;
    private int num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
