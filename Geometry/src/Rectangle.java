
public class Rectangle extends GeometricObject 
{
	// attributes
	private double width;
	private double height;
	
	// default noarg constructor
	Rectangle()
	{
		
	}
	
	// alternate constructor
	Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	// behaviors
	
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	

	@Override
	public double getArea() 
	{
		return width * height;
	}

	@Override
	public double getPerimeter() 
	{
		return 2 * (width + height);
	}

}
