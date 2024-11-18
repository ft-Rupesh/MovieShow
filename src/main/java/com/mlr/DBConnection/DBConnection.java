package com.mlr.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
    static Connection con=null;
    
    static
    {
    	try
    	{  
    		Class.forName(DBInfo.driver);
    		con=DriverManager.getConnection(DBInfo.url,DBInfo.userName,DBInfo.password);
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
     
    public static Connection getMyConnection()
    {
    	return con;
    }
}
