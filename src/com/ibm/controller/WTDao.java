package com.ibm.controller;
import com.ibm.bean.UserBiometrics;
import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WTDao {
	Connection dbCon;
	//UserBiometrics usrBio = new UserBiometrics();
	

	public int setBiometricDetails(HttpServletRequest request, HttpServletResponse response, ServletContext context, UserBiometrics usrBio){
        PreparedStatement theStatement;
        int flag = 0;
        dbCon = (Connection) request.getServletContext().getAttribute("dbCon");
		try{			
			String insertQry = "INSERT INTO `user_biometrics`(`email`, `gender`, `height`, `weight`, `age`) VALUES (?,?,?,?,?)";
		            	      
		            theStatement = (PreparedStatement) dbCon.prepareStatement(insertQry);
		            theStatement.setString(1, usrBio.getEmail());
					theStatement.setString(2, usrBio.getGender());
					theStatement.setDouble(3, usrBio.getHeight());
					theStatement.setDouble(4, usrBio.getWeight());
					theStatement.setInt(5, usrBio.getAge());
					//Execute the query
					if(theStatement.executeUpdate() > 0) {
						//System.out.println("User Biometric details inserted...");
						flag = 1;
						
					}
					else
					{
						//System.out.println("Some issues...");
						flag = 0;
					}
		            } 
		            catch (Exception ex) {
		            System.out.println("Unable to connect to database.");
		 			}
		            /* finally {
		            // close all the connections.
		            theStatement.close();
		            dbCon.close();
		            } */
		return flag;
	}
   public void createUser(HttpServletRequest request, HttpServletResponse response, ServletContext context){
	   dbCon = (Connection) request.getServletContext().getAttribute("dbCon");
	   
   }
   public void login(HttpServletRequest request, HttpServletResponse response, ServletContext context) {
	   
   }
}

