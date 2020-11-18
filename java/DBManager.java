package com.project;

import java.sql.*;

public class DBManager 
{
	private String DB_URL = null;   
	private final String DB_ID = "prj";
	private final String DB_PW = "0000";
   // 변수와 제어자에게 개별적 권한 줄 수 있음
   
   
   public Connection conn(String type)
   {
      
      Connection conn = null;

      try 
      {
         if(type.equals("oracle")) 
         {
//            System.out.println("--oracle연결--");
            DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
            Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클
         } else if (type.equals("mysql")) 
         {
//            System.out.println("--mysql연결--");
            DB_URL = "jdbc:mysql://localhost/mydb";
            Class.forName("com.mysql.jdbc.Driver"); //mysql 구버전
            //Class.forName("com.mysql.cj.jdbc.Driver"); //mysql 신버전
         }
         conn = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
      } 
      catch (ClassNotFoundException e1) 
      {
         e1.printStackTrace();
      } 
      catch (SQLException e) 
      {
         e.printStackTrace();
      }
      return conn;
   }
   
   public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) 
   {
      try
      {	//닫기는 생성순서의 반대로 닫는다.
    	 if( rs != null && !rs.isClosed())
    	 {
    		  rs.close();
    	 }
    	 if( pstmt != null && !pstmt.isClosed())
    	 {
    		  pstmt.close();
    	 }
         if( conn != null && !conn.isClosed())
         {
        	 conn.close();
         }
      } 
      catch( SQLException e)
      {
    	  e.printStackTrace();
      }
   }
   public void close(Connection conn, PreparedStatement pstmt) 
   {
    	  try
    	  {	//닫기는 생성순서의 반대로 닫는다.
    		  if( pstmt != null && !pstmt.isClosed())
    		  {
    			  pstmt.close();
    		  }
    		  if( conn != null && !conn.isClosed())
    		  {
    			  conn.close();
    		  }
    	  } 
      catch( SQLException e)
      {
         e.printStackTrace();
      }
//    System.out.println("--close done--");
    }
   
}