
public class student extends person {
	
	
	private double mark1 ;
	private double mark2 ;
	private double mark3 ;
	private double cgpa ;
	
	student(){
		
	}
	
	student(String n ,int id , String Add){
		super.setinfo(n, id, Add);
	}
	
	public void setmarksheet(double mark1 , double mark2 , double mark3 , double cgpa){
		//super.getinfo();
		this.mark1  = mark1 ;
		this.mark2  = mark2 ;
		this.mark3  = mark3 ;
		this.cgpa = cgpa;
	}
	
	public void getmarksheet(){
		//super.getinfo();
		System.out.println(super.getinfo()+"mark1   : "+mark1+"\nmark2   : "+mark2+"\nmark3   : "+mark3+"\nCGPA    : "+cgpa);
	}
	
	
}
