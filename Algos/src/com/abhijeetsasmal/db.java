package com.abhijeetsasmal;

import java.sql.*;

public class db {
	static final String my_sqldriver = "com.mysql.jdbc.Driver";
	static final String db_url = "jdbc:mysql://localhost:3306/users?verifyServerCertificate=false&useSSL=false";
	
	static final String USER = "root";
	static final String PASS = "toor";
	
	Statement stmt;
	
	void connect() throws ClassNotFoundException, SQLException {
		Class.forName(my_sqldriver);
		Connection conn = DriverManager.getConnection(db_url,USER,PASS);
		stmt = conn.createStatement();
	}
	
	void insert(String email, String password) throws SQLException {
		String sql = "INSERT INTO users (email, password) VALUES ('"+email+"', '"+password+"') ";
		stmt.executeUpdate(sql);
	}

    boolean find(String email, String password) {
    	String sql = "SELECT  email, password FROM users WHERE email = '"+email+"'and password = '"+password+"'";
    	ResultSet rs;
		try {
			rs = stmt.executeQuery(sql);
			rs.last();
			int size = rs.getRow(); 
			if (size == 1) 
				return true;
		} catch (SQLException e) {
			return false;
		}
        return false;
	}
}
