package com.hiabby.web.blog.repository;

import com.hiabby.web.blog.entity.Article;
import com.hiabby.web.blog.entity.ArticleVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author：Arthas
 * @Created：2017/4/24
 */
@Repository
public interface BlogRepository {
    public List<String> getArticleAllNames();
    public int insertArticles(@Param(value = "articleList")List<Article> articleList);
    public List<ArticleVO> getAllShowArticleList();

    public ArticleVO getArticleByArticleName(@Param(value = "date")String date,@Param(value = "name")String name);
}
