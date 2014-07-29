package com.menu.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.menu.entity.Users;
import com.menu.operation.UsersBo;

public class AddUsersServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddUsersServlet() {
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
			response.sendRedirect("register.jsp");
		}else{
			String userName= request.getParameter("userName");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String Address = request.getParameter("Address");
			
			Users user=new Users();  //Ð´ÈëÊý¾Ý
			user.setUserName(userName);
			user.setPassWord(password);
			user.setEmail(email);
			user.setPhone(phone);
			user.setAddress(Address);
	        UsersBo ub=new  UsersBo();
			boolean flag=ub.insertUser(user);
			if(flag)
			{
				response.sendRedirect("success.html");
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
