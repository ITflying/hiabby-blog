package com.flycloud.web.mapper;

import com.flycloud.web.entity.vo.ArticleListVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 文章的数据操作类
 * @date 2019/8/9  
 **/
@Mapper
public interface ArticleMapper {

    /**
     * 获取文章表展示信息
     * @return
     */
    List<ArticleListVO> listArticle();
}
