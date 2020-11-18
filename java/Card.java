package com.project;

import java.sql.*;
import java.util.ArrayList;

public class Card 
{
	public ArrayList<CardVO> cardChoose(ArrayList<PriceVO> priceList)
	{
		DBManager db = new DBManager();
		Connection c = db.conn("oracle");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = String.format("select name,score,img,url from\r\n" + 
				"(select a.*,rownum as r from \r\n" + 
				"(select name,(%.2f*education+%.2f*transport+%.2f*leisure+%.2f*culture+%.2f*life+%.2f*shopping+%.2f*trip+%.2f*food+%.2f*car+%.2f*mobile) as score,img,url from credit order by score desc)a)\r\n" + 
				"where r<=5",
				priceList.get(0).getPer(),priceList.get(1).getPer(),priceList.get(2).getPer(),priceList.get(3).getPer(),priceList.get(4).getPer()
				,priceList.get(5).getPer(),priceList.get(6).getPer(),priceList.get(7).getPer(),priceList.get(8).getPer(),priceList.get(9).getPer());
		ArrayList<CardVO> cardList = new ArrayList<CardVO>();
		try 
		{
			pstmt = c.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				CardVO vo = new CardVO();
				vo.setImg(rs.getString("img"));
				vo.setName(rs.getString("name"));
				vo.setUrl(rs.getString("url"));
				vo.setScore(rs.getDouble("score"));
				cardList.add(vo);
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		db.close(c, pstmt, rs);
		return cardList;
	}

}
