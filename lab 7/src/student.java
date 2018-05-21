public class student {
	private String name;
	private int ID;
	private double m1;
	private double m2;
	private double m3;
	//null constructor
	student(){
		
	}
	//constructor 1
	student(String name,int ID){
		
		this.name = name;
		
		if(ID>9999 && ID<99999){
			this.ID = ID;
		}
		
	}
	//constructor 2
	
	student(String name,int ID,double m1,double m2,double m3){
		
		this.name = name;
		
		if(ID>9999 && ID<99999){
			this.ID = ID;
		}
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	//constructor 3
	student(double m1,double m2,double m3){
		
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return "NAME:"+ this.name;
	}
	
	public void setID(int ID){
		
		if(ID>9999 && ID<99999){
			this.ID = ID;
		}
	}
	
	public String getID(){
		return "ID:"+ String.valueOf(this.ID);
	}
	
	public void setMarks(double m1,double m2, double m3){
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		
	}
	
	public String findAverage(){
		return "Average: "+ String.valueOf((this.m1 + this.m2 + this.m3)/3);
	}
	
	public String highestMark(){
		
		double max= this.m1;
		
		if(this.m2>max){
			max= this.m2;
		}
		else if(this.m3>max){
			max=this.m3;
		}
		return "Highest mark: "+ String.valueOf(max);
			
		
	}
	
}
