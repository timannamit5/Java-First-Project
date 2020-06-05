package sapient.shapes;

public class circle {
	private int side;

	public circle(int side)
	{
		this.side = side;
	}
	
	public float calculateArea()
	{
		float area = (float) (3.14*side*side);
		return area;
	}
}
