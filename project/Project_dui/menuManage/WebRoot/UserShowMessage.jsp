<%@ page language="java" import="java.util.*,com.menu.entity.*,com.menu.operation.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=gb2312" %>
<%@ page language="java" import="java.sql.*,com.menu.entity.Users"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
   <title>用户中心</title>
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
 <%if(session.getAttribute("user")==null)
       {
          out.println("<script type='text/javascript'> alert('您还未登录，请先登录'); document.location.href='login.jsp';</script>");
       } %>
<p>&nbsp;</p>
<table width="680" border="1" align="center">
<tr>
 <td colspan="5" height="40"align="center"><font size="+3">用户中心</font></td>
 </tr>
  <tr>
   <td width="119" align="center"><a href="UserShowCourses.jsp">查看菜单</a></td>
    <td width="119" height="40"  align="center"><a href="UserManage.jsp">用户点菜</a></td>
    <td width="143" align="center"><a href="LeaveMessage.jsp">用户留言</a></td>
    <td width="127" align="center">查看订单</td>
    <td width="138" align="center"><a href="UserShowMessage.jsp">查看留言</a></td>
  </tr>
</table>
<p></p>
<p></p>
<p></p>
 <table width="369" border="1" align="center">
  <tr>
    <td width="20">编号</td>
    <td width="90">留言主题</td>
    <td width="140">留言内容</td>
    <td width="35">留言者</td>
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
  </tr>

<%
  }
%>
</table>
</body>
</html>