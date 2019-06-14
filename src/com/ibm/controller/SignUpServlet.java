//package com.ibm.controller;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.ibm.bean.User;
//
///**
// * Servlet implementation class SignUpServlet
// */
//@WebServlet("/signup")
//public class SignUpServlet extends HttpServlet {
//	
//	WTDao dao = new WTDao();
//	User user;
//
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		doPost(req, resp);
//		String userName = req.getParameter("userName");
//		String email = req.getParameter("email");
//		String contact = req.getParameter("contact");
//		String password = req.getParameter("password");
//
//		user = new User(userName, email, contact, password);
//
//		int flag = dao.createUser(req, resp, getServletContext(), user);
//
//		if (flag > 0) {
//			resp.sendRedirect("biometrics.jsp");
//			
//		} else {
//			RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
//			rd.include(req, resp);
//		}
//	}
//
////	@Override
////	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
////		RequestDispatcher req = request.getRequestDispatcher("");
////		req.include(request, resp);
////
////	}
//}
