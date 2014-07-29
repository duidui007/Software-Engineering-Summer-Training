package com.menu.operation;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.menu.common.DBConnection;
import com.menu.entity.Courses;
import com.menu.entity.Message;
public class MessageBo {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public  boolean insertMessage(Message message){
		int num = 0;
		boolean flag=false;
		String sql = "insert into LeaveMessage values(?,?,?)";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, message.getMessageTopic());
			pstmt.setString(2,message.getMessage());
			pstmt.setString(3,message.getUserName());					
			num = pstmt.executeUpdate();
			if(num>0)
   		    	flag=true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBConnection.getInit().closeAll(conn, pstmt, rs);
		}
		return flag;
	}
	public List selectAllMessages(){   
		List list = new ArrayList();
		String sql = "select * from LeaveMessage";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Message m = new Message();
				m.setMessageId(rs.getInt("MessageId"));
				m.setMessageTopic(rs.getString("MessageTopic"));
				m.setMessage(rs.getString("Message"));
				m.setUserName(rs.getString("userName"));
				list.add(m);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBConnection.getInit().closeAll(conn, pstmt, rs);
		}
		return list;
	}
	public int deleteMessageById(String MessageId){
		int num = 0;
		String sql = "delete from LeaveMessage where MessageId=?";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, MessageId);
			num = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBConnection.getInit().closeAll(conn, pstmt, rs);
		}
		return num;
	}

}
