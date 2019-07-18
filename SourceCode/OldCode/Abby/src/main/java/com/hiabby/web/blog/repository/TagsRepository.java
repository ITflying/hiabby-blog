package com.hiabby.web.blog.repository;

import com.hiabby.web.blog.entity.Tags;

import java.util.List;

/**
 * @Author：Arthas
 * @Created：2017/4/25
 */
public interface TagsRepository {
    public List<Tags> selectAllTags();
    public List<Tags> selectTagsArticle();
    public List<Tags> selectYearArticle();
}
