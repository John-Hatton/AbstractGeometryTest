import java.util.Date;

public abstract class GeometricObject 
{
	// attributes 
	
	protected String color = "white";
	protected boolean filled;
	private Date dateCreated;
	private String name = null;
	
	
	
	
	//-----------------------------------------------
	
	
	// default constructor
	protected GeometricObject()
	{
		
	}
	
	
	// alternate constructor
	protected GeometricObject(String name, String color, boolean filled)
	{
		dateCreated = new Date();
		this.name = name;
		this.color = color;
		this.filled = filled;
	}
	
	// behaviors
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public boolean isFilled()
	{
		return filled;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	@Override
	public String toString()
	{
		return "created on" + dateCreated + "\ncolor" + color + " and filled: " + filled;
	}
	
	
	public abstract double getArea();
	public abstract double getPerimeter();
	

	
}
