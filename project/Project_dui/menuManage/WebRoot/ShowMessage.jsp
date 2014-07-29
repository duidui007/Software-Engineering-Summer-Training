<%@ page language="java" import="java.util.*,com.menu.entity.*,com.menu.operation.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=gb2312" %>
<%@ page language="java"import="java.sql.*,com.menu.entity.Users" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
 <title>查看留言</title>
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
<p><br></p><p>&nbsp;</p>
<table width="747" border="1" align="center">
<tr>
 <td colspan="5" height="40"align="center"><font size="+3">管理员中心</font></td>
 </tr>
  <tr>
    <td width="122" height="40"  align="center"><a href="userInformation.jsp">查看用户信息</a></td>
    <td width="136" align="center"><a href="AdminManage.jsp">添加菜单</a></td>
    <td width="152" align="center"><a href="ShowCourses.jsp">查看菜单</a></td>
    <td width="147" align="center"><a href="ShowMessage.jsp">查看留言板</a></td>
    <td width="156" align="center"><a href="ShowBook.jsp">查看订单</a></td>
  </tr>
</table>
<p></p>
<p></p>

 <table width="369" border="1" align="center">
  <tr>
    <td width="20">编号</td>
    <td width="90">留言主题</td>
    <td width="140">留言内容</td>
    <td width="35">留言者</td>
    <td width="20"align="center">操作</td>
  </tr>
 <%
	MessageBo mb=new  MessageBo();
	List list = mb.selectAllMessages();
	for (int i = 0; i < list.size(); i++) {
	Message message = (Message) list.get(i);
 %>
  <tr>
    <td><%=message.getMessageId()%></td>
    <td><%=message.getMessageTopic()%></td>
    <td><%=message.getMessage()%></td>
    <td><%=message.getUserName()%></td>
    <td width="35"><a href="DeleteServlet?menuId=<%=message.getMessageId() %>">删除</a></td> 
  </tr>

<%
  }
%>
</table>
</body>
</html>