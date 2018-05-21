import java.util.Scanner;


public class BMItest 
{
	static Scanner myScanner = new Scanner(System.in);
	
	static BMI p1 = new BMI();
	
	public static void main(String[] args)
	{
		pr("Enter Your Weight in KG: ");
		double w1 = myScanner.nextDouble();
		p1.setWeight(w1);
		
		pr("Enter Your Height in Meter: ");
		double h1 = myScanner.nextDouble();
		p1.setHeight(h1);
		
		prln("Your BMI is: " + p1.getBMI() + " and you are in " + p1.getStatus());
	}
	
	static void prln(Object anyObject)
	{
		System.out.println(anyObject);
	}
	
	static void pr(Object anyObject)
	{
		System.out.print(anyObject);
	}
}
