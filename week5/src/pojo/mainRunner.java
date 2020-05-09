package pojo;

public class mainRunner {
		
	public static void main(String args[])
	{
		
		studentFunctions sf = new studentFunctions();
		sf.addStudent();
		sf.DisplayStudents();
		sf.DisplayStudents("random");
		sf.sortCity();
		sf.sortName();
		sf.End();
		
	}
}

