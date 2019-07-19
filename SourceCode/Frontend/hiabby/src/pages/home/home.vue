<template>
  <div class="homeBox">
    <div class="content-home text-center">
      <div style="margin-left: 46%;">
        <div class="commentAvatarDiv">
          <img src="@/assets/images/web/home/headImg.jpg" class="commentAvatarImage"/>
        </div>
      </div>
      <div class="name">{{welcomeWords}}</div>
      <div class="slogan">
        {{ slogan }}
      </div>

      <ul class="text-center nav">
        <li class="item" v-for="(m,i) in menu" :key="m.id">
           <a :href="`${m.href}`">{{m.text}}</a>
          <span class="line_left_right" v-if="i !== menu.length-1">|</span>
        </li>
      </ul>
      <hr>

      <ul class="text-center nav">
        <li class="item" v-for="o in otherWeb" :key="o.id">
          <a :class="`${o.classOfa}`" target="_blank" :href="`${o.href}`" title="github">
            <img :src="`${o.imgsrc}`" :class="`${o.imgclass}`"/>
          </a>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  data() {
		return {
      welcomeWords:'Hi,Abby',
      slogan:'Get enough fun from the coding and always keep alive.',
			menu: [
        {'href':'/future',text:'点将台'},
        {'href':'/article',text:'文章'},
        {'href':'/question',text:'解惑'},
        {'href':'/aladdin',text:'阿拉丁'},
        {'href':'/wiki',text:'Wiki'},
        {'href':'/desination',text:'目的地'},
        {'href':'/aboratory',text:'实验室'}
      ],
      emenu:[
        {'href':'/future',text:'Future'},
        {'href':'/article',text:'Article'},
        {'href':'/question',text:'Question'},
        {'href':'/aladdin',text:'Aladdin'},
        {'href':'/wiki',text:'Wiki'},
        {'href':'/desination',text:'Desination'},
        {'href':'/aboratory',text:'Aboratory'}
      ],
      otherWeb:[
          {classOfa:'github',href:'https://github.com/ITflying',title:'gayhub',imgsrc:require('@/assets/images/web/home/githubBefore.png'),imgclass:'githubIcon'},
          {classOfa:'zhihu',href:'https://www.zhihu.com/',title:'zhihu',imgsrc:require('@/assets/images/web/home/zhihuBefore.png'),imgclass:'indexIcon'},
          {classOfa:'steam',href:'http://store.steampowered.com/',title:'steam',imgsrc:require('@/assets/images/web/home/steambefore.png'),imgclass:'indexIcon'}
      ]
		};
  }
}
</script>

<style scoped>
 @import '../../assets/less/home/home.less';
</style>
