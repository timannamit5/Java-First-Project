package com.sapient.employee;

public class EmployeePojo {
	private String name;
	private String city;
	private String id;
	
	public EmployeePojo()
	{
		
	}
	
	public EmployeePojo(String id, String name, String city)
	{
		this.id = id;
		this.city = city;
		this.name = name;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "EmployeePojo [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof EmployeePojo))
			return false;
		EmployeePojo other = (EmployeePojo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
