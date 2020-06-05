package sapient.shapes;

public class shapes {
	private int numberOfSides;
	 
	public void calculateShapeArea(int shape, int length)
	{
		if(numberOfSides==3)
		{
			triangle tri = new triangle(length);
			System.out.println("The area of the triangle is " + tri.calculateArea());
		}
		else if(numberOfSides==4)
		{
			square sq = new square(length);
			System.out.println("The area of the square is " + sq.calculateArea());
		}
		else if(numberOfSides==1)
		{
			circle cir = new circle(length);
			System.out.println("The area of the circle is " + cir.calculateArea());
		}
		else
		{
			System.out.println("No shapes present");
		}
	}
	
	public static void main(String[] args)
	{
		shapes shape = new shapes();
		
		shape.numberOfSides = 3;
		shape.calculateShapeArea(3, 12);
		
		shape.numberOfSides = 4;
		shape.calculateShapeArea(4, 15);
		
		shape.numberOfSides = 5;
		shape.calculateShapeArea(5, 15);
	}
}
