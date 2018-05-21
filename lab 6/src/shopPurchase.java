
public class shopPurchase {

	private double purchaseAmount;
	public static double totalBonusPoints = 0;
	
	shopPurchase()
	{
		
	}
	
	shopPurchase(int pA)
	{
		purchaseAmount = pA;
	}
	
	// getter setters for purchaseAmount variable
	public double get_PurchaseAmount() {
		return purchaseAmount;
	}

	public void set_PurchaseAmount(int pA) {
		purchaseAmount = pA;
	}
	
	public void calculateBonus()
	{
	// code for calculating bonus
		totalBonusPoints += purchaseAmount/100;
	}


}
