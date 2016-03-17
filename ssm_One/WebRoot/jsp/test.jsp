<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> 
<html>  
<head>  
<base href="<%=basePath%>">
<title>：jQuery省市区三级联动插件city-picker</title>
<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<base target="_blank" />  
  
<!--可无视-->  
<link href="http://hovertree.com/texiao/bootstrap/4/css/main.css" rel="stylesheet" type="text/css" />  
  
<!--必要样式-->  
<link href="http://hovertree.com/ziyuan/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" type="text/css" />  
<link href="http://hovertree.com/texiao/bootstrap/4/css/city-picker.css" rel="stylesheet" type="text/css" />  
</head>  
<body>
<center>
<!-- Content -->  
<div class="container">  
  
<h2 class="page-header">演示</h2>  
  
<div class="docs-methods">  
<form class="form-inline">  
<div id="distpicker">  
<div class="form-group">  
<div style="position: relative;">  
<input id="city-picker3" class="form-control" readonly type="text" value="江苏省/常州市/溧阳市" data-toggle="city-picker">  
</div>  
</div>  
<div class="form-group">  
<button class="btn btn-warning" id="reset" type="button">重置</button>  
<button class="btn btn-danger" id="destroy" type="button">确定</button>  
</div>  
</div>  
</form>  
</div>  
  
</div><br/>
<div class="container"><a href="http://hovertree.com">首页</a> <a href="http://hovertree.com/texiao/">特效</a> <a href="http://hovertree.com/h/bjaf/5gbv36dt.htm">原文</a> <a href="http://hovertree.com/texiao/jquery/22/">效果2</a> </div> 
</center> 
<script src="http://hovertree.com/ziyuan/jquery/jquery-1.12.1.min.js"></script>  
<script src="http://hovertree.com/ziyuan/bootstrap/3.3.6/js/bootstrap.min.js"></script>  
<script src="http://hovertree.com/texiao/bootstrap/4/js/city-picker.data.js"></script>  
<script src="http://hovertree.com/texiao/bootstrap/4/js/city-picker.js"></script>  
<script src="http://hovertree.com/texiao/bootstrap/4/js/main.js"></script>  

</body>  
</html>  