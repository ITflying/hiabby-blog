<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/26
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/commons/commonsJs/taglibs.jspf" %>
<%@ include file="/WEB-INF/commons/commonsJs/import-js-jquery.jspf" %>


<html>
<head>
    <title>录入模板</title>
    <link rel="Shortcut Icon" href="files/index/fish.ico" type="image/x-icon">
    <style type="text/css">
        div{
            margin:10px;
        }
    </style>
    <script type="text/javascript">
        $(function(){
            $("#formSbumit").click(function(){
                 if ($("#temp").val() == null || $("#temp").val().length < 10){
                 alert("temp不能为空")
                 }
                 else if ($("#num").val() == null || $("#num").val().length == 0){
                 alert("num不能为空")
                 }
                 else if ($("#row").val() == null || $("#row").val().length == 0){
                 alert("row不能为空")
                 }
                 else{
                 $("#tempForm").submit();
                 }
            })
        })

    </script>
</head>
<body>
    <div>
      <form id="tempForm" action="inputTemp">
        <div>请输入待转化字符串：<input id="temp" type="text" name="temp" style="width:100%;"/></div>
          <div>请输入待转化字符串行数：<br><input id="row"  type="text" name="row"/></div>
          <div>请输入待转化字符串数字：<br><input id="num"  type="text" name="num"/></div>
          <div><input id="formSbumit" type="button" value="提交" style="cursor:pointer;"/></div>
          <div>${tips}</div>
      </form>
    </div>
</body>
</html>
