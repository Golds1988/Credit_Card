package com.project;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 * Servlet implementation class priceServlet
 */
@WebServlet("/price")
public class priceServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int startDate = Integer.parseInt(request.getParameter("startDate"));
		int endDate = Integer.parseInt(request.getParameter("endDate"));
		String age = request.getParameter("age");
		String loc = request.getParameter("loc");
		int sex = Integer.parseInt(request.getParameter("sex"));
		int flc = Integer.parseInt(request.getParameter("flc"));
		Price a = new Price();
		ArrayList<PriceVO> priceList = a.priceChoose(startDate, endDate, age, loc, sex, flc);
		String status = "fail";
		DecimalFormat formatter = new DecimalFormat("###,###");
		if(priceList.size()==0)
		{
			RequestDispatcher rd = request.getRequestDispatcher("Kelly/colorlib-regform-2/colorlib-regform-2/index2.jsp");
			request.setAttribute("status", status);
			rd.forward(request, response);
		}
		else
		{	
			ArrayList<PriceVO> priceList1 = new ArrayList<PriceVO>();
			ArrayList<PriceVO> priceList2 = new ArrayList<PriceVO>();
			TransferInfo t = new TransferInfo();
			String[] userInfo = t.transInfo(startDate, endDate, age, loc, sex, flc);
			for(int i=0;i<5;i++)
			{
				priceList1.add(priceList.get(i));
			}
			for(int i=5;i<10;i++)
			{
				priceList2.add(priceList.get(i));
			}
			Card b = new Card();
			ArrayList<CardVO> cardList = b.cardChoose(priceList);
			int sum = 0;
			for(int i=0;i<priceList.size();i++)
			{
				sum+=priceList.get(i).getPrice();
			}
			sum = Math.round(sum);
	//		RequestDispatcher rd = request.getRequestDispatcher("/project/priceresult.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("/Kelly/about.jsp");
			request.setAttribute("cardList", cardList);
			request.setAttribute("priceList1", priceList1);
			request.setAttribute("priceList2", priceList2);
			request.setAttribute("sum", formatter.format(sum));
			request.setAttribute("userInfoList", userInfo);
			rd.forward(request, response);
		}
	}

}
