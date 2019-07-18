package com.hiabby.web.blog.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author：Arthas
 * @Created：2017/4/24
 */
@Table(name = "tags")
public class Tags {
    @Id
    private int id;
    private String name;
    private int num;

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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
