import java.util.Scanner;

public class Exercise1301 {
		public static void main(String[] args) {
			java.util.Scanner in = new java.util.Scanner(System.in);
			
			System.out.print("Please enter the 3 sides of your triangle: ");
			double s1 = in.nextDouble();
			double s2 = in.nextDouble();
			double s3 = in.nextDouble();
			System.out.print("Please enter the color: ");
			String color = in.next();
			System.out.print("Is the triangle filled (true or false): ");
			boolean filled = in.nextBoolean();
			
			Triangle t = new Triangle(s1, s2, s3);
				t.setColor(color);
				t.setFilled(filled);
			
			System.out.printf("Triangle perimeter: %.2f%n" + 
					"Triangle area: %.2f%n" +
					"Triangle color: %s%n" +
					"Triangle filled? %s%n",
						t.getPerimeter(), 
						t.getArea(),
						t.getColor(),
						t.isFilled());
			
			
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
		}

class Triangle extends GeometricObject {
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
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 +
				" side3 = " + this.side3;
	}
}
