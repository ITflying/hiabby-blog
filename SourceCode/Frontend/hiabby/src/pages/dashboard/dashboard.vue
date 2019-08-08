<template>
  <div class="continer">
      <div id="index" v-title data-title="点将台"/>
    <div>
      <main class="page-content" aria-label="Content">
        <div class="wrapper">
          <h1 class="page-heading">
            Dashboard
            <span style="font-size:10px;text-align:center;">统计数据的展示，看看这个网站最终会成长为什么样子</span>
          </h1>

          <!-- 统计数据气泡 -->
          <div id="echartContainer" style="width:500px; height:500px" class="echart-area"></div>
        </div>
      </main>
    </div>
  </div>
</template>

<script>
export default {
  mounted() {
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById("echartContainer"));
    // 绘制图表
    myChart.setOption({
      title: { text: "测试一下" },
      tooltip: {},
      xAxis: {
        data: ["衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"]
      },
      yAxis: {},
      series: [
        {
          name: "销量",
          type: "bar",
          data: [5, 20, 36, 10, 10, 20]
        }
      ]
    });
  }
};
var echarts = require("echarts");
</script>


<style scoped>
@import "../../assets/less/base/base.less";
.echart-area {
  padding-left: 16px;
  padding-top: 16px;
  float: left;

  display: -webkit-box;
  display: -ms-flexbox;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
  -ms-flex-flow: column;
  flex-flow: column;
  -webkit-box-flex: 1;
  -ms-flex: 1;
  flex: 1;
  margin-top: 10px;
  border-radius: 10px;
  background: #fff;
  -webkit-box-shadow: 0px 8px 20px rgba(0, 0, 0, 0.1);
  box-shadow: 0px 8px 20px rgba(0, 0, 0, 0.1);
  -webkit-transition: all 0.4s linear;
  transition: all 0.4s linear;
}
</style>
