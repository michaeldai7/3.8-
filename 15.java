import java.util.*;

class Fifteen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double income = sc.nextDouble();
		double houseCost = sc.nextDouble();
		double totalChildren = sc.nextDouble();
		double schoolChildren = sc.nextDouble();
		double tax;
		if (houseCost > 8000) {
			tax = income * 0.18;

		} else {
			tax = (income - 10000) * 0.18;
		}
		if (houseCost < 6000 && totalChildren > 2 && schoolChildren > 0) {
			tax = tax - ((schoolChildren * 1000) + ((totalChildren - schoolChildren) * 500)) * 0.18;
		}
		if (tax > 2000) {
			tax *= 1.15;
		}
		if (tax < 0) {
			tax = 0;
		}
		System.out.println(tax);
	}
}