
public class Square extends Rectangle{
	
	private double size;
	
	Square() { System.out.println(toString()); }
	Square(double size) {
		setLength(size);
		setWidth(size);
		System.out.println(toString());
	}
	
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	public double getArea() {
		return super.getArea();
	}
	
	public double getSurfArea() {
		return super.getSurfArea();
	}
	
	public String toString() {
		return super.toString() + "Square";
	}
}
