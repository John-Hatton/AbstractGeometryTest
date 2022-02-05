
public class Circle extends GeometricObject
{
	//attributes
	private double radius;
	
	
	// default noarg constructor
	public Circle() 
	{
		
	}
	
	// alternate constructors 
	
	public Circle (int radius)
	{
		this.radius = radius;
	}
	
	public Circle (double radius)
	{
		this.radius = radius;
	}
	
	public Circle(double radius, String name, String color, boolean filled)
	{
		super(name, color, filled);
		this.radius = radius;
		
	}
	
	
	// behaviors
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getDiameter()
	{
		return 2*radius;
	}
	

	@Override
	public double getArea() 
	{
		return Math.PI * (radius * radius);
	}
	
	@Override
	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	
	public void printCircle()
	{
		System.out.println("The circle is created " + getDateCreated() +
			      " and the radius is " + radius);
	}
}
