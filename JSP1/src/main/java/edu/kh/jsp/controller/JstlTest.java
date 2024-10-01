package edu.kh.jsp.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signUp")
public class JstlTest extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String inputId = req.getParameter("id");
		String inputPw = req.getParameter("inputPw1");
		String inputPwC = req.getParameter("pwCheck1");
		String inputName = req.getParameter("inputName1");
		String inputAge = req.getParameter("inputAge1");
		
		System.out.println(inputId);
		System.out.println(inputPw);
		System.out.println(inputPwC);
		System.out.println(inputName);
		System.out.println(inputAge);
		
		
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/signup_result.jsp");
		
		dispatcher.forward(req, resp);
		
		
	}
}
