package sapient.shapes;

public class square {
	private int side;

	public square(int side)
	{
		this.side = side;
	}
	
	public int calculateArea()
	{
		int area = side*side;
		return area;
	}
}
