import java.util.*;
class Thirteen {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  double grossPay, deductPay, finalPay;
  System.out.println("Enter your family name:");
  String familyname = sc.nextLine();
  System.out.println("Enter your gaven name:");
  String gavenname = sc.nextLine();
  System.out.println("A.no tax deduction\nB.tax is 10% of gross pay\nC.tax is 20% of gross pay\nD.tax is 29% of gross pay\nE.tax is 35% of gross pay");
  System.out.println("Enter the charater of your tax(A-E):");
  String tax = sc.nextLine();
  System.out.println("Enter the charity:");
  String charity = sc.nextLine();
  System.out.println("Enter number of hours:");
  double numofHours = sc.nextDouble();
  System.out.println("Enter the hour rate:");
  double rate = sc.nextDouble(); 
  
  if (numofHours < 40)
  grossPay = numofHours * rate;
  else
  grossPay = (numofHours * rate) + ((numofHours - 40.0) * rate);

  deductPay = grossPay;
  if (tax.compareToIgnoreCase("a")==0)
  deductPay = grossPay;
  else if (tax.compareToIgnoreCase("b")==0)
  deductPay = grossPay * 0.9;
  else if (tax.compareToIgnoreCase("c")==0)
  deductPay = grossPay * 0.8;
  else if (tax.compareToIgnoreCase("d")==0)
  deductPay = grossPay * 0.71;
  else if (tax.compareToIgnoreCase("e")==0)
  deductPay = grossPay * 0.65;

  finalPay = deductPay;
  if (charity.compareToIgnoreCase("y")==0)
  finalPay = deductPay - 20;

  System.out.println(familyname + " " + gavenname + " " +"'s pay slip\n'");
  System.out.println("hours worked:" + numofHours);
  System.out.println("hours rate:" + rate);
  System.out.println("gross pay: " + grossPay);
  System.out.println("after tax deducted: " + deductPay);
  System.out.println("after donation: " + finalPay);
  }
}