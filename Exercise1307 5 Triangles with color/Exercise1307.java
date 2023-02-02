import java.util.Scanner;

public class Exercise1307 {
		public static void main(String[] args) {
			// Create an array of five GeometricObjects
			GeometricObject[] triangles = {new Triangle(4, 5, 6), new Triangle(14, 15, 16), 
				new Triangle(8, 9, 10), new Triangle(12, 13, 14), new Triangle(10, 11, 12)};
			
			// Display the area and invoke the howToColor 
			// method for each GeometricObject
			for (int i = 0; i < triangles.length; i++) {
				System.out.println("\nTriangle #" + (i + 1));
				System.out.println("Area: " + triangles[i].getArea());
				System.out.println("How to color: " + triangles[i].howToColor());
			} 
		}
	}

		abstract class GeometricObject {
			private String color = "white";
			private boolean filled;
			
			/**Default construct*/
			protected GeometricObject() {
			}
			
			/**Construct a geometric object*/
			protected GeometricObject(String color, boolean filled) {
				this.color = color;
				this.filled = filled;
			}
			
			/**Getter method for color*/
			public String getColor() {
				return color;
			}
			
			/**Setter method for color*/
			public void setColor(String color) {
				this.color = color;
			}
			
			/**Getter method for filled. Since filled is boolean,
					so, the get method name is isFilled*/
			public boolean isFilled() {
				return filled;
			}
			
			/**Setter method for filled*/
			public void setFilled(boolean filled) {
				this.filled = filled;
			}
			
			/**Abstract method findArea*/
			public abstract double getArea();
			
			/**Abstract method getPerimeter*/
			public abstract double getPerimeter();
			
			public abstract String howToColor();
		}

class Triangle extends GeometricObject implements Colorable{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	public Triangle(double s1, double s2, double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double getSideOne() {
		return this.side1;
	}
	
	public double getSideTwo() {
		return this.side2;
	}
	
	public double getSideThree() {
		return this.side3;
	}
	
	public double getArea() {
		double perimeter = this.side1 + this.side2 + this.side3;
		return Math.sqrt(perimeter * (
				(perimeter - this.side1) * 
				(perimeter - this.side2) * 
				(perimeter - this.side3)));
		
		
	}
	
	public double getPerimeter() {
		return (this.side1 + this.side2 + this.side3);
	}

	public String howToColor() {
		return "Color all three sides";
	}
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 +
				" side3 = " + this.side3;
	}
}
// interface Colorable {
//	/** Describe how to color */
//	String howToColor();
//}