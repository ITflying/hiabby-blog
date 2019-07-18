package com.hiabby.web.index.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author：Arthas
 * @Created：2017/4/19
 */
@Controller
@RequestMapping(value="/")
public class HiabbyController {
    private static final Logger logger = LoggerFactory.getLogger(HiabbyController.class);

    @RequestMapping(value = "hiabby",method = RequestMethod.GET)
    public String hiabby(ModelMap model) {
        return "index";
    }
}
