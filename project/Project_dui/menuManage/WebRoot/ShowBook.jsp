<%@ page language="java" import="java.util.*,com.menu.entity.*,com.menu.operation.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=gb2312" %>
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
<p></p>
<p></p>


<table width="450" border="1" align="center">
  <tr>
    <td width="40">订单号</td>
    <td width="100">菜名</td>
    <td width="150">价格</td>
    <td width="120">用户名</td>
  </tr>
 <%
     BookBo bb = new BookBo();
     List list=bb.selectAllBookCourses();
	//List list = (List)request.getAttribute("coursesList");
	for (int i = 0; i < list.size(); i++) {
	Book book = (Book) list.get(i);
 %>
  <tr>
    <td><%=book.getBookId()%></td>
    <td><%=book.getCourseName()%></td>
    <td><%=book.getPrice()%></td>
    <td><%=book.getUserName()%></td>
  </tr>
  <%
  }
%>
</table>

</body>
</html>
