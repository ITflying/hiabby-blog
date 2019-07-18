<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/commons/commonsJs/taglibs.jspf" %>
<%@ include file="/WEB-INF/commons/commonsJs/import-js-jquery.jspf" %>
<%@ include file="/WEB-INF/commons/commonsJs/import-js-all.jspf" %>

<html>
<head>
	<title>Hi,Abby - Abby的小管家</title>

	<link rel="stylesheet" href="/static/hiabbyWebsite/index/index.css"/>

	<script type="text/javascript">
		var ctx = "${pageContext.request.contextPath}";
		$(function(){
			$(".githubIcon").hover(function(){
				$(this).attr("src","files/index/github.png");
			});
			$(".githubIcon").mouseleave(function(){
				$(this).attr("src","files/index/githubBefore.png");
			});

			$(".zhihu").find(".indexIcon").hover(function(){
				$(this).attr("src","files/index/zhihuBefore.png");
			});
			$(".zhihu").find(".indexIcon").mouseleave(function(){
				$(this).attr("src","files/index/zhihu.png");
			});

			$(".steam").find(".indexIcon").hover(function(){
				$(this).attr("src","files/index/steam.png");
			});
			$(".steam").find(".indexIcon").mouseleave(function(){
				$(this).attr("src","files/index/steambefore.png");
			});
		})
	</script>
</head>
<body style="overflow:hidden;">
	<div class="content-home text-center">
		<div style="margin-left: 46%;">
			<div class="commentAvatarDiv">
				<img src="/files/index/headImg.jpg" width="180" height="180" class="commentAvatarImage"/>
			</div>
		</div>
		<div class="name">Hi,Abby</div>
		<div class="slogan">
			Get enough fun from the coding and always keep her.
		</div>
		<ul class="text-center nav">
			<li class="item">
				<a href="/blog">Blog</a>
				<span>&nbsp;|</span>
			</li>

			<li class="item">
				<a href="/reading" rel="noopener noreferrer">Reading</a>
				<span>&nbsp;|</span>
			</li>

			<li class="item">
				<a href="/project" rel="noopener noreferrer" >Project</a>
				<span>&nbsp;|</span>
			</li>

			<li class="item">
				<a href="/wiki" rel="noopener noreferrer">Wiki</a>
				<span>&nbsp;|</span>
			</li>

			<li class="item">
				<a href="/about" rel="noopener noreferrer">About</a>
				<span>&nbsp;|</span>
			</li>
		</ul>
		<hr>

		<ul class="text-center nav">
			<li class="item">
				<a class="github" target="_blank" href="https://github.com/ITflying" title="github">
					<img src="files/index/githubBefore.png" class="githubIcon"/>
				</a>
			</li>

			<li class="item">
				<a class="zhihu" target="_blank" href="https://www.zhihu.com/" title="zhihu">
					<img src="files/index/zhihu.png" class="indexIcon"/>
				</a>
			</li>

			<li class="item">
				<a class="steam" target="_blank" href="http://store.steampowered.com/" title="steam">
					<img src="files/index/steambefore.png" class="indexIcon"/>
				</a>
			</li>
		</ul>

	</div>


</body>
</html>