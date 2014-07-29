package com.menu.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.menu.common.DBConnection;
import com.menu.entity.admin;


public class adminBo {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	public admin validAdmin(String admin,String password){   //管理员身份认证
		admin a = null;
		String sql = "select * from Admin where admin=? and password=?";
		try {
			conn = DBConnection.getInit().getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, admin);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(rs.next()){
			    a=new admin();
				a.setAdmin(admin);
				a.setPassword(password);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBConnection.getInit().closeAll(conn, pstmt, rs);
		}
		return a;
	}

}
