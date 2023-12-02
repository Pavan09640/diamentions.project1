package com.diamentions;
import java.util.Scanner;

class shape{
	public double calculateArea() {
		return 0.0;
	}
}
class Rectangle extends shape{
	private double length;
	private double width;
	
	public double calculateArea() {
		return length*width;
		
	}
	public void setDiamentions(double length, double width) {
		this.length = length;
		this.width = width;
	}
}
class Circle extends shape {
	private double radius;
	
	public double calculateArea() {
		return Math.PI *radius* radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
class Traingle extends shape{
	private double base;
	private double height;
	
	public double calculateArea() {
		return 0.5 * base * height;
	}
	public void setDiamentions(double base, double height) {
		this.base = base;
		this.height =height;	
	}
}

public class AreaDiamentions {
	
	void meth1() {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("To calculate the Area ");
        System.out.println("-------------------");
        System.out.println("Select a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.println("-------------------");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateRectangleArea(scanner);
                break;
            case 2:
                calculateCircleArea(scanner);
                break;
            case 3:
                calculateTriangleArea(scanner);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        }catch(Exception e) {
        	System.out.println("An error occured:"+e.getMessage());
        }finally {
        	scanner.close();
        }
    }

  public static void calculateRectangleArea(Scanner scanner) {
     try {
	 System.out.print("Enter the length: ");
	 double length = scanner.nextDouble();
	 System.out.print("Enter the width: ");
	 double width = scanner.nextDouble();
     double area = length * width;
     System.out.println("The area of the rectangle is: " + area);
	 }catch(Exception e){
		 System.out.println("Error calculating rectangle area:"+e.getMessage());
	 }
}

 public static void calculateCircleArea(Scanner scanner) {
	try {
    System.out.print("Enter the radius: ");
    double radius = scanner.nextDouble();
    double area = Math.PI * radius * radius;
    System.out.println("The area of the circle is: " + area);
	}catch(Exception e) {
		System.out.println("Error calculating circle area:"+e.getMessage());
	}
  }

  public static void calculateTriangleArea(Scanner scanner) {
  try {
   System.out.print("Enter the base: ");
   double base = scanner.nextDouble();
   System.out.print("Enter the height: ");
   double height = scanner.nextDouble();
   double area = 0.5 * base * height;
   System.out.println("The area of the triangle is: " + area);
	  }catch(Exception e) {
		  System.out.println("Error calculating traingle area:"+e.getMessage());
	  }
}
	 
    public static void main(String[] args)
    {
		AreaDiamentions obj1=new AreaDiamentions();
		obj1.meth1();
	}

    }
