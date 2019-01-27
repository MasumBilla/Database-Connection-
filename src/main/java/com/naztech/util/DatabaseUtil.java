package com.naztech.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtil {
	
	public static ResultSet select(String sql) throws SQLException, ClassNotFoundException{
        
	       return DBUtil.getConnection().createStatement().executeQuery(sql);
	    }
	    public static boolean DML(String sql) throws SQLException, ClassNotFoundException{
	        Statement stm=DBUtil.getConnection().createStatement();
	        int  value=stm.executeUpdate(sql);
	       stm.close();
	        if(value >=0) {
	            return true;
	        }else{
	            return false;
	        }
	    }
		 
	}