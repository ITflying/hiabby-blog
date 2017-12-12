package com.hiabby.web.blog.service.Impl;

import com.hiabby.web.blog.entity.Tags;
import com.hiabby.web.blog.entity.TagsArticleVO;
import com.hiabby.web.blog.entity.YearArticleVO;
import com.hiabby.web.blog.repository.TagsRepository;
import com.hiabby.web.blog.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：Arthas
 * @Created：2017/4/25
 */
@Service("TagsServiceImpl")
public class TagsServiceImpl implements TagsService{
    @Autowired
    private TagsRepository tagsRepository;

    public List<Tags> getAllTagsList(){
        return tagsRepository.selectAllTags();
    }

    public List<TagsArticleVO> getTagsArticleList(){
        List<TagsArticleVO> tagsArticleVOList = new ArrayList<TagsArticleVO>();
        return tagsArticleVOList;
    }

    public List<YearArticleVO> getYearArticleList(){
        List<YearArticleVO> yearArticleVOList = new ArrayList<YearArticleVO>();
        return yearArticleVOList;
    }
}
