<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=gb2312" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <style type="text/css">
<!--
#Layer1 {
	position:absolute;
	width:288px;
	height:140px;
	z-index:1;
	left: 47px;
	top: 166px;
}
#Layer2 {
	position:absolute;
	width:307px;
	height:140px;
	z-index:2;
	left: 942px;
	top: 169px;
}
#Layer3 {
	position:absolute;
	width:499px;
	height:182px;
	z-index:3;
	left: 329px;
	top: -7px;
}
#Layer4 {
	position:absolute;
	width:583px;
	height:279px;
	z-index:3;
	left: 347px;
	top: 161px;
}
-->
    </style>
</head>

<body background="image/31.jpg">
<embed style="LEFT:371px; POSITION: absolute; TOP: -56px; width: 531px; height: 213px;" src="image/title.swf" width=531 height=136 autostart=true wmode=transparent>
<div id="Layer1">
<form action="adminLoginServlet" method="post">
<table width="280" border="1">
  <tr>
    <td height="32" colspan="2" align="center">管理员登陆</td>
  </tr>
  <tr>
    <td width="89" height="32">管理员名：</td>
    <td width="168"><input type="text" name="admin" style="height:25px"/></td>
  </tr>
  <tr>
    <td height="29">密码：</td>
    <td><input type="password" name="password"style="height:25px" /></td>
  </tr>
  <tr>
    <td height="29" colspan="2"align="center"><input type="submit" value="登陆" /> </td>
  </tr>
</table>
</form>
</div>

<div id="Layer2">
  <form  action="loginServlet" method="post">
<table width="298" height="116" border="1" align="left">
 <tr>
   <td height="32" colspan="2" align="center">用户登陆</td>
 </tr>
  <tr>
    <td width="69" height="37">用户名：</td>
    <td width="213"><input type="text" name="userName"  style="height:25px"/>
      <a href="register.jsp">注册</a></td>
  </tr>
  <tr>
    <td height="37">密码：</td>
    <td><input type="password" name="password"style="height:25px" /></td>
  </tr>
  <tr>
   <td height="32" colspan="2"align="center">
   <input type="submit" value="登录" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   <input type="reset" value="重置" /></td>
  </tr>
</table>
</form>
</div>

<p>&nbsp;</p>

<div id="Layer4">
<embed style="LEFT:27px; POSITION: absolute; TOP: 26px; width: 531px; height: 213px;" src="image/browser.swf" width=531 height=136 autostart=true wmode
 =transparent></div>
</body>
</html>