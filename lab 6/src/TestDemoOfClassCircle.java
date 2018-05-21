import java.util.Scanner;


public class TestDemoOfClassCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please Put radius for The First Circle.");
		
		Scanner input = new Scanner(System.in);
		
		double r = input.nextDouble();
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(r+10);
		
		c1.set_Radius(r);
		
		System.out.println("For radius " + r+" Area will be " + c1.getArea()+".");
		System.out.println("For radius " + r+" Circumference will be " + c1.getCircumference()+".");
		
		System.out.println("For radius " + (r+10) +" Area will be " + c2.getArea()+".");
		System.out.println("For radius " + (r+10) +" Circumference will be " + c2.getCircumference()+".");

	}

}
