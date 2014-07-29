<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=gb2312" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <script language="javascript" src="js/script1.js"></script>
    <base href="<%=basePath%>">
    
    <title>My JSP 'LeaveMessage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
 <body background="image/2.jpg">
 <%if(session.getAttribute("user")==null)
       {
          out.println("<script type='text/javascript'> alert('您还未登录，请先登录'); document.location.href='login.jsp';</script>");
       } %>
<form action="LeaveMessageServlet" method="post" name="myform" onSubmit="return validate()">
<table width="353" border="1" align="center">
  <tr>
    <td height="31" colspan="2"  align="center">！欢迎对我们提出建议！</td>
  </tr>
  <tr>
    <td width="98" height="34">留言主题：</td>
    <td width="239"><input type="text" name="MessageTopic"  style="height:25px"/></td>
  </tr>
  <tr>
    <td height="32">留言内容：</td>
    <td><input type="text" name="Message"style="height:25px" /></td>
  </tr>
  <tr>
    <td height="32">用户名：</td>
    <td><input type="text" name="userName"style="height:25px" /></td>
  </tr>
  <tr>
    <td height="36" colspan="2" align="center">
	<input type="submit" value="确认留言"  style="margin-right:10px"/>
	<input type="reset"  value="取消留言" style="margin-right:5px"/><a href="UserManage.jsp" ><font >返回用户中心</font></a>
	</td>
  </tr>
</table>
</form>
</body>
</html>
