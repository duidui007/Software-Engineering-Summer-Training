package com.menu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.menu.common.Validate;
import com.menu.operation.CoursesBo;

public class SelectServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public SelectServlet() {
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
		if(session == null){
			response.sendRedirect("login.jsp");
		}else{
			String courseName = Validate.validStringNull(request.getParameter("courseName"));
			CoursesBo bb = new CoursesBo();
			List coursesList = bb.selectByCoursesName(courseName);
				if(coursesList==null){
					PrintWriter out=response.getWriter();
					out.print("<script type='' language='javascript'>alert('没有您所要的菜单，请重新输入！');history.go(-1);</script>");
				}
				else{
					request.setAttribute("coursesList", coursesList);
					request.getRequestDispatcher("BookCourses.jsp").forward(request, response);
				}
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
