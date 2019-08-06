// 引入依赖
import Vue from 'vue';
import Router from 'vue-router';

// 引入组件
import home from '@/pages/home/home.vue'
import dashboard from '@/pages/dashboard/dashboard.vue'
import article from '@/pages/article/article.vue'
import viewArticle from '@/pages/article/viewArticle.vue'

import question from '@/pages/question/question.vue'
import aladdin from '@/pages/aladdin/aladdin.vue'
import wiki from '@/pages/wiki/wiki.vue'
import guidepost from '@/pages/guidepost/guidepost.vue'
import aboratory from '@/pages/aboratory/aboratory.vue'

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
        path: "/dashboard",
        component: dashboard,
        meta: {
            title: '点将台'
        }
    },
    {
        path: "/article",
        component: article,
        meta: {
            title: '文章'
        },
        children: [{
                path: 'viewArticle',
                component: viewArticle
            },
            {
                path: 'test',
                component: viewArticle
            }
        ]
    },
    {
        path: "/question",
        component: question,
        meta: {
            title: '解惑'
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
        path: "/wiki",
        component: wiki,
        meta: {
            title: 'Wiki'
        }
    },
    {
        path: "/guidepost",
        component: guidepost,
        meta: {
            title: '路标'
        }
    },
    {
        path: "/aboratory",
        component: aboratory,
        meta: {
            title: '实验室'
        }
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