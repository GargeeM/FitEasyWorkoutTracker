package com.ibm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.ibm.bean.UserBiometrics;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class BiometricsServlet
 */
@WebServlet("/bioservlet")
public class BiometricsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BiometricsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email,gender;
		Double height,weight;
		Integer age;
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//Get a reference to the Session object
		HttpSession session = request.getSession();   //check it
		//Get a reference to the ServletContext
		ServletContext theContext = request.getServletContext();
		PrintWriter out = response.getWriter();
		
		email = (String) request.getSession().getAttribute("email");
		//out.println("email = "+email);
		gender = request.getParameter("radgender");
		//out.println("gender = "+gender);
		height = java.lang.Double.parseDouble(request.getParameter("height"));
		//out.println("height = "+height);
		weight = java.lang.Double.parseDouble(request.getParameter("weight"));
		age = Integer.parseInt(request.getParameter("age"));
		UserBiometrics usrBio = new UserBiometrics(email,gender,height,weight,age);
		WTDao dao = new WTDao();
		int flag = dao.setBiometricDetails(request, response, theContext, usrBio);
		if(flag == 1) {
			request.getRequestDispatcher("lightworkoutplan.jsp").forward(request,response);
		}
		else {
			request.getRequestDispatcher("biometrics.jsp").forward(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
