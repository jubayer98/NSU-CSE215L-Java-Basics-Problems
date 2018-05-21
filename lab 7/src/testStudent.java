
public class testStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		student s1 = new student("ERIC",12345,89,92,75.4);
		student s2 = new student("KYLE",12478,91.5,78.5,85.5);
		
		System.out.println(s1.getName()+"\n"+s1.getID()+"\n"+s1.findAverage()+"\n"+s1.highestMark());
		System.out.println();
		System.out.println(s2.getName()+"\n"+s2.getID()+"\n"+s2.findAverage()+"\n"+s2.highestMark());

	}

}
