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
    <input id="getMessage" type="button" value="��ȡ����ֵ"/>&nbsp;&nbsp;
    <input id="getUserInfo" type="button" value="��ȡUserInfo����"/>&nbsp;&nbsp;
    <input id="getList" type="button" value="��ȡList����"/>&nbsp;&nbsp;
    <input id="getMap" type="button" value="��ȡMap����"/>&nbsp;&nbsp;
    <br>
    <br>
    <br>
    <!-- Ҫ��ʾ��Ϣ�Ĳ� -->
    <div id="message"></div>
    <form >
    	�û�ID��<input name="userInfo.userId" type="text"/><br/>
    	�û�����<input name="userInfo.userName" type="text"/><br/>
    	��&nbsp;&nbsp;&nbsp;�룺<input name="userInfo.password" type="text"/><br>
    	<input id="regRe" type="button" value="ע��"/>
    </form>
  </body>
</html>
