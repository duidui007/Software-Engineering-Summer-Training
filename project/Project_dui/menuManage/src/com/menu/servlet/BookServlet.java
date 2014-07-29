package com.menu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.menu.entity.Courses;
import com.menu.entity.Users;
import com.menu.operation.BookBo;
import com.menu.operation.CoursesBo;
import com.menu.operation.UsersBo;

public class BookServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public BookServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("gbk");
		response.setContentType("text/html;charset=gbk");
		HttpSession session = request.getSession(false);
		Users user = (Users)session.getAttribute("user");
		if(user==null)
		{
			PrintWriter out=response.getWriter();
			out.print("<script type='' language='javascript'>alert('wronguser');document.location.href='UserManage.jsp';</script>");
		}
		if(session == null){
			response.sendRedirect("UserManage.jsp");
		}else{
			String userName=user.getUserName();
			if(userName==null)
			{
				PrintWriter out=response.getWriter();
				out.print("<script type='' language='javascript'>alert('wronguesrname');document.location.href='UserManage.jsp';</script>");
			}
			String courseName= request.getParameter("MenuName");
			CoursesBo cb=new  CoursesBo();
			List list =cb.selectByCoursesName(courseName);
			if(list==null)
			{
				PrintWriter out=response.getWriter();
				out.print("<script type='' language='javascript'>alert('wrong4');document.location.href='UserManage.jsp';</script>");
			}
			Courses course = (Courses) list.get(0);
			if(course == null){
				PrintWriter out=response.getWriter();
				out.print("<script type='' language='javascript'>alert('wrongcourse');document.location.href='UserManage.jsp';</script>");
			}
			if(courseName == null){
				PrintWriter out=response.getWriter();
				out.print("<script type='' language='javascript'>alert('wrong1');document.location.href='UserManage.jsp';</script>");
			}
			UsersBo ub=new UsersBo();		
			user.setUserName(userName);
	        BookBo bb=new BookBo();
			boolean flag=cb.insertBookCourses(course, user);
			List coursesList=null;
			if(flag)
			{
				coursesList=bb.selectAllBookCourses();
				//request.setAttribute("coursesList",coursesList);
				//response.sendRedirect("ShowBook.jsp");
				PrintWriter out=response.getWriter();
				out.print("<script type='' language='javascript'>alert('success！');document.location.href='UserManage.jsp';</script>");
				//response.sendRedirect("UserManage.jsp");
			}
			else
				response.sendRedirect("Error.jsp");
		}
	}

	
	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
