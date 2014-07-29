<%@ page language="java" import="java.util.*,com.menu.entity.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=gb2312" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
 <title>管理员后台操作</title>
<style type="text/css">
 td
{
   font-size:16px; 
 }
 A:hover
{      
	color:red;             
 }
 A:active
{
    color:#CC3399;
 }
A:visited
{
	color:#CC9933;
 }      
</style>
</head>
<body background="image/33.jpg">
<p>&nbsp;</p>
<table width="747" border="1" align="center">
<tr>
 <td colspan="5" height="40"align="center"><font size="+3">管理员中心</font></td>
 </tr>
  <tr>
    <td width="122" height="40"  align="center"><a href="userInformation.jsp">查看用户信息</a></td>
    <td width="136" align="center"><a href="AdminManage.jsp">添加菜单</a></td>
    <td width="152" align="center"><a href="ShowCourses.jsp">查看菜单</a></td>
    <td width="147" align="center"><a href="ManageMessage.jsp">管理留言</a></td>
    <td width="156" align="center"><a href="ShowBook.jsp">查看订单</a></td>
  </tr>
</table>
<p>&nbsp;</p>

<form action="AddCourseServlet" method="post">
<table width="733" height="268" border="1" align="center">
<tr>
    <td height="30"  colspan="2" align="center">请添加菜单</td>
  </tr>
  <tr>
    <td width="211" height="42">请输入菜名：</td>
    <td width="506"><input name="courseName" type="text" size="30" style="height:25px" /></td>
  </tr>
  <tr>
    <td height="34">请输入价格：</td>
    <td><input name="price" type="text" size="30" style="height:25px" /></td>
  </tr>
  <tr>
    <td height="102">菜品简单介绍：</td>
    <td><textarea rows="7"  cols="29" name="detail"></textarea></td>
  </tr>
  <tr>
   <td height="42"  colspan="2" align="center"><input type="submit" value="上传"  style="margin-right:100px"/>&nbsp;&nbsp;&nbsp;
   <input type="reset" value="取消"/>
   <a href="image/viewer.html">查看管理员相册</a></td>
  </tr>
</table>
</form>
</body>
</html>