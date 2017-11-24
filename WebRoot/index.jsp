<%@ page language="java" pageEncoding="GBK"%>
<%
	String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Struts2+JQuery+JSON</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="<%=path %>/js/jquery.js"></script>
	<script type="text/javascript" src="<%=path %>/js/json.js"></script>
  </head>
  
  <body>
    <input id="getMessage" type="button" value="获取单个值"/>&nbsp;&nbsp;
    <input id="getUserInfo" type="button" value="获取UserInfo对象"/>&nbsp;&nbsp;
    <input id="getList" type="button" value="获取List对象"/>&nbsp;&nbsp;
    <input id="getMap" type="button" value="获取Map对象"/>&nbsp;&nbsp;
    <br>
    <br>
    <br>
    <!-- 要显示信息的层 -->
    <div id="message"></div>
    <form >
    	用户ID：<input name="userInfo.userId" type="text"/><br/>
    	用户名：<input name="userInfo.userName" type="text"/><br/>
    	密&nbsp;&nbsp;&nbsp;码：<input name="userInfo.password" type="text"/><br>
    	<input id="regRe" type="button" value="注册"/>
    </form>
  </body>
</html>
