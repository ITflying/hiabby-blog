package com.hiabby.web.interesting.repository;

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
public interface TempRepository {
    public int insertIntoTemp(@Param(value = "temp")String temp,@Param(value = "num")int num);
}
