
public class Rectangle extends Shape{
	
	private double length;
	private double width;
	
	Rectangle() { System.out.println(toString()); }
	Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
		System.out.println(toString());
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
		
	public double getArea() {
		return length*width;
	}
	
	public double getSurfArea() {
		return 2*(length+width);
	}
	
	public String toString() {
		return super.toString() + "Rectangular";
	}
	
}
