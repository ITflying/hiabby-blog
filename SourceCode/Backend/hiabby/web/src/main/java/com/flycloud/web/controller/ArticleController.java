package com.flycloud.web.controller;

import com.flycloud.utils.bean.ResponseResult;
import com.flycloud.web.entity.vo.ArticleListVO;
import com.flycloud.web.entity.vo.ArticleVO;
import com.flycloud.web.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 文章 服务转发类
 * @date 2019/8/9 
 **/
@RestController
@RequestMapping("/article")
public class ArticleController {
    //  region 配置
    
    private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    private ArticleService articleService;
    
    // endregion

    // region 文章

    /**
     * 获取文章列表
     * @param jsonParams
     * @return
     */
    @RequestMapping(value="/list")
    public ResponseResult listArticle(@RequestParam(value = "jsonparams") String jsonParams){
        ResponseResult responseResult = new ResponseResult();

        try{
            List<ArticleListVO> articleListVOList = articleService.listArticle();
            responseResult.setResult(articleListVOList);
        }catch (Exception e){
            logger.error("获取文章列表错误："+e);
            responseResult.setFailInfo("获取文章列表失败", ResponseResult.RESULT_STATUS_FAIL);
        }

        return responseResult;
    }

    /**
     * 获取文章内容
     * @param jsonParams
     * @return
     */
    @RequestMapping(value="/detail")
    public ResponseResult detail(@RequestParam(value = "jsonparams") String jsonParams){
        ResponseResult responseResult = new ResponseResult();

        try{
            ArticleVO articleVO = articleService.getArticleDetail();
            responseResult.setResult(articleVO);
        }catch (Exception e){
            logger.error("获取文章详情失败："+e);
            responseResult.setFailInfo("获取文章详情失败", ResponseResult.RESULT_STATUS_FAIL);
        }

        return responseResult;
    }
    
    
    // endregion

}
