<template>
  <div class="continer">
      <div id="index" v-title data-title="仓鼠"/>
    <div>
      <main class="page-content" aria-label="Content">
        <div class="wrapper">
          <h1 class="page-heading">
            Hamster
            <span style="font-size:10px;text-align:center;">仓鼠喜欢收集很多果实，很巧的是，我也是哦</span>
          </h1>

          <!-- 收藏的内容，人生如书，一本本阅读或许别有一番风味 -->
          <div>
            <div class="hamster-item" @click="choiceBook()">
              <ul class="items">
                <li class="item">
                  <div class="item-banner">
                    <div class="item-name">
                      <span class="iconfont icon-rili" style="margin-right:2px;" />这是我的标题
                    </div>
                    <div class="item-author">这是作者</div>
                  </div>
                  <div class="item-description">这是收藏的具体描述</div>
                  <div>网站</div>
                </li>
              </ul>
            </div>

            <div class="hamster-item" @click="choiceBook()">
              <ul class="items">
                <li class="item">
                  <div class="item-banner">
                    <div class="item-name">
                      <span class="iconfont icon-rili" style="margin-right:2px;" />这是我的标题
                    </div>
                    <div class="item-author">这是作者</div>
                  </div>
                  <div class="item-description">这是收藏的具体描述</div>
                  <div>书籍</div>
                </li>
              </ul>
            </div>
          </div>

          <!-- 弹出框 -->
          <div class="detail-dialog">
            <transition>
              <section v-show="dialogShow">
                <div class="wrapper">
                  <a class="close" @click="closeDialog">X</a>
                  <h1>这是我最喜欢的一本书</h1>
                  <p>这本书很棒，很喜欢这本，可是为啥喜欢呢，可能就是喜欢吧.</p>
                  <button>前往收集第一发生地</button>
                </div>
              </section>
            </transition>
          </div>
          <!-- 弹出框 END -->
        </div>
      </main>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      dialogShow: 0
    };
  },
  methods: {
    choiceBook() {
      this.dialogShow = 1;
    },
    closeDialog() {
      this.dialogShow = 0;
    }
  }
};
</script>


<style scoped>
@import "../../assets/less/hamster/hamster.less";
@import "../../assets/less/base/base.less";
</style>
