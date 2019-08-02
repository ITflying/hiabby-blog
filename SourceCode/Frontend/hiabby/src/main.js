import Vue from 'vue'
import App from './App.vue'

// 引入组件
import AppHeader from './components/base/header.vue'
import AppFooter from './components/base/footer.vue'

Vue.config.productionTip = false

// 引入第三方js
import './assets/iconfont/ali-icon/iconfont.js'

// 引入路由
import router from "./router/router.js"

Vue.component('app-header', AppHeader)
Vue.component('app-footer', AppFooter)

new Vue({
    router, // 注册到根实例中
    render: h => h(App),
}).$mount('#app')