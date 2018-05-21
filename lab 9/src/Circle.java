
public class Circle extends Shape{
	
	private double radius;
	
	Circle() { System.out.println(toString()); }
	Circle(double radius) {
		this.radius = radius;
		System.out.println(toString());
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*PI;
	}
	
	public double getSurfArea() {
		return 2*PI*radius;
	}
	

	public String toString() {
		return super.toString() + "Circle";
	}
}
