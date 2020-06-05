package sapient.shapes;

public class triangle {
	private int side;

	public triangle(int side)
	{
		this.side = side;
	}
	
	public float calculateArea()
	{
		float area = (float) 0.433*side*side;
		return area;
	}
}
