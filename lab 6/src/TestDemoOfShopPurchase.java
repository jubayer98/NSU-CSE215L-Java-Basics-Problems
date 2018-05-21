import java.util.Scanner;


public class TestDemoOfShopPurchase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Put Your purchase from first shop.");
		int pA1 = input.nextInt();
		
		System.out.println("Please Put Your purchase from Second shop.");
		int pA2 = input.nextInt();
		
		System.out.println("Please Put Your purchase from Third shop.");
		int pA3 = input.nextInt();
		
		shopPurchase p1 = new shopPurchase();
		shopPurchase p2 = new shopPurchase();
		shopPurchase p3 = new shopPurchase();
		
		p1.set_PurchaseAmount(pA1);
		p2.set_PurchaseAmount(pA2);
		p3.set_PurchaseAmount(pA3);
		
		p1.calculateBonus();
		p2.calculateBonus();
		p3.calculateBonus();
		
		System.out.println("For total purchase " + (pA1 + pA2 + pA3) +" You get total bonus points "+ shopPurchase.totalBonusPoints + ".");
	}

}
