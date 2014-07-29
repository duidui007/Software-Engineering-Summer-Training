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
import com.menu.entity.Courses;
import com.menu.entity.Message;
import com.menu.operation.CoursesBo;
import com.menu.operation.MessageBo;

public class LeaveMessageServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LeaveMessageServlet() {
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
			response.sendRedirect("LeaveMessage.jsp");
		}else{
			String MessageTopic= request.getParameter("MessageTopic");
			String Message = request.getParameter("Message");
			String userName = request.getParameter("userName");		
			Message message=new Message(); 
			message.setMessageTopic(MessageTopic);
			message.setMessage(Message);
			message.setUserName(userName);
	        MessageBo mb=new  MessageBo();
			boolean flag=mb.insertMessage(message);
			List MessageList=null;
			if(flag)
			{
				MessageList=mb.selectAllMessages();
				request.setAttribute("MessageList",MessageList);
				
				response.sendRedirect("UserShowMessage.jsp");
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
