package com.flycloud.web.controller;

import com.flycloud.utils.bean.ResponseResult;
import com.flycloud.web.entity.vo.ArticleListVO;
import com.flycloud.web.entity.vo.TagsVO;
import com.flycloud.web.service.TagsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 标签 请求转发类
 * @date 2019/8/9 
 **/
@RestController
@RequestMapping(value = "/tags")
public class TagsController {
    // region 配置
    
    private static final Logger logger = LoggerFactory.getLogger(TagsController.class);
    
    @Autowired
    private TagsService tagsService;
    
    // endregion

    // region 公有方法
    
    @RequestMapping("/listArticleTags")
    public ResponseResult listArticleTags(){
        ResponseResult responseResult = new ResponseResult();

        try{
            List<TagsVO> tagsVOS = tagsService.listArticleTags();
            responseResult.setResult(tagsVOS);
        }catch (Exception e){
            logger.error("获取文章分类列表错误："+e);
            responseResult.setFailInfo("获取文章分类列表失败", ResponseResult.RESULT_STATUS_FAIL);
        }

        return responseResult;
    }

    // endregion

}
