package com.menu.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.menu.common.DBConnection;
import com.menu.entity.Users;

public class UsersBo {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public Users validUser(String userName,String password){
		Users user = null;
		String sql = "select * from Users where userName=? and password=?";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(rs.next()){
				user = new Users();
				user.setUserId(rs.getInt("userId"));
				user.setUserName(userName);
				user.setPassWord(password);
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setAddress(rs.getString("Address"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBConnection.getInit().closeAll(conn, pstmt, rs);
		}
		return user;
	}
	public  boolean insertUser(Users user){
		int num = 0;
		boolean flag=false;
		String sql = "insert into Users values(?,?,?,?,?)";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2,user.getPassWord());
			pstmt.setString(3,user.getEmail());
			pstmt.setString(4,user.getPhone());
			pstmt.setString(5,user.getAddress());					
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
	public int deleteUsersById(String userName){
		int num1 = 0;
		String sql = "delete from Users where userName=?";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userName);
			num1 = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBConnection.getInit().closeAll(conn, pstmt, rs);
		}
		return num1;
	}
}

	

