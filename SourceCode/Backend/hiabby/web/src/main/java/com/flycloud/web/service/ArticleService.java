package com.flycloud.web.service;

import com.flycloud.web.entity.vo.ArticleListVO;
import com.flycloud.web.entity.vo.ArticleVO;

import java.util.List;

/**
 *
 * @date 2019/8/9  
 **/
public interface ArticleService {
    
    List<ArticleListVO> listArticle();
    
    ArticleVO getArticleDetail();
}
