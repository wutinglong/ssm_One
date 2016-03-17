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
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
  </head>
  <body>
    <br>
    <center>
    	<h1>修改用户信息</h1><hr>
    		<form id="myfrom" method="post" name="myfrom">
    			编号：&nbsp;&nbsp;<input type="text" name="userId" id="userId" readonly="readonly" value="${user.userId }"/><br/><br/>
    			姓名：&nbsp;&nbsp;<input type="text" name="userName" id="userName" value="${user.userName }"/><br/><br/>
    			年龄：&nbsp;&nbsp;<input type="text" name="userAge" id="userAge" value="${user.userAge }"/><br/><br/>
    			<input type="reset" value="重置"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="修改" id="update"/>
    		</form>
    </center>
  <script type="text/javascript">
  	//修改用户信息
  	$("#update").click(function(){
  		$.ajax({
  			url:"user/updateUserbyId.html",
  			type:"post",
  			data:$("#myfrom").serialize(),
  			success:function(data)
  			{
  				alert("修改成功");
  				location.href="../user/index.html";
  			}
  		});
  	});
  </script>
  </body>
</html>
