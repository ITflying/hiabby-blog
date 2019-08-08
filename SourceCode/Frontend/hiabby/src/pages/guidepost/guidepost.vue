<template>
  <div class="continer">
      <div id="index" v-title data-title="路标"/>
    <div>
      <main class="page-content" aria-label="Content">
        <div class="wrapper">
          <h1 class="page-heading">
            Guidepost
            <span style="font-size:10px;text-align:center;">人的一生很短，所以希望能够在人生的场合当中记录一些事情</span>
          </h1>

          <!-- 时间轴 -->
          <div class="content">
            <div class="wrapper">
              <div class="light">
                <i></i>
              </div>

              <div class="main">
                <h1 class="title">梦回仙剑----文字RPG冒险游戏</h1>
                <div class="year">
                  <h2>
                    <a href="#">
                      2013年
                      <i></i>
                    </a>
                  </h2>
                  <div class="list">
                    <ul>
                      <li class="cls">
                        <p class="date">07.07</p>
                        <p class="intro">用C语言完成了梦回仙剑文字冒险RPG游戏</p>
                        <p class="version">V1.0</p>
                        <div class="more">
                          <span style="color:#E53333;">介绍：</span>
                          <br />纯文字冒险
                          <br />C语言
                          <br />还算可以
                          <br />
                        </div>
                      </li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- 时间轴 END -->
        </div>
      </main>
    </div>
  </div>
</template>

<script>
export default {};
</script>


<style scoped>
@import "../../assets/less/opensource/timeAxis.less";
@import "../../assets/less/base/base.less";
</style>
