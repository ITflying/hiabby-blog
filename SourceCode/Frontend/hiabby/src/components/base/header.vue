<template>
    <header class="site-header" role="banner" >
        <div class="wrapper">
            <a class="site-title" href="/home">
                <span style="font-family: Segoe Print;16px;font-size: 19px;font-weight: 300;">Abby </span> 小管家 
              
            </a>
            <a class="site-title" :href="`/${pageUrl}`">
                <svg class="ali-icon" aria-hidden="true">
                    <use :xlink:href="`${pageImage}`"></use>
                </svg>
           
                {{pageTitle}}
            </a>
            
            <nav class="site-nav">
                <span class="menu-icon">
                    <svg viewBox="0 0 18 15" width="18px" height="15px">
                        <path fill="#424242" d="M18,1.484c0,0.82-0.665,1.484-1.484,1.484H1.484C0.665,2.969,0,2.304,0,1.484l0,0C0,0.665,0.665,0,1.484,0 h15.031C17.335,0,18,0.665,18,1.484L18,1.484z"></path>
                        <path fill="#424242" d="M18,7.516C18,8.335,17.335,9,16.516,9H1.484C0.665,9,0,8.335,0,7.516l0,0c0-0.82,0.665-1.484,1.484-1.484 h15.031C17.335,6.031,18,6.696,18,7.516L18,7.516z"></path>
                        <path fill="#424242" d="M18,13.516C18,14.335,17.335,15,16.516,15H1.484C0.665,15,0,14.335,0,13.516l0,0 c0-0.82,0.665-1.484,1.484-1.484h15.031C17.335,12.031,18,12.696,18,13.516L18,13.516z"></path>
                    </svg>
                </span>
         

                <div class="trigger">
                    
                    <a v-for="page in pages" :key="page.id" class="page-link" :href="`${page.href}`"><span :class="`iconfont ${page.icon}`" style="margin-right:1px;"></span>{{page.text}}</a>
                </div>
            </nav>
        </div>
    </header>
</template>


<script>

export default {
    props:{
        pageUrl:String,
        pageTitle:String,
        pageImage:String
    },
    data(){
        return{
            pages:[
                {'href':'/dashboard',text:'点将台',icon:'icon-gaikuang'},
                {'href':'/article',text:'文章',icon:'icon-wenzhang'},
                {'href':'/question',text:'解惑',icon:'icon-wenti'},
                {'href':'/aladdin',text:'阿拉丁',icon:'icon-deng-'},
                {'href':'/wiki',text:'Wiki',icon:'icon-wiki'},
                {'href':'/guidepost',text:'路标',icon:'icon-lubiao'},
                {'href':'/aboratory',text:'实验室',icon:'icon-shiyan'}
            ],
            eGpages:[
                {'href':'/dashboard',text:'Dashboard'},
                {'href':'/article',text:'Article'},
                {'href':'/question',text:'Question'},
                {'href':'/aladdin',text:'Aladdin'},
                {'href':'/wiki',text:'Wiki'},
                {'href':'/guidepost',text:'Guidepost'},
                {'href':'/aboratory',text:'Aboratory'}
            ]
        }
    }
}
</script>

<style scoped>
    @import '../../assets/iconfont/ali-icon/iconfont.css';    
    @import '../../assets/less/base/header.less';
</style>
