<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=gb2312" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script language="javascript" src="js/script.js"></script>
</head>
<body background="image/33.jpg">

<p></p>
<form name="myform" action="AddUsersServlet" onSubmit="return validate()"  method="post">
<table width="519" height="327" border="1" align="center">
<tr>
 <td height="33" colspan="2"align="center"><font color="#9966FF" size="+3">欢迎新用户注册</font></td>
 </tr>
  <tr>
    <td width="128" height="35">用户名：</td>
    <td width="285"><input type="text" name="userName"  style="height:25px"/></td>
  </tr>
  <tr>
    <td height="35">密码：</td>
    <td><input type="password" name="password" style="height:25px"/></td>
  </tr>
  <tr>
    <td height="36">确认密码：</td>
    <td><input type="password" name="password2" style="height:25px"/></td>
  </tr>
  <tr>
    <td height="34">邮箱：</td>
    <td><input type="text" name="email" style="height:25px"/></td>
  </tr>
  <tr>
    <td height="34">联系电话：</td>
    <td><input type="text" name="phone" style="height:25px"/></td>
  </tr>
  <tr>
    <td height="33">联系地址：</td>
    <td><input type="text" name="Address"style="height:25px" /></td>
  </tr>
   <tr>
    <td height="33" colspan="2"align="center">
      <input type="submit" value="注册" style="margin-right:50px" /> 
      <input type="reset" value="重置"/></td>
  </tr>
</table>
</form>
</body>
</html>>