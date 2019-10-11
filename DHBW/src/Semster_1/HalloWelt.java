package Semster_1;

public class HalloWelt {
	
	
	static int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		HalloWelt2 steven = new HalloWelt2();
		double test = Math.random() * 49 + 1;
		test = (int) test;
		steven.jannik();
		
		System.out.println(test);
		System.out.println(testMethode());
	}

	
	public static int testMethode() {
		return Math.max(a, b);
		
	}
	
}
