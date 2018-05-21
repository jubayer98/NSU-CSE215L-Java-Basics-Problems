import java.util.Scanner;


public class testAcc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String choice = "";
		
		account a1 = new account("ERIC",154254,500.00);
		
		System.out.print("Enter 'w' to Withdraw OR 'd' to Deposit  ");
		choice = choice+in.next();
		if(choice.charAt(0)=='w'){
			double amount=0;
			System.out.println("Enter the Amount");
			amount = in.nextDouble();
			a1.withdraw(amount);
		}
		else if(choice.charAt(0)=='d'){
			double amount=0;
			System.out.println("Enter the Amount");
			amount = in.nextDouble();
			a1.deposit(amount);
		}
	}

}
