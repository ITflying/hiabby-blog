package com.flycloud.gateway.api.web.service;

import com.alibaba.fastjson.JSON;
import com.flycloud.utils.bean.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * @author
 * @date 2020/1/22
 **/
@Service
public class ExtService {
    // region 配置

    @Autowired
    RestTemplate restTemplate;
    
    // endregion
    
    // region
    
    public ResponseResult getBusInfoByName(String busName){
        ResponseResult rs = new ResponseResult();
        rs.setMsg("!23");
        return rs;
    }
    
    // endregoin
}
