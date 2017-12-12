package com.hiabby.web.blog.controller;

import com.hiabby.web.blog.entity.*;
import com.hiabby.web.blog.service.BlogServers;

import com.hiabby.web.blog.service.TagsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author：Arthas
 * @Created：2017/4/19
 */
@Controller
public class BlogController {
    private static final Logger logger = LoggerFactory.getLogger(BlogController.class);

    @Autowired(required = false)
    @Qualifier("BlogServersImpl")
    private BlogServers blogServersImpl;

    @Autowired(required = false)
    @Qualifier("TagsServiceImpl")
    private TagsService tagsServiceImpl;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //博客文章列表页面
    @RequestMapping(value="/blog",method = RequestMethod.GET)
    public String blogIndex(Model model){
        List<ArticleVO> articleList = new ArrayList<ArticleVO>();

        try{
            articleList = blogServersImpl.getAllShowArticleList();
            model.addAttribute("articleList",articleList);
        }catch (Exception e){
            logger.error("获取文章列表错误："+e);
        }

        return "blog/blog";
    }

    @RequestMapping(value="/blog/viewArticle")
    public String viewArticle(Model model,HttpServletRequest request){
        ArticleVO articleVO = new ArticleVO();
        String date = "";
        String name = "";
        try{
            date = request.getParameter("date");
            name = request.getParameter("name");
            articleVO = blogServersImpl.getArticleByArticleName(date, name);
            model.addAttribute("article",articleVO);
        }catch (Exception e){
            logger.error("获取文章错误："+e);
        }

        return "blog/post/viewArticle";
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //分类
    @RequestMapping(value="/category",method = RequestMethod.GET)
    public String tagsIndex(Model model){
        List<Tags> tagsList = new ArrayList<Tags>();
        List<TagsArticleVO> tagsArticleVOList = new ArrayList<TagsArticleVO>();
        List<YearArticleVO> yearArticleVOList = new ArrayList<YearArticleVO>();

        try{
            tagsList = tagsServiceImpl.getAllTagsList();
            tagsArticleVOList  = tagsServiceImpl.getTagsArticleList();
            yearArticleVOList = tagsServiceImpl.getYearArticleList();

            model.addAttribute("tagsList",tagsList);
            model.addAttribute("tagsArticleList",tagsArticleVOList);
            model.addAttribute("yearArticleList",yearArticleVOList);
        }catch (Exception e){
            logger.error("获取分类信息有误："+e);
        }

        return "blog/category";
    }



    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //阅读
    @RequestMapping(value="/reading",method = RequestMethod.GET)
    public String readingIndex(){

        return "blog/reading";
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //项目
    @RequestMapping(value="/project",method = RequestMethod.GET)
    public String projectIndex(){

        return "blog/project";
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //wiki
    @RequestMapping(value="/wiki",method = RequestMethod.GET)
    public String wikiIndex(){
        System.out.println("nihao");
        return "blog/wiki";
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //关于
    @RequestMapping(value="/about",method = RequestMethod.GET)
    public String aboutIndex(){
        return "blog/about";
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //文章同步功能
    //刷新文章到数据库当中
    @RequestMapping(value="/refreshBlogArticle",method = RequestMethod.GET)
    public void rerefreshBlogArticle(HttpServletRequest request){
        String webPath = "/WEB-INF/pages/blog/article";
        String webFileName = request.getSession().getServletContext().getRealPath("/") + webPath;
        File articleFolders = new File(webFileName);
        Map<String,String> res = new HashMap<String,String>();

        try {
            res = blogServersImpl.refreshBlogArticle(articleFolders);
        }catch (Exception e){
            logger.error("同步文章错误：" + e);
            System.out.println("同步文章失败。");
        }

        System.out.println(res.get("RESULT"));
    }

    @RequestMapping(value="testGetArray")
    @ResponseBody
    public void testGetArray(HttpServletRequest request){
        String userNamesStr = request.getParameter("userNamesStr");

        if (userNamesStr.length() > 0) {
            List<String> userNames = new ArrayList<String>();
            String[] userNamesArray = userNamesStr.split(",");

            for (int i = 0; i < userNamesArray.length; i++) {
                userNames.add(userNamesArray[i]);
            }

            System.out.println(userNames);
        }
    }
}
