<%@ page language="java" import="java.util.*,com.menu.entity.*,com.menu.operation.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=gb2312" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
#Layer1 {
	position:absolute;
	width:810px;
	height:330px;
	z-index:1;
	left: 220px;
	top: 148px;
}
</style>
</head>
<body background="image/33.jpg">
<p>&nbsp;</p>
<%if(session.getAttribute("user")==null)
       {
          out.println("<script type='text/javascript'> alert('sorry,您还未登录，请先登录!'); document.location.href='login.jsp';</script>");
       } %>
<table width="680" border="1" align="center">
<tr>
 <td colspan="5" height="40"align="center"><font size="+3">用户中心</font></td>
 </tr>
  <tr>
   <td width="119" align="center"><a href="UserShowCourses.jsp">查看菜单</a></td>
    <td width="119" height="40"  align="center"><a href="UserManage.jsp">用户点菜</a></td>
    <td width="143" align="center"><a href="LeaveMessage.jsp">用户留言</a></td>
    <td width="127" align="center"><a href="Ordered.jsp">查看订单</a></td>
    <td width="138" align="center"><a href="UserShowMessage.jsp">查看留言</a></td>
  </tr>
</table>

<div id="Layer1">
<p>&nbsp;&nbsp;</p>
<table width="790" border="1" align="center">
  <tr>
    <td width="179">编号</td>
    <td width="212">菜名</td>
    <td width="162">价格</td>
    <td width="166">简介</td>
    <td width="37"align="center">操作</td>
  </tr>
 <%
    CoursesBo cb = new CoursesBo();
	List list =cb.selectAllCourses();
	for (int i = 0; i < list.size(); i++) {
	Courses course = (Courses) list.get(i);
 %>
  <tr>
    <td><%=course.getMenuId()%></td>
    <td><a href="PlayServlet?MenuName=<%=course.getCourseName()%>"><%=course.getCourseName()%></a></td>
    <td><%=course.getPrice()%></td>
    <td><%=course.getDetail()%></td>
    <td width="37"><a href="BookServlet?MenuName=<%=course.getCourseName()%>">订菜</a></td>
  </tr>

<%
  }
%>
</table>
</div>
</body>
</html>