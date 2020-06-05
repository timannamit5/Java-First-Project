package com.sapient.employee;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	private List<EmployeePojo> l;

	public AddEmployee()
	{
		l = new ArrayList<EmployeePojo>();
	}
	
	public void SetEmployee(EmployeePojo emp)
	{
		l.add(emp);
	}
	
	public EmployeePojo getEmployee(String id) {
		for (EmployeePojo emp : l) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}
	
}
