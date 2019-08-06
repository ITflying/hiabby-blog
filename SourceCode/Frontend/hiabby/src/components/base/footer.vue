<template>
   <footer id="footer" class="footer">
<div class="footer-inner"> 
  <div>
    <div class="well-know-div">
      <p style="well-know-p">{{wellKnowWord}}</p>
    </div>
  </div>
</div>
</footer>
</template>
<script>
export default {
    data(){
      return{
        wellKnowWord:"一钵上人轻六翮。选场要射如来策。点化黄金非妙药。难堪酌。三生一口都吞却。"
      }
    }
}
</script>
<style scoped>
     @import '../../assets/less/base/footer.less'; 
</style>
