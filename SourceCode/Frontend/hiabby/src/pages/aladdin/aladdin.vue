<template>
  <div class="continer">
      <div id="index" v-title data-title="啊~啊~阿拉丁"/>
    <div>
      <main class="page-content" aria-label="Content">
        <div class="wrapper">
          <h1 class="page-heading">
            Aladdin
            <span style="font-size:10px;text-align:center;">我是阿拉丁，你有什么愿望？</span>
          </h1>

          <!-- 左侧楼层效果 -->
          <div class="left">
            <div class="left-floor" @click="chooiceFloor($event)">
              <div class="floor-num">1 F</div>
              <div class="floor-name">上海公交到站信息</div>
            </div>

            <div class="left-floor" @click="chooiceFloor($event)">
              <div class="floor-num">2 F</div>
              <div class="floor-name">上海浦东新区天气</div>
            </div>
          </div>
          <!-- 右侧联动 -->
          <div class="right">
            <div class="right-area">
              <p style="text-align:center;font-size:32px;font-family:隶书;">请选择左侧功能楼层</p>
            </div>
          </div>
        </div>
      </main>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      choiceFloorDiv: null
    };
  },
  methods: {
    chooiceFloor(e) {
      let className = e.target.className;

      let targetDom = e.target.parentElement;
      if (className == "left-floor") {
        targetDom = e.target;
      }

      if (targetDom.style.color != "lightpink") {
        targetDom.style.color = "lightpink";
      }
      if (this.choiceFloorDiv != null && this.choiceFloorDiv != targetDom) {
        this.choiceFloorDiv.style.color = "#6b54d4";
      }
      this.choiceFloorDiv = targetDom;
    }
  }
};
</script>


<style scoped>
@import "../../assets/less/aladdin/aladdin.less";
@import "../../assets/less/base/base.less";
</style>
