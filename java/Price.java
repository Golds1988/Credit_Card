package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Price 
{
	public ArrayList<PriceVO> priceChoose(int startDate,int endDate,String age,String loc, int sex, int flc)
	{
		DBManager db = new DBManager();
		Connection c = db.conn("oracle");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<PriceVO> priceList = new ArrayList<PriceVO>();
		String sql = 
				String.format("select class, (sum(price)/sum(pcnt))*%d as price from "
				+ "(select class,price,pcnt from %s " 
				+ " where (ym between %d and %d) "
				+ "and age='%s' and sex=%d and flc=%d) group by class order by class", endDate-startDate+1,loc,startDate,endDate,age,sex,flc);
		DecimalFormat formatter = new DecimalFormat("###,###");
		double sum=0;
		try 
		{
			pstmt = c.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				PriceVO vo = new PriceVO();
				vo.setPrice((int)Math.round(rs.getDouble("price")));
				vo.setCname(rs.getString("class"));
				sum+=vo.getPrice();
				vo.setPformat(formatter.format(vo.getPrice()));
				priceList.add(vo);
			}
			for(int i=0;i<priceList.size();i++)
			{
				priceList.get(i).setPer(priceList.get(i).getPrice()/sum*100);
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		db.close(c, pstmt, rs);
		return priceList;
	}
}
