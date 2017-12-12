package com.hiabby.web.interesting.controller;

import com.hiabby.web.interesting.utils.CreateTemp;
import com.hiabby.web.interesting.service.InterestingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author：Arthas
 * @Created：2017/4/26
 */
@Controller
public class InterestingController {
    private static final Logger logger = LoggerFactory.getLogger(InterestingController.class);

    @Autowired(required = false)
    @Qualifier("InterestingServiceImpl")
    private InterestingService interestingServiceImpl;

    @RequestMapping(value="inputDotMatrix")
    public String inputDotMatrix(HttpServletRequest request){
        return "input";
    }

    @RequestMapping(value="inputTemp")
    public String inputTemp(HttpServletRequest request,Model model){
        String temp = request.getParameter("temp");
        int row = Integer.parseInt(request.getParameter("row"));
        int num = Integer.parseInt(request.getParameter("num"));
        CreateTemp createTemp = new CreateTemp();

        try{
            interestingServiceImpl.insertTemp(temp, row, num);
            model.addAttribute("tips","提交成功！");
        }catch (Exception e){
            logger.error("提示信息：有错误，请重新录入\n"+e);
            model.addAttribute("tips","提示信息：有错误，请重新录入\n"+e);
        }
        return "input";
    }
}
