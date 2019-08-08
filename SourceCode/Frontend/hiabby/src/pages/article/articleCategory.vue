<template>
  <div class="continer">
        <div id="index" v-title data-title="文章分类"/>
    <main class="page-content" aria-label="Content">
      <div class="wrapper">
        <h1 class="page-heading">Article - Category</h1>

        <!-- 分类 -->
        <div class="tree-continer tree-menu">
          <ul v-for="item in treeData" :key="item.id">
            <c-tree-item :data="item" @getcategoryparam="listenCategoryParam"></c-tree-item>
          </ul>
        </div>

        <!-- 分类下的文章列表 -->
        <div>
          <div class="category-name" ref="categoryName">分类名称</div>
          <ul class="post-list">
            <li>
              <h2>
                <a class="post-link post-title" href>测试文 | 测试原理剖析剖析</a>
              </h2>
              <div style="width:100%;min-height:100px;">
                <div style="float: left;width:60%;">
                  <span
                    class="post-summary"
                  >测试文本，测试文本，测试文本，测试文本，测试文本，测试文本，测试文本，测试文本，测试文文本，测试文本，测试文本，测试文本。</span>
                  <a
                    class="btn"
                    href="/article/viewArticle"
                    rel="contents"
                    style="font-size:12px;color: #ff9800;"
                  >阅读全文 »</a>
                </div>
                <div style="text-align:center;float:left;width:30%;">
                  <a title="测试文 | 测试原理剖析剖析" href="/article/index/arcid/251.html">
                    <img class="post-img" src="@/assets/images/article/test.jpg" />
                  </a>
                </div>
              </div>

              <div>
                <span class="post-meta">发布时间 : 2019年03月14日</span>
                <span class="post-meta">分类 : java</span>
              </div>
            </li>

            <li>
              <h2>
                <a class="post-link post-title" href>测试一下第二个文章哦</a>
              </h2>

              <div class="post-content">
                <span class="post-summary">测试文本，测试文本，测试文本，测试文本，测试文本，测试文本，测试文本，测试文本，测试文本。</span>
                <a
                  class="btn"
                  href="/article/viewArticle"
                  rel="contents"
                  style="font-size:12px;color: #ff9800;"
                >阅读全文 »</a>
              </div>

              <div>
                <span class="post-meta">发布时间 : 2019年03月14日</span>
                <span class="post-meta">分类 : java</span>
              </div>
            </li>
            <li>
              <h2>
                <a class="post-link post-title" href>测试文 | 测试原理剖析剖析</a>
              </h2>
              <div style="width:100%;min-height:100px;">
                <div style="float: left;width:60%;">
                  <span
                    class="post-summary"
                  >测试文本，测试文本，测试文本，测试文本，测试文本，测试文本，测试文本，测试文本，测试文文本，测试文本，测试文本，测试文本。</span>
                  <a
                    class="btn"
                    href="/article/viewArticle"
                    rel="contents"
                    style="font-size:12px;color: #ff9800;"
                  >阅读全文 »</a>
                </div>
                <div style="text-align:center;float:left;width:30%;">
                  <a title="测试文 | 测试原理剖析剖析" href="/article/index/arcid/251.html">
                    <img class="post-img" src="@/assets/images/article/test.jpg" />
                  </a>
                </div>
              </div>

              <div>
                <span class="post-meta">发布时间 : 2019年03月14日</span>
                <span class="post-meta">分类 : java</span>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </main>
  </div>
</template>

<script>
import cTreeItem from "../../opensource/tree/tree-item.vue";
export default {
  data() {
    return {
      treeData: [
        {
          name: "Web秀",
          children: [
            {
              name: "web前端",
              children: [
                {
                  name: "CSS"
                },
                {
                  name: "JavaScript"
                },
                {
                  name: "Vue"
                },
                {
                  name: "小程序"
                },
                {
                  name: "Three.js"
                }
              ]
            },
            {
              name: "服务器"
            },
            {
              name: "工具类"
            }
          ]
        },
        {
          name: "今日头条",
          children: [
            {
              name: "图片"
            },
            {
              name: "新闻",
              children: []
            }
          ]
        },
        {
          name: "Angular"
        }
      ]
    };
  },
  components: {
    cTreeItem
  },
  methods: {
    listenCategoryParam(data) {
      this.$refs.categoryName.innerText = data.name;
    }
  }
};
</script>


<style scoped>
@import "../../assets/iconfont/ali-icon/iconfont.css";
@import "../../assets/less/article/article.less";
@import "../../assets/less/base/base.less";
</style>
