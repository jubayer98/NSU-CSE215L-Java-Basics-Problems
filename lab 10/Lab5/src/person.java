
public class person {

	private String n ;
	private int id ;
	private String Add;
	
	person(){
		
	}
	
    person(String n ,int id , String Add){
		this.n = n ;
		this.id = id ;
		this.Add = Add ;
	}
    
    
    public void setinfo(String n ,int id , String Add){
		this.n = n ;
		this.id = id ;
		this.Add = Add ;
	}
    
    public String getinfo(){
		return ("Name    : "+n+"\nId      : "+id+"\nAddress : "+Add+"\n");
	}
    
    
	
}
