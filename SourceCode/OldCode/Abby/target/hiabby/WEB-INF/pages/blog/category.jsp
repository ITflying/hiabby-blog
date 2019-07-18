<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/commons/commonsJs/taglibs.jspf" %>
<%@ include file="/WEB-INF/commons/commonsJs/import-js-jquery.jspf" %>
<%@ include file="/WEB-INF/commons/commonsJs/import-js-all.jspf" %>
<html>
<head>
  <title>Abby`s Blog - Tags</title>

  <link rel="stylesheet" href="static/hiabbyWebsite/blog/blog.css"/>
  <link rel="stylesheet" href="static/hiabbyWebsite/category/category.css"/>

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
      <h1 class="page-heading">Category</h1>

     <span>
             <input class='tgl tgl-flip' id='switchLabel' type='checkbox'>
             <label class='tgl-btn' data-tg-off='Tags' data-tg-on='TimeLine' for='switchLabel'></label>
     </span>

      <div id="tagsDiv">
       <ul class="post-list">
        <li>
          <div class="category-list">
            <c:forEach items="${tagsList}" var="tagsList" varStatus="vs">
              <a class="category-item" href="#${tagsList.name}">
                <span class="category-name">${tagsList.name}</span>
                <span class="category-size">( ${tagsList.num} )</span>
              </a>
            </c:forEach>
          </div>
        </li>
       </ul>

        <ul class="post-list">
          <c:forEach items="${tagsArticleList}" var="tagsArticleList" varStatus="vs">
            <li>
              <h2 id="前端">
                前端: <span> 42</span>
              </h2>
              <ul class="organize-item">
                <li class="post-item">
                  <h3>
                    <a href="/2015/11/14/pandoc/"><span class="post-time">2015/11/14</span> 文本转换神器——Pandoc</a>
                  </h3>
                </li>
              </ul>
            </li>
          </c:forEach>
        </ul>
      </div>

      <div id="timeLineDiv" class="timeLineDiv blogHide">
        <c:forEach items="${yearsArticleList}" var="yearsArticleList" varStatus="vs">
          <ul class="post-list">
            <li>
              <div class="year">2017</div>
              <div class="month">April</div>
              <div class="detail">1<span class="post-time">2017/04/14</span><a href="/vue/2017/04/02/vue-starting.html">第一次使用vue构建一个上传图片表单</a></div>
              <div class="detail">2<span class="post-time">2017/04/14</span><a href="/vue/2017/04/02/vue-starting.html">第一次使用vue构建一个上传图片表单</a></div>
              <div class="detail">3<span class="post-time">2017/04/14</span><a href="/vue/2017/04/02/vue-starting.html">第一次使用vue构建一个上传图片表单</a></div>
              <div class="detail">4<span class="post-time">2017/04/14</span><a href="/vue/2017/04/02/vue-starting.html">第一次使用vue构建一个上传图片表单</a></div>
            </li>
          </ul>
        </c:forEach>

      </div>

    <hr>
    </div>
  </div>
</main>

<script src="${ctx}/static/hiabbyWebsite/category/category.js"></script>
</body>
</html>
