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

public class PlayServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String courseName = request.getParameter("MenuName");
		if (courseName != null) {
			PrintWriter out = response.getWriter();
			out.print("<script type='' language='javascript'>alert('wrongcourseName');document.location.href='UserManage.jsp';</script>");
		}
		String Play = "Play" + courseName + ".jsp";
		if (Play == null) {
			PrintWriter out = response.getWriter();
			out.print("<script type='' language='javascript'>alert('wrongpaly');document.location.href='UserManage.jsp';</script>");
		}
		response.sendRedirect(Play);
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
}