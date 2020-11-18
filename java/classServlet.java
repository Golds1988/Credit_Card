package com.project;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet("/class")
public class classServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String cname = request.getParameter("cname");
		Cname c = new Cname();
		ArrayList<CardVO> list = c.cnameChoose(cname);
		RequestDispatcher rd = request.getRequestDispatcher("/project/classresult.jsp");
		request.setAttribute("cardlist", list);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}

}
