public class BMI 
{
	private double weight;
	private double height;
	
	BMI()
	{
		
	}
	
	BMI(double weight, double height)
	{
		this.weight = weight;
		this.height = height;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getBMI()
	{
		return (weight/(height*height));
	}
	
	public String getStatus()
	{
		String status;
		if(getBMI()<18.5)
			status = "Underweight";
		else if(getBMI()>=18.5 && getBMI()<=24.9)
			status = "Normal";
		else if(getBMI()>=25 && getBMI()<=29.9)
			status = "Overweight";
		else if(getBMI()>=30)
			status = "Obese";
		else
			status = "ERR0R!!!";
		
		return status;
		
	}
}