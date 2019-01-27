package com.naztech.JTest;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

import com.naztech.dao.EmployeeDao;
import com.naztech.model.Employee;


public class EmployeeTest {
	EmployeeDao dao=new EmployeeDao();
	
	@Test
	public void testsave() throws ClassNotFoundException, SQLException   {
		
		 Employee em=new Employee();
		 em.setId(2);
			em.setName("Suhada");
			em.setAge(12);
			em.setPhone(01521);
			em.setSalary(12000);
			em.setEmail("billahmasum@gmail.com");
			em.setAddress("Dhaka");
    
		//assertTrue(dao.save(em));
	 
	}
	@Test
	public void testupdate() throws ClassNotFoundException, SQLException   {
		
		 Employee em=new Employee();
		em.setId(2);
		em.setName("Suhada");
		em.setAge(12);
		em.setPhone(01521);
		em.setSalary(12000);
		em.setEmail("billahmasum@gmail.com");
		em.setAddress("Dhaka");
		
    
		assertTrue(dao.update(em));
	 
	}
	
	@Test
	public void testdelete() throws ClassNotFoundException, SQLException   {
		
		 Employee em=new Employee();
		em.setId(2);
    
		assertTrue(dao.delete(em));
	 
	}


	@Test
	public void testgetAll() throws ClassNotFoundException, SQLException   {
		
		Employee emp = new Employee();
		List<Employee> empList = new ArrayList<Employee>();

		empList = dao.getAll();

		assertEquals(empList.size(),3);

	}
		
	 
	}
	

