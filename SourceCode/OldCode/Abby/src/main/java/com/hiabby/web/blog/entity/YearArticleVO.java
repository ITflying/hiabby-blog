package com.hiabby.web.blog.entity;

/**
 * 用于展示在分类页面中Timeline下的文章时间轴
 * @Author：Arthas
 * @Created：2017/4/25
 */
public class YearArticleVO {
    private String year;
    private String month;
    private String title;
    private String fileName;
    private String date;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
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
