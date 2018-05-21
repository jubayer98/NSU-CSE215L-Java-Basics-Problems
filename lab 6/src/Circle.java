
public class Circle {

	private double radius;
	// private double area;
	
	Circle()
	{
		
	}
	
	Circle(double r)
	{
		radius = r ;
	}
	
	// get-set Method.
	public void set_Radius(double r)
	{
		radius = r;
	}
	public double get_Radius()
	{
		return radius;
	}
	
	public float getArea()
	{
	// Write Code to calculate area of a circle
		
		return (float) (Math.PI * radius * radius);
	}

	public float getCircumference()
	{
	// Write Code to calculate circumference of a circle
		
		return (float) (2* Math.PI * radius) ;
	}


}
