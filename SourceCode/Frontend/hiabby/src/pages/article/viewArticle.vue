<template>
  <div class="continer">
      <div id="index" v-title data-title="查看文章"/>
    <main class="page-content" aria-label="Content">
      <div class="wrapper">
        <div style="width: 100%;text-align: center;">
          <h1 class="post-title">Fexo 文档</h1>
        </div>

        <div class="article-meta">
          <span class="iconfont icon-rili" style="margin-right:2px;" />2019年8月6日
          <span
            class="iconfont icon-yuanchuang-"
            style="margin-right:2px;margin-left:16px;"
          />类型: 原创
          <span class="iconfont icon-zishu" style="margin-right:1px;margin-left:16px;" />9148字
          <span class="iconfont icon-shengyugeshu" style="margin-right:1px;margin-left:16px;" />19分钟阅读
        </div>

        <div id="articleContent" class="article-content">这是测试正文，既可以是普通样式，也兼容markdown文件，但应该不支持两个混用</div>

        <div class="article-meta-bottom">
          <span class="iconfont icon-fenlei" style="margin-right:1px;margin-left:16px;" />分类：
          <a href="www.baidu.com" target="_blank">java</a>
          <a href="www.baidu.com" target="_blank">大数据</a>
          <a href="www.baidu.com" target="_blank">测试</a>
          <a href="www.baidu.com" target="_blank">文本</a>
          <a href="www.baidu.com" target="_blank">文章</a>
        </div>
      </div>
    </main>
  </div>
</template>

<script>
export default {
  data() {
    return {
      wellKnowWords: "腹有诗书气自华，读书万卷始通神 - 苏轼"
    };
  }
};
</script>


<style scoped>
@import "../../assets/iconfont/ali-icon/iconfont.css";
@import "../../assets/less/article/article.less";
@import "../../assets/less/base/base.less";
</style>
