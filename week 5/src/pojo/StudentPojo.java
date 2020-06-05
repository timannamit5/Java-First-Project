package pojo;

public class StudentPojo {
	 
    private int StoreID;
    private String name;
    private String city;

//   iii. Display all the student belong to a particular city
//   iv. Display name wise sorted
//   v. Display city wise sorted.
//   vi. Display student details for a given id handle student not found exception
//    
   public void setId(int x)
   {
	   this.StoreID = x;
   }
   
   public int getId()
   {
	   return StoreID;
   }
   
   public void setName(String x)
   {
	   this.name = x;
   }
   
   public String getName()
   {
	   return name;
   }
   
   public void setCity(String x)
   {
	   this.city = x;
   }
   
   public String getCity()
   {
	   return city;
   } 
    
}