import java.util.Scanner;
public class Launcher 
{
	public static void main(String args[])
	{
		System.out.println("Hello World!");
		
		// attributes
		
		GeometricObject circle = new Circle();
		
		GeometricObject rectangle = new Rectangle();
		GeometricObject circle2 = new Circle(5);
		circle2.setFilled(true);
		GeometricObject rectangle2 = new Rectangle(4,2);
		Scanner input = new Scanner(System.in);
		
		System.out.println("The area of Circle 1 is: " + circle.getArea());
		System.out.println("The perimeter of Circle 1 is: " + circle.getPerimeter());
		System.out.println("Circle 1 is filled: " + circle.isFilled());
		System.out.println("The color of Circle 1 is: " + circle.getColor());
		System.out.println();
		System.out.println("The area of Circle 2 is: " + circle2.getArea());
		System.out.println("The perimeter of Circle 2 is: " + circle2.getPerimeter());
		System.out.println("Circle 2 is filled: " + circle2.isFilled());
		System.out.println("The color of Circle 2 is: " + circle2.getColor());
		System.out.println();
		System.out.println("The area of Rectangle 1 is: " + rectangle.getArea());
		System.out.println("The perimeter of Rectangle 1 is: " + rectangle.getPerimeter());
		System.out.println("Rectangle 1 is filled: " + rectangle.isFilled());
		System.out.println("The color of Rectangle 1 is: " + rectangle.getColor());
		System.out.println();
		System.out.println("The area of Rectangle 2 is: " + rectangle2.getArea());
		System.out.println("The perimeter of Rectangle 2 is: " + rectangle2.getPerimeter());
		System.out.println("Rectangle 2 is filled: " + rectangle2.isFilled());
		System.out.println("The color of Rectangle 2 is: " + rectangle2.getColor());
		System.out.println();
		
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
		
		if (newFilled == 1)
		{
			newIsFilled = true;
		}
		
		
		GeometricObject newCircle = new Circle(newRad);
		
		newCircle.setColor(newColor);
		newCircle.setFilled(newIsFilled);
		
		
		System.out.println("\nWoohoo! We created a new Circle object!!!\n\n");
		
		System.out.println("The circumference of your new circle is: " + newCircle.getPerimeter());
		System.out.println("The area of your new Circle is: " + newCircle.getArea());
		System.out.println("Your new circle is filled: " + newCircle.isFilled());
		System.out.println("The color of your new circle is: " + newCircle.getColor());
		System.out.println();
		
		
		
		
		
		
		
		System.out.println("\n\nThanks for participating!");
		
		// constructors 
		
		
		// behaviors
		
		
		
		
	}
}
