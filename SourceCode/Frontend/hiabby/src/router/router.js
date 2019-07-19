// 引入依赖
import Vue from 'vue';
import Router from 'vue-router';

// 引入组件
import HelloWorld from '@/components/HelloWorld.vue'
import home from '@/pages/home/home.vue'
import aladdin from '@/pages/aladdin/aladdin.vue'

Vue.use(Router);

const routes = [{
        path: "/",
        redirect: "/home"
    },
    {
        path: "/home",
        component: home,
        meta: {
            title: '首页' // 标题设置在这里
        }
    },
    {
        path: "/aladdin",
        component: aladdin,
        meta: {
            title: '阿拉丁'
        }
    },
    {
        path: "/HelloWorld",
        component: HelloWorld
    }
]

var router = new Router({
    mode: 'history',
    routes
})

router.beforeEach((to, from, next) => {
    /* 路由发生变化修改页面title */
    if (to.meta.title) {
        document.title = to.meta.title
    }
    next()
})

export default router;