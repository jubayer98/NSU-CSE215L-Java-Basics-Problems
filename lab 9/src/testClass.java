
public class testClass {

	public static String compareShape(Shape s1, Shape s2) {
		
		if(s1.getArea() > s2.getArea()) 
			return s1.toString();
		else 
			return s2.toString();		
	}
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(1.0);
		Rectangle r1 = new Rectangle(2.0,8.0);
		
		System.out.println("The larger "+ compareShape(r1,c1));		
	}

}
