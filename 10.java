import java.util.*;
class Ten {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the mass number of the letter");
  double mass = sc.nextDouble();
  if (mass <= 30) {
    System.out.println("The cost of mailing a letter is 40 sinas");
  }
  else if(mass <= 50) {
    System.out.println("The cost of mailing a letter is 55 sinas");
  }
  else if(mass <= 100) {
    System.out.println("The cost of mailing a letter is 70 sinas");
  }
  else {
    cost = ((((int) (mass - 100) / 50) * 25)) + 70;
    System.out.println("The cost of mailing a letter is " + cost + " sinas");
  }
  }
}