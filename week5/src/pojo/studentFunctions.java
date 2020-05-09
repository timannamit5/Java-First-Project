package pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class SortByName implements Comparator<StudentPojo> 
{ 
    public int compare(StudentPojo a, StudentPojo b) 
    { 
        return a.getName().compareTo(b.getName()); 
    } 
} 

class SortByCity implements Comparator<StudentPojo> 
{ 
    public int compare(StudentPojo a, StudentPojo b) 
    { 
        return a.getCity().compareTo(b.getCity()); 
    } 
} 

public class studentFunctions {

	private List<StudentPojo> list_pojo = new ArrayList<StudentPojo>();
	private Scanner sc;
	
	public studentFunctions()
	{
		this.list_pojo = new ArrayList<StudentPojo>();
		this.sc = new Scanner(System.in);
	}
	
	public StudentPojo readStudent() {

		StudentPojo newStudent = new StudentPojo();
		System.out.println("Enter the id of new student");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of the new studnet ");
		String n = sc.nextLine();
		System.out.println("Enter the city");
		String c = sc.nextLine();
		newStudent.setId(id);
		newStudent.setName(n);
		newStudent.setCity(c);
		return newStudent;
	}
	
	public void addStudent() {
		StudentPojo newStudent = readStudent();
		list_pojo.add(newStudent);
	}
	
	public void DisplayStudents(List<StudentPojo> l)
	{
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getName());
		}
	}
	
	public void DisplayStudents()
	{
		for(int i=0;i<list_pojo.size();i++)
		{
			System.out.println(list_pojo.get(i).getName());
		}
	}

	
	public void DisplayStudents(String city)
	{
		for(int i=0;i<list_pojo.size();i++)
		{
			if(list_pojo.get(i).getCity().compareTo(city)==0)
			{
				System.out.println(list_pojo.get(i).getName());
				//System.out.println("found");
				return;
			}
		}
		System.out.println("not found");
	}
	
	public void DisplayStudents(int id)
	{
		for(int i=0;i<list_pojo.size();i++)
		{
			if(list_pojo.get(i).getId()==id)
			{
				System.out.println(list_pojo.get(i).getName());
				return;
			}
		}
		System.out.println("Not found");
	}
	
	public void sortName()
	{
		List<StudentPojo> list_pojo_2 = new ArrayList<StudentPojo>(Arrays.asList(new StudentPojo[list_pojo.size()]));;
		Collections.copy(list_pojo_2, list_pojo);
		Collections.sort(list_pojo_2, new SortByName());
		DisplayStudents(list_pojo_2);
	}
	
	public void sortCity()
	{
		List<StudentPojo> list_pojo_2 = new ArrayList<StudentPojo>(Arrays.asList(new StudentPojo[list_pojo.size()]));
		Collections.copy(list_pojo_2, list_pojo);
		Collections.sort(list_pojo_2, new SortByCity());
		DisplayStudents(list_pojo_2);
	}
	
	public void End()
	{
		sc.close();
	}
}
