package com.flycloud.web.service.impl;

import com.flycloud.web.entity.Tags;
import com.flycloud.web.entity.vo.TagsVO;
import com.flycloud.web.mapper.TagsMapper;
import com.flycloud.web.service.TagsService;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author
 * @date 2019/8/9 
 **/
@Service
public class TagsServiceImpl implements TagsService {
    // region 配置

    private static final Logger logger = LoggerFactory.getLogger(TagsServiceImpl.class);

    @Autowired
    TagsMapper tagsMapper;
    
    // endregion

    // region 公有方法

    @Override
    public List<TagsVO> listArticleTags() {
        List<TagsVO> tagsVOList = Lists.newArrayList();
        List<Tags> tagsList = tagsMapper.listArticleTags();
        if (CollectionUtils.isEmpty(tagsList)){
            return Lists.newArrayList();
        }
        
        
        return null;
    }
    
    // endregion

}
