package com.naztech.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
        
	      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            return DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
						+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
	        
	     }  

}
