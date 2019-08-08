<template>
  <div class="continer">
    <div id="index" v-title data-title="解惑"/>
    <div>
      <main class="page-content" aria-label="Content">
        <div class="wrapper">
          <div>
            <h1 class="page-heading">
              Question
              <span style="font-size:10px;text-align:center;">学源于思，思源于疑。</span>
            </h1>
          </div>

          <!-- 搜索框 -->
          <div class="search-container">
            <div class="search bar1">
              <form>
                <input type="text" placeholder="请输入要搜索的问题..." />
                <button></button>
              </form>
            </div>
          </div>

          <!-- 问题一 -->
          <div class="stream-list p-stream doc_brief">
            <div class="stream-item" id="loop-30">
              <div class="media">
                <div class="pull-right hidden-xs" style="max-width: 200px; text-align: center;">
                  <img
                    class="img-circle side_unit_author_img"
                    alt="问题"
                    src="@/assets/images/web/home/headImg.jpg"
                  />
                  <br />
                  <span class="side_unit_info">问题关联图片</span>
                </div>

                <div class="media-body">
                  <div style="margin-left: 4px;" class="pull-left">
                    <div style="color:#767676">
                      <span class="iconfont icon-wenti" style="margin-right:10px;" />把大象放进冰箱要几步？
                    </div>

                    <div class="doc_node_content_box">
                      <p class="doc_node_content">
                        <span class="iconfont icon-daanjiexi" style="margin-right:10px;" />第一步，先把冰箱门；第二步，再把冰箱装进去；第三步，再把冰箱门关上。
                      </p>
                    </div>

                    <div class="side_unit_info side_unit_info_left_box">
                      <span class="iconfont icon-rili" style="margin-right:2px;" />2019年8月6日
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <!-- 占位问题二 -->
          <div class="stream-list p-stream doc_brief">
            <div class="stream-item" id="loop-30">
              <div class="media">
                <div class="pull-right hidden-xs" style="max-width: 200px; text-align: center;">
                  <img
                    class="img-circle side_unit_author_img"
                    alt="问题"
                    src="@/assets/images/web/home/headImg.jpg"
                  />
                  <br />
                  <span class="side_unit_info">问题关联图片</span>
                </div>

                <div class="media-body">
                  <div style="margin-left: 4px;" class="pull-left">
                    <div style="color:#767676">
                      <span class="iconfont icon-wenti" style="margin-right:10px;" />把大象放进冰箱要几步？
                    </div>

                    <div class="doc_node_content_box">
                      <p class="doc_node_content">
                        <span class="iconfont icon-daanjiexi" style="margin-right:10px;" />第一步，先把冰箱门；第二步，再把冰箱装进去；第三步，再把冰箱门关上。
                      </p>
                    </div>

                    <div class="side_unit_info side_unit_info_left_box">
                      <span class="iconfont icon-rili" style="margin-right:2px;" />2019年8月6日
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </main>
    </div>
  </div>
</template>

<script>
export default {};
</script>


<style scoped>
@import "../../assets/less/question/question.less";
@import "../../assets/less/base/base.less";
</style>
