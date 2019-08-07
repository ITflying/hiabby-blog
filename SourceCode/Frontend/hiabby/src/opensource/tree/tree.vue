<template>
  <div class="tree-menu">
    <ul v-for="item in treeData" :key="item.id">
      <c-tree-item :data="item"></c-tree-item>
    </ul>
  </div>
</template>
 
<script>
import cTreeItem from "./tree-item";
export default {
  data() {
    return{
        treeData: [
    {
        'name': 'Web秀',
        'children': [{
            'name': 'web前端',
            'children': [{
                'name': 'CSS'
            }, {
                'name': 'JavaScript'
            }, {
                'name': 'Vue'
            }, {
                'name': '小程序'
            }, {
                'name': 'Three.js'
            }]
        }, {
            'name': '服务器'
        }, {
            'name': '工具类'
        }]
    }, {
        'name': '今日头条',
        'children': [{
            'name': '图片'
        }, {
            'name': '新闻',
            'children': []
        }]
    }, {
        'name': 'Angular'
    }
]
    };
  },
  components: {
    cTreeItem
  }
};
</script>