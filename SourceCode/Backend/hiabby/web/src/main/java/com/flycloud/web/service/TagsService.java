package com.flycloud.web.service;

import com.flycloud.web.entity.vo.TagsVO;

import java.util.List;

public interface TagsService {
    
    List<TagsVO> listArticleTags();
}
