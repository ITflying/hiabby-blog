package com.flycloud.web.service.impl;

import com.flycloud.web.controller.ArticleController;
import com.flycloud.web.entity.vo.ArticleListVO;
import com.flycloud.web.entity.vo.ArticleVO;
import com.flycloud.web.mapper.ArticleMapper;
import com.flycloud.web.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文章 方法
 * @date 2019/8/9  
 **/
@Service
public class ArticleServiceImpl implements ArticleService {
    // region 配置

    private static final Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);

    @Autowired
    ArticleMapper articleMapper;
    
    // endregion
    
    // region 公有方法
    
    @Override
    public List<ArticleListVO> listArticle() {
        return articleMapper.listArticle();
    }

    @Override
    public ArticleVO getArticleDetail() {
        return null;
    }

    // endregion
}
