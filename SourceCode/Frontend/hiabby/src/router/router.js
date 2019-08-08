// 引入依赖
import Vue from 'vue';
import Router from 'vue-router';

// 引入组件

import home from '@/pages/home/home.vue'

import dashboardLayout from '@/components/layout/dashboardLayout.vue'
import dashboard from '@/pages/dashboard/dashboard.vue'

import articleLayout from '@/components/layout/articleLayout.vue'
import article from '@/pages/article/article.vue'
import viewArticle from '@/pages/article/viewArticle.vue'
import articleCategory from '@/pages/article/articleCategory.vue'

import questionLayout from '@/components/layout/questionLayout.vue'
import question from '@/pages/question/question.vue'

import aladdinLayout from '@/components/layout/aladdinLayout.vue'
import aladdin from '@/pages/aladdin/aladdin.vue'

import hamsterLayout from '@/components/layout/hamsterLayout.vue'
import hamster from '@/pages/hamster/hamster.vue'

import guidepostLayout from '@/components/layout/guidepostLayout.vue'
import guidepost from '@/pages/guidepost/guidepost.vue'

import aboratoryLayout from '@/components/layout/aboratoryLayout.vue'
import aboratory from '@/pages/aboratory/aboratory.vue'

import systemLayout from '@/components/layout/systemLayout.vue'
import cannotfind from '@/pages/system/cannotfind.vue'

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
        component: dashboardLayout,
        meta: {
            title: 'Hiabby ~ 点将台'
        },
        children: [{
            path: '',
            component: dashboard
        }]
    },
    {
        path: "/article",
        component: articleLayout,
        meta: {
            title: 'Hiabby ~ 文章'
        },
        children: [{
                path: '',
                component: article
            },
            {
                path: 'viewArticle',
                component: viewArticle
            }, {
                path: 'articleCategory',
                component: articleCategory
            }
        ]
    },
    {
        path: "/question",
        component: questionLayout,
        meta: {
            title: 'Hiabby ~ 解惑'
        },
        children: [{
            path: '',
            component: question
        }]
    },
    {
        path: "/aladdin",
        component: aladdinLayout,
        meta: {
            title: 'Hiabby ~ 阿拉丁'
        },
        children: [{
            path: '',
            component: aladdin
        }]
    },
    {
        path: "/hamster",
        component: hamsterLayout,
        meta: {
            title: 'Hiabby ~ 仓鼠'
        },
        children: [{
            path: '',
            component: hamster
        }]
    },
    {
        path: "/guidepost",
        component: guidepostLayout,
        meta: {
            title: '路标'
        },
        children: [{
            path: '',
            component: guidepost
        }]
    },
    {
        path: "/aboratory",
        component: aboratoryLayout,
        meta: {
            title: 'Hiabby ~ 实验室'
        },
        children: [{
            path: '',
            component: aboratory
        }]
    },
    {
        path: "*",
        component: cannotfind,
        meta: {
            title: 'Hiabby ~ 404 找不到页面'
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

Vue.directive('title', (el) => {
    if (el.dataset.title === undefined) {
        document.title = `Hiabby`;
    } else {
        document.title = `${el.dataset.title} | Hiabby`;
    }
})

export default router;