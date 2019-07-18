package com.hiabby.web.blog.service;

import com.hiabby.web.blog.entity.Article;
import com.hiabby.web.blog.entity.ArticleVO;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * @Author：Arthas
 * @Created：2017/4/21
 */
public interface BlogServers {
    public Map<String,String> refreshBlogArticle(File articleFolder);
    public List<ArticleVO> getAllShowArticleList();
    public ArticleVO getArticleByArticleName(String date,String name);
}
