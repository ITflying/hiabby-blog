package com.hiabby.web.blog.entity;

/**
 * 用于展示在分类标签下具体的文章分类标签
 * @Author：Arthas
 * @Created：2017/4/25
 */

public class TagsArticleVO {
    private int id;
    private String name;
    private int num;
    private String title;
    private String fileName;
    private String date;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
