package com.sapient.employee;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	private AddEmployee l;
	
	@Before
	public void set() {
		l = new AddEmployee();
		EmployeePojo e1 = new EmployeePojo("1", "N", "I");
		EmployeePojo e2 = new EmployeePojo("2", "A", "N");
		EmployeePojo e3 = new EmployeePojo("3", "M", "D");
		EmployeePojo e4 = new EmployeePojo("4", "I", "I");
		EmployeePojo e5 = new EmployeePojo("5", "T", "A");
		l.SetEmployee(e1);
		l.SetEmployee(e2);
		l.SetEmployee(e3);
		l.SetEmployee(e4);
		l.SetEmployee(e5);
	}
	
	@Test
	public void testEmployee()
	{
		EmployeePojo e = l.getEmployee("4");
		EmployeePojo q = new EmployeePojo("4", "T", "I");
		assertNotNull(e);
		assertEquals(e, q);
	}
	
	@Test
	public void NullTest() {
		EmployeePojo e = l.getEmployee("7");
		assertNull(e);
	}
	
}
