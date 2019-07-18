package com.hiabby.web.blog.service.Impl;

import com.common.commonconst.SysConst;
import com.hiabby.web.blog.entity.Article;
import com.hiabby.web.blog.entity.ArticleVO;
import com.hiabby.web.blog.repository.BlogRepository;
import com.hiabby.web.blog.service.BlogServers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author：Arthas
 * @Created：2017/4/21
 */
@Service("BlogServersImpl")
public class BlogServersImpl implements BlogServers{
    @Autowired
    private BlogRepository blogRepository;

    public Map<String,String> refreshBlogArticle(File articleFolder){
        Map<String,String> res = new HashMap<String,String>();

        InputStreamReader fileRead = null;
        BufferedReader input = null;
        StringBuffer summaryBuffer = null; //简介
        StringBuffer buffer = null; //全文
        List<Article> articleList = null;
        Article article = null;

        String content,text,title = "", summary = "",prefix,date;
        int temp = 0;

        if (articleFolder.exists()){
            List<String> dbArticleName = blogRepository.getArticleAllNames();
            File[] articles = articleFolder.listFiles();
            articleList = new ArrayList<Article>();

            for (File articleFile:articles){
                if(dbArticleName.contains(articleFile.getName())){
                    continue;
                }

                try {
                    fileRead = new InputStreamReader(new FileInputStream(articleFile), "UTF-8");
                    input = new BufferedReader(fileRead);
                    summaryBuffer = new StringBuffer();
                    buffer = new StringBuffer();
                    article = new Article();

                    while ((text = input.readLine()) != null) {
                        if ("## summary".equals(text.toLowerCase()) || "## 简介".equals(text) || temp == 1 || temp == 2){
                            if (temp == 2){
                                summaryBuffer.append(text);
                                while ((text = input.readLine()).length() > 0){
                                    summaryBuffer.append(text);
                                    buffer.append(text + "\n");
                                }
                            }
                            temp = temp + 1;
                        }

                        buffer.append(text + "\n");
                    }

                    date = changeStrToDateFormat(articleFile.getName().substring(0, 12));
                    title = articleFile.getName().substring(12).split(".")[0];

                    article.setTitle(title);
                    article.setPubDate(date);
                    article.setSummary(summaryBuffer.toString());
                    article.setContent(buffer.toString());
                    article.setFileName(articleFile.getName());
                    article.setIsDelete("FALSE");
                    article.setIsHide("FALSE");

                    prefix = articleFile.getName().substring(articleFile.getName().lastIndexOf(".")+1); //后缀名
                    article.setIsMd(prefix);
                    articleList.add(article);
                }catch (IOException e){
                    System.out.println("IOException = " + e);
                }catch (Exception e){
                    System.out.println("Exception = " + e);
                }
            }

            if (articleList.size() > 0){
                blogRepository.insertArticles(articleList);
            }
            else{
                res.put("STATUC", SysConst.SYS_RET_SUCCESS) ;
                res.put("RESULT", "没有新的文章可以同步") ;
                return res;
            }
            res.put("STATUC", SysConst.SYS_RET_SUCCESS) ;
            res.put("RESULT", "同步文章成功") ;
        }
        else{
            res.put("STATUC", SysConst.SYS_RET_FAILED) ;
            res.put("RESULT", "不存在该文件夹") ;
        }


        return res;
    }

    //获取所有可展示的文章
    public List<ArticleVO> getAllShowArticleList(){
        return blogRepository.getAllShowArticleList();
    }

    //根据文章名称和日期来查询文章并返回显示内容
    public ArticleVO getArticleByArticleName(String date,String name){
        return blogRepository.getArticleByArticleName(date, name);
    }

    private String changeStrToDateFormat(String date){
        String formatDate = "";
        formatDate = formatDate + date.substring(0,4) + "-";
        formatDate = formatDate + date.substring(4,6) + "-";
        formatDate = formatDate + date.substring(6,8) + "-";
        formatDate = formatDate + " " + date.substring(8,10) + ":";
        formatDate = formatDate + date.substring(10);

        return formatDate;
    }
}
