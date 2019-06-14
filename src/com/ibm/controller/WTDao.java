package com.ibm.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.bean.User;

public class WTDao {
	public int createUser(HttpServletRequest request, HttpServletResponse response, ServletContext context, User user) {
		Connection dbCon = (Connection) request.getServletContext().getAttribute("dbCon");
        int flag = 0;
		String userName = user.getUserName();
		String email = user.getEmail();
		String contact = user.getContact();
		String password = user.getPassword();

		PreparedStatement preparedStatement;

		String query = "insert into user_master(email,userName,password,contact) values(?,?,?,?)";

		try {
			preparedStatement = dbCon.prepareStatement(query);

			preparedStatement.setString(1, email);
			preparedStatement.setString(2, userName);
			preparedStatement.setString(3, password);
			preparedStatement.setString(4, contact);

			int i = preparedStatement.executeUpdate();

			if (i > 0) {
				flag = 1;
			} 
		} catch (SQLException e) {

			e.printStackTrace();
		}
        return flag;
	}

	public void login(HttpServletRequest request, HttpServletResponse response, ServletContext context) {

	}

	public int checkUser(HttpServletRequest request, HttpServletResponse response, ServletContext servletContext,
			User user) {
		Connection dbCon = (Connection) request.getServletContext().getAttribute("dbCon");
		int flag=1;
		String un = user.getUserName();
		String pw = user.getPassword();
		
		PreparedStatement ps;
		try {
			ps = dbCon.prepareStatement("select userName,password from user_master where userName=? and password=?");
	
			ps.setString(1, un);
		
		ps.setString(2, pw);

		ResultSet rs = ps.executeQuery();
		if (!rs.next() ) {
		    flag=0;
		} 
		} catch (SQLException e1) {
	
			e1.printStackTrace();
		}
		
		return flag;
	}

}

