package com.iqbal.jdbc;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
public class Book {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Connected...");
			
			CallableStatement stat=con.prepareCall( "create table book(isbn number,price number,title char(10))");
			
			boolean result=stat.execute();
			System.out.println(result);
			if(!result)
				System.out.println("Table created...");
			else
				System.out.println("Table not created..");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
