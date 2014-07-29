<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=gb2312" %>
<%@ page language="java" import="java.sql.*,com.menu.entity.Users" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
   <head>
 <title>已经注册了的用户的信息</title>
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
  <%-- <p>已经注册了的用户的信息</p>--%>
  <p></p>
  <p></p>
 <% 
   String url="jdbc:sqlserver://localhost:1433;DatabaseName=Menu"; 
   String userName="sa"; 
   String password="930921"; 
   String sql=null; 
   Connection conn=null; 
   Statement stmt=null; 
   try{ 
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
     } 
   catch(ClassNotFoundException e){e.printStackTrace(); } 
   try{ 
    
     conn=DriverManager.getConnection(url,userName,password); 
     stmt=conn.createStatement(); 
     sql="select * from Users";; 
     ResultSet rs=stmt.executeQuery(sql);  
  %>
 
<table width="747" height="80" border="1" align="center">
  <tr>
    <td width="100">编号</td>
    <td width="100">用户名</td>
    <td width="90">密码</td>
    <td width="100">邮箱</td>
    <td width="100">联系方式</td>
    <td width="100">地址</td>
  </tr>
 <% 
	while(rs.next())
 {
 %>
  <tr>
     <td width="100"><%=rs.getString(1)%></td>
    <td width="100"><%=rs.getString(2)%></td>
    <td width="90"><%=rs.getString(3)%></td>
    <td width="100"><%=rs.getString(4)%></td>
    <td width="100"><%=rs.getString(5)%></td>
    <td width="100"><%=rs.getString(6)%></td>
  </tr>
  <% } %>
</table>

<%
  rs.close();
  stmt.close();
  }
  catch(SQLException e){}
  finally{
  try{
    if(conn!=null) conn.close();
  }
  catch(SQLException e){e.printStackTrace();}
  }  
%>
</body>
</html>