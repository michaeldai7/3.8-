import java.util.*;
class Fifteen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in)
		int income = sc.nextInt(); 
		int houseCost = sc.nextInt();
		int totalChildren = sc.nextInt();
		int schoolChildren = sc.nextInt();
		if (income < 10000 || houseCost < 8000){
			int tax = 0;
		else if (income < 10000 || houseCost > 8000){
			double tax = (double)income * 1.18;
			if (totalChildren > 2 || schoolChildren > 1) {//housse more than 6000, has child reduction
				int reduction = schoolChildren * 1000 + (totoalChildren - schoolChildren) * 500;
				double tax = (double)tax - (double)reductuion;
			}
		}
		
	}
}
© 2020 GitHub,