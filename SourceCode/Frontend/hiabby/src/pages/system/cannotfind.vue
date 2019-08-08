<template>
  <div class="continer">
    <div id="index" v-title data-title="404 找不到页面"/>
    <!-- 头部 -->
    <app-header pageTitle="404" pageImage="#icon-chixiao" pageUrl></app-header>
    <!-- 正文 -->
    <div>
      <main class="page-content">
        <div class="wrapper" style="min-height:85vh;">
          <img src="@/assets/images/system/404.jpg" style="width:100%;height:100%;" />
        </div>
      </main>
    </div>
    <!-- 底部 -->
    <app-footer></app-footer>
  </div>
</template>

<script>
export default {};
</script>


<style scoped>
@import "../../assets/less/base/base.less";
.back-home {
  position: absolute;
  top: 360px;
  left: 718px;
  height: 35px;
  width: 200px;
  border-radius: 30px;
  cursor: pointer;
  opacity: 0;
}
</style>
