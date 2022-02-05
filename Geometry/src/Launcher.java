import java.util.Scanner;
public class Launcher 
{
	public static void printShape(GeometricObject shape)
	{
		System.out.println("\nThe perimeter of " + shape.getName() + " is: " + shape.getPerimeter());
		System.out.println("The area of " + shape.getName() + " is: " + shape.getArea());
		System.out.println(shape.getName() + " is filled: " + shape.isFilled());
		System.out.println("The color of " + shape.getName() + " is: " + shape.getColor() + "\n");
	}
	
	public static void main(String args[])
	{
		System.out.println("Hello World!");
		
		// attributes
		
		
		Rectangle rectangle = new Rectangle();
		GeometricObject circle2 = new Circle(5, "Circle2", "blue", true);
		GeometricObject rectangle2 = new Rectangle(4,2, "Rectangle", "orange", false);
		Rectangle rectangle3 = new Rectangle(3,5, "Rectangle 3", "cyan", true);
		
		
		Scanner input = new Scanner(System.in);
		
		printShape(circle2);
		printShape(rectangle);
		rectangle.setName("Big Rectangle");
		rectangle.setHeight(5);
		rectangle.setWidth(1000);
		rectangle.setFilled(true);
		rectangle.setColor("royal blue");
		printShape(rectangle);

		printShape(rectangle2);
		
		printShape(rectangle3);
		rectangle3.setHeight(4);
		rectangle3.setWidth(5);
		rectangle3.setName("Tavarisch");
		
		printShape(rectangle3);
		
		System.out.println("I'm going to create a new object. Please give it some fields! ");
		
		System.out.println("For a new Circle, please specifcy radius: ");
		int newRad = input.nextInt();
		System.out.println();
		
		System.out.println("Now for the circle's color? ");
		input.nextLine();
		System.out.println();
		
		String newColor = input.nextLine();
		System.out.println();
		
		
		System.out.println("And finally let's set whether the circle is filled.");
		System.out.println("If you want it to be filled, type 1; otherwise type 0: ");
		
		int newFilled = input.nextInt();
		boolean newIsFilled = false;
		input.close();
		
		if (newFilled == 1)
		{
			newIsFilled = true;
		}
		
		
		GeometricObject newCircle = new Circle(newRad);
		
		newCircle.setColor(newColor);
		newCircle.setFilled(newIsFilled);
		
		
		System.out.println("\nWoohoo! We created a new Circle object!!!\n\n");
		
		
		newCircle.setName("New Circle");
		
		printShape(newCircle);
		
		
		
		
		
		System.out.println("\n\nThanks for participating!");
		
		// constructors 
		
		
		// behaviors
		
		
		
		
	}
}
