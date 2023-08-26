/**
 * @ Nikunj Gupta 
 * This program utilizes if statements to calculate the area, perimeter or volume of a figure 
 * This program asks the user for multiple inputs such as shape and what they want calculated
 */

// imports the scanner class to enable user input

import java.util.Scanner;

public class Unit5Lab {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Geometry Calculator!\n"
				+ "Enter 2 for 2D figures and 3 for 3D:");
		int figure = input.nextInt();
		
		// Checks if the user wants a 2 dimensional figure
		if (figure == 2) {
			System.out.println("Enter P if you are looking to compute the perimeter, A for area, or B for both: ");
			String area = input.next();
			
			System.out.println("C for Circle, S for Square, and P for Parallelogram: ");
			String shape = input.next();
			
			// Checks if the user wants to calculate information for a circle
			if (shape.equals("C")) {
				System.out.println("Enter the length of the radius: ");
				double radius = input.nextDouble();
				
				if (area.equals("A")) {
					circleArea2D(radius);

				}
				
				else if (area.equals("P")) {
					circlePerimeter2D(radius);

				}
				
				else {
					circleArea2D(radius);
					circlePerimeter2D(radius);
				}
				
			}
			
			// Checks if the user wants to calculate information for a square
			if (shape.equals("S")) {
				System.out.println("Enter the length of the side: ");
				double side = input.nextDouble();
				
				if (area.equals("A")) {
					squareArea2D (side);
				}
				
				else if (area.equals("P")) {
					squarePerimeter2D (side);
				}
				
				else {
					squareArea2D (side);
					squarePerimeter2D (side);
				}
				
			}
			
			// Checks if the user wants to calculate information for a parallelogram
			if (shape.equals("P")) {
				System.out.println("Enter the length of the side: ");
				double side = input.nextDouble();
				
				System.out.println("Enter the length of the base: ");
				double base = input.nextDouble();
				

				System.out.println("Enter the vertical height: ");
				double height = input.nextDouble();
				
				if (area.equals("A")) {
					parallelogramArea2D (side, base, height);
				}
				
				else if (area.equals("P")) {
					parallelogramPerimeter2D (side, base, height);
				}
				
				else {
					parallelogramArea2D (side, base, height);
					parallelogramPerimeter2D (side, base, height);
				}
			}
			

		}
		
		// Checks if the user wants a 3 dimensional figure
		if (figure == 3) {
			System.out.println("Enter A if you are looking to compute the area, V for volume, or B for both: ");
			String area = input.next();
			
			System.out.println("S for Sphere, R for Rectangular Solid, and C for Cylinder: ");
			String shape = input.next();
			
			// Checks if the user wants to calculate information for a sphere
			if (shape.equals("S")) {
				System.out.println("Enter the length of the radius: ");
				double radius = input.nextDouble();
				
				if (area.equals("A")) {
					sphereArea3D (radius);
				}
				
				else if (area.equals("V")) {
					sphereVolume3D (radius);
				}
				
				else {
					sphereArea3D (radius);
					sphereVolume3D (radius);	
				}
				
			}
			
			// Checks if the user wants to calculate information for a rectangular solid
			if (shape.equals("R")) {
				System.out.println("Enter the length: ");
				double length = input.nextDouble();
					
				System.out.println("Enter the width: ");
				double width = input.nextDouble();
					
				System.out.println("Enter the height: ");
				double height = input.nextDouble();
					
				if (area.equals("A")) {
					rectangularSolidArea3D (length, width, height);
				}
					
				else if (area.equals("V")) {
					rectangularSolidVolume3D (length, width, height);
				}
					
				else {
					rectangularSolidArea3D (length, width, height);
					rectangularSolidVolume3D (length, width, height);
					}
			
		}
			// Checks if the user wants to calculate information for a cylinder
			if (shape.equals("C")) {
				System.out.println("Enter the radius of the circular base: ");
				double radius = input.nextDouble();
				
				System.out.println("Enter the height: ");
				double height = input.nextDouble();
					
				if (area.equals("A")) {
					cylinderArea3D (radius, height);
				}
					
				else if (area.equals("V")) {
					cylinderVolume3D (radius, height);
				}
					
				else {
					cylinderArea3D (radius, height);
					cylinderVolume3D (radius, height);
					}
		
	}

}
}
	// Creates methods for circles
	public static void circleArea2D (double radius)
	{
		System.out.println("Area: " + Math.PI*radius*radius + " (Computed using the equation: Area = pi * radius * radius)");
	}
	
	public static void circlePerimeter2D (double radius)
	{
		System.out.println("Perimeter: " + 2*Math.PI*radius + " (Computed using the equation: Perimeter = 2 * pi * radius)");
	}
	
	// Creates methods for squares
	public static void squareArea2D (double side)
	{
		System.out.println("Area: " + side*side + " (Computed using the equation: Area = side * side)");
	}
	
	public static void squarePerimeter2D (double side)
	{
		System.out.println("Perimeter: " + 4*side + " (Computed using the equation: Perimeter = 4 * side)");
	}
	
	// Creates methods for parallelograms
	public static void parallelogramArea2D (double side, double base, double height)
	{
		System.out.println("Area: " + base*height + " (Computed using the equation: Area = base * height)");
	}
	
	public static void parallelogramPerimeter2D (double side, double base, double height)
	{
		System.out.println("Perimeter: " + 2*(side+base) + " (Computed using the equation: Perimeter = 2(side + base))");
	}
	
	// Creates methods for spheres
	public static void sphereArea3D (double radius)
	{
		System.out.println("Area: " + 4*Math.PI*radius*radius + " (Computed using the equation: Area = 4 * pi * radius * radius)");
	}
	
	public static void sphereVolume3D (double radius)
	{
		System.out.println("Volume: " + (4/3)*Math.PI*radius*radius*radius + " (Computed using the equation: Volume = (4/3) * pi * radius * radius * radius)");
	}
	
	// Creates methods for rectangular solids
	public static void rectangularSolidArea3D (double length, double width, double height)
	{
		System.out.println("Area: " + 2*(width*length + height*length + height*width) + " (Computed using the equation: Area = 2 * (wl + hl + hw))");
	}
	
	public static void rectangularSolidVolume3D (double length, double width, double height)
	{
		System.out.println("Volume: " + length*width*height + " (Computed using the equation: Volume =  length * width * height)");
	}

	// Creates methods for cylinders
	public static void cylinderArea3D (double radius, double height)
	{
		System.out.println("Area: " + 2*Math.PI*radius*(radius + height) + " (Computed using the equation: Area = 2 * pi * radius(radius + height))");
	}
	
	public static void cylinderVolume3D (double radius, double height)
	{
		System.out.println("Volume: " + Math.PI * radius * radius * height + " (Computed using the equation: Volume =  pi * radius * radius * height)");
	}
}