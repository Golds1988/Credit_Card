package com.project;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/class2")
public class classServlet2 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String[] cname = request.getParameterValues("cname");
		ArrayList<CardVO> list = new ArrayList<CardVO>();
		Cname c = new Cname();
		if(cname.length==1)
		{
			list = c.cnameChoose(cname[0]);
		}
		else
		{
			list = c.cnameChoose(cname);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/project/classresult2.jsp");
		request.setAttribute("cardlist", list);
		rd.forward(request, response);
	}

}
