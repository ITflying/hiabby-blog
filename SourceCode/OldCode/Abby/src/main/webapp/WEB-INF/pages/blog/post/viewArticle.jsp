<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/WEB-INF/commons/commonsJs/taglibs.jspf" %>
<%@ include file="/WEB-INF/commons/commonsJs/import-js-jquery.jspf" %>
<%@ include file="/WEB-INF/commons/commonsJs/import-js-all.jspf" %>
<html>
<head>
  <title>Abby`s Blog</title>

  <link rel="stylesheet" href="${ctx}/static/hiabbyWebsite/blog/article.css?v=1.0"/>
  <link rel="stylesheet" href="${ctx}/static/hiabbyWebsite/blog/blog.css"/>

  <script type="application/javascript">
    $(function(){

    })
  </script>
</head>
<body>
<header class="site-header" role="banner" >
  <div class="wrapper">
    <a class="site-title" href="/blog">Abby的小管家❤服务指南</a>
    <nav class="site-nav">
                <span class="menu-icon">
                <svg viewBox="0 0 18 15" width="18px" height="15px">
                  <path fill="#424242" d="M18,1.484c0,0.82-0.665,1.484-1.484,1.484H1.484C0.665,2.969,0,2.304,0,1.484l0,0C0,0.665,0.665,0,1.484,0 h15.031C17.335,0,18,0.665,18,1.484L18,1.484z"></path>
                  <path fill="#424242" d="M18,7.516C18,8.335,17.335,9,16.516,9H1.484C0.665,9,0,8.335,0,7.516l0,0c0-0.82,0.665-1.484,1.484-1.484 h15.031C17.335,6.031,18,6.696,18,7.516L18,7.516z"></path>
                  <path fill="#424242" d="M18,13.516C18,14.335,17.335,15,16.516,15H1.484C0.665,15,0,14.335,0,13.516l0,0 c0-0.82,0.665-1.484,1.484-1.484h15.031C17.335,12.031,18,12.696,18,13.516L18,13.516z"></path>
                </svg>
                </span>
      <div class="trigger">
        <a class="page-link" href="/hiabby">Home</a>
        <a class="page-link" href="/blog">Blog</a>
        <a class="page-link" href="/category">Category</a>
        <a class="page-link" href="/reading">Reading</a>
        <a class="page-link" href="/project">Project</a>
        <a class="page-link" href="/wiki">Wiki</a>
        <a class="page-link" href="/about">About</a>
      </div>
    </nav>
  </div>
</header>

<main class="page-content" aria-label="Content">
  <div class="wrapper">
    <div class="home">

      <header>
        <div style="width: 100%;text-align: center;"><h1 class="post-title">Fexo 文档</h1></div>

        <div class="article-meta">
          <span>
            <i class="icon-calendar"></i>
            <span>${article.pubDate}</span>
          </span>
          <span>
            <i class="icon-user"></i>
            <span>惊喜</span>
          </span>
          <span>
            <i class="icon-list"></i>
            <a class="article-category-link" href="/categories?cat=${article.tagsName}">${article.tagsName}</a>
          </span>

          <span>
            <i class="icon-list"></i>
            <span>浏览人数：</span><span>0</span>
          </span>

          <br>
          <span>
            <a class="btn zoombtn" href='#' onClick='javascript :history.back(-1);'> <i class="fa fa-chevron-left"></i> </a>
          </span>
        </div>
      </header>

      <div id="contentDiv">
        ${article.content}
      </div>
    </div>
  </div>
</main>

<script type="text/javascript" src="${ctx}/static/hiabbyWebsite/blog/blog.js"></script>
</body>
</html>
