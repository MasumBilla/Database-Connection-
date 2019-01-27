package com.naztech.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.naztech.model.Employee;
import com.naztech.util.DatabaseUtil;

public class EmployeeDao implements GenericDao<Employee> {
	

	

	@Override
	public boolean save(Employee value) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		 String sql="INSERT into dbo.T_Masum_Employee(eName,eAge,ePhone,eEmail,eSalary,eAddress)"
	               +" values( '"+value.getName()+"','"  +value.getAge()
	               +"','"  +value.getPhone()+"','"+value.getEmail()
	               +"','"+value.getSalary()+"', '"+value.getAddress()+"')";
	       
	        
	        DatabaseUtil.DML(sql);
	        return true;
	}

	@Override
	public boolean update(Employee value) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String sql="UPDATE  dbo.T_Masum_Employee set eName='"+value.getName()
        +"',eAge='"+value.getAge()+"',ePhone='"+value.getPhone()
        +"',eEmail='"+value.getEmail()+"',eSalary='"+value.getSalary()+"',eAddress='"
        +value.getAddress()+"' where eId="+value.getId();
        
   
  DatabaseUtil.DML(sql);
		
		return true;
	}

	@Override
	public boolean delete(Employee value) throws SQLException, ClassNotFoundException {
		 String sql="delete from dbo.T_Masum_Employee where eId="+value.getId();
         
	     DatabaseUtil.DML(sql);
	    return true;
	}

	@Override
	public Employee find(Employee value) throws SQLException, ClassNotFoundException {
		
		String sql="Select *from dbo.T_Masum_Employee where eId="+value.getId();
        Employee c=null;
        ResultSet rs=DatabaseUtil.select(sql);
        if(rs.next()){
             c=new Employee();
            c.setId(rs.getInt(1));
            c.setName(rs.getString(2));
            c.setAge(rs.getInt(3));
            c.setEmail(rs.getString(4));
            c.setSalary(rs.getInt(5));
            c.setAddress(rs.getString(6));
            
        }
    return c; 
		
	}

	@Override
	public List<Employee> getAll() throws SQLException, ClassNotFoundException {
		ArrayList <Employee>aryList=new ArrayList<Employee>();
        String sql="Select * from Customer";
        
        ResultSet rs=DatabaseUtil.select(sql);
        while(rs.next()){
            Employee c=new Employee();
             c=new Employee();
            c.setId(rs.getInt(1));
            c.setName(rs.getString(2));
            c.setAge(rs.getInt(3));
            c.setEmail(rs.getString(4));
            c.setSalary(rs.getInt(5));
            c.setAddress(rs.getString(6));
            
            aryList.add(c);
        
    
    }
  return aryList;  
   
	}
	
	

}
