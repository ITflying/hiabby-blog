import Vue from 'vue'
import App from './App.vue'

// 引入组件
import AppHeader from './components/base/header.vue'

Vue.config.productionTip = false

// 引入第三方js
import './assets/iconfont/ali-icon/iconfont.js'

// 引入路由
import router from "./router/router.js"

Vue.component('app-header', AppHeader)

new Vue({
    router, // 注册到根实例中
    render: h => h(App),
}).$mount('#app')