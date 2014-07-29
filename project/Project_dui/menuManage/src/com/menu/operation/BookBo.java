package com.menu.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.menu.common.DBConnection;
import com.menu.entity.Book;
import com.menu.entity.Courses;
import com.menu.entity.Users;

public class BookBo {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	public List selectAllBookCourses(){   //�г�ϵͳ�е����в˵�
		List list = new ArrayList();
		String sql = "select * from Book";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Book c = new Book();
				c.setBookId(rs.getInt("BookId"));
				c.setCourseName(rs.getString("courseName"));
				c.setPrice(rs.getString("price"));
				c.setUserName(rs.getString("userName"));
				list.add(c);
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
	
	public List selectMyAllBookCourses(){   //�г�ϵͳ�е����в˵�
		List list = new ArrayList();
		String sql = "select * from Book";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Book c = new Book();
				c.setBookId(rs.getInt("BookId"));
				c.setCourseName(rs.getString("courseName"));
				c.setPrice(rs.getString("price"));
				c.setUserName(rs.getString("userName"));
				list.add(c);
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

}
