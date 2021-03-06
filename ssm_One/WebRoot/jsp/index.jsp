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
    	<h1>用户信息</h1><hr>
    		<table border="1" width="70%">
    			<tr>
    				<td align="center"><b>编号</b></td>
    				<td align="center"><b>姓名</b></td>
    				<td align="center"><b>年龄</b></td>
    				<td align="center"><b>操作</b></td>
    			</tr>
    			<c:forEach items="${userList}" var="user">
    			<tr>
    				<td align="center">${user.userId}</td>
    				<td align="center">${user.userName}</td>
    				<td align="center">${user.userAge}</td>
    				<td align="center"><a href="user/queryUserbyId.html?userId=${user.userId}">查看</a>&nbsp;&nbsp;<a href="user/updateueryUserbyId.html?userId=${user.userId}">修改</a>&nbsp;&nbsp;<a id="deleteUser" href="user/deleteUserbyId.html?userId=${user.userId}">删除</a></td>
    			</tr>
    			</c:forEach>
    		</table>
    </center>
    <script type="text/javascript">
    	$("#deleteUser").click(function(){
    		alert("删除成功");
    	});
    </script>
  </body>
</html>
