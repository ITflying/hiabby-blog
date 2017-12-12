<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/commons/commonsJs/taglibs.jspf" %>
<%@ include file="/WEB-INF/commons/commonsJs/import-js-jquery.jspf" %>
<%@ include file="/WEB-INF/commons/commonsJs/import-js-all.jspf" %>

<html>
<head>
  <title>Abby`s Blog - Project</title>

  <link rel="stylesheet" href="static/hiabbyWebsite/blog/blog.css"/>
  <link rel="stylesheet" href="static/hiabbyWebsite/project/project.css"/>

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
      <h1 class="page-heading">Project</h1>
      <ul class="post-list">
        <li>
          <div class="content">
          <div class="wrapper">
            <div class="light">
              <i>
              </i>
            </div>

            <div class="main">
              <h1 class="title">
                梦回仙剑----文字RPG冒险游戏
              </h1>
              <div class="year">
                <h2>
                  <a href="#">
                    2013年
                    <i>
                    </i>
                  </a>
                </h2>
                <div class="list">
                  <ul>
                    <li class="cls ">
                      <p class="date">
                        07.07
                      </p>
                      <p class="intro">
                        用C语言完成了梦回仙剑文字冒险RPG游戏
                      </p>
                      <p class="version">
                        V1.0
                      </p>
                      <div class="more">
                          <span style="color:#E53333;">
                            特点：
                          </span>
                        <br />
                        纯文字冒险
                        <br />
                        C语言
                        <br />
                        还算可以
                        <br />

                      </div>
                    </li>

                  </ul>
                </div>
              </div>

            </div>
          </div>
        </div>
        </li>
      </ul>
    </div>
  </div>
</main>

<script type="text/javascript">
  $(function() {
    var e = $(".nav");
            if(e.offset() != null){
      t = e.offset().left;
              $(window).on("resize",
                      function() {
                        t = e.offset().left
                      });
              var n = e.find("li.current"),
                      r = {
                        width: n.innerWidth(),
                        left: n.offset().left - t
                      },
                      i = $(".nav .underscore i"),
                      s;
              e.find("li:not(.underscore):not(.last)").mouseover(function() {
                var e = $(this);
                s = setTimeout(function() {
                          i.css({
                            width: e.innerWidth(),
                            left: e.offset().left - t
                          })
                        },
                        100)
              });

              var o = function() {
                clearTimeout(s),
                        i.css(r)
              };
              e.mouseleave(o).find("li.last").mouseover(o),
                      i.css(r).show(),
                      n.css("border-color", "#fff")
    }
  })
</script>
<script>
  $(".main .year .list").each(function(e, t) {
    var n = $(t),
            r = n.find("ul");
    n.height(r.outerHeight()),
            r.css("position", "absolute")
  }),
          $(".main .year>h2>a").click(function(e) {
            e.preventDefault(),
                    $(this).parents(".year").toggleClass("close")
          })
</script>
</body>
</html>
