package com.hiabby.web.blog.service;

import com.hiabby.web.blog.entity.Tags;
import com.hiabby.web.blog.entity.TagsArticleVO;
import com.hiabby.web.blog.entity.YearArticleVO;

import java.util.List;

/**
 * @Author：Arthas
 * @Created：2017/4/25
 */
public interface TagsService  {
    public List<Tags> getAllTagsList();
    public List<TagsArticleVO> getTagsArticleList();
    public List<YearArticleVO> getYearArticleList();
}
