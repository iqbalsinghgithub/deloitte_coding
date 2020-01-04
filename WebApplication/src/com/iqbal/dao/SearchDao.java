package com.iqbal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iqbal.bean.Search;

public class SearchDao {

	Connection con;
	PreparedStatement pre;
	ResultSet res;
	
	public SearchDao()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Database Connected....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public ResultSet retrieve(int s)
	{
		System.out.println("In Retrieve");
		try
		{
			
			pre=con.prepareStatement("select * from product where id=?");
			pre.setInt(1,s);
			res=pre.executeQuery();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return res;
	}
}
