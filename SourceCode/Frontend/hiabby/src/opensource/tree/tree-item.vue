<template>
  <li>
    <span @click="toggle">
      <em v-if="hasChild" class="icon">{{open ? '-' : '+'}}</em>
      <em v-if="!hasChild" class="icon file-text"></em>
      {{ data.name }}
    </span>
    <ul v-show="open" v-if="hasChild">
      <tree-item
        v-for="(item, index) in data.children"
        :data="item"
        :key="index"
        @getcategoryparam="listenCategoryParam"
      ></tree-item>
    </ul>
  </li>
</template>
 
<script  type="es6">
export default {
  name: "TreeItem",
  props: {
    data: {
      type: [Object, Array],
      required: true
    }
  },
  data() {
    return {
      open: false
    };
  },
  computed: {
    hasChild() {
      return this.data.children && this.data.children.length;
    }
  },
  methods: {
    toggle() {
      if (this.hasChild) {
        this.open = !this.open;
      }
      let categoryParam = { name: this.data.name };
      this.$emit("getcategoryparam", categoryParam);
    },
    listenCategoryParam(data) {
      this.$emit("getcategoryparam", data);
    }
  }
};
</script>
 
<style scoped>
@import "../../assets/less/opensource/tree.less";
</style>
