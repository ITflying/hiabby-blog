package com.flycloud.gateway.api.web.controller;

import com.alibaba.fastjson.JSON;
import com.flycloud.gateway.api.web.service.ExtService;
import com.flycloud.utils.bean.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author
 * @date 2020/1/22
 **/
@RestController
@RequestMapping("/v1")
public class ExtController {
    // region 配置

    @Autowired
    private ExtService extService;

    // endregion

    // region 上海公交车查询接口

    /**
     * 根据公交车名称来获取公交信息
     *
     * @param request
     * @return
     */
    @RequestMapping("/bus/get")
    public String getBusInfoByName(HttpServletRequest request) {
        ResponseResult rs = new ResponseResult();
        try{
            String busName = request.getParameter("busName");
            rs = extService.getBusInfoByName(busName);
        }catch (Exception e){
            rs.setStatus(ResponseResult.RESULT_STATUS_FAIL);
            rs.setMsg("服务器异常");
        }
        return JSON.toJSONString(rs);
    }

    // endregion
}
