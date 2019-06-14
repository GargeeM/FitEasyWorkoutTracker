package com.ibm.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.bean.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")

public class LoginController extends HttpServlet {

	WTDao dao = new WTDao();
	User user;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String un = request.getParameter("uname");
		String pw = request.getParameter("psw");

		// Connect to mysql and verify username password
     user=new User(un, pw);
     
     int flag = dao.checkUser(request, response, getServletContext(), user);
     
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			// loads driver
//			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/workouttrack", "root", ""); // gets
//																												// a new
//																												// connection
//
//			PreparedStatement ps = c.prepareStatement("select userName,password from user_master where userName=? and password=?");
//			ps.setString(1, un);
//			ps.setString(2, pw);
//
//			ResultSet rs = ps.executeQuery();

			if(flag == 1) {
				response.sendRedirect("biometrics.jsp");
				
			} else {
				response.sendRedirect("index.jsp");
			}
			
			}
		
		}
	


