
public class account {
	private String name;
	private int accNum;
	private double balance;
	
	account(){}
	
	account(String name, int accNum, double balance){
		
		this.name = name;
		this.accNum = accNum;
		this.balance = balance;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		
		return "NAME "+ this.name;
	}
	public void setAccNum(int accNum){
		this.accNum = accNum;
	}
	
	public String getAccNum(){
		return "Account Num: "+ String.valueOf(this.accNum);
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public String getBalance(){
		return "Balance: "+ String.valueOf(this.balance);
	}
	
	public void deposit(double amount){
		this.balance += amount;
		System.out.println("Current balance After Deposit:"+this.balance );
	}
	
	public void withdraw(double amount){
		this.balance -= amount;
		System.out.println("Current balance After withdrawal:"+this.balance );
	}
	

}
