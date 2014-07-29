package com.menu.common;
import java.sql.*;
public class DBConnection {
	private static final String DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://localhost:1433;DataBaseName=Menu";
	private static final String DBNAME = "sa";
	private static final String DBPASS = "930921";
	private static DBConnection cdb;
	
	private DBConnection(){}
	
	public static DBConnection getInit(){
		if(cdb == null){
			cdb = new DBConnection();
		}
		return cdb;
	}
	
	public Connection getConn() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER_CLASS);
		return DriverManager.getConnection(URL,DBNAME,DBPASS);
	}
 	
	public void closeAll(Connection conn,PreparedStatement pstmt,ResultSet rs){
		try {
			if(rs != null){
				rs.close();
			}
			if(pstmt != null){
				pstmt.close();
			}
			if(conn != null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
