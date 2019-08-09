package com.flycloud.web.mapper;

import com.flycloud.web.entity.Tags;
import com.flycloud.web.entity.vo.ArticleListVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 分类数据操作类
 * @date 2019/8/9  
 **/
@Mapper
public interface TagsMapper {

    /**
     * 获取文章表展示信息
     * @return
     */
    List<Tags> listArticleTags();
}
