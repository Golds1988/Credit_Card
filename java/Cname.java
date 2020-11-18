package com.project;

import java.util.ArrayList;
import java.sql.*;

public class Cname 
{
	public ArrayList<CardVO> cnameChoose(String cname)
	{
		ArrayList<CardVO> list = new ArrayList<CardVO>();
		DBManager db = new DBManager();
		Connection c = db.conn("oracle");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = String.format("select * from credit where %s != 0",cname);
		try 
		{
			pstmt = c.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				CardVO vo = new CardVO();
				vo.setImg(rs.getString("img"));
				vo.setUrl(rs.getString("url"));
				vo.setName(rs.getString("name"));
				list.add(vo);
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		db.close(c, pstmt, rs);
		return list;
	}
	
	public ArrayList<CardVO> cnameChoose(String[] cname)
	{
		String sql;
		if(cname.length==2)
		{
			sql = String.format("select * from credit where %s!=0 and %s!=0", cname[0],cname[1]);
		}
		else
		{
			sql = String.format("select * from credit where %s!=0 and %s!=0 and %s!=0", cname[0],cname[1],cname[2]);
		}
		ArrayList<CardVO> list = new ArrayList<CardVO>();
		DBManager db = new DBManager();
		Connection c = db.conn("oracle");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try 
		{
			pstmt = c.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				CardVO vo = new CardVO();
				vo.setName(rs.getString("name"));
				vo.setImg(rs.getString("img"));
				vo.setUrl(rs.getString("url"));
				list.add(vo);
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.close(c, pstmt, rs);
		return list;
	}
//	public static void main(String[] arg)
//	{
//		CnameSelect c = new CnameSelect();
//		String[] cname= {"education","trip"};
//		ArrayList<CardVO> list = c.cnameChoose(cname);
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i).getName());
//		}
//	}
}
