<template>
  <div class="continer">
    <!-- 头部 -->
    <app-header pageTitle="实验室" pageImage="#icon-chixiao" pageUrl="aboratory"></app-header>
    <!-- 正文 -->
    <router-view></router-view> 
    <!-- 底部 -->
    <app-footer></app-footer>
  </div>
</template>

<script>
export default {};
</script>


<style scoped>
@import "../../assets/less/base/base.less";
</style>
