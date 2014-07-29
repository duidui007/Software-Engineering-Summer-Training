package com.menu.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.menu.common.DBConnection;
import com.menu.entity.Courses;
import com.menu.entity.Users;
public class CoursesBo {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
		
public  boolean insertCourses(Courses course){
		int num = 0;
		boolean flag=false;
		String sql = "insert into menu values(?,?,?)";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, course.getCourseName());
			pstmt.setString(2,course.getPrice());
			pstmt.setString(3,course.getDetail());					
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
	
  public int deleteCourseById(String menuId){
		int num = 0;
		String sql = "delete from menu where menuId=?";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, menuId);
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
	public List selectAllCourses(){   //�г�ϵͳ�е����в˵�
		List list = new ArrayList();
		String sql = "select * from menu";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Courses c = new Courses();
				c.setMenuId(rs.getInt("menuId"));
				c.setCourseName(rs.getString("courseName"));
				c.setPrice(rs.getString("price"));
				c.setDetail(rs.getString("detail"));
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
	public List selectByCoursesName(String courseName){
		List list = new ArrayList();
		String sql = "select * from menu where courseName=?";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, courseName);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Courses course=new Courses();
				course.setMenuId(rs.getInt("menuId"));
				course.setCourseName(rs.getString("courseName"));
				course.setPrice(rs.getString("price"));
				course.setDetail(rs.getString("detail"));
				list.add(course);
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
	
public  boolean insertBookCourses(Courses course,Users user){
		int num = 0;
		boolean flag=false;
		String sql = "insert into Book values(?,?,?)";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, course.getCourseName());
			pstmt.setString(2,course.getPrice());
			pstmt.setString(3,user.getUserName());
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
	

	
	
}
